package Modelo;

import Controlador.logica;
import static Modelo.Conexion.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Querys {

    private String modelo;
    private String marca;
    private String id;
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static ResultSet buscaCliente(String id){
        ResultSet rs= null;
        String query="SELECT * FROM \"privateSchema\".cliente WHERE idcliente=?";
        try{
            PreparedStatement ps=  con.prepareStatement(query);
            ps.setString(1, id);
            rs=ps.executeQuery();
        }catch(SQLException e){}
        return rs;
    }
   
    
    //nuevos metodos
    public static ResultSet buscaModelo() {

        ResultSet rs = null;
        String modelo = logica.x.getModelo();
        modelo = "%" + modelo + "%";
        String query = "select * from \"privateSchema\".vehiculos where modelo like ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, modelo);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet rolesLista(){
        ResultSet rs=null;
        try{
            String query="SELECT rolname FROM pg_roles WHERE rolcanlogin = true;";
            PreparedStatement ps=con.prepareStatement(query);
            rs=ps.executeQuery();
            return rs;
        }catch(SQLException e){
            return rs;
        }
        
    }
    public static ResultSet buscaBrand() {

        ResultSet rs = null;
        String brand = logica.x.getBrand();
        brand = "%" + brand + "%";
        String query = "select * from \"privateSchema\".vehiculos where nombre like ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, brand);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static boolean isSuper(){
    String query="SELECT rolsuper FROM pg_roles WHERE rolname = '"+Conexion.getUser()+"';";
    ResultSet rs=null;
    try{
        PreparedStatement ps = con.prepareStatement(query);
        rs=ps.executeQuery();
       while(rs.next()){
           return rs.getBoolean("rolsuper");
       }
    }catch(SQLException e){}
    return false;
    }
    //Consulta para mostrar los datos en la lista  de gastos 

    public static ResultSet queryGastos() {
        ResultSet rs = null;
        String query = "SELECT  descripcion, idgasto FROM \"privateSchema\".gastos;";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {

        }

        return rs;
    }

    //Consulta para mostrar los datos en la lista deudasd
    public static ResultSet queryDeudas() {
        ResultSet rs = null;
        String query = "SELECT  motivo, iddeuda FROM \"privateSchema\".deudas;";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {

        }

        return rs;
    }

    public static ResultSet buscaId() {

        ResultSet rs = null;
        String id = logica.x.getId();
        id = "%" + id + "%";
        String query = "select * from \"privateSchema\".vehiculos where idvehiculo LIKE ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }

    public static ResultSet buscaContacto(String id) {
        ResultSet rs = null;
        id = id;
        String query = "select * from \"privateSchema\".contacto_empleado where idempleado= ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }

    /**
 * Busca el ID del empleado asociado a una cuenta en base a su contraseña.
 *
 * @param pass Contraseña de la cuenta asociada.
 * @return Un ResultSet con el ID del empleado, o null en caso de error.
 */
public static ResultSet searchUserNow(String pass) {
    ResultSet rs = null;
    String query = "SELECT idempleado FROM \"privateSchema\".cuentas WHERE asociada = ?";
    try {
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, pass); // Establece la contraseña como parámetro de la consulta.
        rs = ps.executeQuery(); // Ejecuta la consulta y obtiene el resultado.
        return rs;
    } catch (SQLException e) {
        System.out.println("Error al buscar usuario: " + e.getMessage());
    }
    return rs;
}

/**
 * Busca vehículos cuyo nombre coincida parcialmente con la marca obtenida desde la lógica del sistema.
 *
 * @return Un ResultSet con los vehículos encontrados, o null en caso de error.
 */
public static ResultSet buscaNombre() {
    ResultSet rs = null;
    String marca = logica.x.getMarca(); // Obtiene la marca desde la lógica del sistema.
    marca = "%" + marca + "%"; // Agrega comodines '%' para hacer una búsqueda parcial.
    
    String query = "SELECT * FROM \"privateSchema\".vehiculos WHERE nombre LIKE ?";
    try {
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, marca); // Establece la marca como parámetro de la consulta.
        rs = ps.executeQuery(); // Ejecuta la consulta y obtiene el resultado.
        return rs;
    } catch (SQLException e) {
        System.out.println("Error al buscar vehículo por nombre: " + e.getMessage());
    }
    return rs;
}


    //------------------------------------------------------------------------
    //Consulta todos los datos de la tabla automovil (tal vez se elimine y solo se deje queryUpdateI)
    public static ResultSet queryInventary() {
        ResultSet rs = null;
        String query = "select * from " + "\"privateSchema\"." + "vehiculos;";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
    //Consulta todo lo de la tabla automovil excepto el tipo de dato serial

    public static ResultSet queryUpdateI(String id) {
        ResultSet rs = null;
        String query = "select color, anio, idvehiculo, tipo,descripcion,cantidad,marca,modelo,precio,nombre from \"privateSchema\".vehiculos where idvehiculo=?;";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }

    //Consulta el usuario (Al agrgar roles ya no sera necesario este metodo)    
    public static ResultSet queryusers(String tabla, String user, String passw) {
        ResultSet rs = null;
        String query = "select nameuser, contrasenia from " + tabla + " where nameuser=? and contrasenia=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, passw);
            rs = ps.executeQuery();

        } catch (SQLException e) {
            System.out.println("ERROR");
        }
        return rs;
    }

    //Consulta todos los datos del empleado para mostrarlos en la ventana de actualizacion
    public static ResultSet llenaActulizarE(String id) {
        ResultSet rs = null;
        String query = "select idempleado, nombre, apellidop, "
                + "apellidom,fechanacimiento,"
                + "fechaingreso,status from \"privateSchema\".empleado where idempleado=?;";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
/**
 * Obtiene la información de contacto de un empleado según su ID.
 *
 * @param id Identificador único del empleado.
 * @return Un ResultSet con los datos de contacto (ubicación, email, teléfono) si existen,
 *         o null en caso de error o si no se encuentra el empleado.
 */
public static ResultSet selectContacto(String id) {
    ResultSet rs = null;
    String query = "SELECT ubicacion, email, telefono FROM \"privateSchema\".contacto_empleado WHERE idempleado = ?;";
    try {
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, id);
        rs = ps.executeQuery();
        return rs;
    } catch (SQLException e) {
        System.out.println("Error al obtener el contacto del empleado: " + e.getMessage());
    }
    return rs;
}


    //Consulta algunas coincidencias para la barra buscadora de empleados               
    public static ResultSet buscaIdEm(String busca) {
        String srh = "%" + busca + "%";
        ResultSet rs = null;
        String query = "select idempleado, nombre, apellidop, apellidom  from \"privateSchema\".empleado where  idempleado like ?"; //olvide poner el like
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, srh); //el problema esta en que rgresa un ResultSet nulo
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;

    }
    
 /**
 * Busca empleados cuyo nombre coincida parcialmente con el valor proporcionado.
 *
 * @param busca Cadena de búsqueda para filtrar empleados por nombre (se usa LIKE).
 * @return Un ResultSet con los empleados encontrados o null en caso de error.
 */
