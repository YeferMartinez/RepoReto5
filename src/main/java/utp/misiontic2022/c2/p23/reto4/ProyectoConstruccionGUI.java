package utp.misiontic2022.c2.p23.reto4;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import utp.misiontic2022.c2.p23.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p23.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p23.reto4.modelo.vo.Requerimiento_3;

import static utp.misiontic2022.c2.p23.reto4.vista.VistaRequerimientos.controlador;


public class ProyectoConstruccionGUI extends JFrame {

    public ProyectoConstruccionGUI() throws SQLException {
        initComponents();
        TablaConsulta1();
        TablaConsulta2();
        TablaConsulta3();
    }

    //Metodos    
    public void TablaConsulta1() throws SQLException {
         
        ArrayList<Requerimiento_1> requerimiento1 = controlador.consultarRequerimiento1();

        DefaultTableModel modelo = (DefaultTableModel) jTableConsulta1.getModel();
        //recorre cada una de los registros obtenidos en la consulta retornaUsuario

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        int numcols = modelo.getColumnCount();
        for (Requerimiento_1 requerimiento : requerimiento1) {
            Object[] fila = new Object[numcols];
          
            fila[0] = requerimiento.getConstructora();
            fila[1] = requerimiento.getCiudad();
            fila[2] = requerimiento.getBanco();
            fila[3] = requerimiento.getPorcentaje();
            fila[4] = requerimiento.getClasificacion();
            fila[5] = requerimiento.getFecha();
          
            modelo.addRow(fila);
        }
    }
    
    public void TablaConsulta2() throws SQLException {
                
        ArrayList<Requerimiento_2> requerimiento2 = controlador.consultarRequerimiento2();
        
        DefaultTableModel modelo = (DefaultTableModel) jTableConsulta2.getModel();
        
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        int numcols = modelo.getColumnCount();
        for (Requerimiento_2 requerimiento : requerimiento2) {
            Object[] fila = new Object[numcols];
            
            fila[0] = requerimiento.getProveedor();
            fila[1] = requerimiento.getConstructora();
            fila[2] = requerimiento.getPagado();
            
            modelo.addRow(fila);
        }
    }

    public void TablaConsulta3() throws SQLException {
        
        ArrayList<Requerimiento_3> requerimiento3 = controlador.consultarRequerimiento3();
        
        DefaultTableModel modelo = (DefaultTableModel) jTableConsulta3.getModel();
        
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        int numcols = modelo.getColumnCount();
        for (Requerimiento_3 requerimiento : requerimiento3) {
            Object[] fila = new Object[numcols];
            
            fila[0] = requerimiento.getCargo();
            fila[1] = requerimiento.getMaxSalario();
            
            modelo.addRow(fila);
        }
    }

