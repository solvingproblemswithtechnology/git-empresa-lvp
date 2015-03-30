/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoempresalvp.gui;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import proyectoempresalvp.datos.ArrayListDato;
import proyectoempresalvp.datos.Cliente;
import proyectoempresalvp.datos.Dato;
import proyectoempresalvp.datos.FacturaExtra;
import proyectoempresalvp.datos.FacturaExtraDetalles;
import proyectoempresalvp.datos.Fecha;
import proyectoempresalvp.datosUI.Boton;
import proyectoempresalvp.datosUI.JPanelTranslucido;
import proyectoempresalvp.datosUI.PanelImagen;
import proyectoempresalvp.gestoras.Gestora;
import proyectoempresalvp.gestoras.GestoraBaseDatos;
import proyectoempresalvp.gestoras.Datos.GestoraDatos;
import proyectoempresalvp.gestoras.UtilidadesTareas;

/**
 *
 * @author Oscar
 */
public class DialogoNuevaFacturaExtra extends javax.swing.JDialog {

    ArrayList<FacturaExtraDetalles> conceptos = new ArrayList();
//  CAMBIAR EL IVA POR LA CONFIGURACION!!!!!!!!!!!!!!!!!!!!!!

    /**
     * Creates new form DialogoNuevaFacturaExtra
     *
     * @param parent
     * @param modal
     */
    public DialogoNuevaFacturaExtra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        ctporcenIva.setText("21");
        ctNumF.setText("" + GestoraDatos.dameGestora().get(FacturaExtra.getTabla()).devuelveNumeroSiguiente());

        comboNumeroCliente.setModel(new DefaultComboBoxModel(GestoraDatos.dameGestora().get("CLIENTES").devuelveTodasLasClaves()));
        comboNumeroCliente.addItem("NINGUNO");
        
