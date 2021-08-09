package co.edu.utp.misiontic2022.c2.u42;


import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.edu.utp.misiontic2022.c2.u42.model.Employees;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
            try {
                Path archivo = Paths.get("emptyFile.txt");
                if (Files.notExists(archivo)){
                    archivo = Files.createFile(Paths.get("emptyFile.txt"));
                }

                var contenido = new String(Files.readAllBytes(Paths.get("emptyFile.txt")),StandardCharsets.UTF_8);

                System.out.println(contenido);
            } catch (Exception e) {
                //TODO: handle exception
            }
        */
        
        /*
            String url = "jdbc:sqlite:dbGrupo09.db";

            Connection conn = null;

            try {
                conn = DriverManager.getConnection(url);
                File file =new File("dbGrupo09.db");
                if (file.length() == 0){
                    var statement = conn.createStatement();
                    statement.execute("CREATE TABLE paises(pais_id INTEGER NOT NULL PRIMARY KEY,"
                            + " nombre VARCHAR(50) NOT NULL);");

                    statement.execute("CREATE TABLE dpto(dpto_id INTEGER NOT NULL PRIMARY KEY,"
                            + " nombre VARCHAR(50) NOT NULL);");
                }

            } catch (SQLException e) {
                //TODO: handle exception
                System.out.println("Error de conexion : " + e);
            }
        */

        String db = "C://Users/israelarbonaguerrero/Desktop/MISION TIC 2022/2. CICLO Java/GRUPO_09/db_sqlite/hr.db";
        String url = "jdbc:sqlite:" + db;

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        var listaEmployees = new ArrayList<Employees>();

        try {
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
            String sql = "SELECT employee_id,first_name,last_name,email "
                      +"FROM employees WHERE (employee_id < 110)";
            rs = stmt.executeQuery(sql);
            while(rs.next()){

                var employees = new Employees();

                int id = rs.getInt("employee_id");
                String nombre = rs.getString("first_name");
                String apellido = rs.getString("last_name");
                String email = rs.getString("email");
                
                // System.out.println("Id : " + id + " nombre : " + nombre);

                employees.setEmployee_id(id);
                employees.setFirst_name(nombre);
                employees.setLast_name(apellido);
                employees.setEmail(email);

                listaEmployees.add(employees);

            }
            
        } catch (SQLException e) {
            //TODO: handle exception
            System.out.println("Error consulta SQL: " + e);
        } finally{
            try {
                if (rs != null){
                    rs.close();
                }
                if (stmt != null){
                    stmt.close();
                }
                if (conn != null){
                    conn.close();
                }
            } catch (SQLException e) {
                //TODO: handle exception
                System.out.println("conexion close! ->" + e);
            }
        }

        /*
        for(Employees emm : listaEmployees){
            System.out.println(emm.getEmail());
        }
        */

        listaEmployees.forEach(System.out::println);


    }






// ProductosAlimentarios() p base 80 + valor peso 6 + t alimento 40 = 126
// Bebidas(200.0,10,'n') p base 200 + valor peso 8 + lugar origen 5 t alimento 40 = 253
// Refrigerados(140.0,20) p base 140 + valor peso 20 + valor temperatura 18 + t alimento 40 = 218
// Bebidas(120.0,10,'I') p base 120 + valor peso 8 + lugar origen 15 + t alimento 40 = 183
// Refrigerados(110.0,7) p base 110 + valor peso 6 + valor temperatura 18 + t alimento 40 = 174
// total = 126 + 253 + 218 + 183 + 174 = 954
// bebidas = 253 + 183 = 436
// Refrigerados = 218 + 174 = 392


}
