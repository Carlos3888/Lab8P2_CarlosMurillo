/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_carlosmurillo;

import java.util.ArrayList;
import java.util.concurrent.ForkJoinWorkerThread;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Jafeth
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        
        try{
        String archivo1 = "./archivos/Listas/Lista_de_universos.ltuni";
        AdminUniverso_lista ltuni = new AdminUniverso_lista(archivo1);
        
        ltuni.cargarArchivo();
        ArrayList<Universo> lista1 = ltuni.getLista();
        ltuni.escribirArchivo();
        
        
        DefaultComboBoxModel modelo1 = new DefaultComboBoxModel();
        for (int i = 0; i < lista1.size(); i++) {
            String nombre1 = lista1.get(i).getNombre();
            modelo1.addElement(nombre1);
        }
        combo_universos.setModel(modelo1);
        
        String archivo2 = "./archivos/Listas/Lista_de_seres.ltser";
        AdminSerVivo_lista ltser = new AdminSerVivo_lista(archivo2);
        
        ltser.cargarArchivo();
        ArrayList<SerVivo> lista2 = ltser.getLista();
        ltser.escribirArchivo();
        for (int i = 0; i < lista2.size(); i++) {
            System.out.println(lista2.get(i)+"aaaaaaaa");
        }
        }catch(Exception e){
            
        }
        jPanel3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escala_de_poder = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        barra = new javax.swing.JProgressBar();
        iniciar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_seres = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t_universo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        b_crear_universo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        t_ser_nombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        t_ser_id = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        b_2 = new javax.swing.JRadioButton();
        b_3 = new javax.swing.JRadioButton();
        b_5 = new javax.swing.JRadioButton();
        b_6 = new javax.swing.JRadioButton();
        b_8 = new javax.swing.JRadioButton();
        b_9 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        combo_universos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        combo_raza = new javax.swing.JComboBox<>();
        b_1 = new javax.swing.JRadioButton();
        b_4 = new javax.swing.JRadioButton();
        b_7 = new javax.swing.JRadioButton();
        b_10 = new javax.swing.JRadioButton();
        sp_edad = new javax.swing.JSpinner();
        b_crear_ser = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        iniciar.setText("Iniciar");
        iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarMouseClicked(evt);
            }
        });

        jScrollPane2.setViewportView(lista_seres);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barra, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iniciar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cargar Seres Vivos", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nombre del Universo");

        t_universo.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        b_crear_universo.setText("Crear");
        b_crear_universo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_crear_universoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(t_universo, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                        .addComponent(jSeparator1))
                    .addComponent(b_crear_universo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_universo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_crear_universo)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear Universo", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Nombre");

        t_ser_nombre.setBorder(null);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setText("ID");

        t_ser_id.setBorder(null);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setText("Escala de Poder");

        escala_de_poder.add(b_2);
        b_2.setText("2");

        escala_de_poder.add(b_3);
        b_3.setText("3");

        escala_de_poder.add(b_5);
        b_5.setText("5");

        escala_de_poder.add(b_6);
        b_6.setText("6");

        escala_de_poder.add(b_8);
        b_8.setText("8");

        escala_de_poder.add(b_9);
        b_9.setText("9");

        jLabel5.setText("Años");

        jLabel6.setText("Universo de procedencia");

        jLabel7.setText("Raza");

        combo_raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "Amanto" }));

        escala_de_poder.add(b_1);
        b_1.setText("1");

        escala_de_poder.add(b_4);
        b_4.setText("4");

        escala_de_poder.add(b_7);
        b_7.setText("7");

        escala_de_poder.add(b_10);
        b_10.setText("10");

        b_crear_ser.setText("Crear");
        b_crear_ser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_crear_serMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_ser_id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(t_ser_nombre, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(b_1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(b_10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(b_4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(b_7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(combo_universos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_raza, 0, 150, Short.MAX_VALUE)
                    .addComponent(sp_edad)
                    .addComponent(b_crear_ser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(145, 145, 145))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_ser_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(t_ser_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(combo_universos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_1)
                    .addComponent(b_2)
                    .addComponent(b_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_4)
                    .addComponent(b_5)
                    .addComponent(b_6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_7)
                    .addComponent(b_8)
                    .addComponent(b_9)
                    .addComponent(b_crear_ser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_10)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear Ser Vivo", jPanel3);

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jButton3.setText("listar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });

        jButton1.setText("listar ser");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(66, 66, 66)
                                .addComponent(jButton1))
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_crear_universoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_crear_universoMouseClicked
        String archivo = "./archivos/Universos/";
        String nombre = t_universo.getText();
        archivo += nombre+".uni";
        AdminUniverso_individual uni = new AdminUniverso_individual(archivo);
        
        
        
        int numero = 0;
        ArrayList<Universo> lista = new ArrayList();
        
        
        
        uni.cargarArchivo();
        Universo universo = new Universo(nombre, numero, lista);
        uni.setUniverso(universo);
        uni.escribirArchivo();
        t_universo.setText("");
        
        String archivo1 = "./archivos/Listas/Lista_de_universos.ltuni";
        AdminUniverso_lista ltuni = new AdminUniverso_lista(archivo1);
        
        ltuni.cargarArchivo();
        ltuni.setUniverso(universo);
        ArrayList<Universo> lista1 = ltuni.getLista();
        ltuni.escribirArchivo();
        
        
        DefaultComboBoxModel modelo1 = new DefaultComboBoxModel();
        for (int i = 0; i < lista1.size(); i++) {
            String nombre1 = lista1.get(i).getNombre();
            modelo1.addElement(nombre1);
        }
        combo_universos.setModel(modelo1);
        
        
    }//GEN-LAST:event_b_crear_universoMouseClicked

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String archivo = "./archivos/Universos/";
        String nom = nombre.getText();
        archivo += nom+".uni";
        AdminUniverso_individual uni = new AdminUniverso_individual(archivo);
        uni.cargarArchivo();
        Universo universo = uni.getUniverso();
        
        area.setText(universo.toString());

    }//GEN-LAST:event_jButton3MouseClicked

    private void b_crear_serMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_crear_serMouseClicked
        String archivo = "./archivos/Seres_vivos/";
        String nombre = t_ser_nombre.getText();
        archivo += nombre+".ser";
        AdminSerVivo_individual ser = new AdminSerVivo_individual(archivo);
        
        String id = t_ser_id.getText();
        int poder = 0;
        if(b_1.isSelected()){
            poder = 1;
        }else if(b_2.isSelected()){
            poder = 2;
        }else if(b_3.isSelected()){
            poder = 3;
        }else if(b_4.isSelected()){
            poder = 4;
        }else if(b_5.isSelected()){
            poder = 5;
        }else if(b_6.isSelected()){
            poder = 6;
        }else if(b_7.isSelected()){
            poder = 7;
        }else if(b_8.isSelected()){
            poder = 8;
        }else if(b_9.isSelected()){
            poder = 9;
        }else if(b_10.isSelected()){
            poder = 10;
        }
        int edad = (Integer) sp_edad.getValue();
        String universo = combo_universos.getSelectedItem().toString();
        String raza = combo_raza.getSelectedItem().toString();
        
        
        ser.cargarArchivo();
        SerVivo servivo = new SerVivo(nombre, id, poder, edad, universo, raza);
        ser.setSer(servivo);
        ser.escribirArchivo();
        t_ser_nombre.setText("");
        t_ser_id.setText("");
        sp_edad.setValue(0);
        
        String archivo2 = "./archivos/Listas/Lista_de_seres.ltser";
        AdminSerVivo_lista ltser = new AdminSerVivo_lista(archivo2);
        
        ltser.cargarArchivo();
        ltser.setServivo(servivo);
        ArrayList<SerVivo> lista2 = ltser.getLista();
        ltser.escribirArchivo();
        for (int i = 0; i < lista2.size(); i++) {
            System.out.println(lista2.get(i));
        }
        
        
    }//GEN-LAST:event_b_crear_serMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String archivo = "./archivos/Seres_vivos/";
        String nom = nombre.getText();
        archivo += nom+".ser";
        AdminSerVivo_individual ser = new AdminSerVivo_individual(archivo);
        ser.cargarArchivo();
        SerVivo servivo = ser.getSer();
        
        area.setText(servivo.toString());
    }//GEN-LAST:event_jButton1MouseClicked

    private void iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarMouseClicked
        String archivo2 = "./archivos/Listas/Lista_de_seres.ltser";
        AdminSerVivo_lista ltser = new AdminSerVivo_lista(archivo2);
        
        ltser.cargarArchivo();
        ArrayList<SerVivo> lista2 = ltser.getLista();
        ltser.escribirArchivo();
        
        
        Thread hilo = new Thread(new Hilo(lista2));
        
        hilo.start();
    }//GEN-LAST:event_iniciarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JRadioButton b_1;
    private javax.swing.JRadioButton b_10;
    private javax.swing.JRadioButton b_2;
    private javax.swing.JRadioButton b_3;
    private javax.swing.JRadioButton b_4;
    private javax.swing.JRadioButton b_5;
    private javax.swing.JRadioButton b_6;
    private javax.swing.JRadioButton b_7;
    private javax.swing.JRadioButton b_8;
    private javax.swing.JRadioButton b_9;
    private javax.swing.JButton b_crear_ser;
    private javax.swing.JButton b_crear_universo;
    javax.swing.JProgressBar barra;
    private javax.swing.JComboBox<String> combo_raza;
    private javax.swing.JComboBox<String> combo_universos;
    private javax.swing.ButtonGroup escala_de_poder;
    private javax.swing.JButton iniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    javax.swing.JList<String> lista_seres;
    private javax.swing.JTextField nombre;
    private javax.swing.JSpinner sp_edad;
    private javax.swing.JTextField t_ser_id;
    private javax.swing.JTextField t_ser_nombre;
    private javax.swing.JTextField t_universo;
    // End of variables declaration//GEN-END:variables
}
