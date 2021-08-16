package utp.misiontic2022.c2.p23.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p23.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p23.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p23.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p23.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {

        System.out.println("----------Listado de Proyectos de la ciudad de Pereira----------");
        try {
            ArrayList<Requerimiento_1> requerimiento1 = controlador.consultarRequerimiento1();
            // Su código

            // Encabezado del resultado
            System.out.println("Constructora Ciudad Banco_Vinculado Porcentaje_Cuota_Inicial Clasificacion Fecha_Inicio");

            // Cada VO cargado, mostrarlo en la vista
            for (Requerimiento_1 proyecto : requerimiento1) {
                System.out.printf("%s %s %s %f %s %s %n",

                        proyecto.getConstructora(), proyecto.getCiudad(), proyecto.getBanco(), proyecto.getPorcentaje(),
                        proyecto.getClasificacion(), proyecto.getFecha());
            }

        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void requerimiento2() {
        try {
            ArrayList<Requerimiento_2> requerimiento2 = controlador.consultarRequerimiento2();
            // Su código

            System.out.println("----------Listado de compras----------");
            // Encabezado del resultado
            System.out.println("Proveedor Constructora Pagado");

            // Cada VO cargado, mostrarlo en la vista
            for (Requerimiento_2 proyecto : requerimiento2) {
                System.out.printf("%s %s %s %n",
                
                        proyecto.getProveedor(), proyecto.getConstructora(), proyecto.getPagado());
            }

        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void requerimiento3() {
        try {
            ArrayList<Requerimiento_3> requerimiento3 = controlador.consultarRequerimiento3();
            // Su código

            System.out.println("----------Cargo y el máximo de los salarios----------");
            // Encabezado del resultado
            System.out.println("Cargo MAX(l.Salario)");

            // Cada VO cargado, mostrarlo en la vista
            for (Requerimiento_3 proyecto : requerimiento3) {
                System.out.printf("%s %d %n",
                
                        proyecto.getCargo(), proyecto.getMaxSalario());
            }

        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }
}
