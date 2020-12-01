package proyecto1.Ventana;

import proyecto1.logica.TCP.Cliente;
import proyecto1.logica.TCP.Servidor;

import proyecto1.logica.UDP.UDPcliente;
import proyecto1.logica.UDP.UDPservidor;

import proyecto1.logica.RMI.ClienteRMI;
import proyecto1.logica.RMI.ServidorRMI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

import proyecto1.logica.Registro;

public class Vista extends JFrame {

    boolean sudp = false, stcp = false, rmi = false;

    // TCP
    Servidor servidorTCP = new Servidor();
    Cliente clienteTCP = new Cliente();

    // UDP
    UDPservidor ServidorUDP = new UDPservidor();
    UDPcliente ClienteUDP = new UDPcliente();

    // RMI
    ClienteRMI crmi = new ClienteRMI();
    ServidorRMI srmi = new ServidorRMI();

    public Vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ClienteUI = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        tnombre = new javax.swing.JTextField();
        tncodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Benviar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        tnapellido = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tnCarrera = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        tnSala = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        ServidorUI = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        lactual = new javax.swing.JLabel();
        lactual2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        diractual = new javax.swing.JLabel();
        ServerUDP = new javax.swing.JFrame();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        eschudp = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        udpport = new javax.swing.JLabel();
        ServerRMI = new javax.swing.JFrame();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dirmi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        ClienteUI.setTitle("Cliente");
        ClienteUI.setMinimumSize(new java.awt.Dimension(598, 499));
        ClienteUI.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                ClienteUIWindowClosing(evt);
            }
        });

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACIÓN DEL ESTUDIANTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tnombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        tncodigo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tncodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tncodigoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel2.setText("Ingreso de clientes");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Nombres");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Codigo");

        Benviar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Benviar.setText("Enviar");
        Benviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BenviarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setText("Apellido");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setText("Carrera");

        tnCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniería de Sistemas", "Ingeniería de Alimentos", "Ingeniería Quimica", "Ingeniería Civil", "Contabilidad", "Administración de empresas", "Administración industrial", " " }));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setText("Sala de");

        tnSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informatica", "Tutoria", "Estudio", "Entretenimiento" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tncodigo)
                                    .addComponent(tnCarrera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tnSala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tnapellido)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(36, 36, 36)
                                .addComponent(tnombre))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel2)
                        .addGap(0, 293, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Benviar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tnapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tncodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tnCarrera)
                        .addGap(18, 18, 18)
                        .addComponent(tnSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Benviar)
                        .addGap(325, 325, 325))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Registrar", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTADO DE ESTUDIANTES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tabla.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Carrera", "Codigo", "Fecha", "Sala"
            }
        ));
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(2).setMinWidth(3);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout ClienteUILayout = new javax.swing.GroupLayout(ClienteUI.getContentPane());
        ClienteUI.getContentPane().setLayout(ClienteUILayout);
        ClienteUILayout.setHorizontalGroup(
            ClienteUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteUILayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(ClienteUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        ClienteUILayout.setVerticalGroup(
            ClienteUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteUILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ServidorUI.setTitle("Servidor TCP");
        ServidorUI.setMinimumSize(new java.awt.Dimension(336, 383));
        ServidorUI.setResizable(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Servidor TCP");

        lactual.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lactual.setText("Escuchando en: ");

        lactual2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lactual2.setForeground(new java.awt.Color(0, 153, 51));
        lactual2.setText("jLabel7");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Escuchando a");

        diractual.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        diractual.setForeground(new java.awt.Color(0, 153, 0));
        diractual.setText("jLabel8");

        javax.swing.GroupLayout ServidorUILayout = new javax.swing.GroupLayout(ServidorUI.getContentPane());
        ServidorUI.getContentPane().setLayout(ServidorUILayout);
        ServidorUILayout.setHorizontalGroup(
            ServidorUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServidorUILayout.createSequentialGroup()
                .addGroup(ServidorUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ServidorUILayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(ServidorUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lactual2)
                            .addComponent(lactual)
                            .addComponent(jLabel7)
                            .addComponent(diractual)))
                    .addGroup(ServidorUILayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        ServidorUILayout.setVerticalGroup(
            ServidorUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServidorUILayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(lactual)
                .addGap(18, 18, 18)
                .addComponent(lactual2)
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(diractual)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        ServerUDP.setTitle("Servidor TCP");
        ServerUDP.setMinimumSize(new java.awt.Dimension(319, 395));
        ServerUDP.setResizable(false);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 0));
        jLabel9.setText("Servidor UDP");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Escuchando en");

        eschudp.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        eschudp.setForeground(new java.awt.Color(0, 153, 0));
        eschudp.setText("jLabel11");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Petición desde");

        udpport.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        udpport.setForeground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout ServerUDPLayout = new javax.swing.GroupLayout(ServerUDP.getContentPane());
        ServerUDP.getContentPane().setLayout(ServerUDPLayout);
        ServerUDPLayout.setHorizontalGroup(
            ServerUDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServerUDPLayout.createSequentialGroup()
                .addGroup(ServerUDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ServerUDPLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel9))
                    .addGroup(ServerUDPLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(ServerUDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eschudp)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(udpport))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        ServerUDPLayout.setVerticalGroup(
            ServerUDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServerUDPLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel9)
                .addGap(37, 37, 37)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(eschudp)
                .addGap(32, 32, 32)
                .addComponent(jLabel11)
                .addGap(29, 29, 29)
                .addComponent(udpport)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        ServerRMI.setTitle("Servidor RMI");
        ServerRMI.setMinimumSize(new java.awt.Dimension(344, 287));
        ServerRMI.setResizable(false);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setText("Servidor RMI");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("Escuchando desde");

        dirmi.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        dirmi.setForeground(new java.awt.Color(0, 204, 0));
        dirmi.setText("jLabel14");

        javax.swing.GroupLayout ServerRMILayout = new javax.swing.GroupLayout(ServerRMI.getContentPane());
        ServerRMI.getContentPane().setLayout(ServerRMILayout);
        ServerRMILayout.setHorizontalGroup(
            ServerRMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServerRMILayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(ServerRMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dirmi)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        ServerRMILayout.setVerticalGroup(
            ServerRMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServerRMILayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel12)
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dirmi)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto ");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("BIENVENIDO");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Socket TCP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setText("Socket UDP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setText("RMI");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel14.setText("SELECCIONE LA TECNOLOGIA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        sudp = true;
        this.dispose();
        ClienteUI.setVisible(true);
        ClienteUI.setLocationRelativeTo(ServidorUI);
        ServerUDP.setVisible(true);
        // inicar server UDP
        new Thread(() -> {
            try {
                ServidorUDP.iniciarServidor();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();

        eschudp.setText(ServidorUDP.getIp() + ":" + ServidorUDP.getPuerto());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        stcp = true;
        this.dispose();
        ClienteUI.setVisible(true);
        ClienteUI.setLocationRelativeTo(ServidorUI);
        ServidorUI.setVisible(true);

        // inicar server TCP
        new Thread(() -> {
            try {
                servidorTCP.recibir();
            } catch (IOException ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();

        try {
            clienteTCP.conectar();
        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }

        lactual2.setText(servidorTCP.getIp() + ":" + servidorTCP.getPort());
        diractual.setText(servidorTCP.getIp2());
        try {
            clienteTCP.desconectar();
        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void limpiartexto() {
        tnombre.setText("");
        tncodigo.setText("");
        tnapellido.setText("");
        tnSala.setSelectedIndex(0);
        tnCarrera.setSelectedIndex(0);
       
    }

    public void limpiarTabla(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }
//String nombre, String apellido, String carrera, String codigo, String sala
    public void refrescartabla(ArrayList<Registro> cts, JTable table) {

        limpiarTabla(table);
        if (cts.size() > 0) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            String nombre = null, codigo = null, fecha = null,carrera = null,apellido = null, sala =null ;
          
            for (Registro reg : cts) {
                nombre = reg.getNomnbre();
                apellido = reg.getApellido();
                carrera= reg.getCarrera();
                fecha = reg.getFecha();
                codigo = reg.getCodigo();
                sala= reg.getSala();
                
                model.addRow(new Object[]{nombre,apellido,carrera,sala,codigo,fecha});
            }
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        rmi = true;
        this.dispose();
        ClienteUI.setVisible(true);
        ClienteUI.setLocationRelativeTo(ServidorUI);
        ServerRMI.setVisible(true);
        dirmi.setText(srmi.getNombreServer());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ClienteUIWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ClienteUIWindowClosing

        if (stcp) {
          
            diractual.setText("");
            ServidorUI.dispose();
            this.setVisible(true);
        } else if (sudp) {
            ServerUDP.dispose();
            this.setVisible(true);
        } else {
            ServerRMI.dispose();
            ServerRMI.dispose();
            this.setVisible(true);
        }
    }//GEN-LAST:event_ClienteUIWindowClosing

    private void BenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BenviarActionPerformed
        if (!tnombre.getText().isEmpty() && !tncodigo.getText().isEmpty() && !tnapellido.getText().isEmpty()) {
            if (stcp) {

                new Thread(() -> {
                    try {
                        ArrayList<Registro> cts;
                        //String nomnbre, String codigo, String apellido, String sala, String carrera, String fecha
                        cts = clienteTCP.iniciar(new Registro(tnombre.getText(), tncodigo.getText(),tnapellido.getText(),tnSala.getSelectedItem().toString(),tnCarrera.getSelectedItem().toString()));
                        refrescartabla(cts, tabla);
                        limpiartexto();
                        diractual.setText(servidorTCP.getIp2());
                        JOptionPane.showMessageDialog(this, "Registro guardado con éxito!");
                    } catch (IOException ex) {
                        Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }).start();
            }

            if (sudp) {
                if (!tnombre.getText().isEmpty() && !tncodigo.getText().isEmpty() && !tnapellido.getText().isEmpty()) {

                    try {
                        ArrayList<Registro> cts;
                        cts = ClienteUDP.GuardarRegistros(new Registro(tnombre.getText(), tncodigo.getText(),tnapellido.getText(),tnSala.getSelectedItem().toString(),tnCarrera.getSelectedItem().toString()));

                        udpport.setText(String.valueOf(ClienteUDP.getIp() + ":" + ClienteUDP.getPuertocliente()));
                        Timer SimpleTimer = new Timer(4500, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                // udpport.setText("");
                            }
                        });
                        SimpleTimer.start();
                        JOptionPane.showMessageDialog(this, "Registro guardado con éxito!");
                        refrescartabla(cts, tabla);
                        limpiartexto();
                    } catch (IOException | ClassNotFoundException ex) {
                        Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            if (rmi) {
                if (!tnombre.getText().isEmpty() && !tncodigo.getText().isEmpty() && !tnapellido.getText().isEmpty()) {
                    ArrayList<Registro> cts;
                    cts = crmi.peticion(new Registro(tnombre.getText(), tncodigo.getText(),tnapellido.getText(),tnSala.getSelectedItem().toString(),tnCarrera.getSelectedItem().toString()));
                    refrescartabla(cts, tabla);
                    limpiartexto();
                    JOptionPane.showMessageDialog(this, "Registro guardado con éxito!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "INGRESE TODOS LOS DATOS!");
        }
    }//GEN-LAST:event_BenviarActionPerformed

    private void tncodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tncodigoKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_tncodigoKeyTyped

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        SwingUtilities.invokeLater(() -> {
            new Vista().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Benviar;
    private javax.swing.JFrame ClienteUI;
    private javax.swing.JFrame ServerRMI;
    private javax.swing.JFrame ServerUDP;
    private javax.swing.JFrame ServidorUI;
    private javax.swing.JLabel diractual;
    private javax.swing.JLabel dirmi;
    private javax.swing.JLabel eschudp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lactual;
    private javax.swing.JLabel lactual2;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox<String> tnCarrera;
    private javax.swing.JComboBox<String> tnSala;
    private javax.swing.JTextField tnapellido;
    private javax.swing.JTextField tncodigo;
    private javax.swing.JTextField tnombre;
    private javax.swing.JLabel udpport;
    // End of variables declaration//GEN-END:variables
}
