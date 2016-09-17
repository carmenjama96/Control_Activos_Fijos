/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaInterfaces;

import Capa_ConexionBD.Conexion;
import java.awt.GridBagLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandro
 */
public class AsignaciónActivos extends javax.swing.JDialog {

    /**
     * Creates new form AsignaciónActivos
     */
     int banderaOculta = 0;
    public AsignaciónActivos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        panelBusquedaTipo.setVisible(false);
        this.setLocationRelativeTo(null);
        //this.getContentPane().setLayout (new GridBagLayout());
        cargar();
        
            
    }
    
    Conexion conexion = new Conexion();
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        GrupoCriterioBusquedaActivosNoAsignados = new javax.swing.ButtonGroup();
        GrupoBusquedaPorTipo = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_activoSinResponsable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_buscar_activo = new javax.swing.JButton();
        panelBusquedaTipo = new javax.swing.JPanel();
        rbtn_marca_activo = new javax.swing.JRadioButton();
        rbtn_procesador_activo = new javax.swing.JRadioButton();
        rbtn_memoria_activo = new javax.swing.JRadioButton();
        rbtn_discoduro_activo = new javax.swing.JRadioButton();
        combo_marca_activo = new javax.swing.JComboBox();
        combo_procesador_activo = new javax.swing.JComboBox();
        combo_memoria_activo = new javax.swing.JComboBox();
        combo_discoduro_activo = new javax.swing.JComboBox();
        rbtn_tipo = new javax.swing.JRadioButton();
        combo_tipo_activo = new javax.swing.JComboBox();
        rbtn_serie_activo = new javax.swing.JRadioButton();
        txt_serie_activo = new javax.swing.JTextField();
        rbtn_codigoinstitucional_activo = new javax.swing.JRadioButton();
        txt_codigoInternoInsticucional_activo = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btn_nuevo = new javax.swing.JButton();
        btn_asignar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btn_seleccionar = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles de Búsqueda"));

        jRadioButton1.setText("Tipo");

        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Estado");

        jRadioButton3.setText("Serie");

        jRadioButton4.setText("Código Institucional");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton5.setText("Marca");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setText("Procesador");

        jRadioButton7.setText("Memoria");

        jRadioButton8.setText("Disco Duro");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton6)
                .addGap(10, 10, 10)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton7)
                .addGap(18, 18, 18)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jRadioButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel6.setBackground(new java.awt.Color(68, 69, 69));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Asignación de Activos ");
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(232, 232, 232));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel4MouseMoved(evt);
            }
        });

        jScrollPane3.setBorder(null);
        jScrollPane3.setToolTipText("");

        tabla_activoSinResponsable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla_activoSinResponsable.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        tabla_activoSinResponsable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo ", "Marca", "Procesador", "Memoria ", "Disco Duro", "Modelo", "Serie", "Costo", "Fecha Compra", "Cod. Institucional", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_activoSinResponsable.setNextFocusableComponent(btn_asignar);
        tabla_activoSinResponsable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla_activoSinResponsable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tabla_activoSinResponsable);
        tabla_activoSinResponsable.getAccessibleContext().setAccessibleName("Tabla_Busqueda_Sin_Responsable");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Búsqueda de activos sin responsable");

        btn_buscar_activo.setBorder(null);
        btn_buscar_activo.setBorderPainted(false);
        btn_buscar_activo.setContentAreaFilled(false);

        panelBusquedaTipo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        GrupoBusquedaPorTipo.add(rbtn_marca_activo);
        rbtn_marca_activo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        rbtn_marca_activo.setText("Marca");
        rbtn_marca_activo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_marca_activoActionPerformed(evt);
            }
        });

        GrupoBusquedaPorTipo.add(rbtn_procesador_activo);
        rbtn_procesador_activo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        rbtn_procesador_activo.setText("Procesador");

        GrupoBusquedaPorTipo.add(rbtn_memoria_activo);
        rbtn_memoria_activo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        rbtn_memoria_activo.setText("Memoria");

        GrupoBusquedaPorTipo.add(rbtn_discoduro_activo);
        rbtn_discoduro_activo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        rbtn_discoduro_activo.setText("Disco Duro");

        combo_marca_activo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        combo_marca_activo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_marca_activo.setNextFocusableComponent(btn_buscar_activo);

        combo_procesador_activo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        combo_procesador_activo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_procesador_activo.setNextFocusableComponent(btn_buscar_activo);

        combo_memoria_activo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        combo_memoria_activo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_memoria_activo.setName(""); // NOI18N
        combo_memoria_activo.setNextFocusableComponent(btn_buscar_activo);

        combo_discoduro_activo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        combo_discoduro_activo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_discoduro_activo.setNextFocusableComponent(btn_buscar_activo);

        javax.swing.GroupLayout panelBusquedaTipoLayout = new javax.swing.GroupLayout(panelBusquedaTipo);
        panelBusquedaTipo.setLayout(panelBusquedaTipoLayout);
        panelBusquedaTipoLayout.setHorizontalGroup(
            panelBusquedaTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBusquedaTipoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBusquedaTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBusquedaTipoLayout.createSequentialGroup()
                        .addComponent(rbtn_marca_activo)
                        .addGap(18, 18, 18)
                        .addComponent(combo_marca_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBusquedaTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelBusquedaTipoLayout.createSequentialGroup()
                            .addComponent(rbtn_memoria_activo)
                            .addGap(36, 36, 36)
                            .addComponent(combo_memoria_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelBusquedaTipoLayout.createSequentialGroup()
                            .addComponent(rbtn_procesador_activo)
                            .addGap(18, 18, 18)
                            .addComponent(combo_procesador_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelBusquedaTipoLayout.createSequentialGroup()
                            .addComponent(rbtn_discoduro_activo)
                            .addGap(18, 18, 18)
                            .addComponent(combo_discoduro_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43))
        );
        panelBusquedaTipoLayout.setVerticalGroup(
            panelBusquedaTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBusquedaTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_marca_activo)
                    .addComponent(combo_marca_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBusquedaTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_procesador_activo)
                    .addComponent(combo_procesador_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBusquedaTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_memoria_activo)
                    .addComponent(combo_memoria_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBusquedaTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_discoduro_activo)
                    .addComponent(combo_discoduro_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rbtn_tipo.setBackground(new java.awt.Color(232, 232, 232));
        GrupoCriterioBusquedaActivosNoAsignados.add(rbtn_tipo);
        rbtn_tipo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        rbtn_tipo.setText("Tipo");
        rbtn_tipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtn_tipoMouseClicked(evt);
            }
        });
        rbtn_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_tipoActionPerformed(evt);
            }
        });

        combo_tipo_activo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        combo_tipo_activo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_tipo_activo.setNextFocusableComponent(combo_marca_activo);
        combo_tipo_activo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_tipo_activoItemStateChanged(evt);
            }
        });
        combo_tipo_activo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                combo_tipo_activoMouseMoved(evt);
            }
        });
        combo_tipo_activo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_tipo_activoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                combo_tipo_activoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                combo_tipo_activoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                combo_tipo_activoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                combo_tipo_activoMouseReleased(evt);
            }
        });
        combo_tipo_activo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipo_activoActionPerformed(evt);
            }
        });

        rbtn_serie_activo.setBackground(new java.awt.Color(232, 232, 232));
        GrupoCriterioBusquedaActivosNoAsignados.add(rbtn_serie_activo);
        rbtn_serie_activo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        rbtn_serie_activo.setText("Serie");
        rbtn_serie_activo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtn_serie_activoMouseClicked(evt);
            }
        });

        txt_serie_activo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_serie_activo.setNextFocusableComponent(btn_buscar_activo);
        txt_serie_activo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_serie_activoKeyTyped(evt);
            }
        });

        rbtn_codigoinstitucional_activo.setBackground(new java.awt.Color(232, 232, 232));
        GrupoCriterioBusquedaActivosNoAsignados.add(rbtn_codigoinstitucional_activo);
        rbtn_codigoinstitucional_activo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        rbtn_codigoinstitucional_activo.setText("Código Institucional");
        rbtn_codigoinstitucional_activo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtn_codigoinstitucional_activoMouseClicked(evt);
            }
        });
        rbtn_codigoinstitucional_activo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_codigoinstitucional_activoActionPerformed(evt);
            }
        });

        txt_codigoInternoInsticucional_activo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_codigoInternoInsticucional_activo.setNextFocusableComponent(btn_buscar_activo);
        txt_codigoInternoInsticucional_activo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoInternoInsticucional_activoKeyTyped(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_buscar(1).png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setContentAreaFilled(false);
        jButton9.setNextFocusableComponent(btn_asignar);
        jButton9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_buscar(1).png"))); // NOI18N
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_buscar.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jToolBar1.setBackground(new java.awt.Color(117, 214, 255));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btn_nuevo.setBackground(new java.awt.Color(117, 214, 255));
        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add-new-file (1).png"))); // NOI18N
        btn_nuevo.setText("   Nuevo   ");
        btn_nuevo.setFocusable(false);
        btn_nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_nuevo.setNextFocusableComponent(combo_tipo_activo);
        btn_nuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_nuevo);

        btn_asignar.setBackground(new java.awt.Color(117, 214, 255));
        btn_asignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/new-user (1).png"))); // NOI18N
        btn_asignar.setText("   Asignar   ");
        btn_asignar.setFocusable(false);
        btn_asignar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_asignar.setNextFocusableComponent(btn_nuevo);
        btn_asignar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asignarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_asignar);

        btn_regresar.setBackground(new java.awt.Color(117, 214, 255));
        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logout (1).png"))); // NOI18N
        btn_regresar.setText("   Regresar");
        btn_regresar.setFocusable(false);
        btn_regresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_regresar.setNextFocusableComponent(btn_nuevo);
        btn_regresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_regresar);

        jPanel7.setBackground(new java.awt.Color(68, 69, 69));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_seleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/1/seleccionar.png"))); // NOI18N
        btn_seleccionar.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_seleccionar)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelBusquedaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(rbtn_tipo)
                                .addGap(18, 18, 18)
                                .addComponent(combo_tipo_activo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_buscar_activo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(rbtn_serie_activo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_serie_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(rbtn_codigoinstitucional_activo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_codigoInternoInsticucional_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_tipo_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtn_tipo))
                        .addGap(18, 18, 18)
                        .addComponent(panelBusquedaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtn_serie_activo)
                            .addComponent(txt_serie_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtn_codigoinstitucional_activo)
                            .addComponent(txt_codigoInternoInsticucional_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_buscar_activo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void cargar(){
    if (conexion.crearConexion()) {
                combo_tipo_activo.removeAllItems(); //Vaciamos el JComboBox
                ArrayList<String> resultat;
                ArrayList<String> ls = new ArrayList<String>();
                String sql="select nombre_tipoactivo from tmaetaccon";
                ResultSet rs = conexion.ejecutarSQLSelect(sql);
                try {
                    while(rs.next()){
                        
                        ls.add(rs.getString("nombre_tipoactivo"));
                    }               
                } catch (SQLException ex) {
                }
                resultat = ls;//La consulta tiene que retornar un ArrayList
                
                for(int i=0; i<resultat.size();i++){
                    combo_tipo_activo.addItem(resultat.get(i));
                }
        }
         
    }
    
    public void cargarMarcas(){
    if (conexion.crearConexion()) {
                combo_marca_activo.removeAllItems(); //Vaciamos el JComboBox
                Integer valTipoActivo = combo_tipo_activo.getSelectedIndex() +1;
                ArrayList<String> resultat;
                ArrayList<String> ls = new ArrayList<String>();
                String sql="select distinct marca_activo from tmovactcon where idtipo_activo = '"+valTipoActivo+"'";
                ResultSet rs = conexion.ejecutarSQLSelect(sql);
                try {
                    while(rs.next()){
                        
                        ls.add(rs.getString("marca_activo"));
                    }               
                } catch (SQLException ex) {
                }
                resultat = ls;//La consulta tiene que retornar un ArrayList
                
                for(int i=0; i<resultat.size();i++){
                    combo_marca_activo.addItem(resultat.get(i));
                }
        }
         
    }
    
    public void cargarProcesador(){
    if (conexion.crearConexion()) {
                combo_procesador_activo.removeAllItems(); //Vaciamos el JComboBox
                Integer valTipoActivo = combo_tipo_activo.getSelectedIndex() +1;
                ArrayList<String> resultat;
                ArrayList<String> ls = new ArrayList<String>();
                String sql="select distinct precesador_acrtivo from tmovactcon where idtipo_activo = '"+valTipoActivo+"'";
                ResultSet rs = conexion.ejecutarSQLSelect(sql);
                try {
                    while(rs.next()){
                        
                        ls.add(rs.getString("precesador_acrtivo"));
                    }               
                } catch (SQLException ex) {
                }
                resultat = ls;//La consulta tiene que retornar un ArrayList
                
                for(int i=0; i<resultat.size();i++){
                    combo_procesador_activo.addItem(resultat.get(i));
                }
        }
         
    }
    
    public void cargarMemoria(){
    if (conexion.crearConexion()) {
                combo_memoria_activo.removeAllItems(); //Vaciamos el JComboBox
                Integer valTipoActivo = combo_tipo_activo.getSelectedIndex() +1;
                ArrayList<String> resultat;
                ArrayList<String> ls = new ArrayList<String>();
                String sql="select distinct memoria_activo from tmovactcon where idtipo_activo = '"+valTipoActivo+"'";
                ResultSet rs = conexion.ejecutarSQLSelect(sql);
                try {
                    while(rs.next()){
                        
                        ls.add(rs.getString("memoria_activo"));
                    }               
                } catch (SQLException ex) {
                }
                resultat = ls;//La consulta tiene que retornar un ArrayList
                
                for(int i=0; i<resultat.size();i++){
                    combo_memoria_activo.addItem(resultat.get(i));
                }
        }
         
    }
    
    public void cargarDiscoduro(){
    if (conexion.crearConexion()) {
                combo_discoduro_activo.removeAllItems(); //Vaciamos el JComboBox
                Integer valTipoActivo = combo_tipo_activo.getSelectedIndex() +1;
                ArrayList<String> resultat;
                ArrayList<String> ls = new ArrayList<String>();
                String sql="select distinct discoduro_activo from tmovactcon where idtipo_activo = '"+valTipoActivo+"'";
                ResultSet rs = conexion.ejecutarSQLSelect(sql);
                try {
                    while(rs.next()){
                        
                        ls.add(rs.getString("discoduro_activo"));
                    }               
                } catch (SQLException ex) {
                }
                resultat = ls;//La consulta tiene que retornar un ArrayList
                
                for(int i=0; i<resultat.size();i++){
                    combo_discoduro_activo.addItem(resultat.get(i));
                }
        }
         
    }
    
    public void activarBusqueaTipos(){
        if (combo_tipo_activo.getSelectedItem().equals("Computadora de escritorio") || 
                combo_tipo_activo.getSelectedItem().equals("Portátil") || combo_tipo_activo.getSelectedItem().equals("CPU")) {
            combo_procesador_activo.setEnabled(true);
            combo_memoria_activo.setEnabled(true);
            combo_discoduro_activo.setEnabled(true);
            rbtn_procesador_activo.setEnabled(true);
            rbtn_memoria_activo.setEnabled(true);
            rbtn_discoduro_activo.setEnabled(true);
        } else{
            combo_procesador_activo.setEnabled(false);
            combo_memoria_activo.setEnabled(false);
            combo_discoduro_activo.setEnabled(false);
            rbtn_procesador_activo.setEnabled(false);
            rbtn_memoria_activo.setEnabled(false);
            rbtn_discoduro_activo.setEnabled(false);           
        }
    }
    
    public void buscar(){
        if (rbtn_tipo.isSelected()) {
            if (rbtn_marca_activo.isSelected()) {
                String valMarca = combo_marca_activo.getSelectedItem().toString();
                    if (conexion.crearConexion()) {

                        String[] titulos ={"Id","Tipo","Marca", "Procesador", "Memoria", "Disco Duro", "Modelo", "Serie", "Costo", "Fecha Compra", "Código Interno"};
                        DefaultTableModel modelo = new DefaultTableModel (null, titulos); 
                        String[] fila = new String[11];    

                        String sql="select  id_activo, idtipo_activo, marca_activo, precesador_acrtivo, memoria_activo, discoduro_activo, modelo_activo, serie_activo, costo_activo, fechacompra_activo, codigointernoinstitucional_activo from tmovactcon where marca_activo = '"+valMarca+"'";
                        try{
                            ResultSet rs = conexion.ejecutarSQLSelect(sql);

                            while(rs.next()){

                                fila[0] = rs.getString(1);
                                fila[1] = rs.getString(2);
                                fila[2] = rs.getString(3);
                                fila[3] = rs.getString(4);
                                fila[4] = rs.getString(5);
                                fila[5] = rs.getString(6);
                                fila[6] = rs.getString(7);
                                fila[7] = rs.getString(8);
                                fila[8] = rs.getString(9);
                                fila[9] = rs.getString(10);
                                fila[10] = rs.getString(11);
                                 modelo.addRow(fila);
                            }
                            tabla_activoSinResponsable.setModel(modelo);
                        }catch(Exception ex){

                            JOptionPane.showMessageDialog(rootPane,"exception: "+ex);
                        }
                    }
            } else{
                if (rbtn_procesador_activo.isSelected()) {
                    String valProcesador = combo_procesador_activo.getSelectedItem().toString();
                    if (conexion.crearConexion()) {

                        String[] titulos ={"Id","Tipo","Marca", "Procesador", "Memoria", "Disco Duro", "Modelo", "Serie", "Costo", "Fecha Compra", "Código Interno"};
                        DefaultTableModel modelo = new DefaultTableModel (null, titulos); 
                        String[] fila = new String[11];    

                        String sql="select  id_activo, idtipo_activo, marca_activo, precesador_acrtivo, memoria_activo, discoduro_activo, modelo_activo, serie_activo, costo_activo, fechacompra_activo, codigointernoinstitucional_activo from tmovactcon where precesador_acrtivo = '"+valProcesador+"'";
                        try{
                            ResultSet rs = conexion.ejecutarSQLSelect(sql);

                            while(rs.next()){

                                fila[0] = rs.getString(1);
                                fila[1] = rs.getString(2);
                                fila[2] = rs.getString(3);
                                fila[3] = rs.getString(4);
                                fila[4] = rs.getString(5);
                                fila[5] = rs.getString(6);
                                fila[6] = rs.getString(7);
                                fila[7] = rs.getString(8);
                                fila[8] = rs.getString(9);
                                fila[9] = rs.getString(10);
                                fila[10] = rs.getString(11);
                                 modelo.addRow(fila);
                            }
                            tabla_activoSinResponsable.setModel(modelo);
                        }catch(Exception ex){

                            JOptionPane.showMessageDialog(rootPane,"exception: "+ex);
                        }
                    }
                } else{
                    if (rbtn_memoria_activo.isSelected()) {
                        String valMemoria = combo_memoria_activo.getSelectedItem().toString();
                        if (conexion.crearConexion()) {

                            String[] titulos ={"Id","Tipo","Marca", "Procesador", "Memoria", "Disco Duro", "Modelo", "Serie", "Costo", "Fecha Compra", "Código Interno"};
                            DefaultTableModel modelo = new DefaultTableModel (null, titulos); 
                            String[] fila = new String[11];    

                            String sql="select  id_activo, idtipo_activo, marca_activo, precesador_acrtivo, memoria_activo, discoduro_activo, modelo_activo, serie_activo, costo_activo, fechacompra_activo, codigointernoinstitucional_activo from tmovactcon where memoria_activo = '"+valMemoria+"'";
                            try{
                                ResultSet rs = conexion.ejecutarSQLSelect(sql);

                                while(rs.next()){

                                    fila[0] = rs.getString(1);
                                    fila[1] = rs.getString(2);
                                    fila[2] = rs.getString(3);
                                    fila[3] = rs.getString(4);
                                    fila[4] = rs.getString(5);
                                    fila[5] = rs.getString(6);
                                    fila[6] = rs.getString(7);
                                    fila[7] = rs.getString(8);
                                    fila[8] = rs.getString(9);
                                    fila[9] = rs.getString(10);
                                    fila[10] = rs.getString(11);
                                     modelo.addRow(fila);
                                }
                                tabla_activoSinResponsable.setModel(modelo);
                            }catch(Exception ex){

                                JOptionPane.showMessageDialog(rootPane,"exception: "+ex);
                            }
                        }
                    } else{
                        if (rbtn_discoduro_activo.isSelected()) {
                            String valProcesador = combo_procesador_activo.getSelectedItem().toString();
                            if (conexion.crearConexion()) {

                                String[] titulos ={"Id","Tipo","Marca", "Procesador", "Memoria", "Disco Duro", "Modelo", "Serie", "Costo", "Fecha Compra", "Código Interno"};
                                DefaultTableModel modelo = new DefaultTableModel (null, titulos); 
                                String[] fila = new String[11];    

                                String sql="select  id_activo, idtipo_activo, marca_activo, precesador_acrtivo, memoria_activo, discoduro_activo, modelo_activo, serie_activo, costo_activo, fechacompra_activo, codigointernoinstitucional_activo from tmovactcon where discoduro_activo = '"+valProcesador+"'";
                                try{
                                    ResultSet rs = conexion.ejecutarSQLSelect(sql);

                                    while(rs.next()){

                                        fila[0] = rs.getString(1);
                                        fila[1] = rs.getString(2);
                                        fila[2] = rs.getString(3);
                                        fila[3] = rs.getString(4);
                                        fila[4] = rs.getString(5);
                                        fila[5] = rs.getString(6);
                                        fila[6] = rs.getString(7);
                                        fila[7] = rs.getString(8);
                                        fila[8] = rs.getString(9);
                                        fila[9] = rs.getString(10);
                                        fila[10] = rs.getString(11);
                                         modelo.addRow(fila);
                                    }
                                    tabla_activoSinResponsable.setModel(modelo);
                                }catch(Exception ex){

                                    JOptionPane.showMessageDialog(rootPane,"exception: "+ex);
                                }
                            }
                        }
                    }
                }
            }
        } else{
            if (rbtn_serie_activo.isSelected()) {
                String valSerie = txt_serie_activo.getText();
                    if (conexion.crearConexion()) {

                        String[] titulos ={"Id","Tipo","Marca", "Procesador", "Memoria", "Disco Duro", "Modelo", "Serie", "Costo", "Fecha Compra", "Código Interno"};
                        DefaultTableModel modelo = new DefaultTableModel (null, titulos); 
                        String[] fila = new String[11];    

                        String sql="select  id_activo, idtipo_activo, marca_activo, precesador_acrtivo, memoria_activo, discoduro_activo, modelo_activo, serie_activo, costo_activo, fechacompra_activo, codigointernoinstitucional_activo from tmovactcon where serie_activo = '"+valSerie+"'";
                        try{
                            ResultSet rs = conexion.ejecutarSQLSelect(sql);

                            while(rs.next()){

                                fila[0] = rs.getString(1);
                                fila[1] = rs.getString(2);
                                fila[2] = rs.getString(3);
                                fila[3] = rs.getString(4);
                                fila[4] = rs.getString(5);
                                fila[5] = rs.getString(6);
                                fila[6] = rs.getString(7);
                                fila[7] = rs.getString(8);
                                fila[8] = rs.getString(9);
                                fila[9] = rs.getString(10);
                                fila[10] = rs.getString(11);
                                 modelo.addRow(fila);
                            }
                            tabla_activoSinResponsable.setModel(modelo);
                        }catch(Exception ex){

                            JOptionPane.showMessageDialog(rootPane,"exception: "+ex);
                        }
                    }
            } else{
                String valCodigoInstitucional = txt_codigoInternoInsticucional_activo.getText();
                    if (conexion.crearConexion()) {

                        String[] titulos ={"Id","Tipo","Marca", "Procesador", "Memoria", "Disco Duro", "Modelo", "Serie", "Costo", "Fecha Compra", "Código Interno"};
                        DefaultTableModel modelo = new DefaultTableModel (null, titulos); 
                        String[] fila = new String[11];    

                        String sql="select  id_activo, idtipo_activo, marca_activo, precesador_acrtivo, memoria_activo, discoduro_activo, modelo_activo, serie_activo, costo_activo, fechacompra_activo, codigointernoinstitucional_activo from tmovactcon where codigointernoinstitucional_activo = '"+valCodigoInstitucional+"'";
                        try{
                            ResultSet rs = conexion.ejecutarSQLSelect(sql);

                            while(rs.next()){

                                fila[0] = rs.getString(1);
                                fila[1] = rs.getString(2);
                                fila[2] = rs.getString(3);
                                fila[3] = rs.getString(4);
                                fila[4] = rs.getString(5);
                                fila[5] = rs.getString(6);
                                fila[6] = rs.getString(7);
                                fila[7] = rs.getString(8);
                                fila[8] = rs.getString(9);
                                fila[9] = rs.getString(10);
                                fila[10] = rs.getString(11);
                                 modelo.addRow(fila);
                            }
                            tabla_activoSinResponsable.setModel(modelo);
                        }catch(Exception ex){

                            JOptionPane.showMessageDialog(rootPane,"exception: "+ex);
                        }
                    }
            }
        }
    }
    
    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void rbtn_marca_activoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_marca_activoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_marca_activoActionPerformed

    private void rbtn_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_tipoActionPerformed

    private void rbtn_codigoinstitucional_activoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_codigoinstitucional_activoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_codigoinstitucional_activoActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_asignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignarActionPerformed
        new RegistroDocumentoAsignacion( this, true).setVisible(true);
    }//GEN-LAST:event_btn_asignarActionPerformed

    private void txt_serie_activoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_serie_activoKeyTyped
        char c=evt.getKeyChar(); 
           
          if(!Character.isDigit(c)) {  //Si el dato ingresado no es un número verificará:
               if(Character.isLetter(c)) {//si es una letra
                     evt.setKeyChar(Character.toUpperCase(c));//la registra pero como mayúscula
                 }else{//todo lo demás será ignorado
                     evt.consume();
                 } 
           }
          
          if (txt_serie_activo.getText().length()>=150){//Si el dato ingresado pasa del limite no se registrara en el campo
             evt.consume();     
         }
    }//GEN-LAST:event_txt_serie_activoKeyTyped

    private void txt_codigoInternoInsticucional_activoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoInternoInsticucional_activoKeyTyped
        char c=evt.getKeyChar(); 
           
          if(!Character.isDigit(c)) {  //Si el dato ingresado no es un número verificará:
               if(Character.isLetter(c)) {//si es una letra
                     evt.setKeyChar(Character.toUpperCase(c));//la registra pero como mayúscula
                 }else{//todo lo demás será ignorado
                     evt.consume();
                 } 
           }
          
          if (txt_serie_activo.getText().length()>=200){//Si el dato ingresado pasa del limite no se registrara en el campo
             evt.consume();     
         }
    }//GEN-LAST:event_txt_codigoInternoInsticucional_activoKeyTyped

    private void rbtn_tipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn_tipoMouseClicked
        if (rbtn_tipo.isSelected()) {
            if (!panelBusquedaTipo.isVisible()) {
               panelBusquedaTipo.setVisible(true);  
            } else{
                panelBusquedaTipo.setVisible(false); 
            }            
         } 
    }//GEN-LAST:event_rbtn_tipoMouseClicked

    private void rbtn_serie_activoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn_serie_activoMouseClicked
        if (rbtn_serie_activo.isSelected()) {
             panelBusquedaTipo.setVisible(false);  
         } 
    }//GEN-LAST:event_rbtn_serie_activoMouseClicked

    private void rbtn_codigoinstitucional_activoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn_codigoinstitucional_activoMouseClicked
        if (rbtn_codigoinstitucional_activo.isSelected()) {
             panelBusquedaTipo.setVisible(false);             
         } 
    }//GEN-LAST:event_rbtn_codigoinstitucional_activoMouseClicked

    private void combo_tipo_activoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_tipo_activoMouseClicked
        
    }//GEN-LAST:event_combo_tipo_activoMouseClicked

    private void combo_tipo_activoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_tipo_activoMousePressed
        
    }//GEN-LAST:event_combo_tipo_activoMousePressed

    private void combo_tipo_activoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipo_activoActionPerformed
        
    }//GEN-LAST:event_combo_tipo_activoActionPerformed

    private void combo_tipo_activoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_tipo_activoMouseMoved
        
    }//GEN-LAST:event_combo_tipo_activoMouseMoved

    private void combo_tipo_activoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_tipo_activoMouseReleased
        
    }//GEN-LAST:event_combo_tipo_activoMouseReleased

    private void combo_tipo_activoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_tipo_activoItemStateChanged
        cargarMarcas();
        cargarMemoria();
        cargarProcesador();
        cargarDiscoduro();
    }//GEN-LAST:event_combo_tipo_activoItemStateChanged

    private void combo_tipo_activoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_tipo_activoMouseEntered
       activarBusqueaTipos(); 
       cargarMarcas();
       cargarMemoria();
       cargarProcesador();
       cargarDiscoduro();
    }//GEN-LAST:event_combo_tipo_activoMouseEntered

    private void combo_tipo_activoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_tipo_activoMouseExited
        activarBusqueaTipos();
        cargarMarcas();
        cargarMemoria();
        cargarProcesador();
        cargarDiscoduro();
    }//GEN-LAST:event_combo_tipo_activoMouseExited

    private void jPanel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseMoved
        activarBusqueaTipos();
    }//GEN-LAST:event_jPanel4MouseMoved

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        buscar();
    }//GEN-LAST:event_jButton9ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AsignaciónActivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignaciónActivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignaciónActivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignaciónActivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AsignaciónActivos dialog = new AsignaciónActivos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBusquedaPorTipo;
    private javax.swing.ButtonGroup GrupoCriterioBusquedaActivosNoAsignados;
    private javax.swing.JButton btn_asignar;
    private javax.swing.JButton btn_buscar_activo;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_seleccionar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox combo_discoduro_activo;
    private javax.swing.JComboBox combo_marca_activo;
    private javax.swing.JComboBox combo_memoria_activo;
    private javax.swing.JComboBox combo_procesador_activo;
    private javax.swing.JComboBox combo_tipo_activo;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel panelBusquedaTipo;
    private javax.swing.JRadioButton rbtn_codigoinstitucional_activo;
    private javax.swing.JRadioButton rbtn_discoduro_activo;
    private javax.swing.JRadioButton rbtn_marca_activo;
    private javax.swing.JRadioButton rbtn_memoria_activo;
    private javax.swing.JRadioButton rbtn_procesador_activo;
    private javax.swing.JRadioButton rbtn_serie_activo;
    private javax.swing.JRadioButton rbtn_tipo;
    private javax.swing.JTable tabla_activoSinResponsable;
    private javax.swing.JTextField txt_codigoInternoInsticucional_activo;
    private javax.swing.JTextField txt_serie_activo;
    // End of variables declaration//GEN-END:variables
}