    //Componentes    
    private void initComponents() {

        jTPprincipal = new JTabbedPane();
        jPMenuP = new JPanel();
        jPanelMenuP = new JPanel();
        jButtonMenuP1 = new JButton();
        jButtonMenuP2 = new JButton();
        jButtonMenuP3 = new JButton();
        jScrollPane2 = new JScrollPane();
        jTextPane1 = new JTextPane();
        jScrollPane3 = new JScrollPane();
        jTextPane2 = new JTextPane();
        jScrollPane4 = new JScrollPane();
        jTextPane3 = new JTextPane();
        jTextField1 = new JTextField();
        jLabelMenuP1 = new JLabel();
        jPConsulta1 = new JPanel();
        jLabelConsulta1 = new JLabel();
        jSplitPane1 = new JSplitPane();
        jPanel1Cosulta1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTableConsulta1 = new JTable();
        jPanel2Consulta1 = new JPanel();
        jButtonMenuCon1 = new JButton();
        jPConsulta2 = new JPanel();
        jLabelConsulta2 = new JLabel();
        jSplitPane2 = new JSplitPane();
        jPanel1Consulta2 = new JPanel();
        jButtonMenuCon2 = new JButton();
        jPanel2Consulta2 = new JPanel();
        jScrollPane5 = new JScrollPane();
        jTableConsulta2 = new JTable();
        jPConsulta3 = new JPanel();
        jLabelConsulta3 = new JLabel();
        jSplitPane3 = new JSplitPane();
        jPanel1Consulta3 = new JPanel();
        jScrollPane6 = new JScrollPane();
        jTableConsulta3 = new JTable();
        jPanel1 = new JPanel();
        jButtonMenuCon3 = new JButton();
        jMOpciones = new JMenuBar();
        jMFile = new JMenu();
        jMExit = new JMenuItem();
        jMOpcion = new JMenu();
        jMenuItem1 = new JMenuItem();
        jMConsulta1 = new JMenuItem();
        jMConsulta2 = new JMenuItem();
        jMConsulta3 = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Construcción");
        setPreferredSize(new java.awt.Dimension(720, 659));

        jPMenuP.setLayout(new java.awt.BorderLayout());

        //Interfaz
        jPanelMenuP.setBackground(new java.awt.Color(255, 255, 255)); //COLOR BLANCO EN RGB//
        
        //Boton de la primera consulta
        jButtonMenuP1.setBackground(new java.awt.Color(255, 204, 204));
        jButtonMenuP1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jButtonMenuP1.setText("Consulta 1");
        jButtonMenuP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenuP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuP1ActionPerformed(evt);
            }
        });

        //Boton de la segunda consulta
        jButtonMenuP2.setBackground(new java.awt.Color(204, 255, 255));
        jButtonMenuP2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jButtonMenuP2.setText("Consulta 2");
        jButtonMenuP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenuP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuP2ActionPerformed(evt);
            }
        });

        //Boton de la tercera consulta
        jButtonMenuP3.setBackground(new java.awt.Color(204, 204, 255));
        jButtonMenuP3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jButtonMenuP3.setText("Consulta 3");
        jButtonMenuP3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenuP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuP3ActionPerformed(evt);
            }
        });

        //Informacion de la primer consulta
        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTextPane1.setText("Listado de proyectos en la ciudad de Pereira con la siguiente información: Constructora, Ciudad, Banco Vinculado, Porcentaje Cuota Inicial, Clasificación y Fecha Inicio.");
        jScrollPane2.setViewportView(jTextPane1);

        //Informacion de la segunda consulta
        jTextPane2.setEditable(false);
        jTextPane2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTextPane2.setText("Listado de compras con la siguiente información: Proveedor, Constructora y Pagado. Filtrada de la siguiente manera:\n• Proveedor: Homecenter y JUMBO.\n• Pagado: igual a \"Si\"\n• Constructora: con terminación en \"S.A.\"");
        jScrollPane3.setViewportView(jTextPane2);

        //Informacion de la tercera consulta
        jTextPane3.setEditable(false);
        jTextPane3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTextPane3.setText("Listado de Cargos y el Máximo de los salarios mayores a $70.000 de los lideres.");
        jScrollPane4.setViewportView(jTextPane3);

        //Titulo - nombre de la empresa
        jTextField1.setEditable(false);
        jTextField1.setBackground(java.awt.Color.orange);
        jTextField1.setFont(new java.awt.Font("Arial", 1, 36));
        jTextField1.setHorizontalAlignment(JTextField.CENTER);
        jTextField1.setText("CAMACOL");
        jTextField1.setToolTipText("");
        jTextField1.setDoubleBuffered(true);

        //Subtitulo - Descripcion
        jLabelMenuP1.setFont(new java.awt.Font("Arial", 0, 16));
        jLabelMenuP1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelMenuP1.setText("Gremio de constructores");

        //Creacion del primer menu - Menu Principal
        GroupLayout jPanelMenuPLayout = new GroupLayout(jPanelMenuP);
        jPanelMenuP.setLayout(jPanelMenuPLayout);
        jPanelMenuPLayout.setHorizontalGroup(
            jPanelMenuPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, GroupLayout.Alignment.TRAILING)
            .addComponent(jLabelMenuP1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanelMenuPLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(jPanelMenuPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMenuP2)
                    .addComponent(jButtonMenuP1)
                    .addComponent(jButtonMenuP3))
                .addGap(25, 25, 25)
                .addGroup(jPanelMenuPLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanelMenuPLayout.setVerticalGroup(
            jPanelMenuPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuPLayout.createSequentialGroup()
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMenuP1)
                .addGroup(jPanelMenuPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuPLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuPLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButtonMenuP1)))
                .addGroup(jPanelMenuPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuPLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuPLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButtonMenuP2)))
                .addGroup(jPanelMenuPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuPLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuPLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButtonMenuP3)))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jPMenuP.add(jPanelMenuP, java.awt.BorderLayout.CENTER);

        jTPprincipal.addTab("Menú Principal", jPMenuP);
        
        //Creacion del menu de la primera consulta
        jPConsulta1.setBackground(new java.awt.Color(255, 255, 255)); //FONDO COLOR BLANCO EN RGB//
        jPConsulta1.setLayout(new java.awt.BorderLayout());

        jLabelConsulta1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelConsulta1.setText("Proyectos CAMACOL");
        jLabelConsulta1.setPreferredSize(new java.awt.Dimension(48, 20));
        jPConsulta1.add(jLabelConsulta1, java.awt.BorderLayout.PAGE_START);

        jSplitPane1.setDividerLocation(35);
        jSplitPane1.setOrientation(JSplitPane.VERTICAL_SPLIT);

        jPanel1Cosulta1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1Cosulta1.setLayout(new java.awt.BorderLayout());

        //Creacion del layout de la primera consulta
        GroupLayout jPanel2Consulta1Layout = new GroupLayout(jPanel2Consulta1);
        jPanel2Consulta1.setLayout(jPanel2Consulta1Layout);
        jPanel2Consulta1Layout.setHorizontalGroup(
            jPanel2Consulta1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Consulta1Layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(jButtonMenuCon1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(325, Short.MAX_VALUE))
        );
        jPanel2Consulta1Layout.setVerticalGroup(
            jPanel2Consulta1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jButtonMenuCon1, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        //Creacion de la tabla de la primera conslta
        jTableConsulta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Constructora ", "Ciudad", "Banco", "Porcentaje", "Clasificacion", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(jTableConsulta1);

        jPanel1Cosulta1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(jPanel1Cosulta1);
        
        //Boton que regresa al menu principal
        jButtonMenuCon1.setBackground(new java.awt.Color(0, 204, 204)); //COLOR CYAN EN RGB//
        jButtonMenuCon1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jButtonMenuCon1.setText("Menú");
        jButtonMenuCon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenuCon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuCon1ActionPerformed(evt);
            }
        });

        jSplitPane1.setLeftComponent(jPanel2Consulta1);

        jPConsulta1.add(jSplitPane1, java.awt.BorderLayout.CENTER);

        jTPprincipal.addTab("Consulta1", jPConsulta1);

        //Creacion del menu de la segunda consulta
        jPConsulta2.setBackground(new java.awt.Color(255, 255, 255));
        jPConsulta2.setLayout(new java.awt.BorderLayout());

        jLabelConsulta2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelConsulta2.setText("Proyectos CAMACOL");
        jLabelConsulta2.setPreferredSize(new java.awt.Dimension(100, 20));
        jPConsulta2.add(jLabelConsulta2, java.awt.BorderLayout.PAGE_START);

        jSplitPane2.setOrientation(JSplitPane.VERTICAL_SPLIT);
        
        //Boton en la segunda consulta que devuelve al menu princial
        jButtonMenuCon2.setBackground(new java.awt.Color(0, 204, 204));
        jButtonMenuCon2.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jButtonMenuCon2.setText("Menú");
        jButtonMenuCon2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenuCon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuCon2ActionPerformed(evt);
            }
        });
        
        //Creacion del layout de la segunda consulta
        GroupLayout jPanel1Consulta2Layout = new GroupLayout(jPanel1Consulta2);
        jPanel1Consulta2.setLayout(jPanel1Consulta2Layout);
        jPanel1Consulta2Layout.setHorizontalGroup(
            jPanel1Consulta2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Consulta2Layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(jButtonMenuCon2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(325, Short.MAX_VALUE))
        );
        jPanel1Consulta2Layout.setVerticalGroup(
            jPanel1Consulta2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Consulta2Layout.createSequentialGroup()
                .addComponent(jButtonMenuCon2, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jSplitPane2.setTopComponent(jPanel1Consulta2);

        jPanel2Consulta2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2Consulta2.setLayout(new java.awt.BorderLayout());
        
        //Creacion de la tabla de la segunda consulta
        jTableConsulta2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Proveedor", "Constructora", "Pagado"
            }
        ));
        jScrollPane5.setViewportView(jTableConsulta2);

        jPanel2Consulta2.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        jSplitPane2.setRightComponent(jPanel2Consulta2);

        jPConsulta2.add(jSplitPane2, java.awt.BorderLayout.CENTER);

        jTPprincipal.addTab("Consulta2", jPConsulta2);

        //Creacion del menu de la tercera consulta
        jPConsulta3.setBackground(new java.awt.Color(255, 255, 255));
        jPConsulta3.setLayout(new java.awt.BorderLayout());

        jLabelConsulta3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelConsulta3.setText("Proyectos CAMACOL");
        jLabelConsulta3.setPreferredSize(new java.awt.Dimension(100, 20));
        jPConsulta3.add(jLabelConsulta3, java.awt.BorderLayout.PAGE_START);

        jSplitPane3.setOrientation(JSplitPane.VERTICAL_SPLIT);

        jPanel1Consulta3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1Consulta3.setLayout(new java.awt.BorderLayout());

        //Creacion del layout de la tercera consulta
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(jButtonMenuCon3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(325, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jButtonMenuCon3, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        //Creacion de la tabla de la tercera consulta
        jTableConsulta3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cargo", "Salario Máximo"
            }
        ));
        jScrollPane6.setViewportView(jTableConsulta3);

        jPanel1Consulta3.add(jScrollPane6, java.awt.BorderLayout.CENTER);

        jSplitPane3.setRightComponent(jPanel1Consulta3);

        //Boton de menu en la tercera consulta
        jButtonMenuCon3.setBackground(new java.awt.Color(0, 204, 204));
        jButtonMenuCon3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonMenuCon3.setText("Menú");
        jButtonMenuCon3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenuCon3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuCon3ActionPerformed(evt);
            }
        });

        jSplitPane3.setLeftComponent(jPanel1);

        jPConsulta3.add(jSplitPane3, java.awt.BorderLayout.CENTER);

        jTPprincipal.addTab("Consulta3", jPConsulta3);

        //Añadir menus al menu de opciones principal
        getContentPane().add(jTPprincipal, java.awt.BorderLayout.PAGE_START);

        jMFile.setText("File");
        
        //Atajo para Exit-cerrar programa
        jMExit.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMExit.setText("Exit");
        jMExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMExitActionPerformed(evt);
            }
        });
        jMFile.add(jMExit);
        
        //Atajo menu principal
        jMOpciones.add(jMFile);

        jMOpcion.setText("Edit");

        jMenuItem1.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_HOME, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Menú Principal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMOpcion.add(jMenuItem1);
        
        //Atajo menu primera consulta
        jMConsulta1.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMConsulta1.setText("Consulta1");
        jMConsulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsulta1ActionPerformed(evt);
            }
        });
        jMOpcion.add(jMConsulta1);

        //Atajo menu segunda consulta
        jMConsulta2.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMConsulta2.setText("Consulta2");
        jMConsulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsulta2ActionPerformed(evt);
            }
        });
        jMOpcion.add(jMConsulta2);

        //Atajo menu tercera consulta
        jMConsulta3.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMConsulta3.setText("Consulta3");
        jMConsulta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsulta3ActionPerformed(evt);
            }
        });
        jMOpcion.add(jMConsulta3);

        jMOpciones.add(jMOpcion);

        setJMenuBar(jMOpciones);

        pack();
        setLocationRelativeTo(null); //Centrar JFrame//
    }
    
    //Acciones de los atajos - a donde direccionan
    private void jMConsulta1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        jTPprincipal.setSelectedIndex(1);
    }                                           

    private void jMConsulta2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        jTPprincipal.setSelectedIndex(2);
    }                                           

    private void jMConsulta3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        jTPprincipal.setSelectedIndex(3);
    }                                           

    private void jMExitActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if (JOptionPane.showConfirmDialog(this, "Desea cerrar la aplicacion?", 
             getTitle(), JOptionPane.YES_NO_OPTION,
             JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
         
         dispose();
     
     }
    }
    
    //Acciones de los botones del los menus de opciones - atajos
    private void jButtonMenuP1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        jTPprincipal.setSelectedIndex(1);
    }                                             

    private void jButtonMenuP2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        jTPprincipal.setSelectedIndex(2);
    }                                             

    private void jButtonMenuP3ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        jTPprincipal.setSelectedIndex(3);
    }
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        jTPprincipal.setSelectedIndex(0);
    }  
    
    //Botones de las consultas 1,2 y 3
    private void jButtonMenuCon1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        jTPprincipal.setSelectedIndex(0);
    }  

    private void jButtonMenuCon2ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        jTPprincipal.setSelectedIndex(0);
    }

    private void jButtonMenuCon3ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        jTPprincipal.setSelectedIndex(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProyectoConstruccionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectoConstruccionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectoConstruccionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectoConstruccionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ProyectoConstruccionGUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ProyectoConstruccionGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify                     
    private JButton jButtonMenuCon1;
    private JButton jButtonMenuCon2;
    private JButton jButtonMenuCon3;
    private JButton jButtonMenuP1;
    private JButton jButtonMenuP2;
    private JButton jButtonMenuP3;
    private JLabel jLabelConsulta1;
    private JLabel jLabelConsulta2;
    private JLabel jLabelConsulta3;
    private JLabel jLabelMenuP1;
    private JMenuItem jMConsulta1;
    private JMenuItem jMConsulta2;
    private JMenuItem jMConsulta3;
    private JMenuItem jMExit;
    private JMenu jMFile;
    private JMenu jMOpcion;
    private JMenuBar jMOpciones;
    private JMenuItem jMenuItem1;
    private JPanel jPConsulta1;
    private JPanel jPConsulta2;
    private JPanel jPConsulta3;
    private JPanel jPMenuP;
    private JPanel jPanel1;
    private JPanel jPanel1Consulta2;
    private JPanel jPanel1Consulta3;
    private JPanel jPanel1Cosulta1;
    private JPanel jPanel2Consulta1;
    private JPanel jPanel2Consulta2;
    private JPanel jPanelMenuP;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JScrollPane jScrollPane5;
    private JScrollPane jScrollPane6;
    private JSplitPane jSplitPane1;
    private JSplitPane jSplitPane2;
    private JSplitPane jSplitPane3;
    private JTabbedPane jTPprincipal;
    private JTable jTableConsulta1;
    private JTable jTableConsulta2;
    private JTable jTableConsulta3;
    private JTextField jTextField1;
    private JTextPane jTextPane1;
    private JTextPane jTextPane2;
    private JTextPane jTextPane3;
    // End of variables declaration                   
}