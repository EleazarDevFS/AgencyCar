package Controlador;

import Modelo.Conexion;
import Modelo.Delets;
import static Modelo.Delets.eliminarEmpleado;
import static Modelo.Delets.querydelete;
import Modelo.Inserts;
import Modelo.Querys;
import static Modelo.Querys.*;
import static Modelo.Querys.consultaEmpleados;
import static Modelo.Querys.llenaActulizarE;
import static Modelo.Querys.queryInventary;
import static Modelo.Querys.queryUpdateI;
import static Modelo.Querys.queryusers;
import Modelo.Updates;
import static Modelo.Updates.queryUpdateInventario;
import Vista.GestionEmpleados;
import Vista.InicioFrame;
import Vista.Inventario;
import Vista.Login;
import Vista.Principal;
import static Vista.Principal.cantidad;
import static Vista.Principal.labelTresP;
import static Vista.Principal.txtClienteId;
import static Vista.Principal.txtFecha;
import static Vista.Principal.txtId;
import static Vista.Principal.txtMonto;
import static Vista.Principal.txtN;
import static Vista.Principal.ventas;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;

public class logica {

    public static ArrayList nombres = new ArrayList();
    public static ArrayList pv = new ArrayList();
    public static Querys x = new Querys();
    public static String idNow = "";
    public static String userNow = "";
    public static final String nombress = "^[A-Za-zÁÉÍÓÚáéíóúÑñ ]+$"; // Solo letras y espacios
    public static final String precios = "^[0-9.]+$"; // Solo números y punto decimal
    public static final String descripciones = "^[\\w\\s,.!?-]+$"; // Permitir letras, números y puntuación común
    public static final String modelos = "^[A-Za-z0-9 -]+$"; // Modelo puede tener letras, números y guiones
    public static final String sinEspeciales = "^[A-Za-z0-9 ]+$";
    public static final String serie = "^[A-Za-z0-9]+$"; // Números de serie pueden incluir letras y números
    public static final String cantidades = "^[0-9]+$"; // Solo números (sin decimales)
    public static final String marcas = "^[A-Za-zÁÉÍÓÚáéíóúÑñ ]+$"; // Solo letras y espacios
    public static final String tipos = "^[A-Za-zÁÉÍÓÚáéíóúÑñ ]+$"; // Solo letras y espacios
    public static final String telefonos = "^(\\+\\d{1,3}\\s?)?(\\d{2,4}[-\\s]?)?\\d{6,10}$";
    public static final String correos = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    public static DefaultListModel modeloLista = new DefaultListModel();
    public static DefaultListModel rolesModel = new DefaultListModel();
    public static DefaultListModel<String> modeloLista2 = new DefaultListModel();

    ; // Solo letras y espacios
    public static void registraVenta(String idCliente, int idRegistro,
            String idVehiculo, String fecha, int cantV, double monto) {
        Inserts.registraVenta(idCliente, idRegistro, idVehiculo, fecha, cantV, monto);
    }

    public static void registraCliente(String id, String tel, String nom, String apP, String apM, String dir) {
        if (id.isEmpty() || tel.isEmpty() || nom.isEmpty() || apP.isEmpty() || apM.isEmpty() || dir.isEmpty()) {
            JOptionPane.showMessageDialog(Principal.venta, "Debes rellenar todos los campos del cliente");
        } else {
            Inserts.registraCliente(id, tel, nom, apP, apM, dir);
        }
    }

    public static void resta(int cantidad, String id) {
        if (!id.isEmpty()) {
            Updates.resta(cantidad, id);
        }
    }

    public static void consultaEmpleado(String id) {
        ResultSet rs = Querys.buscaIdEm(id);
    }

    public static void suma(String id) {
        if (!id.isEmpty()) {
            Updates.suma(id);
        }
    }

    public static void deleteDeudaId(int id) {
        boolean b = Delets.deleteDeudaId(id);
        if (b) {
            JOptionPane.showMessageDialog(null, "La deuda a sido eliminada correctamente");
        }

    }

