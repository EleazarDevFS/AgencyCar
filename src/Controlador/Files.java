package Controlador;

import Vista.Login;
import Vista.Principal;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.JOptionPane;

public class Files {

    private static File historial = new File("historialVentas.txt");
    private static File lista = new File("lista.txt");

    public static void addlist(String txt) {
        try {
            FileWriter fw = new FileWriter(lista, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(txt);
            bw.newLine();
            bw.close();
        } catch (IOException e) {

        }
    }

    public void openDocumentation() {

        URL url = getClass().getResource("/pdf/Documentacion Agency Car.pdf");
        if (url != null) {
            try {
                File pdfFile = new File(url.toURI());
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(pdfFile);
                } else {
                }
            } catch (IOException | URISyntaxException e) {
                JOptionPane.showMessageDialog(null, "Error al abrir el archivo PDF ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo encontrar el archivo PDF.");
        }

    }

    public static void getList() {
        // Método deshabilitado: El campo de usuario ahora es un JTextField
        // Los usuarios deben escribir manualmente su nombre de usuario (ej: admin_adm)
        /*
        try {
            FileReader fr = new FileReader(lista);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                Login.user.addItem(line);
            }
            fr.close();
            br.close();
        } catch (IOException e) {

        }
        */
    }

    public static void agregaVenta(String venta) {

        try {
            FileWriter fhv = new FileWriter(historial, true);
            BufferedWriter bhv = new BufferedWriter(fhv);
            bhv.write(venta);
            bhv.close();
            fhv.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void muestraHistorial() {
        try {
            FileReader fhv = new FileReader(historial);
            BufferedReader bhv = new BufferedReader(fhv);
            String line = "";
            int count = 0;
            while ((line = bhv.readLine()) != null) {
                count++;
                int v = count % 2;
                if (v == 0) {
                    Principal.txtAhistorial.setText(Principal.txtAhistorial.getText() + "\n" + line);
                } else {
                    Principal.txtAhistorial.setText(Principal.txtAhistorial.getText() + "\n" + line);
                }
            }
//            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void generarFactura(
            String idCliente, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String direccion,
            String fecha, String idAuto, String nombreAuto, String tipo, String marca, String color, String anio, String modelo,
            int cantidad, double precioUnitario, double descuento
    ) {
        double subtotal = cantidad * precioUnitario;
        double montoTotal = subtotal - descuento;

        String factura = "========================================\n"
                + "                AGENCY SPEED            \n"
                + "            FACTURA DE VENTA            \n"
                + "========================================\n"
                + "Fecha: " + fecha + "\n"
                + "----------------------------------------\n"
                + "            DATOS DEL CLIENTE            \n"
                + "ID Cliente: " + idCliente + "\n"
                + "Nombre: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno + "\n"
                + "Teléfono: " + telefono + "\n"
                + "Dirección: " + direccion + "\n"
                + "----------------------------------------\n"
                + "          DETALLES DE LA COMPRA          \n"
                + "ID Auto: " + idAuto + "\n"
                + "Nombre: " + nombreAuto + "\n"
                + "Tipo: " + tipo + "\n"
                + "Marca: " + marca + "\n"
                + "Color: " + color + "\n"
                + "Año: " + anio + "\n"
                + "Modelo: " + modelo + "\n"
                + "Cantidad: " + cantidad + "\n"
                + "Precio Unitario: $" + precioUnitario + "\n"
                + "Subtotal: $" + subtotal + "\n"
                + "Descuento: $" + descuento + "\n"
                + "----------------------------------------\n"
                + "Monto Total: $" + montoTotal + "\n"
                + "----------------------------------------\n"
                + "Firma del Vendedor: ________________\n"
                + "Firma del Cliente: ________________\n";

        // Guardar la factura en un archivo
        try (FileWriter writer = new FileWriter("factura.txt")) {
            writer.write(factura);
        } catch (IOException e) {
            System.out.println("Error al generar la factura: " + e.getMessage());
        }
        try (FileWriter writer2 = new FileWriter("facturas.txt", true)) {
            writer2.write(factura);
            writer2.write("\n");
        } catch (IOException e) {
        }
    }

    public static void convertirTxtAPdf(String archivoTxt, String archivoPdf) {
        Principal p = new Principal();
        try {
            // Crear el documento PDF
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(archivoPdf));
            document.open();

            // Leer el archivo de texto
            BufferedReader br = new BufferedReader(new FileReader(archivoTxt));
            String linea;
            while ((linea = br.readLine()) != null) {
                document.add(new Paragraph(linea));
            }
            br.close();

            // Cerrar el documento PDF
            document.close();
            JOptionPane.showMessageDialog(null, "PDF guardado como: " + archivoPdf);
            p.saveFile.setVisible(false);
        } catch (DocumentException | IOException e) {
            System.out.println("Error al convertir el archivo: " + e.getMessage());
        }

    }

}
