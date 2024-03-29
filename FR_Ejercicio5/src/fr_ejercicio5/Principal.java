/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_ejercicio5;

import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elena María Gómez Ríos y Jose Luis Martínez Ortíz
 */
public class Principal extends javax.swing.JFrame {

    private int cant;
    private ClienteCine cliente;
    ArrayList<JCheckBox> asientos;
    ArrayList<Boolean> sala1, sala2, sala3, sala4, sala5;

    /**
     * Creates new form Principal
     */
    public Principal(ClienteCine cliente) {
        this.cliente = cliente;
        cant = 0;
        initComponents();
        sala1 = new ArrayList();
        sala2 = new ArrayList();
        sala3 = new ArrayList();
        sala4 = new ArrayList();
        sala5 = new ArrayList();

        for (int i = 0; i < 20; i++) {
            sala1.add(false);
            sala2.add(false);
            sala3.add(false);
            sala4.add(false);
            sala5.add(false);
        }

        asientos = new ArrayList();
        asientos.add(cb0);
        asientos.add(cb1);
        asientos.add(cb2);
        asientos.add(cb3);
        asientos.add(cb4);
        asientos.add(cb5);
        asientos.add(cb6);
        asientos.add(cb7);
        asientos.add(cb8);
        asientos.add(cb9);
        asientos.add(cb10);
        asientos.add(cb11);
        asientos.add(cb12);
        asientos.add(cb13);
        asientos.add(cb14);
        asientos.add(cb15);
        asientos.add(cb16);
        asientos.add(cb17);
        asientos.add(cb18);
        asientos.add(cb19);

        cargarSalas();
        
        actualizarSalas(jComboBox1.getSelectedIndex());
        cant = 0;
        tf_cantidad.setText("");
        tf_total.setText("");

    }

    void cargarSalas() {
        String butacas = cliente.CargarButacas();
        System.out.println(butacas);
        String[] salas = butacas.split("#");
        String[] butaca;

        for (int i = 0; i < salas.length; i++) {
            butaca = salas[i].split(":");
            jComboBox1.addItem(butaca[0]);
            for (int j = 1; j < butaca.length && i == 0; j++) {
                sala1.set(Integer.valueOf(butaca[j]), true);
            }
            for (int j = 1; j < butaca.length && i == 1; j++) {
                sala2.set(Integer.valueOf(butaca[j]), true);
            }
            for (int j = 1; j < butaca.length && i == 2; j++) {
                sala3.set(Integer.valueOf(butaca[j]), true);
            }
            for (int j = 1; j < butaca.length && i == 3; j++) {
                sala4.set(Integer.valueOf(butaca[j]), true);
            }
            for (int j = 1; j < butaca.length && i == 4; j++) {
                sala5.set(Integer.valueOf(butaca[j]), true);
            }
        }

    }

    public void actualizarSalas(int numsala) {

        for (int j = 0; j < sala1.size() && numsala == 0; j++) {
            asientos.get(j).setSelected(sala1.get(j));
            asientos.get(j).setEnabled(!sala1.get(j));
        }
        for (int j = 0; j < sala2.size() && numsala == 1; j++) {
            asientos.get(j).setSelected(sala2.get(j));
            asientos.get(j).setEnabled(!sala2.get(j));
        }
        for (int j = 0; j < sala3.size() && numsala == 2; j++) {
            asientos.get(j).setSelected(sala3.get(j));
            asientos.get(j).setEnabled(!sala3.get(j));
        }
        for (int j = 0; j < sala4.size() && numsala == 3; j++) {
            asientos.get(j).setSelected(sala4.get(j));
            asientos.get(j).setEnabled(!sala4.get(j));
        }
        for (int j = 0; j < sala5.size() && numsala == 4; j++) {
            asientos.get(j).setSelected(sala5.get(j));
            asientos.get(j).setEnabled(!sala5.get(j));
        }

    }

    private void actualizarCantidad(int n) {
        if (asientos.get(n).isSelected()) {
            cant++;
        } else {
            cant--;
        }

        tf_cantidad.setText(cant + "");
        tf_total.setText(cant * 6 + "");
    }
    
