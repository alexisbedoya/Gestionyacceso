
package proyecto1.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import proyecto1.logica.Registro;

public class BD {

    String driver, url, login, password;
    Connection conexion = null;

    public BD() {

        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/registros";
        login = "root";
        password = "";
        try {
            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection(url, login, password);
            System.out.println("Conexion con Base de datos Ok....");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exc) {
            System.out.println("Error al tratar de abrir la base de datos");
            System.out.println(exc.getMessage());
        }

    }

    
   
    /***
     * clase que agrega la información con los siguientes parametros:
     * nombre varchar(50)
     * apellido varchar(50)
     * Carrera varchar (50)
     * codigo varchar (15)
     * fecha varchar(15)
     * Sala vasrchar (50)
     * @param nombre
     * @param apellido@param codigo
     * @param sala@param carrera     ***/
    public void AgregarInfo(String nombre, String apellido, String carrera, String codigo, String sala) {
         SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy hh:mm:");
         String fecha = sdf.format(new Date());
         System.out.println(fecha);
        String ComandoSQL = "INSERT INTO clientes  VALUES ('" + nombre + "' , '" + apellido + "' , '" + carrera + "' , '"+codigo+"' , '"+fecha+"' , '"+sala+"')";
        try {
            Statement stmt = conexion.createStatement();
            stmt.executeUpdate(ComandoSQL);
            System.out.println("Registro agregado!");
            stmt.close();

        } catch (java.sql.SQLException er) {
            System.out.println("No se pudo realizar la operación.");
        }
    }

    // traer lista de registros desde BD
    public ArrayList<Registro> ListarRegistros() {
        String nombre,codigo,fecha,sala,carrera,apellido;
   
        String ComandoSQL = "SELECT * FROM clientes";
        ArrayList<Registro> cts = new ArrayList<>();

        try {
            Statement stmt = conexion.createStatement();
            ResultSet resultado = stmt.executeQuery(ComandoSQL);

            while (resultado.next()) {
                nombre = resultado.getString(1);
                apellido = resultado.getString(2);
                carrera = resultado.getString(3);
                sala = resultado.getString(4);
                codigo = resultado.getString(5);
                fecha = resultado.getString(6);
                cts.add(new Registro(nombre,codigo,apellido,sala,carrera,fecha));
            }
            stmt.close();
        } catch (java.sql.SQLException er) {
            System.out.println("No se pudo realizar la operación.");
        }
        return cts;
    }
}