    public static void llenaVentaID(String id) {
        x.setId(id);
        ResultSet rs = x.buscaId();
        try {
            while (rs.next() == true) {
                Principal.txtId.setText(rs.getString("idvehiculo"));
                Principal.txtN.setText(rs.getString("nombre"));
                Principal.txtTipo.setText(rs.getString("tipo"));
                Principal.txtMarca.setText(rs.getString("marca"));
                Principal.txtColor.setText(rs.getString("color"));
                Principal.txtAnio.setText(rs.getString("anio"));
                Principal.txtModelo.setText(rs.getString("modelo"));
                Principal.txtPrecio.setText(rs.getString("precio"));
                Principal.precio = rs.getDouble("precio");
                Principal.txtMonto.setText("" + rs.getDouble("precio"));
                Principal.existence.setText("En existencia:" + rs.getString("cantidad"));

            }
        } catch (SQLException e) {
        }
    }

    public static void llenaVentaModelo(String modelo) {
        x.setModelo(modelo);
        ResultSet rs = x.buscaModelo();
        try {
            while (rs.next() == true) {
                Principal.txtId.setText(rs.getString("idvehiculo"));
                Principal.txtN.setText(rs.getString("nombre"));
                Principal.txtTipo.setText(rs.getString("tipo"));
                Principal.txtMarca.setText(rs.getString("marca"));
                Principal.txtColor.setText(rs.getString("color"));
                Principal.txtAnio.setText(rs.getString("anio"));
                Principal.txtModelo.setText(rs.getString("modelo"));
                Principal.txtPrecio.setText(rs.getString("precio"));
                Principal.precio = rs.getDouble("precio");
            }
        } catch (SQLException e) {
        }
    }

