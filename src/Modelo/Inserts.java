package Modelo;

import static Modelo.Conexion.con;
import Vista.InicioFrame;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Inserts {
    
    /**
 * Registra una nueva venta en la base de datos.
 *
 * @param idCliente   Identificador del cliente que realiza la compra.
 * @param idRegistro  Identificador del registro asociado a la venta.
 * @param idVehiculo  Identificador del vehículo vendido.
 * @param fecha       Fecha de la venta en formato "YYYY-MM-DD".
 * @param cantV       Cantidad de vehículos vendidos.
 * @param monto       Monto total de la venta.
 */
public static void registraVenta(String idCliente, int idRegistro,
                                 String idVehiculo, String fecha, int cantV, double monto) {
    String query = "INSERT INTO \"privateSchema\".ventas (idcliente, idregistro, idvehiculo, fecha, cantidadvendida, montototal) "
            + "VALUES (?, ?, ?, ?, ?, ?)";
    java.sql.Date fech = java.sql.Date.valueOf(fecha);
    try {
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, idCliente);
        ps.setInt(2, idRegistro);
        ps.setString(3, idVehiculo);
        ps.setDate(4, fech);
        ps.setInt(5, cantV);
        ps.setDouble(6, monto);
        ps.executeUpdate(); // Se recomienda executeUpdate() en lugar de executeQuery() para INSERT
    } catch (SQLException e) {
        System.out.println("Error: " + e.getMessage());
    }
}

/**
 * Registra una nueva cuenta en la base de datos.
 *
 * @param id   Identificador único del usuario.
 * @param pass Contraseña de la cuenta.
 */
public static void registerNewCuenta(String id, String pass) {
    String query = "INSERT INTO \"privateSchema\".cuentas VALUES (?, ?)";
    try {
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, id);
        ps.setString(2, pass);
        ps.execute();
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}

/**
 * Registra un nuevo cliente en la base de datos.
 *
 * @param id   Identificador único del cliente.
 * @param tel  Número de teléfono del cliente.
 * @param nom  Nombre del cliente.
 * @param apP  Apellido paterno del cliente.
 * @param apM  Apellido materno del cliente.
 * @param dir  Dirección del cliente.
 */
public static void registraCliente(String id, String tel, String nom, String apP, String apM, String dir) {
    String query = "INSERT INTO \"privateSchema\".cliente VALUES (?, ?, ?, ?, ?, ?, ?)";
    try {
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, id);
        ps.setString(2, nom);
        ps.setString(3, apP);
        ps.setString(4, apM);
        ps.setString(5, tel);
        ps.setString(6, dir);
        ps.setInt(7, 1); // Se asume que este valor representa un estado o categoría fija.
        ps.execute();
    } catch (SQLException e) {
        System.out.println("Error: " + e.getMessage());
    }
}

/**
 * Crea una nueva cuenta de usuario en la base de datos y asigna permisos.
 *
 * @param nombreUsuario Nombre de usuario para la cuenta.
 * @param pass          Contraseña del usuario.
 * @return true si la cuenta se creó correctamente, false en caso contrario.
 */
