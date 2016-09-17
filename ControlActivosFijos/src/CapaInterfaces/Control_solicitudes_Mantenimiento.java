/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaInterfaces;

import java.awt.GridBagLayout;
import javax.swing.ButtonGroup;

/**
 *
 * @author Dayanna Luna
 */
public class Control_solicitudes_Mantenimiento extends javax.swing.JDialog {

    /**
     * Creates new form Control_solicitudes_Mantenimiento
     */
    public Control_solicitudes_Mantenimiento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        radio();
        activarCampos();        
        this.getContentPane().setLayout (new GridBagLayout());
        this.setLocationRelativeTo(null);
        tabla_solicitudes_mantenimiento.getTableHeader().setReorderingAllowed(false);
    }
    public void radio(){
        ButtonGroup btngGrupoConsulta = new ButtonGroup();
        ButtonGroup btngGrupoEstado = new ButtonGroup();
        btngGrupoConsulta.add(rbtn_condigo_institucional);
        btngGrupoConsulta.add(rbtn_fecha_docSolicitud);
        btngGrupoConsulta.add(rbtn_estado_docSolicitud);
        btngGrupoConsulta.add(rbtn_tipo_area);        
        btngGrupoEstado.add(rbtn_solicitud_enProceso);
        btngGrupoEstado.add(rbtn_solicitud_pendiente);
        btngGrupoEstado.add(rbtn_solicitud_realizado);        
    }
    public void activarCampos(){        
        txt_codigoInternoInsticucional_activo.setEnabled(false);
        date_fecha_docSolicitud.setEnabled(false);
        combo_tipo_area.setEnabled(false);
        combo_idResponsable_area.setEnabled(false);
        combo_descripcion_area.setEnabled(false);
        rbtn_solicitud_enProceso.setEnabled(false);
        rbtn_solicitud_pendiente.setEnabled(false); 
        rbtn_solicitud_realizado.setEnabled(false);
        if(rbtn_condigo_institucional.isSelected()){
            txt_codigoInternoInsticucional_activo.setEnabled(true);            
        }
        if(rbtn_fecha_docSolicitud.isSelected()){
            date_fecha_docSolicitud.setEnabled(true);            
        }
        if(rbtn_tipo_area.isSelected()){            
            combo_tipo_area.setEnabled(true);
            combo_idResponsable_area.setEnabled(true);
            combo_descripcion_area.setEnabled(true);            
        }
        if(rbtn_estado_docSolicitud.isSelected()){
            rbtn_solicitud_realizado.setEnabled(true);
            rbtn_solicitud_enProceso.setEnabled(true);
            rbtn_solicitud_pendiente.setEnabled(true);            
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        rbtn_condigo_institucional = new javax.swing.JRadioButton();
        combo_tipo_area = new javax.swing.JComboBox();
        rbtn_fecha_docSolicitud = new javax.swing.JRadioButton();
        rbtn_estado_docSolicitud = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        rbtn_tipo_area = new javax.swing.JRadioButton();
        combo_descripcion_area = new javax.swing.JComboBox();
        combo_idResponsable_area = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        rbtn_solicitud_pendiente = new javax.swing.JRadioButton();
        rbtn_solicitud_enProceso = new javax.swing.JRadioButton();
        rbtn_solicitud_realizado = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_solicitudes_mantenimiento = new javax.swing.JTable();
        label3 = new java.awt.Label();
        date_fecha_docSolicitud = new com.toedter.calendar.JDateChooser();
        btn_buscar_solicitudes = new javax.swing.JButton();
        txt_codigoInternoInsticucional_activo = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        btn_nuevo = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btn_modificarSolicitud = new javax.swing.JButton();
        btn_modificarEncargadooMantenimiento = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_enviarMantenimiento = new javax.swing.JButton();
        btn_registrarMantenimiento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Control de Solicitudes de Mantenimiento");
        setResizable(false);

        rbtn_condigo_institucional.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        rbtn_condigo_institucional.setText("Código Institucional");
        rbtn_condigo_institucional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtn_condigo_institucionalMouseClicked(evt);
            }
        });

        combo_tipo_area.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        combo_tipo_area.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_tipo_area.setNextFocusableComponent(combo_descripcion_area);

        rbtn_fecha_docSolicitud.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        rbtn_fecha_docSolicitud.setText("Fecha de solicitud");
        rbtn_fecha_docSolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtn_fecha_docSolicitudMouseClicked(evt);
            }
        });

        rbtn_estado_docSolicitud.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        rbtn_estado_docSolicitud.setText("Estado");
        rbtn_estado_docSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_estado_docSolicitudActionPerformed(evt);
            }
        });

        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        rbtn_tipo_area.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        rbtn_tipo_area.setText("Tipo de Área");

        combo_descripcion_area.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        combo_descripcion_area.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_descripcion_area.setNextFocusableComponent(combo_idResponsable_area);

        combo_idResponsable_area.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        combo_idResponsable_area.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_idResponsable_area.setNextFocusableComponent(btn_buscar);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 17))); // NOI18N

        rbtn_solicitud_pendiente.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        rbtn_solicitud_pendiente.setText("Pendiente");
        rbtn_solicitud_pendiente.setNextFocusableComponent(rbtn_solicitud_enProceso);

        rbtn_solicitud_enProceso.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        rbtn_solicitud_enProceso.setText("En Proceso");
        rbtn_solicitud_enProceso.setNextFocusableComponent(rbtn_solicitud_realizado);

        rbtn_solicitud_realizado.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        rbtn_solicitud_realizado.setText("Realizado");
        rbtn_solicitud_realizado.setNextFocusableComponent(btn_buscar);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtn_solicitud_pendiente)
                    .addComponent(rbtn_solicitud_enProceso)
                    .addComponent(rbtn_solicitud_realizado))
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtn_solicitud_pendiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn_solicitud_enProceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn_solicitud_realizado))
        );

        tabla_solicitudes_mantenimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Código Interno", "Fecha Solicitud", "Cédula Solicitante", "Solicitante", "Motivos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_solicitudes_mantenimiento.setNextFocusableComponent(btn_modificarSolicitud);
        tabla_solicitudes_mantenimiento.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla_solicitudes_mantenimiento.removeColumn(tabla_solicitudes_mantenimiento.getColumnModel().getColumn(0));
        jScrollPane1.setViewportView(tabla_solicitudes_mantenimiento);

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        label3.setText("Control de Solicitudes de Mantenimiento");

        date_fecha_docSolicitud.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        date_fecha_docSolicitud.setNextFocusableComponent(btn_buscar);

        btn_buscar_solicitudes.setBorder(null);
        btn_buscar_solicitudes.setBorderPainted(false);
        btn_buscar_solicitudes.setContentAreaFilled(false);

        txt_codigoInternoInsticucional_activo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_codigoInternoInsticucional_activo.setNextFocusableComponent(btn_buscar);

        jToolBar1.setBackground(new java.awt.Color(117, 214, 255));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btn_nuevo.setBackground(new java.awt.Color(117, 214, 255));
        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add-new-file (1).png"))); // NOI18N
        btn_nuevo.setText("   Nuevo   ");
        btn_nuevo.setFocusable(false);
        btn_nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_nuevo.setNextFocusableComponent(txt_codigoInternoInsticucional_activo);
        btn_nuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_nuevo);

        btn_imprimir.setBackground(new java.awt.Color(117, 214, 255));
        btn_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/printer- (1).png"))); // NOI18N
        btn_imprimir.setText("   Imprimir   ");
        btn_imprimir.setFocusable(false);
        btn_imprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_imprimir.setNextFocusableComponent(btn_nuevo);
        btn_imprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_imprimir);

        btn_regresar.setBackground(new java.awt.Color(117, 214, 255));
        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logout (1).png"))); // NOI18N
        btn_regresar.setText("   Regresar");
        btn_regresar.setFocusable(false);
        btn_regresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_regresar.setName(""); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel1.setText("Descripción");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel2.setText("RR.HH");

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_buscar(1).png"))); // NOI18N
        btn_buscar.setBorder(null);
        btn_buscar.setContentAreaFilled(false);
        btn_buscar.setNextFocusableComponent(btn_imprimir);
        btn_buscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_buscar(1).png"))); // NOI18N
        btn_buscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_buscar.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_modificarSolicitud.setBackground(new java.awt.Color(255, 255, 255));
        btn_modificarSolicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/1/pencil.png"))); // NOI18N
        btn_modificarSolicitud.setContentAreaFilled(false);
        btn_modificarSolicitud.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_modificarSolicitud.setNextFocusableComponent(btn_enviarMantenimiento);
        btn_modificarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarSolicitudActionPerformed(evt);
            }
        });

        btn_modificarEncargadooMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/mod_persona_mant.png"))); // NOI18N
        btn_modificarEncargadooMantenimiento.setToolTipText("");
        btn_modificarEncargadooMantenimiento.setContentAreaFilled(false);
        btn_modificarEncargadooMantenimiento.setNextFocusableComponent(btn_registrarMantenimiento);
        btn_modificarEncargadooMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarEncargadooMantenimientoActionPerformed(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/1/rubbish-bin (1).png"))); // NOI18N
        btn_eliminar.setToolTipText("");
        btn_eliminar.setContentAreaFilled(false);
        btn_eliminar.setNextFocusableComponent(tabla_solicitudes_mantenimiento);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_enviarMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/servicio (2).png"))); // NOI18N
        btn_enviarMantenimiento.setContentAreaFilled(false);
        btn_enviarMantenimiento.setNextFocusableComponent(btn_modificarEncargadooMantenimiento);
        btn_enviarMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarMantenimientoActionPerformed(evt);
            }
        });

        btn_registrarMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/1/archive.png"))); // NOI18N
        btn_registrarMantenimiento.setToolTipText("");
        btn_registrarMantenimiento.setContentAreaFilled(false);
        btn_registrarMantenimiento.setNextFocusableComponent(btn_eliminar);
        btn_registrarMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarMantenimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_modificarSolicitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_modificarEncargadooMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_enviarMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_registrarMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_modificarSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_enviarMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_modificarEncargadooMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_registrarMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rbtn_condigo_institucional)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_codigoInternoInsticucional_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbtn_fecha_docSolicitud)
                                        .addGap(18, 18, 18)
                                        .addComponent(date_fecha_docSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rbtn_tipo_area)
                                        .addGap(18, 18, 18)
                                        .addComponent(combo_tipo_area, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(combo_idResponsable_area, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combo_descripcion_area, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(rbtn_estado_docSolicitud)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btn_buscar))
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_buscar_solicitudes)))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rbtn_fecha_docSolicitud)
                                .addComponent(date_fecha_docSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbtn_condigo_institucional)
                                .addComponent(txt_codigoInternoInsticucional_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbtn_tipo_area)
                                    .addComponent(combo_tipo_area, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jButton3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(combo_descripcion_area, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(combo_idResponsable_area, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))))
                    .addComponent(rbtn_estado_docSolicitud)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_buscar_solicitudes)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(128, 128, 128))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_modificarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarSolicitudActionPerformed
        new Registro_Solicitud_Mantenimiento(this, true).setVisible(true);
    }//GEN-LAST:event_btn_modificarSolicitudActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_registrarMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarMantenimientoActionPerformed
        new RegistroMantenimiento(this, true).setVisible(true);
    }//GEN-LAST:event_btn_registrarMantenimientoActionPerformed

    private void rbtn_estado_docSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_estado_docSolicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_estado_docSolicitudActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_enviarMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarMantenimientoActionPerformed
        new Registro_datos_encargado_mantenimiento(this, true).setVisible(true);
    }//GEN-LAST:event_btn_enviarMantenimientoActionPerformed

    private void btn_modificarEncargadooMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarEncargadooMantenimientoActionPerformed
        new Registro_datos_encargado_mantenimiento(this, true).setVisible(true);
    }//GEN-LAST:event_btn_modificarEncargadooMantenimientoActionPerformed

    private void rbtn_condigo_institucionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn_condigo_institucionalMouseClicked
            activarCampos();
    }//GEN-LAST:event_rbtn_condigo_institucionalMouseClicked

    private void rbtn_fecha_docSolicitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn_fecha_docSolicitudMouseClicked
        activarCampos();
    }//GEN-LAST:event_rbtn_fecha_docSolicitudMouseClicked

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
            java.util.logging.Logger.getLogger(Control_solicitudes_Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Control_solicitudes_Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Control_solicitudes_Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Control_solicitudes_Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Control_solicitudes_Mantenimiento dialog = new Control_solicitudes_Mantenimiento(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_buscar_solicitudes;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_enviarMantenimiento;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_modificarEncargadooMantenimiento;
    private javax.swing.JButton btn_modificarSolicitud;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_registrarMantenimiento;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox combo_descripcion_area;
    private javax.swing.JComboBox combo_idResponsable_area;
    private javax.swing.JComboBox combo_tipo_area;
    private com.toedter.calendar.JDateChooser date_fecha_docSolicitud;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private java.awt.Label label3;
    private javax.swing.JRadioButton rbtn_condigo_institucional;
    private javax.swing.JRadioButton rbtn_estado_docSolicitud;
    private javax.swing.JRadioButton rbtn_fecha_docSolicitud;
    private javax.swing.JRadioButton rbtn_solicitud_enProceso;
    private javax.swing.JRadioButton rbtn_solicitud_pendiente;
    private javax.swing.JRadioButton rbtn_solicitud_realizado;
    private javax.swing.JRadioButton rbtn_tipo_area;
    private javax.swing.JTable tabla_solicitudes_mantenimiento;
    private javax.swing.JTextField txt_codigoInternoInsticucional_activo;
    // End of variables declaration//GEN-END:variables
}
