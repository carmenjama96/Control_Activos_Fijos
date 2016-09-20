package CapaInterfaces;

import Capa_ConexionBD.Conexion;
import java.awt.GridBagLayout;
import java.awt.Checkbox;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AsignaciónActivos extends javax.swing.JDialog {

    /**
     * Creates new form AsignaciónActivos
     */
        
     int banderaOculta = 0;
     String Tipos[] = {"Cámara de Vigilancia","CPU","Computadora de Escritorio","Detector de Huellas","Impresora","Mouse","Pantalla o Monitor","Portátil","Proyector","Servidores","Teclado","Otros"};
     String CamaraVigilancia[] = {"Samsung","Sony","EverFocus","Avtech","Otros"};
     String CPU[] = {"HP","DELL","TOSHIBA","ACER","Otros"};
     String DetectorHuellas[] = {"Secugeu Hamster Plus"};
     String Impresora[] = {"Epson","Canon","HP","Xerox","Otros"};
     String Mouse[] = {"Genius","Compac","HP","Microsoft","Otros"};
     String Pantalla[] = {"LG","ACER","HP","LENOVO","BENQ","Otros"};
     String Proyector[] = {"EPSON","SONY","PANASONIC","INFOCUS","Otros"};
     String Servidores[] = {"IBM","TOSHIBA","DELL","COMPAQ","Otros"};
     String Teclado[] = {"DELL","Genius","DLINK","Microsoft","Otros"};
     String Otros[] = {"Otros"};
     String Procesador[] = {"Core i7", "Core i5", "Core i3"};
     String Memoria[] = {"8 GB", "4 GB", "2 GB", "1 GB"};
     String DiscoDuro[] = {"160 GB","250 GB","320 GB","500 GB","1 TB","1.5 TB","2 TB","2.5 TB","3TB"};
     
    public AsignaciónActivos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        panelBusquedaTipo.setVisible(false);
        rbtn_marca_activo.setSelected(true);
        this.setLocationRelativeTo(null);
        //this.getContentPane().setLayout (new GridBagLayout());
        cargar();           
        cargarMarcas();
    }
    
    Conexion conexion = new Conexion();

    public AsignaciónActivos() {
        
    }


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
        btn_buscar = new javax.swing.JButton();
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
                "Id", "Tipo ", "Marca", "Procesador", "Memoria ", "Disco Duro", "Modelo", "Serie", "Costo", "Fecha Compra", "Cod. Institucional", "Seleccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_activoSinResponsable.setNextFocusableComponent(btn_asignar);
        tabla_activoSinResponsable.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tabla_activoSinResponsable.getTableHeader().setReorderingAllowed(false);
        tabla_activoSinResponsable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_activoSinResponsableMouseClicked(evt);
            }
        });
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
        combo_marca_activo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_marca_activoItemStateChanged(evt);
            }
        });

        combo_procesador_activo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        combo_procesador_activo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_procesador_activo.setNextFocusableComponent(btn_buscar_activo);
        combo_procesador_activo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_procesador_activoItemStateChanged(evt);
            }
        });

        combo_memoria_activo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        combo_memoria_activo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_memoria_activo.setName(""); // NOI18N
        combo_memoria_activo.setNextFocusableComponent(btn_buscar_activo);
        combo_memoria_activo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_memoria_activoItemStateChanged(evt);
            }
        });

        combo_discoduro_activo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        combo_discoduro_activo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_discoduro_activo.setNextFocusableComponent(btn_buscar_activo);
        combo_discoduro_activo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_discoduro_activoItemStateChanged(evt);
            }
        });

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

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_buscar(1).png"))); // NOI18N
        btn_buscar.setBorder(null);
        btn_buscar.setContentAreaFilled(false);
        btn_buscar.setNextFocusableComponent(btn_asignar);
        btn_buscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_buscar(1).png"))); // NOI18N
        btn_buscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_buscar.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
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
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
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
        btn_seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionarActionPerformed(evt);
            }
        });

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
                            .addComponent(btn_buscar, javax.swing.GroupLayout.Alignment.TRAILING)))
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
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
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
                        .addComponent(btn_buscar)))
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
    
    public void verificarBusqueda(){
        if (!rbtn_serie_activo.isSelected() && !rbtn_codigoinstitucional_activo.isSelected() && !rbtn_tipo.isSelected()) {
                JOptionPane.showMessageDialog(rootPane,"Debe elegir un criterio de búsqueda");
            } else{
                if ((rbtn_serie_activo.isSelected() && txt_serie_activo.getText().equals(""))||(rbtn_codigoinstitucional_activo.isSelected() && txt_codigoInternoInsticucional_activo.getText().equals(""))) {
                        JOptionPane.showMessageDialog(rootPane,"Debe ingresar un dato para la búsqueda");
                    } else{
                            buscar();
                        }
                }    
    }
    
    public void cargar(){
        combo_tipo_activo.setModel(new javax.swing.DefaultComboBoxModel(Tipos));                 
    }
    
    public void cargarComponentes(){
        combo_procesador_activo.setModel(new javax.swing.DefaultComboBoxModel(Procesador));
        combo_memoria_activo.setModel(new javax.swing.DefaultComboBoxModel(Memoria));
        combo_discoduro_activo.setModel(new javax.swing.DefaultComboBoxModel(DiscoDuro));
    }
    
    public void vaciarComponentes(){
        combo_procesador_activo.removeAllItems();
        combo_memoria_activo.removeAllItems();
        combo_discoduro_activo.removeAllItems();
    }
    
   public void cargarMarcas(){
       String tipoActivo = combo_tipo_activo.getSelectedItem().toString();
       if (combo_tipo_activo.getSelectedItem().equals("Computadora de Escritorio") || 
                combo_tipo_activo.getSelectedItem().equals("Portátil") || combo_tipo_activo.getSelectedItem().equals("CPU")){
           combo_marca_activo.setModel(new javax.swing.DefaultComboBoxModel(CPU));
           cargarComponentes();
       } else{
           if (combo_tipo_activo.getSelectedItem().equals("Cámara de Vigilancia")) {
               combo_marca_activo.setModel(new javax.swing.DefaultComboBoxModel(CamaraVigilancia));
               vaciarComponentes();
           } else{
               if (combo_tipo_activo.getSelectedItem().equals("Detector de Huellas")) {
                    combo_marca_activo.setModel(new javax.swing.DefaultComboBoxModel(DetectorHuellas));
                    vaciarComponentes();
               } else{
                   if (combo_tipo_activo.getSelectedItem().equals("Impresora")) {
                        combo_marca_activo.setModel(new javax.swing.DefaultComboBoxModel(Impresora));
                        vaciarComponentes();
                   } else{
                        if (combo_tipo_activo.getSelectedItem().equals("Mouse")) {
                            combo_marca_activo.setModel(new javax.swing.DefaultComboBoxModel(Mouse));
                            vaciarComponentes();
                        }  else{
                            if (combo_tipo_activo.getSelectedItem().equals("Pantalla o Monitor")) {
                                combo_marca_activo.setModel(new javax.swing.DefaultComboBoxModel(Pantalla));
                                vaciarComponentes();
                            } else{
                                if (combo_tipo_activo.getSelectedItem().equals("Proyector")) {
                                    combo_marca_activo.setModel(new javax.swing.DefaultComboBoxModel(Proyector));
                                    vaciarComponentes();
                                }  else{
                                    if (combo_tipo_activo.getSelectedItem().equals("Servidores")) {
                                        combo_marca_activo.setModel(new javax.swing.DefaultComboBoxModel(Servidores));
                                        vaciarComponentes();
                                    } else{
                                        if (combo_tipo_activo.getSelectedItem().equals("Teclado")) {
                                            combo_marca_activo.setModel(new javax.swing.DefaultComboBoxModel(Teclado));
                                            vaciarComponentes();
                                        } else{
                                            if (combo_tipo_activo.getSelectedItem().equals("Otros")) {
                                                combo_marca_activo.setModel(new javax.swing.DefaultComboBoxModel(Otros));
                                                vaciarComponentes();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                   }
               }
           }
       }
    }
    
    public void activarBusquedaTipos(){
        if (combo_tipo_activo.getSelectedItem().equals("Computadora de Escritorio") || 
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
    Integer numeroColumnas = 11;
    
    public void buscar(){
        if (rbtn_tipo.isSelected()) {
            if (rbtn_marca_activo.isSelected()) {
                String valMarca = combo_marca_activo.getSelectedItem().toString();
                Integer numTipo = combo_tipo_activo.getSelectedIndex() + 1;
                    if (conexion.crearConexion()) {
                        String[] titulos ={"Id","Tipo","Marca", "Procesador", "Memoria", "Disco Duro", "Modelo", "Serie", "Costo", "Fecha Compra", "Código Interno"};
                        DefaultTableModel modelo = new DefaultTableModel (null, titulos); 
                        Object[] fila = new Object[12];                      
                        String sql="select  id_activo, idtipo_activo, marca_activo, precesador_acrtivo, memoria_activo, discoduro_activo, modelo_activo, serie_activo, costo_activo, fechacompra_activo, codigointernoinstitucional_activo from tmovactcon where marca_activo = '"+valMarca+"' and idtipo_activo = '"+numTipo+"' and iddocasignacion_activo = 1";
                        try{
                            ResultSet rs = conexion.ejecutarSQLSelect(sql);
                            while(rs.next()){
                                  int i;
                                  for (i = 1; i <= numeroColumnas; i++) {                                      
                                          fila[i - 1] = rs.getObject(i) ;                                                                          
                                    }                                  
                                Checkbox checkbox;
                                checkbox =new Checkbox("checkB"+titulos[1], false);
                                checkbox.setVisible(true);
                                checkbox.setSize(20, 20);
                                checkbox.setLabel("");
                                fila[i+1]= (checkbox);
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
                        Object[] fila = new Object[11];                      

                        String sql="select  id_activo, idtipo_activo, marca_activo, precesador_acrtivo, memoria_activo, discoduro_activo, modelo_activo, serie_activo, costo_activo, fechacompra_activo, codigointernoinstitucional_activo from tmovactcon where precesador_acrtivo = '"+valProcesador+"' and iddocasignacion_activo = 1";
                        try{
                            ResultSet rs = conexion.ejecutarSQLSelect(sql);

                            while(rs.next()){
                                  for (int i = 1; i <= numeroColumnas; i++) {                                      
                                          fila[i - 1] = rs.getObject(i) ;                                                                          
                                    }
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
                            Object[] fila = new Object[11];                      

                            String sql="select  id_activo, idtipo_activo, marca_activo, precesador_acrtivo, memoria_activo, discoduro_activo, modelo_activo, serie_activo, costo_activo, fechacompra_activo, codigointernoinstitucional_activo from tmovactcon where memoria_activo = '"+valMemoria+"' and iddocasignacion_activo = 1";
                            try{
                                ResultSet rs = conexion.ejecutarSQLSelect(sql);

                                while(rs.next()){
                                  for (int i = 1; i <= numeroColumnas; i++) {                                      
                                          fila[i - 1] = rs.getObject(i) ;                                                                          
                                    }
                                 modelo.addRow(fila);
                                }
                            tabla_activoSinResponsable.setModel(modelo); 
                            }catch(Exception ex){

                                JOptionPane.showMessageDialog(rootPane,"exception: "+ex);
                            }
                        }
                    } else{
                        if (rbtn_discoduro_activo.isSelected()) {
                            String valDiscoDuro = combo_discoduro_activo.getSelectedItem().toString();
                            if (conexion.crearConexion()) {
                                String[] titulos ={"Id","Tipo","Marca", "Procesador", "Memoria", "Disco Duro", "Modelo", "Serie", "Costo", "Fecha Compra", "Código Interno"};
                                DefaultTableModel modelo = new DefaultTableModel (null, titulos); 
                                Object[] fila = new Object[11];                      

                                String sql="select id_activo, idtipo_activo, marca_activo, precesador_acrtivo, memoria_activo, discoduro_activo, modelo_activo, serie_activo, costo_activo, fechacompra_activo, codigointernoinstitucional_activo from tmovactcon where discoduro_activo = '"+valDiscoDuro+"' and iddocasignacion_activo = 1";
                                try{
                                    ResultSet rs = conexion.ejecutarSQLSelect(sql);

                                    while(rs.next()){
                                        for (int i = 1; i <= numeroColumnas; i++) {                                      
                                          fila[i - 1] = rs.getObject(i) ;                                                                          
                                        }
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
                        Object[] fila = new Object[11];                      

                        String sql="select  id_activo, idtipo_activo, marca_activo, precesador_acrtivo, memoria_activo, discoduro_activo, modelo_activo, serie_activo, costo_activo, fechacompra_activo, codigointernoinstitucional_activo from tmovactcon where serie_activo = '"+valSerie+"' and iddocasignacion_activo = 1";
                        try{
                            ResultSet rs = conexion.ejecutarSQLSelect(sql);                   
                                while(rs.next()){
                                    for (int i = 1; i <= numeroColumnas; i++) {                                      
                                           fila[i - 1] = rs.getObject(i) ;                                                                          
                                        }
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
                        Object[] fila = new Object[11];                      
                        
                        String sql="select  id_activo, idtipo_activo, marca_activo, precesador_acrtivo, memoria_activo, discoduro_activo, modelo_activo, serie_activo, costo_activo, fechacompra_activo, codigointernoinstitucional_activo from tmovactcon where codigointernoinstitucional_activo = '"+valCodigoInstitucional+"' and iddocasignacion_activo = 1";
                        try{
                            ResultSet rs = conexion.ejecutarSQLSelect(sql);                           
                                while(rs.next()){
                                        for (int i = 1; i <= numeroColumnas; i++) {                                      
                                              fila[i - 1] = rs.getObject(i) ;                                                                          
                                        }
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
        int[] row = tabla_activoSinResponsable.getSelectedRows();
        int numero = row.length;int id=0;String s="";
        for (int i = 0; i < (numero); i++) {
            id = Integer.parseInt(tabla_activoSinResponsable.getValueAt(row[i], 0).toString());            
            RegistroDocumentoAsignacion.id_activoasignar.add(id);
        }                                        
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
                     if (c == KeyEvent.VK_MINUS) {
                       evt.setKeyChar(c);
                   } else{
                         evt.consume();
                     }
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
        activarBusquedaTipos();
        if (!rbtn_tipo.isSelected()) {
            rbtn_tipo.setSelected(true);
            panelBusquedaTipo.setVisible(true); 
            rbtn_marca_activo.setSelected(true); 
        }
    }//GEN-LAST:event_combo_tipo_activoItemStateChanged

    private void combo_tipo_activoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_tipo_activoMouseEntered
       activarBusquedaTipos(); 
    }//GEN-LAST:event_combo_tipo_activoMouseEntered

    private void combo_tipo_activoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_tipo_activoMouseExited
        activarBusquedaTipos();
    }//GEN-LAST:event_combo_tipo_activoMouseExited

    private void jPanel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseMoved
        activarBusquedaTipos();
    }//GEN-LAST:event_jPanel4MouseMoved

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        verificarBusqueda();           
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void combo_marca_activoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_marca_activoItemStateChanged
        
    }//GEN-LAST:event_combo_marca_activoItemStateChanged

    private void combo_procesador_activoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_procesador_activoItemStateChanged
       
    }//GEN-LAST:event_combo_procesador_activoItemStateChanged

    private void combo_memoria_activoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_memoria_activoItemStateChanged
        
    }//GEN-LAST:event_combo_memoria_activoItemStateChanged

    private void combo_discoduro_activoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_discoduro_activoItemStateChanged

    }//GEN-LAST:event_combo_discoduro_activoItemStateChanged

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        String[] titulos ={"Id","Tipo","Marca", "Procesador", "Memoria", "Disco Duro", "Modelo", "Serie", "Costo", "Fecha Compra", "Código Interno"};
        DefaultTableModel modelo = new DefaultTableModel (null, titulos); 
        tabla_activoSinResponsable.setModel(modelo);
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void tabla_activoSinResponsableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_activoSinResponsableMouseClicked

    }//GEN-LAST:event_tabla_activoSinResponsableMouseClicked

    private void btn_seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionarActionPerformed
        for (int i = 0; i < tabla_activoSinResponsable.getRowCount(); i++) {
                                                     
                  tabla_activoSinResponsable.selectAll();
            
        }
    }//GEN-LAST:event_btn_seleccionarActionPerformed

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
    public javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_buscar_activo;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_seleccionar;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox combo_discoduro_activo;
    public javax.swing.JComboBox combo_marca_activo;
    public javax.swing.JComboBox combo_memoria_activo;
    public javax.swing.JComboBox combo_procesador_activo;
    public javax.swing.JComboBox combo_tipo_activo;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
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
    public javax.swing.JRadioButton rbtn_codigoinstitucional_activo;
    public javax.swing.JRadioButton rbtn_discoduro_activo;
    public javax.swing.JRadioButton rbtn_marca_activo;
    public javax.swing.JRadioButton rbtn_memoria_activo;
    public javax.swing.JRadioButton rbtn_procesador_activo;
    public javax.swing.JRadioButton rbtn_serie_activo;
    public javax.swing.JRadioButton rbtn_tipo;
    public javax.swing.JTable tabla_activoSinResponsable;
    public javax.swing.JTextField txt_codigoInternoInsticucional_activo;
    public javax.swing.JTextField txt_serie_activo;
    // End of variables declaration//GEN-END:variables
}
