package utp.misiontic2022.c2.p23.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p23.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p23.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {

        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT  Cargo, MAX(l.Salario) FROM Lider l GROUP BY Cargo HAVING MAX(Salario)>700000; ";
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);
            while (resultSet.next()) {

                Requerimiento_3 requerimiento3 = new Requerimiento_3();
                requerimiento3.setCargo(resultSet.getString("Cargo"));
                requerimiento3.setMaxSalario(resultSet.getInt("MAX(l.Salario)"));
                // Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(requerimiento3);
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