        Fecha f = UtilidadesTareas.getFechaActual();
        ctFecha.setText(f.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = PanelImagen.dameNuevoPanelSinLetras();
        bCancelar = new Boton();
        bAceptar = new Boton();
        jPanel7 = new JPanelTranslucido();
        jLabel60 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        listaConceptos = new javax.swing.JList();
        bAñade = new Boton();
        bEditar = new Boton();
        bBorra = new Boton();
        jPanel5 = new JPanelTranslucido();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        ctNumF = new javax.swing.JTextField();
        ctBaseIm = new javax.swing.JTextField();
        ctporcenIva = new javax.swing.JTextField();
        ctTotal = new javax.swing.JTextField();
        ctIvaa = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        panelTexto = new JPanelTranslucido();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        ctNomb = new javax.swing.JTextField();
        ctDomic = new javax.swing.JTextField();
        ctLoca = new javax.swing.JTextField();
        ctCodpos = new javax.swing.JTextField();
        ctProvin = new javax.swing.JTextField();
        ctNcif = new javax.swing.JTextField();
        jPanel3 = new JPanelTranslucido();
        jLabel44 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ctFecha = new javax.swing.JTextField();
        comboNumeroCliente = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bAceptar.setText("Generar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));

        jLabel60.setText("Conceptos:");

        listaConceptos.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jScrollPane16.setViewportView(listaConceptos);

        bAñade.setText("Añadir");
        bAñade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAñadeActionPerformed(evt);
            }
        });

        bEditar.setText("Editar");

        bBorra.setText("Borrar");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel60)
                    .addComponent(bAñade)
                    .addComponent(bEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bBorra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addGap(18, 18, 18)
                        .addComponent(bAñade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bBorra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 153, 153));
        jLabel51.setText("DATOS GENERALES DE LA FACTURA");

        jLabel52.setText("Número de factura");

        jLabel53.setText("Base imponible");

        jLabel54.setText("IVA");

        jLabel55.setForeground(new java.awt.Color(255, 102, 102));
        jLabel55.setText("TOTAL");

        ctNumF.setEditable(false);

        ctTotal.setBackground(new java.awt.Color(255, 204, 204));

        jLabel56.setText("%");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addContainerGap(120, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ctTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel53)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel54)
                                        .addGap(54, 54, 54)
                                        .addComponent(ctporcenIva, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel56)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ctIvaa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ctNumF, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                        .addComponent(ctBaseIm)))))
                        .addGap(35, 35, 35))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51)
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(ctNumF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(ctBaseIm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(ctporcenIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctIvaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(ctTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        panelTexto.setBackground(new java.awt.Color(204, 204, 255));

        jLabel45.setText("Nombre:");

        jLabel46.setText("Domicilio:");

        jLabel47.setText("Localidad:");

        jLabel48.setText("C.P:");

        jLabel49.setText("Provincia:");

        jLabel50.setText("NIF/CIF:");

        javax.swing.GroupLayout panelTextoLayout = new javax.swing.GroupLayout(panelTexto);
        panelTexto.setLayout(panelTextoLayout);
        panelTextoLayout.setHorizontalGroup(
            panelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTextoLayout.createSequentialGroup()
                        .addGroup(panelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ctNcif, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(ctProvin)
                            .addComponent(ctCodpos)
                            .addComponent(ctLoca)))
                    .addGroup(panelTextoLayout.createSequentialGroup()
                        .addGroup(panelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTextoLayout.createSequentialGroup()
                                .addGroup(panelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel46))
                                .addGap(51, 51, 51)
                                .addGroup(panelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ctDomic, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ctNomb, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel47))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(43, 43, 43))
        );
        panelTextoLayout.setVerticalGroup(
            panelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(ctNomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(ctDomic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(ctLoca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(ctCodpos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(ctProvin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(ctNcif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel44.setText("Seleccione un cliente:");

        jLabel1.setText("Fecha:");

        comboNumeroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNumeroClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel44)
                    .addComponent(jLabel1)
                    .addComponent(ctFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(comboNumeroCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addGap(18, 18, 18)
                .addComponent(comboNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ctFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 739, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelFondoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelFondoLayout.createSequentialGroup()
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                                    .addComponent(panelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                                    .addComponent(bAceptar)
                                    .addGap(18, 18, 18)
                                    .addComponent(bCancelar)))))
                    .addContainerGap()))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelFondoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(bCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAñadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAñadeActionPerformed

        DialogoNuevaFacturaDetalles dialogo = new DialogoNuevaFacturaDetalles((JFrame) this.getParent(), true,
                Integer.parseInt(ctNumF.getText()), conceptos.size());
        dialogo.setVisible(true);
        if(dialogo.getFactura() != null) {

            conceptos.add(dialogo.getFactura());
            listaConceptos.setListData(conceptosFormateados());
            ctBaseIm.setText("" + (Float.parseFloat(ctBaseIm.getText().isEmpty()
                    ? "0" : ctBaseIm.getText())
                    + Float.parseFloat(dialogo.getFactura().get("IMPORTE").toString())));
            float base = Float.parseFloat(ctBaseIm.getText().isEmpty()
                    ? "0" : ctBaseIm.getText());
            float iva = Float.parseFloat(ctporcenIva.getText().isEmpty()
                    ? "0" : ctporcenIva.getText());
            float total = (base * iva / 100);
            ctIvaa.setText("" + (total));
            ctTotal.setText("" + (total + base));
        }
    }//GEN-LAST:event_bAñadeActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed

        if(insertarFacturaExtra()) {
            this.dispose();
        }
    }//GEN-LAST:event_bAceptarActionPerformed

    private void comboNumeroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNumeroClienteActionPerformed
        
        refrescarCliente();
    }//GEN-LAST:event_comboNumeroClienteActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private String[] conceptosFormateados() {

        String[] dev = new String[conceptos.size()];

        for(int i = 0;i < dev.length;i++) {

            dev[i] = Gestora.completarConEspaciosBlancosIzq(conceptos.get(i).get("CONCEPTO").toString(), 50)
                    + " | " + Gestora.stringLongitudFijaIzq(conceptos.get(i).get("IMPORTE").toString(), "      ");
        }

        return dev;
    }

    private boolean insertarFacturaExtra() {
        
        String fecha = ctFecha.getText();

        if(!Gestora.comprobarFormatoFechaCorrecto(fecha)) {
            JOptionPane.showMessageDialog(this, "Comprueba las fechas, el formato es dd/mm/aaaa");
        } else if(!comprobarNumero(ctCodpos.getText())
                || !comprobarNumero(ctporcenIva.getText())
                || !comprobarNumero(ctNumF.getText())) {

            JOptionPane.showMessageDialog(this, "Comprueba que has introducido en los campos numéricos números correctamente.");
        } else {
            String cliente = comboNumeroCliente.getSelectedItem().toString();
            System.out.println(cliente);
            FacturaExtra nuevaFacturaExtra = new FacturaExtra(Integer.parseInt(ctNumF.getText()), //NUMFACTURA
                    new Fecha(fecha), //FECHA
                    ctNcif.getText(), //CIFNIF
                    ctNomb.getText(), ctDomic.getText(), ctLoca.getText(), ctProvin.getText(),//NOMBRE,DOMICILIO,LOCALIDAD,PROVINCIA
                    ctCodpos.getText(), //CP
                    Integer.parseInt(ctporcenIva.getText()), //TANTOIVA
                    ctTotal.getText(), //EUROSNETO
                    cliente.equals("NINGUNO") ? -1 : Integer.parseInt(cliente));//CLIENTE

            if(GestoraBaseDatos.insertarDato(nuevaFacturaExtra)) {
                conceptos.stream().forEach((f) -> {
                    GestoraBaseDatos.insertarDato(f);
                });
                GestoraDatos.actualizaDatos(GestoraDatos.ACTUALIZAR_FACTURASEXTRA);
                return true;
            } else {

                JOptionPane.showMessageDialog(this, "Ya existe");
            }
        }
        return false;
    }

    private void refrescarCliente() {

        if(!"NINGUNO".equals(comboNumeroCliente.getSelectedItem())) {

            ArrayListDato<Dato> clientes = GestoraDatos.recuperarConDummy(new Cliente(),
                    null, " where NUMEROCLIENTE = " + comboNumeroCliente.getSelectedItem());
            Dato d = clientes.get(0);
            ctNomb.setText(d.get("NOMBRE").toString());
            ctLoca.setText(d.get("LOCALIDAD").toString());
            ctDomic.setText(d.get("DOMICILIO").toString());
            ctCodpos.setText(d.get("CP").toString());
            ctProvin.setText(d.get("PROVINCIA").toString());
            ctNcif.setText(d.get("CIF").toString());
        }else{
            
            Component[] cs = panelTexto.getComponents();
            for(Component c : cs){
                
                if(c instanceof JTextField)
                    ((JTextField)c).setText("");
            }
        }
    }

    private boolean comprobarNumero(String n) {

        
        return n.isEmpty() ? false : Gestora.comprobarNumero(n);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bAñade;
    private javax.swing.JButton bBorra;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bEditar;
    private javax.swing.JComboBox comboNumeroCliente;
    private javax.swing.JTextField ctBaseIm;
    private javax.swing.JTextField ctCodpos;
    private javax.swing.JTextField ctDomic;
    private javax.swing.JTextField ctFecha;
    private javax.swing.JTextField ctIvaa;
    private javax.swing.JTextField ctLoca;
    private javax.swing.JTextField ctNcif;
    private javax.swing.JTextField ctNomb;
    private javax.swing.JTextField ctNumF;
    private javax.swing.JTextField ctProvin;
    private javax.swing.JTextField ctTotal;
    private javax.swing.JTextField ctporcenIva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JList listaConceptos;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelTexto;
    // End of variables declaration//GEN-END:variables
}
