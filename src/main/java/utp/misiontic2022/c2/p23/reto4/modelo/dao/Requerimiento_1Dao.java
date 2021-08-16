package utp.misiontic2022.c2.p23.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p23.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p23.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        // Su código
        ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT Constructora, Ciudad, Banco_Vinculado, Porcentaje_Cuota_Inicial, Clasificacion, Fecha_Inicio FROM Proyecto WHERE Ciudad = 'Pereira'; ";
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);
            while (resultSet.next()) {

                Requerimiento_1 requerimiento1 = new Requerimiento_1();
                requerimiento1.setConstructora(resultSet.getString("Constructora"));
                requerimiento1.setCiudad(resultSet.getString("Ciudad"));
                requerimiento1.setBanco(resultSet.getString("Banco_Vinculado"));
                requerimiento1.setPorcentaje(resultSet.getDouble("Porcentaje_Cuota_Inicial"));
                requerimiento1.setClasificacion(resultSet.getString("Clasificacion"));
                requerimiento1.setFecha(resultSet.getString("Fecha_Inicio"));
                // Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(requerimiento1);
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