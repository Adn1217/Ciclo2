package utp.misiontic2022.c2.reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.reto4.model.vo.Requerimiento_1;
import utp.misiontic2022.c2.reto4.util.JDBCUtilities;

public class RequerimientoDao_1 {
    
    public ArrayList<Requerimiento_1> requerimiento1 (Integer Limit) throws SQLException{
        
        ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>();
        Connection conexion = JDBCUtilities.getConnection();

        try{
            //Preparar la consulta y su conexión.
            
            String consulta = "Select c.Fecha as \"Fecha Compra\", c.ID_Compra as \"Cod. Compra\"," + 
                    " c.Proveedor as \"Nombre Proveedor\", c.Pagado From Compra as c " + 
                    "ORDER BY \"Cod. Compra\" DESC ";
            if(Limit!=null){
                consulta = consulta + "LIMIT " + Limit;
            }
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            //Recorrer los registros en los VO especificos.

            while(resultSet.next()){
                Requerimiento_1 requerimiento_1 = new Requerimiento_1();
                requerimiento_1.setFechaCompra(resultSet.getString("Fecha Compra"));
                requerimiento_1.setCodCompra(resultSet.getInt("Cod. Compra"));
                requerimiento_1.setNombreProveedor(resultSet.getString("Nombre Proveedor"));
                requerimiento_1.setPagado(resultSet.getString("Pagado"));
                respuesta.add(requerimiento_1);

            }

            if (resultSet != null){
                resultSet.close();
            }

            if (statement != null){
                statement.close();
            }
        }catch(SQLException e){
            System.out.println("Error de consulta SQL Requerimiento_1 -> " + e);
        }finally{

            if (conexion != null){
                conexion.close();
            }
        }
        return respuesta;
    }
}