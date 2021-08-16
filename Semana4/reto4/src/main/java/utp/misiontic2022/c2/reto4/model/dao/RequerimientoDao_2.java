package utp.misiontic2022.c2.reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.reto4.model.vo.Requerimiento_2;
import utp.misiontic2022.c2.reto4.util.JDBCUtilities;

public class RequerimientoDao_2 {

    public ArrayList<Requerimiento_2> requerimiento2 () throws SQLException{
        
        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
        Connection conexion = JDBCUtilities.getConnection();

        try{
            //Preparar la consulta y su conexión.
            String consulta = "SELECT Fecha_Inicio as \"Fec Inicio\", Constructora as \"Nombre Constructora\", Ciudad as \"Nombre Ciudad\", T1.NombreApellido as \"Nombre Lider\", T2.Codigo_Tipo as \"Cod. Tipo\", T2.Estrato  FROM Proyecto as Pr LEFT JOIN (SELECT Li.ID_Lider, Li.Nombre, Li.Segundo_Apellido, (Li.Nombre || ' ' || Li.Primer_Apellido) as NombreApellido FROM Lider as Li) T1 on Pr.ID_Lider = T1.ID_Lider LEFT JOIN (SELECT Ti.ID_Tipo, Ti.Codigo_Tipo, Ti.Estrato FROM Tipo as Ti) T2 on Pr.ID_Tipo = T2.ID_Tipo WHERE Fecha_Inicio BETWEEN '2019-09-01' AND '2019-09-09' AND Ciudad = 'Pereira'";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            //Recorrer los registros en los VO especificos.

            while(resultSet.next()){
                Requerimiento_2 requerimiento_2 = new Requerimiento_2();
                requerimiento_2.setFechaInicio(resultSet.getString("Fec Inicio"));
                requerimiento_2.setConstructora(resultSet.getString("Nombre Constructora"));
                requerimiento_2.setCiudad(resultSet.getString("Nombre Ciudad"));
                requerimiento_2.setLider(resultSet.getString("Nombre Lider"));
                requerimiento_2.setTipo(resultSet.getString("Cod. Tipo"));
                requerimiento_2.setEstrato(resultSet.getInt("Estrato"));
                respuesta.add(requerimiento_2);

            }

            if (resultSet != null){
                resultSet.close();
            }

            if (statement != null){
                statement.close();
            }
        }catch(SQLException e){
            System.out.println("Error de consulta SQL Requerimiento_2 -> " + e);
        }finally{

            if (conexion != null){
                conexion.close();
            }
        }
        return respuesta;
    }
    
}