    private boolean mandarCompraButacas (){
        String compra="";
        // Comprobamos la sala actual
        compra+=jComboBox1.getSelectedIndex()+":";
        
        for (int i = 0; i< asientos.size(); i++){
            // Comprobamos que checkBox estan habilitados
            if (asientos.get(i).isEnabled()){
                // Comprobamos cuales estan seleccionados
                if (asientos.get(i).isSelected()){
                    // Guardamos los datos en un string (Sala x : <butacas ocupadas>)
                    compra+=i+":";
                }          
            }
        }      
        return cliente.realizarComprar(compra);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_cantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_total = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cb1 = new javax.swing.JCheckBox();
        cb0 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        cb5 = new javax.swing.JCheckBox();
        cb6 = new javax.swing.JCheckBox();
        cb7 = new javax.swing.JCheckBox();
        cb8 = new javax.swing.JCheckBox();
        cb9 = new javax.swing.JCheckBox();
        cb10 = new javax.swing.JCheckBox();
        cb11 = new javax.swing.JCheckBox();
        cb15 = new javax.swing.JCheckBox();
        cb16 = new javax.swing.JCheckBox();
        cb12 = new javax.swing.JCheckBox();
        cb17 = new javax.swing.JCheckBox();
        cb13 = new javax.swing.JCheckBox();
        cb18 = new javax.swing.JCheckBox();
        cb14 = new javax.swing.JCheckBox();
        cb19 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compra Entradas!");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Seleccione Sala:");

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Precio Entrada: 6€");

        jLabel3.setText("Cantidad:");

