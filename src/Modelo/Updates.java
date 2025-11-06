package Modelo;

import static Modelo.Conexion.con;
import Vista.Inventario;
import static Vista.Login.conn;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.CallableStatement;
import javax.swing.JOptionPane;

public class Updates {
//
   /**
 * Llama a un procedimiento almacenado para restar una cantidad del inventario de un vehículo.
 *
 * @param cantidad Cantidad a restar.
 * @param id ID del vehículo.
 */
public static void resta(int cantidad, String id) {
    try {
        CallableStatement stmt = con.prepareCall("{CALL \"privateSchema\".resta_cantidad(?, ?)}");

        // Asignar parámetros
        stmt.setInt(1, cantidad); // Cantidad a restar
        stmt.setString(2, id);    // ID del vehículo

        // Ejecutar la función
        stmt.execute();
        System.out.println("Cantidad restada correctamente.");
    } catch (SQLException e) {
        System.out.println("Error al restar cantidad: " + e.getMessage());
    }
}

/**
 * Llama a un procedimiento almacenado para sumar compras a un vehículo en el inventario.
 *
 * @param id ID del vehículo.
 */
public static void suma(String id) {
    try {
        CallableStatement stmt = con.prepareCall("{CALL \"privateSchema\".suuma_compras(?)}");
        stmt.setString(1, id); // ID del vehículo
        stmt.execute();
        System.out.println("Cantidad sumada correctamente.");
    } catch (SQLException e) {
        System.out.println("Error al sumar cantidad: " + e.getMessage());
    }
}

/**
 * Actualiza la información de contacto de un empleado en la base de datos.
 *
 * @param id ID del empleado.
 * @param ubicacion Ubicación del empleado.
 * @param email Correo electrónico del empleado.
 * @param telefono Teléfono del empleado.
 */
public static void contactoEmpleado(String id, String ubicacion, String email, String telefono) {
    String query = "UPDATE  contacto_empleado SET ubicacion = ?, email = ?, telefono = ? WHERE idempleado=  ?;";
    try {
        PreparedStatement ps = Conexion.con.prepareStatement(query);
        ps.setString(1, ubicacion);
        ps.setString(2, email);
        ps.setString(3, telefono);
        ps.setString(4, id);

        int rowsInserted = ps.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Contacto del empleado editado correctamente.");
        } else {
            System.out.println("Error: No se pudo editar el contacto del empleado.");
        }
    } catch (SQLException e) {
        System.out.println("Error al actualizar el contacto del empleado: " + e.getMessage());
    }
}

/**
 * Actualiza los datos de un empleado en la base de datos mediante su ID.
 *
 * @param ID ID del empleado.
 * @param nombre Nombre del empleado.
 * @param paterno Apellido paterno.
 * @param materno Apellido materno.
 * @param ubicacion Ubicación del empleado.
 * @param telefono Teléfono del empleado.
 * @param mail Correo electrónico del empleado.
 * @param status Estado del empleado.
 * @param fn Fecha de nacimiento en formato "YYYY-MM-DD".
 * @param fi Fecha de ingreso en formato "YYYY-MM-DD".
 */
public static void actualizarEmpleado(String ID, String nombre, String paterno, String materno, 
                                      String ubicacion, String telefono, String mail, 
                                      String status, String fn, String fi) {
    String query = "UPDATE \"privateSchema\".empleado SET nombre = ?, apellidopaterno = ?, apellidomaterno = ?, "
                 + "fechanacimiento = ?, fechaingreso = ?, estado = ?, telefono = ?, mail = ?, ubicacion = ? WHERE id = ?";

    try {
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, nombre);
        ps.setString(2, paterno);
        ps.setString(3, materno);
        ps.setDate(4, java.sql.Date.valueOf(fn)); // Convierte la fecha de String a Date
        ps.setDate(5, java.sql.Date.valueOf(fi)); // Convierte la fecha de String a Date
        ps.setString(6, status);
        ps.setString(7, telefono);
        ps.setString(8, mail);
        ps.setString(9, ubicacion);
        ps.setString(10, ID);

        int rowsUpdated = ps.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Empleado actualizado correctamente.");
        }
    } catch (SQLException e) {
        System.out.println("Error al actualizar empleado: " + e.getMessage());
    }
}

/**
 * Actualiza los datos de un automóvil en el inventario mediante su ID.
 *
 * @param id ID del automóvil.
 * @param tipo Tipo de vehículo.
 * @param descripcion Descripción del vehículo.
 * @param cantidad Cantidad disponible en el inventario.
 * @param marca Marca del vehículo.
 * @param modelo Modelo del vehículo.
 * @param num_serie Número de serie del vehículo.
 * @param precio Precio del vehículo.
 * @param nombre Nombre del vehículo.
 */
public static void queryUpdateInventario(String id, String tipo, String descripcion, int cantidad, 
                                         String marca, String modelo, String num_serie, 
                                         Double precio, String nombre, int anio, String color) {
    String query = "UPDATE \"privateSchema\".vehiculos SET tipo = ?, descripcion = ?, cantidad = ?, marca = ?, modelo = ?, "
                 + "anio=?, color=?, precio = ?, nombre = ? WHERE idvehiculo = ?;";

    try {
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, tipo);
        ps.setString(2, descripcion);
        ps.setInt(3, cantidad);
        ps.setString(4, marca);
        ps.setString(5, modelo);
        ps.setInt(6, anio);
        ps.setString(7, color);
        ps.setDouble(8, precio);
        ps.setString(9, nombre);
        ps.setString(10, id);
        ps.executeUpdate(); // Se cambió `executeQuery()` por `executeUpdate()` ya que es una operación UPDATE.
        Inventario.updateV.setVisible(false);
        JOptionPane.showMessageDialog(null, "Vehiculo actualizado.");
    } catch (SQLException e) {
        System.out.println("Error al actualizar inventario: " + e.getMessage());
    }
}


}
