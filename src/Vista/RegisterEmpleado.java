package Vista;

import Controlador.Empleado;
import Controlador.logica;
import Modelo.Conexion;


import javax.swing.JOptionPane;

/**
 *
 * @author eleaz
 */
public class RegisterEmpleado extends javax.swing.JFrame {

    public static String id = "";
    public static String Ruta = "no";
    public static GestionEmpleados ge = new GestionEmpleados();
    
    public RegisterEmpleado() {
        initComponents();
        this.setLocationRelativeTo(null);
        user.setText(Controlador.logica.userNow);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        OpenFiles = new javax.swing.JDialog();
        chooser = new javax.swing.JFileChooser();
        config = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPprincipal = new javax.swing.JPanel();
        jPsuper = new javax.swing.JPanel();
        GoBack = new javax.swing.JLabel();
        ubicacionVentana = new javax.swing.JLabel();
        jPtituloVentana = new javax.swing.JPanel();
        tituloVentana = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jPcentro = new javax.swing.JPanel();
        jPDP = new javax.swing.JPanel();
        jPtituloDP = new javax.swing.JPanel();
        tituloDP = new javax.swing.JLabel();
        jPcuerpoDP = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jPpieDP = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnOKID = new javax.swing.JButton();
        jLfnac = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        jPIE = new javax.swing.JPanel();
        jPtituloIE = new javax.swing.JPanel();
        tituloIE = new javax.swing.JLabel();
        jPcuerpoIE = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txtUbi = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        comboPuesto = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtIDEmpresa = new javax.swing.JTextField();
        jPbotonesGD = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnDescartar = new javax.swing.JButton();

        OpenFiles.setLocation(new java.awt.Point(0, 0));
        OpenFiles.setModal(true);
        OpenFiles.setSize(new java.awt.Dimension(667, 365));

        javax.swing.GroupLayout OpenFilesLayout = new javax.swing.GroupLayout(OpenFiles.getContentPane());
        OpenFiles.getContentPane().setLayout(OpenFilesLayout);
        OpenFilesLayout.setHorizontalGroup(
            OpenFilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpenFilesLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        OpenFilesLayout.setVerticalGroup(
            OpenFilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpenFilesLayout.createSequentialGroup()
                .addComponent(chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );

        OpenFiles.setLocationRelativeTo(null);

        config.setTitle("Configuración");
        config.getContentPane().setLayout(new javax.swing.OverlayLayout(config.getContentPane()));

        jPanel1.setBackground(new java.awt.Color(140, 162, 192));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        jButton1.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jButton1.setText("Editar perfil");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 162, 192), 5));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.setMinimumSize(new java.awt.Dimension(126, 20));
        jButton1.setPreferredSize(new java.awt.Dimension(126, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jButton3.setText("Cerrar sesión");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 162, 192), 5));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton3.setMinimumSize(new java.awt.Dimension(126, 20));
        jButton3.setPreferredSize(new java.awt.Dimension(126, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 5, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 75, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 75, Short.MAX_VALUE)))
        );

        config.getContentPane().add(jPanel1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registra Empleados");
        setSize(new java.awt.Dimension(1000, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPprincipal.setLayout(new java.awt.BorderLayout());

        jPsuper.setBackground(new java.awt.Color(140, 162, 192));
        jPsuper.setPreferredSize(new java.awt.Dimension(943, 45));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 1, -8);
        flowLayout1.setAlignOnBaseline(true);
        jPsuper.setLayout(flowLayout1);

        GoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/vuel.png"))); // NOI18N
        GoBack.setText("   ");
        GoBack.setToolTipText("Volver");
        GoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoBackMouseClicked(evt);
            }
        });
        jPsuper.add(GoBack);

        ubicacionVentana.setFont(new java.awt.Font("Nimbus Mono PS", 0, 15)); // NOI18N
        ubicacionVentana.setForeground(java.awt.Color.black);
        ubicacionVentana.setText("Alta de empleados    ");
        ubicacionVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ubicacionVentanaMouseClicked(evt);
            }
        });
        jPsuper.add(ubicacionVentana);

        jPtituloVentana.setBackground(new java.awt.Color(255, 255, 255));
        jPtituloVentana.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPtituloVentana.setMinimumSize(new java.awt.Dimension(600, 50));
        jPtituloVentana.setPreferredSize(new java.awt.Dimension(600, 50));
        jPtituloVentana.setLayout(new java.awt.GridBagLayout());

        tituloVentana.setFont(new java.awt.Font("Nimbus Mono PS", 0, 15)); // NOI18N
        tituloVentana.setForeground(java.awt.Color.black);
        tituloVentana.setText("Recursos humanos");
        tituloVentana.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        tituloVentana.setPreferredSize(new java.awt.Dimension(120, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 0);
        jPtituloVentana.add(tituloVentana, gridBagConstraints);

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/usuarioGrande.png"))); // NOI18N
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        jPtituloVentana.add(user, gridBagConstraints);

        jPsuper.add(jPtituloVentana);

        jPprincipal.add(jPsuper, java.awt.BorderLayout.PAGE_START);

        jPcentro.setBackground(new java.awt.Color(140, 162, 192));
        jPcentro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250), 8));
        jPcentro.setMinimumSize(new java.awt.Dimension(750, 680));
        jPcentro.setPreferredSize(new java.awt.Dimension(750, 680));
        jPcentro.setVerifyInputWhenFocusTarget(false);
        jPcentro.setLayout(new java.awt.GridLayout(0, 1));

        jPDP.setBackground(new java.awt.Color(140, 162, 192));
        jPDP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        jPDP.setLayout(new java.awt.BorderLayout());

        jPtituloDP.setBackground(new java.awt.Color(140, 162, 192));
        jPtituloDP.setMinimumSize(new java.awt.Dimension(125, 20));
        jPtituloDP.setPreferredSize(new java.awt.Dimension(981, 20));
        jPtituloDP.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 2, 0));

        tituloDP.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        tituloDP.setForeground(new java.awt.Color(255, 255, 255));
        tituloDP.setText("Datos personales");
        jPtituloDP.add(tituloDP);

        jPDP.add(jPtituloDP, java.awt.BorderLayout.PAGE_START);

        jPcuerpoDP.setBackground(new java.awt.Color(140, 162, 192));
        jPcuerpoDP.setLayout(new java.awt.GridLayout(6, 2));

        jLabel7.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("    Nombre:");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        jPcuerpoDP.add(jLabel7);

        txtNombre.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtNombre.setToolTipText("Inserte nombre");
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        txtNombre.setMinimumSize(new java.awt.Dimension(180, 24));
        txtNombre.setPreferredSize(new java.awt.Dimension(180, 24));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPcuerpoDP.add(txtNombre);

        jLabel8.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("    Apellido paterno:");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        jPcuerpoDP.add(jLabel8);

        txtApellidoP.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtApellidoP.setToolTipText("Inserte apellido paterno");
        txtApellidoP.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        txtApellidoP.setMinimumSize(new java.awt.Dimension(180, 24));
        txtApellidoP.setPreferredSize(new java.awt.Dimension(180, 24));
        txtApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoPActionPerformed(evt);
            }
        });
        txtApellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPKeyTyped(evt);
            }
        });
        jPcuerpoDP.add(txtApellidoP);

        jLabel12.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("    Apellido materno:");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        jPcuerpoDP.add(jLabel12);

        txtApellidoM.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtApellidoM.setToolTipText("Inserte  apellido materno");
        txtApellidoM.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        txtApellidoM.setMinimumSize(new java.awt.Dimension(180, 24));
        txtApellidoM.setPreferredSize(new java.awt.Dimension(180, 24));
        txtApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMActionPerformed(evt);
            }
        });
        txtApellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMKeyTyped(evt);
            }
        });
        jPcuerpoDP.add(txtApellidoM);

        jLabel9.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("    e-mail");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        jPcuerpoDP.add(jLabel9);

        txtEmail.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtEmail.setToolTipText("Inserte apellido paterno");
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        txtEmail.setMinimumSize(new java.awt.Dimension(180, 24));
        txtEmail.setPreferredSize(new java.awt.Dimension(180, 24));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        jPcuerpoDP.add(txtEmail);

        jLabel14.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("    Telefono:");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPcuerpoDP.add(jLabel14);

        txtTelefono.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        txtTelefono.setMinimumSize(new java.awt.Dimension(180, 24));
        txtTelefono.setPreferredSize(new java.awt.Dimension(180, 24));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPcuerpoDP.add(txtTelefono);

        jPDP.add(jPcuerpoDP, java.awt.BorderLayout.CENTER);

        jPpieDP.setBackground(new java.awt.Color(140, 162, 192));
        jPpieDP.setPreferredSize(new java.awt.Dimension(669, 20));
        jPpieDP.setLayout(new java.awt.GridLayout(1, 7));

        jLabel24.setForeground(java.awt.Color.white);
        jLabel24.setText("  Curp o ID:");
        jPpieDP.add(jLabel24);

        txtID.setFont(new java.awt.Font("Liberation Sans", 2, 10)); // NOI18N
        txtID.setToolTipText("Inserte fecha de nacimiento");
        txtID.setMinimumSize(new java.awt.Dimension(70, 24));
        txtID.setPreferredSize(new java.awt.Dimension(70, 24));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });
        jPpieDP.add(txtID);

        btnOKID.setText("Ok ID");
        btnOKID.setToolTipText("Confirmar ID");
        btnOKID.setFocusPainted(false);
        btnOKID.setMinimumSize(new java.awt.Dimension(42, 24));
        btnOKID.setPreferredSize(new java.awt.Dimension(42, 24));
        btnOKID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKIDActionPerformed(evt);
            }
        });
        jPpieDP.add(btnOKID);

        jLfnac.setForeground(java.awt.Color.white);
        jLfnac.setText("  F. Nacimiento");
        jLfnac.setToolTipText("Fecha de nacimiento");
        jPpieDP.add(jLfnac);

        txtAnio.setForeground(new java.awt.Color(150, 150, 150));
        txtAnio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAnio.setText("YY");
        txtAnio.setToolTipText("Inserte año");
        txtAnio.setMinimumSize(new java.awt.Dimension(180, 24));
        txtAnio.setPreferredSize(new java.awt.Dimension(180, 24));
        txtAnio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAnioMouseClicked(evt);
            }
        });
        txtAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnioKeyTyped(evt);
            }
        });
        jPpieDP.add(txtAnio);

        txtMes.setForeground(new java.awt.Color(150, 150, 150));
        txtMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMes.setText("MM");
        txtMes.setToolTipText("Inserte mes");
        txtMes.setMinimumSize(new java.awt.Dimension(40, 24));
        txtMes.setPreferredSize(new java.awt.Dimension(40, 24));
        txtMes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMesMouseClicked(evt);
            }
        });
        txtMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMesKeyTyped(evt);
            }
        });
        jPpieDP.add(txtMes);

        txtDia.setForeground(new java.awt.Color(150, 150, 150));
        txtDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDia.setText("DD");
        txtDia.setToolTipText("Inserte dia");
        txtDia.setMinimumSize(new java.awt.Dimension(40, 24));
        txtDia.setPreferredSize(new java.awt.Dimension(40, 24));
        txtDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDiaMouseClicked(evt);
            }
        });
        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });
        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaKeyTyped(evt);
            }
        });
        jPpieDP.add(txtDia);

        jPDP.add(jPpieDP, java.awt.BorderLayout.PAGE_END);

        jPcentro.add(jPDP);

        jPIE.setBackground(new java.awt.Color(140, 162, 192));
        jPIE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        jPIE.setPreferredSize(new java.awt.Dimension(727, 102));
        jPIE.setLayout(new java.awt.BorderLayout());

        jPtituloIE.setBackground(new java.awt.Color(140, 162, 192));
        jPtituloIE.setPreferredSize(new java.awt.Dimension(821, 20));
        jPtituloIE.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        tituloIE.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        tituloIE.setForeground(java.awt.Color.white);
        tituloIE.setText("Información de empresa");
        jPtituloIE.add(tituloIE);

        jPIE.add(jPtituloIE, java.awt.BorderLayout.PAGE_START);

        jPcuerpoIE.setBackground(new java.awt.Color(140, 162, 192));
        jPcuerpoIE.setPreferredSize(new java.awt.Dimension(821, 130));
        jPcuerpoIE.setLayout(new java.awt.GridLayout(6, 2));

        jLabel11.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setText("    Status");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        jPcuerpoIE.add(jLabel11);

        comboEstado.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", "Activo", "A Prueba", "Baja Temporal", "Baja Definitiva" }));
        comboEstado.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        jPcuerpoIE.add(comboEstado);

        jLabel19.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel19.setForeground(java.awt.Color.white);
        jLabel19.setText("    Ubicación:");
        jLabel19.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        jPcuerpoIE.add(jLabel19);

        txtUbi.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtUbi.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        txtUbi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUbiKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUbiKeyTyped(evt);
            }
        });
        jPcuerpoIE.add(txtUbi);

        jLabel16.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("    Fecha de ingreso:");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        jPcuerpoIE.add(jLabel16);

        txtFechaIngreso.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtFechaIngreso.setForeground(new java.awt.Color(150, 150, 150));
        txtFechaIngreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaIngreso.setText("YYYY/MM/DD");
        txtFechaIngreso.setToolTipText("YYYY/MM/DD");
        txtFechaIngreso.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        txtFechaIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaIngresoMouseClicked(evt);
            }
        });
        txtFechaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaIngresoActionPerformed(evt);
            }
        });
        txtFechaIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFechaIngresoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaIngresoKeyTyped(evt);
            }
        });
        jPcuerpoIE.add(txtFechaIngreso);

        jLabel18.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel18.setForeground(java.awt.Color.white);
        jLabel18.setText("    Puesto:");
        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        jPcuerpoIE.add(jLabel18);

        comboPuesto.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        comboPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir..", "GESTIONAR", "VENDER", "ADMINISTRAR" }));
        comboPuesto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        comboPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPuestoActionPerformed(evt);
            }
        });
        jPcuerpoIE.add(comboPuesto);

        jLabel15.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setText("    Id de empleado:");
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPcuerpoIE.add(jLabel15);

        txtIDEmpresa.setEditable(false);
        txtIDEmpresa.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtIDEmpresa.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        txtIDEmpresa.setEnabled(false);
        txtIDEmpresa.setFocusable(false);
        txtIDEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDEmpresaKeyReleased(evt);
            }
        });
        jPcuerpoIE.add(txtIDEmpresa);

        jPIE.add(jPcuerpoIE, java.awt.BorderLayout.PAGE_END);

        jPcentro.add(jPIE);

        jPbotonesGD.setBackground(new java.awt.Color(140, 162, 192));
        jPbotonesGD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        jPbotonesGD.setMinimumSize(new java.awt.Dimension(0, 50));
        jPbotonesGD.setPreferredSize(new java.awt.Dimension(827, 50));
        jPbotonesGD.setLayout(new java.awt.GridLayout(5, 2, 20, 6));

        btnGuardar.setBackground(new java.awt.Color(100, 150, 100));
        btnGuardar.setFont(new java.awt.Font("Nimbus Mono PS", 0, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(20, 20, 20));
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Registrar alta de empleado");
        btnGuardar.setFocusPainted(false);
        btnGuardar.setMinimumSize(new java.awt.Dimension(90, 35));
        btnGuardar.setPreferredSize(new java.awt.Dimension(90, 35));
        btnGuardar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPbotonesGD.add(btnGuardar);

        btnDescartar.setBackground(new java.awt.Color(150, 80, 80));
        btnDescartar.setFont(new java.awt.Font("Nimbus Mono PS", 0, 24)); // NOI18N
        btnDescartar.setForeground(new java.awt.Color(20, 20, 20));
        btnDescartar.setText("Descartar");
        btnDescartar.setToolTipText("Descartar alta de empleado");
        btnDescartar.setFocusPainted(false);
        btnDescartar.setMinimumSize(new java.awt.Dimension(90, 35));
        btnDescartar.setPreferredSize(new java.awt.Dimension(90, 35));
        btnDescartar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartarActionPerformed(evt);
            }
        });
        jPbotonesGD.add(btnDescartar);

        jPcentro.add(jPbotonesGD);

        jPprincipal.add(jPcentro, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPprincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ubicacionVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ubicacionVentanaMouseClicked

    }//GEN-LAST:event_ubicacionVentanaMouseClicked

    private void GoBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackMouseClicked
        
        String []type=Conexion.getPassword().split("_");
        
        switch(type[1]){
            case "rh":
                ge.GoToIn.setVisible(false);
                break;
        }
        ge.setVisible(true);
        ge.setLocation(this.getLocation());
        ge.setSize(this.getSize());
        this.setVisible(false);
        //ge.GoToIn.setVisible(false);
    }//GEN-LAST:event_GoBackMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int answ = JOptionPane.showConfirmDialog(this, "¿Estas seguro de salir?", "!?", JOptionPane.YES_NO_OPTION);
        if (answ == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased

    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void btnOKIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKIDActionPerformed
        String id = txtID.getText().toUpperCase();
        txtID.setText(id.replaceAll("[^" + logica.sinEspeciales.replace("^", "").replace("+", "") + "]", ""));
         String idgood = txtID.getText().toUpperCase();
        if (!idgood.isEmpty() && !(idgood.length() < 10)) {
            txtIDEmpresa.setText(idgood);
        } else {
            JOptionPane.showMessageDialog(null, "El id debe tener por lo menos 10 caracteres", "Advertencia!!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnOKIDActionPerformed

    private void txtAnioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioKeyReleased

    }//GEN-LAST:event_txtAnioKeyReleased

    private void txtFechaIngresoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaIngresoKeyReleased
        char c= evt.getKeyChar();
                // Obtener el texto actual
                String texto = txtFechaIngreso.getText();
                
                // Agregar '/' automáticamente en la posición correcta
                if ((texto.length() == 4 || texto.length() == 7) && c != '-') {
                    txtFechaIngreso.setText(texto + "-");
                }
    }//GEN-LAST:event_txtFechaIngresoKeyReleased

    private void comboPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPuestoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String idocurp = txtIDEmpresa.getText(), nombre = txtNombre.getText(),
                apellidoP = txtApellidoP.getText(), apellidoM = txtApellidoM.getText(),
                fechaN = txtAnio.getText() + "-" + txtMes.getText() + "-" + txtDia.getText(),
                fechaI = txtFechaIngreso.getText(), estado = (String) comboEstado.getSelectedItem(),
                telefono = txtTelefono.getText(), mail = txtEmail.getText(), ubi = txtUbi.getText();
        
        
        Empleado empleado = new Empleado(
            idocurp, nombre, apellidoP, apellidoM, fechaN,
            fechaI, estado, ubi, telefono, mail
        ) {};
        
        
        int idpuesto = (int) comboPuesto.getSelectedIndex();
        if(!idocurp.isEmpty()&&!nombre.isEmpty()&&!apellidoP.isEmpty()&&!apellidoM.isEmpty()&&!fechaN.isEmpty()&&!fechaI.isEmpty()&&!estado.isEmpty()&&!telefono.isEmpty()&&!mail.isEmpty()){
            logica.insertaE(idocurp, nombre, apellidoP, apellidoM, fechaN, fechaI, estado, telefono, mail, ubi, idpuesto);
            GestionEmpleados gee = new GestionEmpleados();
            gee.setVisible(true);
            super.setVisible(false);
            GestionEmpleados.btnConsulta.doClick();
        }else{
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartarActionPerformed

        GestionEmpleados gee = new GestionEmpleados();
        gee.setLocation(this.getLocation());
        gee.setSize(this.getSize());
        gee.setVisible(true);
        super.setVisible(false);
    }//GEN-LAST:event_btnDescartarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        btnOKID.doClick();
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtIDEmpresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDEmpresaKeyReleased

    }//GEN-LAST:event_txtIDEmpresaKeyReleased

    private void txtFechaIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaIngresoActionPerformed

    private void txtFechaIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaIngresoMouseClicked
        txtFechaIngreso.setText("");
    }//GEN-LAST:event_txtFechaIngresoMouseClicked

    private void txtAnioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAnioMouseClicked
        txtAnio.setText("");
    }//GEN-LAST:event_txtAnioMouseClicked

    private void txtMesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMesMouseClicked
        txtMes.setText("");
    }//GEN-LAST:event_txtMesMouseClicked

    private void txtDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDiaMouseClicked
        txtDia.setText("");
    }//GEN-LAST:event_txtDiaMouseClicked

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        config.setAlwaysOnTop(true); // Siempre encima
        config.setSize(442, 218);
        config.setLocationRelativeTo(null); // Centrar el diálogo
        config.setVisible(true);

    }//GEN-LAST:event_userMouseClicked

    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
    }//GEN-LAST:event_userMouseEntered

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited

    }//GEN-LAST:event_userMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Principal p =new Principal();
        p.edit.doClick();
        p.setSize(1,1);
        config.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Login log = new Login();
        log.setVisible(true);
        config.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtFechaIngresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaIngresoKeyTyped
         char c = evt.getKeyChar();
                
                // Solo permitir números y controlar la longitud
                if (!Character.isDigit(c) || txtFechaIngreso.getText().length() >= 10) {
                    evt.consume(); // Bloquea la entrada inválida
                    return;
                }

    }//GEN-LAST:event_txtFechaIngresoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
         char c = evt.getKeyChar();

        // Solo permitir números y controlar la longitud
        if (Character.isDigit(c)) {
            evt.consume(); // Bloquea la entrada inválida
            return;
        }
        String texto = txtNombre.getText();
        if (!texto.matches(logica.nombress)) {
            // Filtrar solo los caracteres válidos 
            txtNombre.setText(texto.replaceAll("[^" + logica.nombress.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPKeyTyped
        String texto = txtApellidoP.getText();
        if (!texto.matches(logica.nombress)) {
            // Filtrar solo los caracteres válidos
            txtApellidoP.setText(texto.replaceAll("[^" + logica.nombress.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtApellidoPKeyTyped

    private void txtApellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMKeyTyped
       String texto = txtApellidoM.getText();
        if (!texto.matches(logica.nombress)) {
            // Filtrar solo los caracteres válidos
            txtApellidoM.setText(texto.replaceAll("[^" + logica.nombress.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtApellidoMKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        String texto = txtEmail.getText();
        if (!texto.matches(logica.correos)) {
            // Filtrar solo los caracteres válidos
            txtEmail.setText(texto.replaceAll("[^" + logica.correos.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        
         char c = evt.getKeyChar();

        // Solo permitir números y controlar la longitud
        if (!Character.isDigit(c) || txtTelefono.getText().length() >= 10) {
            evt.consume(); // Bloquea la entrada inválida
            return;
        }
        String texto = txtTelefono.getText();
        if (!texto.matches(logica.telefonos)) {
            // Filtrar solo los caracteres válidos
            txtTelefono.setText(texto.replaceAll("[^" + logica.telefonos.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioKeyTyped
         char c = evt.getKeyChar();

        // Solo permitir números y controlar la longitud
        if (!Character.isDigit(c) || txtAnio.getText().length() >= 10) {
            evt.consume(); // Bloquea la entrada inválida
            return;
        }
        String texto = txtAnio.getText();
        if (!texto.matches(logica.cantidades)) {
            // Filtrar solo los caracteres válidos
            txtAnio.setText(texto.replaceAll("[^" + logica.cantidades.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtAnioKeyTyped

    private void txtMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesKeyTyped
         char c = evt.getKeyChar();

        // Solo permitir números y controlar la longitud
        if (!Character.isDigit(c) || txtMes.getText().length() >= 10) {
            evt.consume(); // Bloquea la entrada inválida
            return;
        }
        String texto = txtMes.getText();
        if (!texto.matches(logica.cantidades)) {
            // Filtrar solo los caracteres válidos
            txtMes.setText(texto.replaceAll("[^" + logica.cantidades.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtMesKeyTyped

    private void txtDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaKeyTyped
         char c = evt.getKeyChar();

        // Solo permitir números y controlar la longitud
        if (!Character.isDigit(c) || txtDia.getText().length() >= 10) {
            evt.consume(); // Bloquea la entrada inválida
            return;
        }
        String texto = txtDia.getText();
        if (!texto.matches(logica.cantidades)) {
            // Filtrar solo los caracteres válidos
            txtDia.setText(texto.replaceAll("[^" + logica.cantidades.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtDiaKeyTyped

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        
        String texto = txtID.getText().toUpperCase();
        if (!texto.matches(logica.sinEspeciales)) {
            // Filtrar solo los caracteres válidos
            txtID.setText(texto.replaceAll("[^" + logica.sinEspeciales.replace("^", "").replace("+", "") + "]", ""));
        }else{
            txtID.setText(texto.replaceAll("[^" + logica.sinEspeciales.replace("^", "").replace("+", "") + "]", ""));
        }
        
       
            
       
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtUbiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUbiKeyTyped
       String texto = txtUbi.getText();
        if (!texto.matches(logica.descripciones)) {
            // Filtrar solo los caracteres válidos
            txtUbi.setText(texto.replaceAll("[^" + logica.descripciones.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtUbiKeyTyped

    private void txtUbiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUbiKeyReleased
        
    }//GEN-LAST:event_txtUbiKeyReleased

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtApellidoP.requestFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoPActionPerformed
        txtApellidoM.requestFocus();
    }//GEN-LAST:event_txtApellidoPActionPerformed

    private void txtApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMActionPerformed
        txtEmail.requestFocus();
    }//GEN-LAST:event_txtApellidoMActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        txtTelefono.requestFocus();
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
       txtID.requestFocus();
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        txtUbi.requestFocus();
    }//GEN-LAST:event_txtDiaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GoBack;
    public static javax.swing.JDialog OpenFiles;
    private javax.swing.JButton btnDescartar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnOKID;
    public static javax.swing.JFileChooser chooser;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JComboBox<String> comboPuesto;
    private javax.swing.JDialog config;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLfnac;
    private javax.swing.JPanel jPDP;
    private javax.swing.JPanel jPIE;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPbotonesGD;
    private javax.swing.JPanel jPcentro;
    private javax.swing.JPanel jPcuerpoDP;
    private javax.swing.JPanel jPcuerpoIE;
    private javax.swing.JPanel jPpieDP;
    private javax.swing.JPanel jPprincipal;
    private javax.swing.JPanel jPsuper;
    private javax.swing.JPanel jPtituloDP;
    private javax.swing.JPanel jPtituloIE;
    private javax.swing.JPanel jPtituloVentana;
    private javax.swing.JLabel tituloDP;
    private javax.swing.JLabel tituloIE;
    private javax.swing.JLabel tituloVentana;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDEmpresa;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUbi;
    private javax.swing.JLabel ubicacionVentana;
    public static javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