        tf_cantidad.setEditable(false);
        tf_cantidad.setText(" ");
        tf_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cantidadActionPerformed(evt);
            }
        });

        jLabel4.setText("Total:");

        tf_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_totalActionPerformed(evt);
            }
        });

        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Salas"));

        jLabel5.setText("Asiento 1");

        jLabel6.setText("Asiento 2");

        jLabel7.setText("Asiento 3");

        jLabel8.setText("Asiento 4");

        jLabel9.setText("Asiento 5");

        jLabel10.setText("Fila 1");

        jLabel11.setText("Fila 2");

        jLabel12.setText("Fila 3");

        jLabel13.setText("Fila 4");

        cb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb1MouseClicked(evt);
            }
        });

        cb0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb0MouseClicked(evt);
            }
        });

        cb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb2MouseClicked(evt);
            }
        });

        cb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb3MouseClicked(evt);
            }
        });

        cb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb4MouseClicked(evt);
            }
        });

        cb5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb5MouseClicked(evt);
            }
        });

        cb6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb6MouseClicked(evt);
            }
        });

        cb7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb7MouseClicked(evt);
            }
        });

        cb8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb8MouseClicked(evt);
            }
        });

        cb9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb9MouseClicked(evt);
            }
        });

        cb10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb10MouseClicked(evt);
            }
        });

        cb11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb11MouseClicked(evt);
            }
        });

        cb15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb15MouseClicked(evt);
            }
        });

        cb16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb16MouseClicked(evt);
            }
        });

        cb12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb12MouseClicked(evt);
            }
        });

        cb17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb17MouseClicked(evt);
            }
        });

        cb13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb13MouseClicked(evt);
            }
        });

        cb18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb18MouseClicked(evt);
            }
        });

        cb14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb14MouseClicked(evt);
            }
        });

        cb19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(46, 46, 46)
                        .addComponent(cb15))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb10))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb5))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(22, 22, 22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cb0)
                                .addComponent(jLabel5)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(cb1)
                    .addComponent(cb6)
                    .addComponent(cb11)
                    .addComponent(cb16))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb7)
                            .addComponent(cb2)
                            .addComponent(cb12)
                            .addComponent(cb17))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb3)
                            .addComponent(cb8)
                            .addComponent(cb13)
                            .addComponent(cb18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb4)
                            .addComponent(cb9)
                            .addComponent(cb14)
                            .addComponent(cb19))
                        .addGap(32, 32, 32))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(cb1)
                            .addComponent(cb2)
                            .addComponent(cb3)
                            .addComponent(cb4)
                            .addComponent(cb0))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(cb6, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(cb7)
                            .addComponent(cb8)
                            .addComponent(cb9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cb5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb10)
                    .addComponent(cb11)
                    .addComponent(cb12)
                    .addComponent(cb13)
                    .addComponent(cb14)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel13)
                        .addComponent(cb15)
                        .addComponent(cb16)
                        .addComponent(cb17))
                    .addComponent(cb18)
                    .addComponent(cb19))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_cantidad))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(23, 23, 23)
                            .addComponent(tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cantidadActionPerformed

    private void tf_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_totalActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

        actualizarSalas(jComboBox1.getSelectedIndex());
        cant = 0;
        tf_cantidad.setText("");
        tf_total.setText("");
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void cb0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb0MouseClicked
        actualizarCantidad(0);
    }//GEN-LAST:event_cb0MouseClicked

    private void cb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb1MouseClicked
        actualizarCantidad(1);
    }//GEN-LAST:event_cb1MouseClicked

    private void cb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb2MouseClicked
        actualizarCantidad(2);
    }//GEN-LAST:event_cb2MouseClicked

    private void cb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb3MouseClicked
        actualizarCantidad(3);
    }//GEN-LAST:event_cb3MouseClicked

    private void cb4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb4MouseClicked
        actualizarCantidad(4);
    }//GEN-LAST:event_cb4MouseClicked

    private void cb5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb5MouseClicked
        actualizarCantidad(5);
    }//GEN-LAST:event_cb5MouseClicked

    private void cb6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb6MouseClicked
       actualizarCantidad(6);
    }//GEN-LAST:event_cb6MouseClicked

    private void cb7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb7MouseClicked
       actualizarCantidad(7);
    }//GEN-LAST:event_cb7MouseClicked

    private void cb8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb8MouseClicked
        actualizarCantidad(8);
    }//GEN-LAST:event_cb8MouseClicked

    private void cb9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb9MouseClicked
       actualizarCantidad(9);
    }//GEN-LAST:event_cb9MouseClicked

    private void cb10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb10MouseClicked
        actualizarCantidad(10);
    }//GEN-LAST:event_cb10MouseClicked

    private void cb11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb11MouseClicked
        actualizarCantidad(11);
    }//GEN-LAST:event_cb11MouseClicked

    private void cb12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb12MouseClicked
       actualizarCantidad(12);
    }//GEN-LAST:event_cb12MouseClicked

    private void cb13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb13MouseClicked
       actualizarCantidad(13);
    }//GEN-LAST:event_cb13MouseClicked

    private void cb14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb14MouseClicked
      actualizarCantidad(14);
    }//GEN-LAST:event_cb14MouseClicked

    private void cb15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb15MouseClicked
       actualizarCantidad(15);
    }//GEN-LAST:event_cb15MouseClicked

    private void cb16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb16MouseClicked
       actualizarCantidad(16);
    }//GEN-LAST:event_cb16MouseClicked

    private void cb17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb17MouseClicked
        actualizarCantidad(17);
    }//GEN-LAST:event_cb17MouseClicked

    private void cb18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb18MouseClicked
       actualizarCantidad(18);
    }//GEN-LAST:event_cb18MouseClicked

    private void cb19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb19MouseClicked
       actualizarCantidad(19);
    }//GEN-LAST:event_cb19MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cliente.desconectar();
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String msg = "Su compra no se ha podido realizar, pruebe más tarde.";
        if (mandarCompraButacas()){
            msg = "Su compra se ha realizado con éxito.";
        }
        JOptionPane.showMessageDialog(this,msg);
        cliente.desconectar();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb0;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb10;
    private javax.swing.JCheckBox cb11;
    private javax.swing.JCheckBox cb12;
    private javax.swing.JCheckBox cb13;
    private javax.swing.JCheckBox cb14;
    private javax.swing.JCheckBox cb15;
    private javax.swing.JCheckBox cb16;
    private javax.swing.JCheckBox cb17;
    private javax.swing.JCheckBox cb18;
    private javax.swing.JCheckBox cb19;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JCheckBox cb5;
    private javax.swing.JCheckBox cb6;
    private javax.swing.JCheckBox cb7;
    private javax.swing.JCheckBox cb8;
    private javax.swing.JCheckBox cb9;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_cantidad;
    private javax.swing.JTextField tf_total;
    // End of variables declaration//GEN-END:variables

}
