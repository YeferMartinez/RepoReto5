package utp.misiontic2022.c2.p23.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p23.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p23.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        // Su código

        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta ="SELECT Proveedor, Constructora, Pagado FROM Proyecto p JOIN Compra c ON p.ID_Proyecto = c.ID_Proyecto WHERE Proveedor IN ('Homecenter', 'JUMBO') AND Pagado = 'Si' AND Constructora LIKE '%S.A.' ORDER BY Proveedor; ";
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);
            while (resultSet.next()) {

                Requerimiento_2 requerimiento2 = new Requerimiento_2();
                requerimiento2.setProveedor(resultSet.getString("Proveedor"));
                requerimiento2.setConstructora(resultSet.getString("Constructora"));
                requerimiento2.setPagado(resultSet.getString("Pagado"));
                // Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(requerimiento2);
            }
            resultSet.close();
            statement.close();
            // Recorrer los registros en los VO específicos

        } catch (SQLException e) {
            System.err.println("error:"+ e);

        } finally {
            if (conexion != null) {
                conexion.close();
            }

        }

        // Retornar la colección de vo's
        return respuesta;

    }
}