    public static void llenaVentaBrand(String brand) {
        x.setBrand(brand);
        ResultSet rs = x.buscaBrand();
        try {
            while (rs.next() == true) {
                Principal.txtId.setText(rs.getString("idvehiculo"));
                Principal.txtN.setText(rs.getString("nombre"));
                Principal.txtTipo.setText(rs.getString("tipo"));
                Principal.txtMarca.setText(rs.getString("marca"));
                Principal.txtColor.setText(rs.getString("color"));
                Principal.txtAnio.setText(rs.getString("anio"));
                Principal.txtModelo.setText(rs.getString("modelo"));
                Principal.txtPrecio.setText(rs.getString("precio"));
                Principal.precio = rs.getDouble("precio");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //
    public static void llenaPerfil(String id) {
        ResultSet rs = Querys.buscaContacto(id);
        if (rs != null) {
            try {
                while (rs.next() == true) {
                    Principal.txtEmail.setText(rs.getString("email"));
                    Principal.txtPhone.setText(rs.getString("telefono"));
                    Principal.txtUbicacion.setText(rs.getString("ubicacion"));
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
    //

    //
    public static void buscaIdna(String ID) {
        String id = ID.replace(" ", "").toUpperCase();
        ResultSet rs = Querys.buscaIdEm(id);
        int cont = 0;
        try {
            while (rs.next() == true) {
                InicioFrame.txtId.setText(rs.getString("idempleado"));
                cont++;
            }
            if (cont == 0) {
                JOptionPane.showMessageDialog(InicioFrame.addNewUser, "No se encontraron coincidencias con el ID " + ID);
                InicioFrame.txtBusca.setText("");
                InicioFrame.txtId.setText("");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
//            

    }

    //
    //nuevo metodo
    public static void buscaModelo(String modelo) {

        Object[] inv = {};
        String m = modelo.replace(" ", "");
        x.setModelo(m);
        ResultSet rs = Querys.buscaModelo();
        if (rs != null) {
            try {
                while (rs.next() == true) {
                    inv = new Object[]{rs.getString("idvehiculo"), rs.getString("tipo"), rs.getString("descripcion"),
                        rs.getString("cantidad"), rs.getString("marca"), rs.getString("modelo"),
                        rs.getString("precio"), rs.getString("nombre")};

                    Inventario.modeloInventario.addRow(inv);
                    Inventario.tableInventario.setModel(Inventario.modeloInventario);
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontrar" + m + ". ");
        }
    }

    public static void deleteRol(String name) {
        if (Querys.isSuper()) {
            Delets.deleteRol(name);
        } else {
            JOptionPane.showMessageDialog(InicioFrame.roles, "No se elimino el usuario porque usted no tiene permisos necesario");
        }
    }

    public static void buscaId(String id) {
        Object[] inv = {};
        String i = id.replace(" ", "");
        x.setId(i);
        ResultSet rs = Querys.buscaId();
        if (rs != null) {
            try {
                while (rs.next() == true) {
                    inv = new Object[]{rs.getString("idvehiculo"), rs.getString("tipo"), rs.getString("descripcion"),
                        rs.getString("cantidad"), rs.getString("marca"), rs.getString("modelo"),
                        rs.getString("precio"), rs.getString("nombre")};

                    Inventario.modeloInventario.addRow(inv);
                    Inventario.tableInventario.setModel(Inventario.modeloInventario);
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public static void buscaNombre(String nombre) {
        Object[] inv = {};
        String m = nombre.replace(" ", "");
        x.setMarca(m);
        ResultSet rs = Querys.buscaNombre();
        if (rs != null) {
            try {
                while (rs.next() == true) {
                    inv = new Object[]{rs.getString("idvehiculo"), rs.getString("tipo"), rs.getString("descripcion"),
                        rs.getString("cantidad"), rs.getString("marca"), rs.getString("modelo"),
                        rs.getString("precio"), rs.getString("nombre")};

                    Inventario.modeloInventario.addRow(inv);
                    Inventario.tableInventario.setModel(Inventario.modeloInventario);
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    //----------------------------------------------------------------------------------
    //ArrayList para verificar que tipo de usuario es (Se va a eliminar al implementar roles)
    private static ArrayList adminOuser = new ArrayList();
    private static Object[] cabecera = {"ID", "TIPO", "DESCRIPCIÓN", "CANTIDAD", "MARCA", "MODELO", "PRECIO", "NOMBRE"};
    private static DefaultTableModel modeloInventario = new DefaultTableModel();

    //Metodo el cual creara un modelo para alguna tabla¿
    public static DefaultTableModel mkmodel() {
        modeloInventario.setColumnIdentifiers(cabecera);
        return modeloInventario;
    }

    //Metodo de control para insertar un nuevo empleado
    public static void insertaE(String idocurp, String nombre,
            String apellidoP, String apellidoM, String fechaN, String fechaI,
            String estado, String telefono, String mail, String ubi, int idpuesto) {
        Inserts.querysInsertEmpleados(idocurp, nombre, apellidoP, apellidoM, fechaN, fechaI,
                estado, telefono, mail, ubi, idpuesto);
    }

    //Metodo para la peticion de la barra buscadora de empleados
    public static void buscaEmpleadoId(String busca) {
        Object[] empl = {};
        ResultSet rs = buscaIdEm(busca);
        try {
            while (rs.next() == true) {
                empl = new Object[]{rs.getString("idempleado"), rs.getString("nombre"), rs.getString("apellidop"), rs.getString("apellidom")};
                GestionEmpleados.dtm.addRow(empl);
                GestionEmpleados.tableEmpleados.setModel(GestionEmpleados.dtm);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void buscaEmpleadoName(String busca) {
        Object[] empl = {};
        ResultSet rs = buscaNameEm(busca);
        try {
            while (rs.next() == true) {
                empl = new Object[]{rs.getString("idempleado"), rs.getString("nombre"), rs.getString("apellidop"), rs.getString("apellidom")};
                GestionEmpleados.dtm.addRow(empl);
                GestionEmpleados.tableEmpleados.setModel(GestionEmpleados.dtm);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Metodo para consultar todos los empleados para mostrar algunos datos relevantes en la tabla empleados
    public static void consulta() {
        Object[] empl = {};
        ResultSet rs = null;
        rs = consultaEmpleados();
        try {
            while (rs.next() == true) {
                empl = new Object[]{rs.getString("idempleado"), rs.getString("nombre"), rs.getString("apellidop"), rs.getString("apellidom")};

                GestionEmpleados.dtm.addRow(empl);
                GestionEmpleados.tableEmpleados.setModel(GestionEmpleados.dtm);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Metodo que elimina un empleados mediante ID
    public static void eliminaE(String id) {
        eliminarEmpleado(id);
    }

    //Metodo para mostrar los datos completos del empleado en la vista GestionEmpleados y asi actualizar
    public static void llenaActualizarEmpleado(String id) {
        String idc = "", nombre = "", apellidopaterno = "", apellidomaterno = "", fechanacimiento = "",
                fechaingreso = "", estado = "", telefono = "", mail = "", ubicacion = "";
        ResultSet rs = llenaActulizarE(id);

        try {
            while (rs.next() == true) { //Optimizar metodo
                idc = rs.getString("idempleado");
                nombre = rs.getString("nombre");
                apellidopaterno = rs.getString("apellidop");
                apellidomaterno = rs.getString("apellidom");
                fechanacimiento = rs.getString("fechanacimiento");
                fechaingreso = rs.getString("fechaingreso");
                estado = rs.getString("status");

            }
            ResultSet rs2 = selectContacto(id);
            while (rs2.next() == true) {
                telefono = rs2.getString("telefono"); //sacar de la tabla contactos con otra query
                mail = rs2.getString("email");
                ubicacion = rs2.getString("ubicacion");
            }

            GestionEmpleados.txtNombre.setText(nombre);
            GestionEmpleados.id.setText(idc);
            GestionEmpleados.txtPaterno.setText(apellidopaterno);
            GestionEmpleados.txtMaterno.setText(apellidomaterno);
            GestionEmpleados.txtFN.setText(fechanacimiento);
            GestionEmpleados.txtFI.setText(fechaingreso);
            GestionEmpleados.comboEstado.setSelectedItem(estado);
            GestionEmpleados.txtTelefono.setText(telefono);
            GestionEmpleados.txtMail.setText(mail);
            GestionEmpleados.txtUbi.setText(ubicacion);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Metodo que verifica si es un usuario administrador o un usuario de alguna otra area (se va a eliminar cuando se implementen roles)
    public static ArrayList verificaAdmin(String user, String password) {
        adminOuser.clear();
        ResultSet rs = queryusers("administradores", user, password);
        if (rs != null) {
            try {
                while (rs.next() == true) {
                    adminOuser.addLast(rs.getString("nameuser"));
                    adminOuser.addLast(rs.getString("contrasenia"));

                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al consultar");
            }
        }
        return adminOuser;

    }

    //Metodo que verifica si es un contador (Se eliminara al implementar roles)
    public static ArrayList verificaConta(String user, String password) {
        adminOuser.clear();
        ResultSet rs = queryusers("contadores", user, password);
        if (rs != null) {
            try {
                while (rs.next() == true) {
                    adminOuser.addLast(rs.getString("nameuser"));
                    adminOuser.addLast(rs.getString("contrasenia"));

                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al consultar");
            }
        }
        return adminOuser;
    }

    //Metodo que consulta datos del inventario de automoviles para llenar la tabla en la vista Inventario
    public static Object[] consultaInv() {
        int cont = 0;
        Object[] inv = {};
        ResultSet rs = queryInventary();
        try {
            while (rs.next() == true) {
                inv = new Object[]{rs.getString("idvehiculo"), rs.getString("tipo"), rs.getString("descripcion"),
                    rs.getString("cantidad"), rs.getString("marca"), rs.getString("modelo"),
                    rs.getString("precio"), rs.getString("nombre")};
                Inventario.modeloInventario.addRow(inv);
                Inventario.tableInventario.setModel(Inventario.modeloInventario);
            }
            return inv;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return inv;
    }

    //Metodo que actualiza los datos de la tabla inventario
    public static void actualizaI(String id) {
        ResultSet rs = queryUpdateI(id);
        String tipo = "", descripcion = "", marca = "", modelo = "", num_serie = "", precio = "", nombre = "";
        String cantidad = "", color = "";
        int anio = 0;
        try {
            while (rs.next() == true) {
                tipo = rs.getString("tipo");
                descripcion = rs.getString("descripcion");
                cantidad = rs.getString("cantidad");
                marca = rs.getString("marca");
                modelo = rs.getString("modelo");
                num_serie = rs.getString("idvehiculo");
                precio = rs.getString("precio");
                nombre = rs.getString("nombre");
                color = rs.getString("color");
                anio = rs.getInt("anio");
            }
            Inventario.comboColor.setSelectedItem(color);
            Inventario.Sanio.setText("" + anio);
            Inventario.txtUdescripcion.setText(descripcion);
            Inventario.txtUcantidad.setText(cantidad);
            Inventario.txtUmodelo.setText(modelo);
            Inventario.txtUnoserie.setText(num_serie);
            Inventario.txtUprecio.setText(precio);
            Inventario.txtUnombre.setText(nombre);
            Inventario.comboMarca.setSelectedItem(marca);
            Inventario.comboTipo.setSelectedItem(tipo);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    //Elimina un automovil mediante su ID
    public static void deleteCar(String idcar) {
        boolean b = querydelete(idcar);
        if (b) {
            Inventario.btnConsulta.doClick();
        }
    }

    //Metodo para insertar un nuevo registro a a la tabla de inventario
    public static void insertInventario(String tipo, String descripcion,
            int cantidad, String marca, String modelo, String num_serie, Double precio, String nombre) {
        Inserts.queryInsertInventario("automovil", tipo, descripcion, cantidad, marca, modelo, num_serie, precio, nombre);
        Inventario.btnConsulta.doClick();
    }

    //Metodo de controlador para actualizar un registro de la tabla inventario
    public static void actuInventario(String id, String tipo, String descripcion,
            int cantidad, String marca, String modelo, String num_serie, Double precio, String nombre, int anio, String color) {
        queryUpdateInventario(id, tipo, descripcion, cantidad, marca, modelo, num_serie, precio, nombre, anio, color);
        Inventario.btnConsulta.doClick();
    }

    //Metodo para actualizar un empleado
    public static boolean actualizarEmpleado(String id, String nombre, String paterno, String materno, String ubicacion, String telefono, String mail, String status, String fn, String fi) {
        try {

            Updates.actualizarEmpleado(id, nombre, paterno, materno, ubicacion, telefono, mail, status, fn, fi);
            JOptionPane.showMessageDialog(GestionEmpleados.jdActualizar, "Actualización exitosa");
            return true;
        } catch (Exception e) {
            System.out.println("Error al actualizar empleado: " + e.getMessage());
            return false;
        }
    }

    public static void buscaPv(String id) {
        pv.clear();
        logica.x.setId(id);
        ResultSet rs = Querys.buscaId();
        try {
            while (rs.next() == true) {
                pv.addLast(rs.getString("idvehiculo"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void buscaPvm(String model) {
        pv.clear();
        logica.x.setModelo(model);
        ResultSet rs = Querys.buscaModelo();
        try {
            while (rs.next() == true) {
                pv.addLast(rs.getString("modelo"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void buscaPvname(String nombre) {
        pv.clear();
        logica.x.setMarca(nombre);
        ResultSet rs = Querys.buscaNombre();
        try {
            while (rs.next() == true) {
                pv.addLast(rs.getString("nombre"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //
    public static void shopPromo() {
        ResultSet rs = Querys.getShopPromo();
        try {
            while (rs.next() == true) {
                if (nombres.size() <= 18) {
                    nombres.addLast(rs.getString("nombre"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Efitar este metodo 
    public static void searchUserNow(String pass) {
        ResultSet rs = Querys.searchUserNow(pass);

        try {
            while (rs.next() == true) {
                idNow = rs.getString("idempleado");

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //
    public static void llenaComboLogin() {

        ResultSet rs = Querys.rolesLista();
        String rol = "";
        try {
            while (rs.next()) {
                rol = rs.getString("rolname");
                if (!rol.equals("postgres")) {
                    Files.addlist(rol);
                }
            }

        } catch (SQLException e) {

        }
    }

    public static void newCuenta(String leter, String id, String nombreUsuario, String pass) {
        boolean yesNo = false;
        switch (leter) {
            case "a":
                yesNo = Inserts.createSuperUser(nombreUsuario, pass);
                break;
            case "r":
                yesNo = Inserts.createRh(nombreUsuario, pass);
                break;
            case "p":
                yesNo = Inserts.createPv(nombreUsuario, pass);
                break;
            case "c":
                yesNo = Inserts.createConta(nombreUsuario, pass);
                break;
        }

        if (yesNo) {
            JOptionPane.showMessageDialog(InicioFrame.addNewUser, "Cuenta creada con exito: \n"
                    + "Nombre de usuario: " + nombreUsuario
                    + "\nContraseña: " + pass);
            Inserts.registerNewCuenta(id, pass);
        } else {
            JOptionPane.showMessageDialog(InicioFrame.addNewUser, "Error al crear la cuenta de " + nombreUsuario);
        }
    }

    //
    //
    public static JList consultaGastos(JList listaGastos) {

        ResultSet rs = null;

        try {
            // Llamada al método que ya realiza la consulta
            rs = Querys.queryGastos();

            while (rs.next()) {
                // Construir un texto descriptivo para cada elemento de la lista
                String item = String.format(
                        rs.getString("descripcion") + "_" + rs.getString("idgasto"));
                modeloLista.addElement(item); // Agregar cada elemento al modelo de lista
            }

            // Asignar el modelo al JList
            listaGastos.setModel(modeloLista);

        } catch (SQLException e) {
            System.out.println("Error al cargar la lista de gastos: " + e.getMessage());
        }
        return listaGastos;

    }

    public static void rolesLista() {
        ResultSet rs = Querys.rolesLista();
        String rol = "";
        try {
            while (rs.next()) {
                rol = rs.getString("rolname");
                if (!rol.equals("postgres")) {
                    rolesModel.addElement(rol);
                }
            }
            InicioFrame.listaRoles.setModel(rolesModel);
        } catch (SQLException e) {

        }
    }

    public static void registraAll() {
        logica.registraRegistro(ventas);
        int idRegistro = Controlador.logica.endRegister();
        String[] str = cantidad.getText().split("_");
        int ctv = Integer.parseInt(str[1]);
//        logica.resta(Integer.parseInt(str[1]), txtId.getText());
        logica.registraVenta(txtClienteId.getText(), idRegistro, txtId.getText(), txtFecha.getText(), ctv, Double.parseDouble(txtMonto.getText()));
        String venta = "\n   " + txtId.getText() + "\t" + txtN.getText() + " " + labelTresP.getText() + " " + "\n-----------------------------------------------------------------------------------------------------\n";
        Controlador.Files.agregaVenta(venta);
    }

    public static void registraRegistro(String tipo) {
        Inserts.registrarRegistro(tipo);
    }

    public static int endRegister() {
        int reg = 0;

        ResultSet rs = Querys.endRegister();
        try {
            while (rs.next()) {
                reg = rs.getInt("idregistro");
                return reg;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return reg;
    }

    //Metodo para concultar los deudas
    public static JList consultaDeudas(javax.swing.JList<String> listaDeudas) {

        ResultSet rs = null;

        try {
            // Llamada al método que ya realiza la consulta
            rs = Querys.queryDeudas();

            while (rs.next()) {
                // Construir un texto descriptivo para cada elemento de la lista
                String item = String.format(
                        rs.getString("motivo") + "_" + rs.getString("iddeuda"));

                modeloLista2.addElement(item); // Agregar cada elemento al modelo de lista
            }

            // Asignar el modelo al JList
            listaDeudas.setModel(modeloLista2);

        } catch (SQLException e) {
            System.out.println("Error al cargar la lista de gastos: " + e.getMessage());
        }
        return listaDeudas;

    }

    public static void buscaClienteId(String id) {
        int cont = 0;
        ResultSet rs = Querys.buscaCliente(id);
        try {
            while (rs.next() == true) {
                Principal.txtClienteId.setText(rs.getString("idcliente"));
                Principal.txtTelefonoC.setText(rs.getString("telefono"));
                Principal.txtNombreC.setText(rs.getString("nombre"));
                Principal.txtApellidoP.setText(rs.getString("apellidop"));
                Principal.txtApellidoM.setText(rs.getString("apellidom"));
                Principal.txtDireccionC.setText(rs.getString("direccion"));
                Principal.existNo = true;
                cont++;
            }
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        if (cont == 0) {
            Principal.existNo = false;
//            Principal.btnRegistraCliente.setVisible(true);
        }

    }

    //
    public static void registrarGasto(int idRegistro, String fecha, String descripcion, double total, String metodoDePago) {
        Inserts.registrarGasto(idRegistro, fecha, descripcion, total, metodoDePago);
    }

    public static void registrarCompra(int idRegistro, double total, String metodoDePago, String descripcion, String fecha) {
        Inserts.registrarCompra(idRegistro, total, metodoDePago, descripcion, fecha);
    }

    public static void registrarDeuda(int idRegistro, String motivo, String fecha, double monto, String metodoDePago, double interes, String acreedor, int mesesPlazo) {
        Inserts.registrarDeuda(idRegistro, motivo, fecha, monto, metodoDePago, interes, acreedor, mesesPlazo);
    }

}
