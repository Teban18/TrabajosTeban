/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.Crud;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deiber
 */
public class ClientView extends javax.swing.JFrame {
    private DefaultTableModel model;
    private ArrayList<String> columns = new ArrayList<String>();
    private ArrayList<String> values;
    private Crud crud;
    private String clientname = "client";
    private String clientid = "client_id";
    public ClientView() {
        initComponents();
        columns.add("client_identification");
        columns.add("first_name");
        columns.add("last_name");
        columns.add("birth_date");
        columns.add("phone");
        columns.add("address_client");
        columns.add("city_client");
        columns.add("created_by");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void setCrud(Crud crud) {
        this.crud = crud;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        txtbdate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clienttable = new javax.swing.JTable();
        txtaddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnread = new javax.swing.JToggleButton();
        txtphone = new javax.swing.JTextField();
        txtcreatedby = new javax.swing.JTextField();
        txtsearch = new javax.swing.JTextField();
        txtcity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtidentification = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Birth_Date");

        jLabel7.setText("Phone");

        jLabel1.setText("Cliente");

        jLabel8.setText("Direccion");

        clienttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        clienttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clienttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(clienttable);

        jLabel9.setText("Ciudad");

        jLabel10.setText("Creado por");

        btnread.setText("Buscar");
        btnread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreadActionPerformed(evt);
            }
        });

        jLabel2.setText("Busqueda por ID");

        jLabel3.setText("Identificacion");

        btninsert.setText("Agregar");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        btnupdate.setText("Editar");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre");

        btndelete.setText("Eliminar");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtidentification, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbdate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtcreatedby, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel6)
                        .addGap(133, 133, 133)
                        .addComponent(jLabel7)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel8)
                        .addGap(132, 132, 132)
                        .addComponent(jLabel9)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btninsert, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(btnread, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel4)
                        .addGap(127, 127, 127)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnread)
                    .addComponent(txtidentification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btninsert)
                            .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcreatedby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(btnupdate)
                        .addGap(28, 28, 28)
                        .addComponent(btndelete))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
try {
            values = new ArrayList<String>();
            values.add(txtidentification.getText());
            values.add(txtfname.getText());
            values.add(txtlname.getText());
            values.add(txtbdate.getText());
            values.add(txtphone.getText());
            values.add(txtaddress.getText());
            values.add(txtcity.getText());
            values.add(txtcreatedby.getText());
            crud.createstatement(clientname, columns, values);
            setTableSets();
            cleartxt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {
            if (clienttable.getSelectedRow() != -1) {
                int i = clienttable.getSelectedRow();
                int idvalue = (int) clienttable.getValueAt(i, 0);
                ArrayList<String> thisvalues = new ArrayList<String>();
                thisvalues.add(txtidentification.getText());
                thisvalues.add(txtfname.getText());
                thisvalues.add(txtlname.getText());
                thisvalues.add(txtbdate.getText());
                thisvalues.add(txtphone.getText());
                thisvalues.add(txtaddress.getText());
                thisvalues.add(txtcity.getText());
                thisvalues.add(txtcreatedby.getText());
                crud.updatestatement(clientname, columns, thisvalues, clientid, idvalue);
                setTableSets();
                cleartxt();
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try {
            if (clienttable.getSelectedRow() != -1) {
                int i = clienttable.getSelectedRow();
                int idvalue = (int) clienttable.getValueAt(i, 0);
                crud.deletestatement(clientname, clientid, idvalue);
                setTableSets();
                cleartxt();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione el registro que desea eliminar");
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreadActionPerformed
        try {
            String thisidvalue = txtsearch.getText();
            int integeridvalue = Integer.parseInt(thisidvalue);
            try {
                model = new DefaultTableModel();
                model.addColumn("ID");
                model.addColumn("Identificación");
                model.addColumn("Nombres");
                model.addColumn("Apellidos");
                model.addColumn("FechaDeCreacion");
                model.addColumn("FechaNacimiento");
                model.addColumn("Telefono");                
                model.addColumn("Direccion");
                model.addColumn("Ciudad");
                model.addColumn("CreadoPor");
                crud.searchStatement(clientname, clientid, integeridvalue);
                while (crud.getresultset().next()) {
                    Object[] row = new Object[10];
                    for (int i = 0; i <row.length; i++) {
                        row[i] = crud.getresultset().getObject(i + 1);
                    }
                    model.addRow(row);
                }
                this.clienttable.setModel(model);
                cleartxt();
            } catch (SQLException ex) {

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No existe un registro con ese ID");
        }
    }//GEN-LAST:event_btnreadActionPerformed

    private void clienttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienttableMouseClicked
        int i = clienttable.getSelectedRow();
        txtidentification.setText((String) clienttable.getValueAt(i, 1));
        txtfname.setText((String) clienttable.getValueAt(i, 2));
        txtlname.setText((String) clienttable.getValueAt(i, 3));
        txtbdate.setText((String) clienttable.getValueAt(i, 5));
        txtphone.setText((String) clienttable.getValueAt(i, 6));
        txtaddress.setText((String) clienttable.getValueAt(i, 7));
        txtcity.setText((String) clienttable.getValueAt(i, 8));
        txtcreatedby.setText((String) clienttable.getValueAt(i, 9));
    }//GEN-LAST:event_clienttableMouseClicked
 
     private void cleartxt() {
        txtidentification.setText("");
        txtfname.setText("");
        txtlname.setText("");
        txtbdate.setText("");
        txtphone.setText("");
        txtaddress.setText("");
        txtcity.setText("");
        txtcreatedby.setText("");
        txtsearch.setText("");
    }
    public void setTableSets() {

        try {
            model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Identificación");
            model.addColumn("Nombres");            
            model.addColumn("Apellidos");
            model.addColumn("FechaDeCreacion");
            model.addColumn("FechaNacimiento");
            model.addColumn("Telefono");            
            model.addColumn("Direccion");
            model.addColumn("Ciudad");
            model.addColumn("CreadoPor");
            crud.readstatement(clientname);
            while (crud.getresultset().next()) {
                Object[] row = new Object[10];
                for (int i = 0; i < row.length; i++) {
                    row[i] = crud.getresultset().getObject(i + 1);
                }
                model.addRow(row);
            }
            this.clienttable.setModel(model);
        } catch (SQLException ex) {

        }
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JToggleButton btnread;
    private javax.swing.JButton btnupdate;
    private javax.swing.JTable clienttable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtbdate;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtcreatedby;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtidentification;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
