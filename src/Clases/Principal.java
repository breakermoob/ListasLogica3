package Clases;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    IngresaCadOriginal Frame = new IngresaCadOriginal();
    LDL Original = new LDL();
    LDL copia = new LDL();
    int contador=0;
    public DefaultTableModel model= new DefaultTableModel();
    Vector listas= new Vector();
    String historial = "Historial:";
    
     public Principal() {
        initComponents();
        model.addColumn("Listas ingresadas previamente");
        Vistas.setModel(model);
        
    }
     public void recibeDatos(LDL a) {
        Original = a;
        listas.add(Original);
        cadena.setText(Original.mostrar());
        cadena.setEditable(false);
        cadena.setEnabled(false);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        Vistas = Vistas = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        AñadirHilera = new javax.swing.JButton();
        EliHilera = new javax.swing.JButton();
        modificarHilera = new javax.swing.JButton();
        OrdHilera = new javax.swing.JButton();
        BuscPalabra = new javax.swing.JButton();
        EsPalindro = new javax.swing.JButton();
        inicio = new javax.swing.JButton();
        EsAnagrama = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        cadena = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        InHilera = new javax.swing.JButton();

        label1.setText("Ultima Hilera Modificada");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Funciones");

        Vistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Vistas.setAutoscrolls(false);
        jScrollPane1.setViewportView(Vistas);

        AñadirHilera.setText("Añadir Hilera");
        AñadirHilera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirHileraActionPerformed(evt);
            }
        });

        EliHilera.setText("Eliminar una Hilera");
        EliHilera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliHileraActionPerformed(evt);
            }
        });

        modificarHilera.setText("Modificar Hilera");
        modificarHilera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarHileraActionPerformed(evt);
            }
        });

        OrdHilera.setText("Ordernar Hilera Alfabeticamente");
        OrdHilera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdHileraActionPerformed(evt);
            }
        });

        BuscPalabra.setText("Buscar Palabra en una Hilera");
        BuscPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscPalabraActionPerformed(evt);
            }
        });

        EsPalindro.setText("Determinar si es Palindromo");
        EsPalindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsPalindroActionPerformed(evt);
            }
        });

        inicio.setText("Ingresar Nueva Hilera");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        EsAnagrama.setText("Determinar si es Anagrama");
        EsAnagrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsAnagramaActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel1.setText("Ultima Hilera Modificada");

        InHilera.setText("Invertir Hilera");
        InHilera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InHileraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BuscPalabra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EsPalindro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EsAnagrama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(AñadirHilera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(EliHilera, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(modificarHilera, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(OrdHilera, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(InHilera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                            .addComponent(cadena))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AñadirHilera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EliHilera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificarHilera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InHilera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OrdHilera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscPalabra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EsPalindro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EsAnagrama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inicio))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AñadirHileraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirHileraActionPerformed
        if(Vistas.getSelectedRow()>=0){
            Original=(LDL)listas.get(Vistas.getSelectedRow());
            String k = (String) JOptionPane.showInputDialog(null, "Ingrese la cadena que quiere añadir");
            if (k != null) {
                Original.adicionaHilera(k);
                cadena.setText(Original.mostrar());
                listas.set(Vistas.getSelectedRow(),Original);
                mostrarHilera(Vistas.getSelectedRow());
            }
        }else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione la hilera a operar");
        }
    }//GEN-LAST:event_AñadirHileraActionPerformed

    private void OrdHileraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdHileraActionPerformed
        if(Vistas.getSelectedRow()>=0){
            Original=(LDL)listas.get(Vistas.getSelectedRow());
            Original.OrdenaAlfaLista();
            listas.set(Vistas.getSelectedRow(),Original);
            mostrarHilera(Vistas.getSelectedRow());
            cadena.setText(Original.mostrar());
        }else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione la hilera a operar");
        }
    }//GEN-LAST:event_OrdHileraActionPerformed

    private void BuscPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscPalabraActionPerformed
        if(Vistas.getSelectedRow()>=0){   
            Original=(LDL)listas.get(Vistas.getSelectedRow());
            copia=Original;
            String k = (String) JOptionPane.showInputDialog(null, "Ingrese la palabra que quiere que se busque en la lista");
            if (k != null) {
                boolean a = copia.subHilera(k);
                if (a == true) {
                    JOptionPane.showMessageDialog(null, "La palabra " + k + " Se encuentra en la lista");
                } else {
                    JOptionPane.showMessageDialog(null, "La palabra " + k + " No se encuentra en la lista");
                }
            }
        }else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione la hilera a operar");
        }
    }//GEN-LAST:event_BuscPalabraActionPerformed

    private void EsPalindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsPalindroActionPerformed
        if(Vistas.getSelectedRow()>=0){    
             Original=(LDL)listas.get(Vistas.getSelectedRow());
             copia=Original;
             boolean b = copia.palindromo();
             String m = Original.mostrar();
             if (b == true) {
                 JOptionPane.showMessageDialog(null, "La palabra " + m + " es Palindromo ");
             } else {
                 JOptionPane.showMessageDialog(null, "La palabra " + m + " NO es Palindromo");
             }
        }else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione la hilera a operar");
        }
    }//GEN-LAST:event_EsPalindroActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
             String k = (String) JOptionPane.showInputDialog(null, "Ingrese su nueva hilera");
            if (k != null) {
                contador=contador+1;
                LDL nueva = new LDL();
                nueva.creaLista(k);
                Original= nueva;
                listas.add(Original);
                String auxiliar[]=new String[1];
                auxiliar[0]=((LDL)listas.get(contador)).mostrar();
                model.addRow(auxiliar);
            }else if(k==null) {
                JOptionPane.showMessageDialog(null, "Por favor Ingrese una cadena",null,JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_inicioActionPerformed

    private void EsAnagramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsAnagramaActionPerformed
        if(Vistas.getSelectedRow()>=0){  
            Original=(LDL)listas.get(Vistas.getSelectedRow());
            copia=Original;
            String k = (String) JOptionPane.showInputDialog(null, "Ingrese la palabra que quiere comparar como anagrama");
            if (k != null) {
                boolean a = copia.anagrama(k);
                if (a == true) {
                    JOptionPane.showMessageDialog(null, "La palabra " + k + " Es anagrama de la hilera");
                } else {
                    JOptionPane.showMessageDialog(null, "La palabra " + k + " No es anagrama de la hilera");
                }
            }
        }else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione la hilera a operar");
        }
    }//GEN-LAST:event_EsAnagramaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void EliHileraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliHileraActionPerformed
        if(Vistas.getSelectedRow()>=0){ 
            String k = (String) JOptionPane.showInputDialog(null, "Ingrese la cadena que quiere eliminar");
            if (k != null) {
                Original = Original.eliminarParte(k);
                cadena.setText(Original.mostrar());
                listas.set(contador,Original);
                mostrarHilera(Vistas.getSelectedRow());
            }else {
                JOptionPane.showMessageDialog(null, "Por favor seleccione la hilera a operar");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione la hilera a operar");
        }
    }//GEN-LAST:event_EliHileraActionPerformed

    private void modificarHileraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarHileraActionPerformed
        if(Vistas.getSelectedRow()>=0){ 
            Original = (LDL) listas.get(Vistas.getSelectedRow());
            String k = (String) JOptionPane.showInputDialog(null, "Ingrese la parte que quiere modificar");
            String h = (String) JOptionPane.showInputDialog(null, "Ahora lo que quiere insertar");
            if ((k != null && h != null)&& k != "" && h != "") {
                Original.modificar(k,h);
                cadena.setText(Original.mostrar());
                listas.set(Vistas.getSelectedRow(), Original);
                mostrarHilera(Vistas.getSelectedRow());
                
            } else {
                JOptionPane.showMessageDialog(null, "Por favor seleccione la hilera a operar");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione la hilera a operar");
        }
    }//GEN-LAST:event_modificarHileraActionPerformed

    private void InHileraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InHileraActionPerformed
          if(Vistas.getSelectedRow()>=0){
                Original =(LDL)listas.get(Vistas.getSelectedRow());
                copia = Original.invertirHilera();
                listas.set(Vistas.getSelectedRow(),copia);
                mostrarHilera(Vistas.getSelectedRow());
                cadena.setText(copia.mostrar());
                Original = copia;
        }else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione la hilera a operar");
        }
    }//GEN-LAST:event_InHileraActionPerformed
   
    public void mostrarHilera(int a){
        String auxiliar[]=new String[1];
        auxiliar[0]=((LDL)listas.get(a)).mostrar();
        Vistas.setValueAt(auxiliar[0], a,0);
        
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
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
    private javax.swing.JButton AñadirHilera;
    private javax.swing.JButton BuscPalabra;
    private javax.swing.JButton EliHilera;
    private javax.swing.JButton EsAnagrama;
    private javax.swing.JButton EsPalindro;
    private javax.swing.JButton InHilera;
    private javax.swing.JButton OrdHilera;
    private javax.swing.JTable Vistas;
    private javax.swing.JTextField cadena;
    private javax.swing.JButton inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JButton modificarHilera;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
