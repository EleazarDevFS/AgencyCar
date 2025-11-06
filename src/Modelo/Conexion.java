package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    private static String user = "";
    private static String password = "";
    private static String url = "jdbc:postgresql://localhost:5432/";
    public static Connection con;

    //Metodo para hacer la conexion a la BD
    public static boolean conectagency() {
        try {
            con = DriverManager.getConnection(url + "agenciaBd", user, password);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error verifique su usuario y contraseña.", "ERROR", JOptionPane.ERROR_MESSAGE);

            return false;
        }
    }

    //Metodo para cerrar la conexion a la BD
    public static void closeBd() {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        Conexion.user = user;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Conexion.password = password;
    }
}