public static boolean createSuperUser(String nombreUsuario, String pass){
    String query="CREATE ROLE \""+nombreUsuario+"\" WITH LOGIN SUPERUSER PASSWORD '"+pass+"';";
    
    try {
        PreparedStatement createUserStmt = con.prepareStatement(query);
        createUserStmt.execute();
        return true;
    } catch (SQLException e) {
        System.out.println("Error: " + e.getMessage());
    }
    return false;
}
public static boolean createPv(String nombreUsuario, String pass){
    String query="CREATE ROLE \""+nombreUsuario+"\" WITH LOGIN PASSWORD '"+pass+"';"
            + "GRANT USAGE ON SCHEMA \"privateSchema\" TO \""+nombreUsuario+"\";"
            + "GRANT SELECT, INSERT, UPDATE ON \"privateSchema\".ventas,\"privateSchema\".registros,"
            + "\"privateSchema\".vehiculos,\"privateSchema\".contacto_empleado,\"privateSchema\".cliente TO\""
            + ""+nombreUsuario+"\";GRANT readwrite TO \""+nombreUsuario+"\";";
    
    try {
        PreparedStatement createUserStmt = con.prepareStatement(query);
        createUserStmt.execute();
        return true;
    } catch (SQLException e) {
         if (e.getMessage().contains("already exists")) {
                JOptionPane.showMessageDialog(InicioFrame.addNewUser, "El rol '" + nombreUsuario + "' ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }
    return false;
}
public static boolean createConta(String nombreUsuario, String pass){
    String query="CREATE ROLE \""+nombreUsuario+"\" WITH LOGIN PASSWORD '"+pass+"';"
            + "GRANT USAGE ON SCHEMA \"privateSchema\" TO \""+nombreUsuario+"\";"
            + "GRANT SELECT, INSERT, UPDATE ON \"privateSchema\".vehiculos,\"privateSchema\".registros,"
            + "\"privateSchema\".deudas,\"privateSchema\".contacto_empleado,  \"privateSchema\".gastos TO \""+nombreUsuario+"\";"
            + "GRANT readwrite TO \""+nombreUsuario+"\";";
    
    try {
        PreparedStatement createUserStmt = con.prepareStatement(query);
        createUserStmt.execute();
        return true;
    } catch (SQLException e) {
         if (e.getMessage().contains("already exists")) {
                JOptionPane.showMessageDialog(null, "El rol '" + nombreUsuario + "' ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }
    return false;
}
public static boolean createRh(String nombreUsuario, String pass){
    String query="CREATE ROLE \""+nombreUsuario+"\" WITH LOGIN PASSWORD '"+pass+"';"
            + "GRANT USAGE ON SCHEMA \"privateSchema\" TO \""+nombreUsuario+"\";"
            + "GRANT SELECT, INSERT, UPDATE ON \"privateSchema\".empleado,\"privateSchema\".registros,"
            + "\"privateSchema\".puesto,\"privateSchema\".contacto_empleado,  \"privateSchema\".departamento "
            + "\"privateSchema\".area TO \""+nombreUsuario+"\";"
            + "GRANT readwrite TO \""+nombreUsuario+"\";";
    
    try {
        PreparedStatement createUserStmt = con.prepareStatement(query);
        createUserStmt.execute();
        return true;
    } catch (SQLException e) {
       if (e.getMessage().contains("already exists")) {
                JOptionPane.showMessageDialog(null, "El rol '" + nombreUsuario + "' ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }
    return false;
}

/**
 * Registra un nuevo registro en la base de datos.
 *
 * @param tipo Tipo de registro que se va a insertar.
 * @return true si la operación fue exitosa, false en caso de error.
 */
public static boolean registrarRegistro(String tipo) {
    String idEmpleado = Controlador.logica.idNow; // Obtiene el ID del empleado actual.
    String sql = "INSERT INTO \"privateSchema\".registros (idempleado, tipo) VALUES (?, CAST(? AS \"privateSchema\".tipo_registro))";
    try {
        PreparedStatement ps = Conexion.con.prepareStatement(sql);
        ps.setString(1, idEmpleado);
        ps.setString(2, tipo);
        ps.executeUpdate();
        return true;
    } catch (SQLException e) {
        System.out.println("Error: " + e.getMessage());
        return false;
    }
}

    // Método para registrar una deuda
    public static void registrarDeuda(int idregistro, String motivo, String fecha, double monto, String metododepago, double interes, String acreedor, int mesesPlazo) {
        String sql = "INSERT INTO \"privateSchema\".deudas (idregistro, motivo, fecha, monto, metododepago, interes, acreedor, mesesplazo) VALUES (?, ?, ?, ?,CAST(? AS \"privateSchema\".metodo_de_pago), ?, ?,?)";
        java.sql.Date fech = java.sql.Date.valueOf(fecha);
        try {
            PreparedStatement ps = Conexion.con.prepareStatement(sql);
            ps.setInt(1, idregistro);
            ps.setString(2, motivo);
            ps.setDate(3, fech);
            ps.setDouble(4, monto);
            ps.setString(5, metododepago);
            ps.setDouble(6, interes);
            ps.setString(7, acreedor);
            ps.setInt(8, mesesPlazo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deuda registrada correctamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar deuda: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para registrar un gasto
    public static void registrarGasto(int idRegistro, String fecha, String descripcion, double total, String metodoDePago) {
        String sql = "INSERT INTO \"privateSchema\".gastos (idregistro, fecha, descripcion, total, metododepago) VALUES (?, ?, ?, ?, CAST(? AS \"privateSchema\".metodo_de_pago));";
        java.sql.Date fech = java.sql.Date.valueOf(fecha);
        try {
            PreparedStatement ps = Conexion.con.prepareStatement(sql);
            ps.setInt(1, idRegistro);
            ps.setDate(2, fech);
            ps.setString(3, descripcion);
            ps.setDouble(4, total);
            ps.setString(5, metodoDePago);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Gasto registrado correctamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar gasto: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para registrar una compra
    public static void registrarCompra(int idRegistro, double total, String metodoDePago, String descripcion, String fecha) {
        String sql = "INSERT INTO \"privateSchema\".compras (idregistro, total, metododepago, descripcion, fecha) "
                + "VALUES (?, ?, CAST(? AS \"privateSchema\".metodo_de_pago), ?, ?)";

        java.sql.Date fech = java.sql.Date.valueOf(fecha);
        try {
            PreparedStatement ps = Conexion.con.prepareStatement(sql);
            ps.setInt(1, idRegistro);
            ps.setDouble(2, total);
            ps.setString(3, metodoDePago);
            ps.setString(4, descripcion);
            ps.setDate(5, fech);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Compra registrada correctamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar compra: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método auxiliar para convertir cadenas en fechas SQL
    private static java.sql.Date convertirFecha(String fecha) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaUtil = formato.parse(fecha);
            return new java.sql.Date(fechaUtil.getTime());
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Formato de fecha inválido: " + fecha, "ERROR", JOptionPane.ERROR_MESSAGE);
            return null; // Regresa null si no se pudo convertir
        }
    }

    //Metodo que agrega un nuevo registro a la tabla automovil
    public static void queryInsertInventario(String tabla, String tipo, String descripcion,
            int cantidad, String marca, String modelo, String num_serie, Double precio, String nombre) {

        String query = "INSERT INTO " + tabla + "(tipo,descripcion,cantidad,marca,modelo,num_serie,"
                + "precio,nombre)values(?,?,?,?,?,?,?,?);";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, tipo);
            ps.setString(2, descripcion);
            ps.setInt(3, cantidad);
            ps.setString(4, marca);
            ps.setString(5, modelo);
            ps.setString(6, num_serie);
            ps.setDouble(7, precio);
            ps.setString(8, nombre);
            ps.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    //Metodo que agrega un nuevo registro a  la tabla de empleados
    public static void querysInsertEmpleados(String idocurp, String nombre,
            String apellidoP, String apellidoM, String fechaN, String fechaI,
            String estado, String telefono, String mail, String ubi, int idpuesto) {
        String query = "INSERT INTO \"privateSchema\".empleado (idempleado, idpuesto, nombre, apellidoP, "
                + "apellidoM, fechanacimiento, fechaingreso, status) VALUES (?, ?, ?, ?, ?, ?, ?, CAST(? AS \"privateSchema\".\"statusValido\"));";
        java.sql.Date fechaNac = java.sql.Date.valueOf(fechaN), fechaIngres = java.sql.Date.valueOf(fechaI); //Se castean los tipos de datos Date y ime
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, idocurp);
            ps.setInt(2, idpuesto);
            ps.setString(3, nombre);
            ps.setString(4, apellidoP);
            ps.setString(5, apellidoM);
            ps.setDate(6, fechaNac);
            ps.setDate(7, fechaIngres);
            ps.setString(8, estado);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception e) {
           if (e.getMessage().contains("ya existe")) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } 
        }
        try {
            String querycontact = "INSERT INTO \"privateSchema\".contacto_empleado VALUES(?,?,?,?)";
            PreparedStatement ps2 = con.prepareStatement(querycontact);
            ps2.setString(1, idocurp);
            ps2.setString(2, ubi);
            ps2.setString(3, mail);
            ps2.setString(4, telefono);

            ps2.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
