package utp.misiontic2022.c2.reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.reto4.model.vo.Requerimiento_3;
import utp.misiontic2022.c2.reto4.util.JDBCUtilities;

public class RequerimientoDao_3 {

    public ArrayList<Requerimiento_3> requerimiento3 () throws SQLException{
        
        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
        Connection conexion = JDBCUtilities.getConnection();

        try{
            //Preparar la consulta y su conexión.
            String consulta = "SELECT (SUBSTR(Li.Nombre,1,1) || SUBSTR(Li.Primer_Apellido,1,1) || SUBSTR(Li.Segundo_Apellido,1,1)) as Abrev FROM Lider as Li";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            //Recorrer los registros en los VO especificos.

            while(resultSet.next()){
                Requerimiento_3 requerimiento_3 = new Requerimiento_3();
                requerimiento_3.setAbrev(resultSet.getString("Abrev"));
                respuesta.add(requerimiento_3);

            }

            if (resultSet != null){
                resultSet.close();
            }

            if (statement != null){
                statement.close();
            }
        }catch(SQLException e){
            System.out.println("Error de consulta SQL Requerimiento_3 -> " + e);
        }finally{

            if (conexion != null){
                conexion.close();
            }
        }
        return respuesta;
    }
    
}