public static ResultSet buscaNameEm(String busca) {
    String srh = "%" + busca + "%"; // Se agrega el wildcard '%' para buscar coincidencias parciales.
    ResultSet rs = null;
    String query = "SELECT idempleado, nombre, apellidop, apellidom FROM \"privateSchema\".empleado WHERE nombre LIKE ?;";
    try {
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, srh); // Se establece el parámetro con el patrón de búsqueda.
        rs = ps.executeQuery();
        return rs;
    } catch (SQLException e) {
        System.out.println("Error al buscar empleados por nombre: " + e.getMessage());
    }
    return rs;
}

    //Consulta algunos datos relevantes del empleado para que aparezcan en la tabla

    public static ResultSet consultaEmpleados() {
        ResultSet rs = null;
        String query = "SELECT idempleado, nombre, apellidop, apellidom from \"privateSchema\".empleado;";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }

   /**
 * Obtiene la lista de nombres de los vehículos en promoción.
 *
 * @return Un ResultSet con los nombres de los vehículos, o null en caso de error.
 */
public static ResultSet getShopPromo() {
    ResultSet rs = null;
    String query = "SELECT nombre FROM \"privateSchema\".vehiculos;";
    try {
        PreparedStatement ps = con.prepareStatement(query);
        rs = ps.executeQuery(); // Ejecuta la consulta y obtiene los resultados.
        return rs;
    } catch (SQLException e) {
        System.out.println("Error al obtener las promociones de vehículos: " + e.getMessage());
    }
    return rs;
}

/**
 * Obtiene el último registro insertado en la tabla "registros".
 *
 * @return Un ResultSet con el ID del último registro, o null en caso de error.
 */
public static ResultSet endRegister() {
    ResultSet rs = null;
    String query = "SELECT idregistro FROM \"privateSchema\".registros ORDER BY idregistro DESC LIMIT 1;";
    try {
        PreparedStatement ps = con.prepareStatement(query);
        rs = ps.executeQuery(); // Ejecuta la consulta para obtener el último ID registrado.
        return rs;
    } catch (SQLException e) {
        System.out.println("Error al obtener el último registro: " + e.getMessage());
    }
    return rs;
}


}
