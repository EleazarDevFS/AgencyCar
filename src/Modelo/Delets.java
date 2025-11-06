
package Modelo;

import static Modelo.Conexion.con;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Delets {
    
 /**
 * Elimina una deuda de la base de datos según su ID.
 * 
 * @param id Identificador único de la deuda a eliminar.
 * @return true si la eliminación fue exitosa, false en caso de error.
 */
public static boolean deleteDeudaId(int id) {
    ResultSet rs = null;
    String query = "DELETE FROM \"privateSchema\".deudas WHERE iddeuda=?";
    try {
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        rs = ps.executeQuery(); // DELETE no devuelve un ResultSet, debería usarse executeUpdate()
        return true;
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return false;
}

/**
 * Elimina un empleado de la base de datos según su ID.
 * 
 * @param id Identificador único del empleado a eliminar.
 */
public static void eliminarEmpleado(String id) {
    String query = "DELETE FROM \"privateSchema\".empleado WHERE idempleado = ?";
    try (PreparedStatement ps = con.prepareStatement(query)) {
        ps.setString(1, id);
        ps.executeQuery(); // DELETE no devuelve un ResultSet, debería usarse executeUpdate()
    } catch (Exception e) {
        System.out.println(e);
    }
}

/**
 * Elimina un vehículo de la base de datos según su ID.
 * 
 * @param id Identificador único del vehículo a eliminar.
 * @return true si la eliminación fue exitosa, false en caso de error.
 */
public static boolean querydelete(String id) {
    boolean b = false;
    String query = "DELETE FROM \"privateSchema\".vehiculos WHERE idvehiculo=?";
    try {
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, id);
        ps.execute(); // Se recomienda usar executeUpdate() para DELETE
        b = true;
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return b;
}
public static void deleteRol(String n){
    String query="REVOKE ALL ON SCHEMA \"privateSchema\" FROM \""+n+"\";"
            +"REVOKE ALL PRIVILEGES ON ALL TABLES IN SCHEMA \"privateSchema\" FROM \""+n+"\"; "
            +"REVOKE ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA \"privateSchema\" FROM \""+n+"\"; " +
        "REVOKE ALL PRIVILEGES ON ALL FUNCTIONS IN SCHEMA \"privateSchema\" FROM \""+n+"\"; " +
        "DROP OWNED BY \""+n+"\" CASCADE; " 
            + "DROP ROLE \""+n+"\";";
    
    try{
        PreparedStatement ps =con.prepareStatement(query);
        ps.execute();
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
}

}
