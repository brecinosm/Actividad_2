package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author BryanRecinos
 */
public class Conexion {

    public Connection conexionBD;
    
    // jdbc:mysql://localhost:3306/?user=root
    
    private final String puerto = "3306";
    private final String db = "db_empresa"; 
    private final String urlConexion = String.format("jdbc:mysql://localhost:%s/%s?serverTimezone=UTC",puerto,db);
    private final String usuario ="root";
    private final String contra = "TigoClaro0*$";
    private final String jdbc = "com.mysql.cj.jdbc.Driver";
    public void abrir_conexion() {

        try {
            Class.forName(jdbc);
            conexionBD = DriverManager.getConnection(urlConexion, usuario, contra);
            System.out.println("Conexion Exitosa...");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error"+ex.getMessage());

        }
    }
    
    public void cerrar_conexion(){
    
        try{
           conexionBD.close();
        }catch(SQLException ex){
            System.out.println("Error"+ex.getMessage());
        }
    }

    
    
    
    
    
}
