package Vista;

import Controlador.Files;
import Controlador.logica;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author eleaz
 */
public class InicioFrame extends javax.swing.JFrame {

    public static int widt;
    public static int heigt;
    private static String confirmPass = "";
    private static Principal p = new Principal();
    private String idCuenta = "";

    public InicioFrame() {
        initComponents();
        inicia();
    }
    private void inicia(){
        moreC();
         this.setLocationRelativeTo(null);
        btnGtipo.add(rbtnAdmin);
        btnGtipo.add(rbtnConta);
        btnGtipo.add(rbtnPV);
        btnGtipo.add(rbtnRh);
        rbtnPV.doClick();
        txtBusca.setForeground(Color.black);
        Controlador.logica.shopPromo();
        llenaHome();
        user.setText(Controlador.logica.userNow);
        titleAnima();
    }
    private void llenaHome() {
        // Verificar que haya suficientes elementos antes de acceder
        int size = Controlador.logica.nombres.size();
        
        if (size > 0) jLabel12.setText((String) Controlador.logica.nombres.get(0));
        else jLabel12.setText("N/A");
        
        if (size > 1) jLabel13.setText((String) Controlador.logica.nombres.get(1));
        else jLabel13.setText("N/A");
        
        if (size > 2) jLabel15.setText((String) Controlador.logica.nombres.get(2));
        else jLabel15.setText("N/A");
        
        if (size > 3) jLabel16.setText((String) Controlador.logica.nombres.get(3));
        else jLabel16.setText("N/A");
        
        if (size > 4) jLabel17.setText((String) Controlador.logica.nombres.get(4));
        else jLabel17.setText("N/A");
        
        if (size > 5) jLabel18.setText((String) Controlador.logica.nombres.get(5));
        else jLabel18.setText("N/A");
        
        if (size > 6) jLabel19.setText((String) Controlador.logica.nombres.get(6));
        else jLabel19.setText("N/A");
        
        if (size > 7) jLabel20.setText((String) Controlador.logica.nombres.get(7));
        else jLabel20.setText("N/A");
        
        if (size > 8) jLabel21.setText((String) Controlador.logica.nombres.get(8));
        else jLabel21.setText("N/A");
        
        if (size > 9) jLabel22.setText((String) Controlador.logica.nombres.get(9));
        else jLabel22.setText("N/A");
        
        if (size > 10) jLabel23.setText((String) Controlador.logica.nombres.get(10));
        else jLabel23.setText("N/A");
        
        if (size > 11) jLabel24.setText((String) Controlador.logica.nombres.get(11));
        else jLabel24.setText("N/A");
        
        if (size > 12) jLabel25.setText((String) Controlador.logica.nombres.get(12));
        else jLabel25.setText("N/A");
        
        if (size > 13) jLabel26.setText((String) Controlador.logica.nombres.get(13));
        else jLabel26.setText("N/A");
        
        if (size > 14) jLabel27.setText((String) Controlador.logica.nombres.get(14));
        else jLabel27.setText("N/A");
    }

    public static void muestraPanel(JPanel p) {
        Muestra.removeAll();
        Muestra.add(p, BorderLayout.CENTER);
        Muestra.revalidate();
        Muestra.repaint();

    }

    public static void holder() {
        if (txtBusca.getText().isEmpty()) {
            txtBusca.setText("Inserte  el ID de un empleado.");
            txtBusca.setForeground(Color.LIGHT_GRAY);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        rrHH = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        addNewUser = new javax.swing.JDialog();
        jPsuperDialog = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        rbtnPV = new javax.swing.JRadioButton();
        rbtnConta = new javax.swing.JRadioButton();
        rbtnAdmin = new javax.swing.JRadioButton();
        rbtnRh = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        labelId = new javax.swing.JLabel();
        labelNameUsuario = new javax.swing.JLabel();
        txtNameUsu = new javax.swing.JTextField();
        passw = new javax.swing.JTextField();
        labelPass = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        CPass = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        txtBusca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnGtipo = new javax.swing.ButtonGroup();
        config = new javax.swing.JDialog();
        jPanel22 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        roles = new javax.swing.JDialog();
        jPanel23 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaRoles = new javax.swing.JList<>();
        Muestra = new javax.swing.JPanel();
        jPizquierdo = new javax.swing.JPanel();
        jPbotones = new javax.swing.JPanel();
        btnShop = new javax.swing.JButton();
        btnrh = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnConta = new javax.swing.JButton();
        btnNuevaC = new javax.swing.JButton();
        btnCierraS = new javax.swing.JButton();
        jPsuper = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        GoToIn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPajustes = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        jPcentro = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuOne = new javax.swing.JMenu();
        usersItem = new javax.swing.JMenuItem();
        sep = new javax.swing.JMenu();
        sep2 = new javax.swing.JMenu();
        sep3 = new javax.swing.JMenu();
        menuHelp = new javax.swing.JMenu();
        documentItem = new javax.swing.JMenuItem();

        rrHH.setModal(true);
        rrHH.setResizable(false);
        rrHH.setSize(new java.awt.Dimension(653, 205));
        rrHH.getContentPane().setLayout(new javax.swing.OverlayLayout(rrHH.getContentPane()));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 7, true));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(140, 162, 192));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setPreferredSize(new java.awt.Dimension(825, 80));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/Hous.png"))); // NOI18N
        jLabel6.setText("               ");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jPanel8.add(jLabel7);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.black, null));
        jPanel9.setPreferredSize(new java.awt.Dimension(550, 60));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        jLabel8.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(20, 20, 20));
        jLabel8.setText("Recursos humanos");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel8.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel8.setMinimumSize(new java.awt.Dimension(200, 18));
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 18));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 130);
        jPanel9.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/engraneWhite.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 25);
        jPanel9.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(20, 20, 20));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/usuarioGrande.png"))); // NOI18N
        jLabel10.setText("Eleazar");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 25);
        jPanel9.add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel11.setText("^");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 25);
        jPanel9.add(jLabel11, gridBagConstraints);

        jPanel8.add(jPanel9);

        jPanel1.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel10.setBackground(new java.awt.Color(140, 162, 192));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 20));

        jButton5.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jButton5.setText("Gestión de empleados");
        jButton5.setFocusPainted(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPreferredSize(new java.awt.Dimension(500, 50));
        jButton5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton5);

        jPanel1.add(jPanel10, java.awt.BorderLayout.CENTER);

        rrHH.getContentPane().add(jPanel1);

        addNewUser.setTitle("Cuentas");
        addNewUser.setAutoRequestFocus(false);
        addNewUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addNewUser.setLocation(new java.awt.Point(100, 100));
        addNewUser.setName("addNewUser"); // NOI18N
        addNewUser.setSize(new java.awt.Dimension(717, 544));

        jPsuperDialog.setBackground(new java.awt.Color(140, 162, 192));
        jPsuperDialog.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPsuperDialog.setFont(new java.awt.Font("Z003", 3, 36)); // NOI18N
        jPsuperDialog.setPreferredSize(new java.awt.Dimension(717, 100));
        jPsuperDialog.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Z003", 0, 24)); // NOI18N
        jLabel4.setText("Agregar cuentas para login");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 0);
        jPsuperDialog.add(jLabel4, gridBagConstraints);

        rbtnPV.setBackground(new java.awt.Color(140, 162, 192));
        rbtnPV.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        rbtnPV.setText("Punto de venta");
        rbtnPV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnPVMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 7, 0);
        jPsuperDialog.add(rbtnPV, gridBagConstraints);

        rbtnConta.setBackground(new java.awt.Color(140, 162, 192));
        rbtnConta.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        rbtnConta.setText("Contador");
        rbtnConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnContaMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 7, 2);
        jPsuperDialog.add(rbtnConta, gridBagConstraints);

        rbtnAdmin.setBackground(new java.awt.Color(140, 162, 192));
        rbtnAdmin.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        rbtnAdmin.setText("Administrador");
        rbtnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnAdminMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 7, 7);
        jPsuperDialog.add(rbtnAdmin, gridBagConstraints);

        rbtnRh.setBackground(new java.awt.Color(140, 162, 192));
        rbtnRh.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        rbtnRh.setText("RRHH");
        rbtnRh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnRhMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 7, 19);
        jPsuperDialog.add(rbtnRh, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel5.setText("Tipo de usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 11, 0);
        jPsuperDialog.add(jLabel5, gridBagConstraints);

        addNewUser.getContentPane().add(jPsuperDialog, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(140, 162, 192));
        jPanel2.setPreferredSize(new java.awt.Dimension(717, 330));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtId.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 180;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 5, 0, 0);
        jPanel2.add(txtId, gridBagConstraints);

        labelId.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        labelId.setText("ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 74, 0, 0);
        jPanel2.add(labelId, gridBagConstraints);

        labelNameUsuario.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        labelNameUsuario.setText("Nombre de usuario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 6, 0, 7);
        jPanel2.add(labelNameUsuario, gridBagConstraints);

        txtNameUsu.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtNameUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameUsuActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 165;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 10, 0, 6);
        jPanel2.add(txtNameUsu, gridBagConstraints);

        passw.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        passw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 143;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(64, 18, 0, 0);
        jPanel2.add(passw, gridBagConstraints);

        labelPass.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        labelPass.setText("Contraseña:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(67, 12, 0, 0);
        jPanel2.add(labelPass, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel14.setText("Confirmar contraseña:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(67, 6, 0, 0);
        jPanel2.add(jLabel14, gridBagConstraints);

        btnCreate.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/user_add.png"))); // NOI18N
        btnCreate.setText("Crear cuenta");
        btnCreate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCreate.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnCreate.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 77;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 131, 3);
        jPanel2.add(btnCreate, gridBagConstraints);

        CPass.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        CPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPassActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(64, 1, 0, 6);
        jPanel2.add(CPass, gridBagConstraints);

        addNewUser.getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(140, 162, 192));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 50));
        jPanel3.setPreferredSize(new java.awt.Dimension(717, 55));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 7));

        txtBusca.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtBusca.setToolTipText("Busca el id de un empleado");
        txtBusca.setPreferredSize(new java.awt.Dimension(500, 24));
        txtBusca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscaFocusLost(evt);
            }
        });
        txtBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscaMouseClicked(evt);
            }
        });
        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });
        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscaKeyTyped(evt);
            }
        });
        jPanel3.add(txtBusca);

        jButton1.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/zoom.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        addNewUser.getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        config.getContentPane().setLayout(new javax.swing.OverlayLayout(config.getContentPane()));

        jPanel22.setBackground(new java.awt.Color(140, 162, 192));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        jButton2.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jButton2.setText("Editar perfil");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 162, 192), 5));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton2.setMinimumSize(new java.awt.Dimension(126, 20));
        jButton2.setPreferredSize(new java.awt.Dimension(126, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 5, Short.MAX_VALUE)))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addGap(0, 75, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 75, Short.MAX_VALUE)))
        );

        config.getContentPane().add(jPanel22);

        roles.setTitle("Lista de Roles");
        roles.setModal(true);
        roles.setSize(new java.awt.Dimension(200, 300));

        jPanel23.setPreferredSize(new java.awt.Dimension(50, 300));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/user_delete.png"))); // NOI18N
        btnDelete.setToolTipText("Elimina");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel23.add(btnDelete);

        roles.getContentPane().add(jPanel23, java.awt.BorderLayout.LINE_START);

        jPanel24.setPreferredSize(new java.awt.Dimension(140, 300));
        jPanel24.setLayout(new javax.swing.OverlayLayout(jPanel24));

        jScrollPane1.setViewportView(listaRoles);

        jPanel24.add(jScrollPane1);

        roles.getContentPane().add(jPanel24, java.awt.BorderLayout.LINE_END);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Inicio");
        setSize(new java.awt.Dimension(900, 646));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        Muestra.setLayout(new java.awt.BorderLayout());

        jPizquierdo.setBackground(new java.awt.Color(140, 162, 192));
        jPizquierdo.setPreferredSize(new java.awt.Dimension(180, 586));

        jPbotones.setBackground(new java.awt.Color(255, 255, 255));
        jPbotones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPbotones.setMinimumSize(new java.awt.Dimension(170, 210));
        jPbotones.setPreferredSize(new java.awt.Dimension(170, 210));
        jPbotones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        btnShop.setBackground(new java.awt.Color(113, 161, 166));
        btnShop.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        btnShop.setForeground(new java.awt.Color(255, 255, 255));
        btnShop.setText("Punto de venta");
        btnShop.setToolTipText("Hacer ventas");
        btnShop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnShop.setPreferredSize(new java.awt.Dimension(160, 23));
        btnShop.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShopActionPerformed(evt);
            }
        });
        jPbotones.add(btnShop);

        btnrh.setBackground(new java.awt.Color(113, 161, 166));
        btnrh.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        btnrh.setForeground(new java.awt.Color(255, 255, 255));
        btnrh.setText("RRHH");
        btnrh.setToolTipText("Recursos humanos");
        btnrh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnrh.setPreferredSize(new java.awt.Dimension(160, 23));
        btnrh.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnrh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrhActionPerformed(evt);
            }
        });
        jPbotones.add(btnrh);

        btnInventario.setBackground(new java.awt.Color(113, 161, 166));
        btnInventario.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnInventario.setText("Inventario");
        btnInventario.setToolTipText("Inventario");
        btnInventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInventario.setPreferredSize(new java.awt.Dimension(160, 23));
        btnInventario.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        jPbotones.add(btnInventario);

        btnConta.setBackground(new java.awt.Color(113, 161, 166));
        btnConta.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        btnConta.setForeground(new java.awt.Color(255, 255, 255));
        btnConta.setText("Contabilidad");
        btnConta.setToolTipText("Contabilidad");
        btnConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConta.setPreferredSize(new java.awt.Dimension(160, 23));
        btnConta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContaActionPerformed(evt);
            }
        });
        jPbotones.add(btnConta);

        btnNuevaC.setBackground(new java.awt.Color(113, 161, 166));
        btnNuevaC.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        btnNuevaC.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaC.setText("Nueva cuenta");
        btnNuevaC.setToolTipText("Contabilidad");
        btnNuevaC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevaC.setPreferredSize(new java.awt.Dimension(160, 23));
        btnNuevaC.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnNuevaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCActionPerformed(evt);
            }
        });
        jPbotones.add(btnNuevaC);

        btnCierraS.setBackground(new java.awt.Color(113, 161, 166));
        btnCierraS.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        btnCierraS.setForeground(new java.awt.Color(250, 250, 250));
        btnCierraS.setText("Cerrar sesión");
        btnCierraS.setToolTipText("Close");
        btnCierraS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCierraS.setPreferredSize(new java.awt.Dimension(161, 22));
        btnCierraS.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnCierraS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCierraSActionPerformed(evt);
            }
        });
        jPbotones.add(btnCierraS);

        jPizquierdo.add(jPbotones);

        Muestra.add(jPizquierdo, java.awt.BorderLayout.LINE_START);

        jPsuper.setBackground(new java.awt.Color(140, 162, 192));
        jPsuper.setPreferredSize(new java.awt.Dimension(1101, 70));
        jPsuper.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jLabel1.setText("            ");
        jPsuper.add(jLabel1);

        GoToIn.setFont(new java.awt.Font("Linux Biolinum Keyboard O", 0, 36)); // NOI18N
        GoToIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GoToIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/Hous.png"))); // NOI18N
        GoToIn.setText("            Inicio");
        GoToIn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        GoToIn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        GoToIn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPsuper.add(GoToIn);

        jLabel2.setText("                        ");
        jPsuper.add(jLabel2);

        jPajustes.setBackground(new java.awt.Color(255, 255, 255));
        jPajustes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jPajustes.setMinimumSize(new java.awt.Dimension(500, 48));
        jPajustes.setPreferredSize(new java.awt.Dimension(200, 50));
        jPajustes.setLayout(new java.awt.GridBagLayout());

        user.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
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
        jPajustes.add(user, new java.awt.GridBagConstraints());

        jPsuper.add(jPajustes);

        Muestra.add(jPsuper, java.awt.BorderLayout.PAGE_START);

        jPcentro.setBackground(new java.awt.Color(140, 162, 192));
        jPcentro.setLayout(new java.awt.GridLayout(3, 5));

        jPanel4.setBackground(new java.awt.Color(140, 162, 192));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel4.setFont(new java.awt.Font("Linux Libertine Mono O", 0, 14)); // NOI18N
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jLabel12.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(20, 20, 20));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel12);

        jPcentro.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(140, 162, 192));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel5.setFont(new java.awt.Font("Linux Libertine Mono O", 0, 14)); // NOI18N
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jLabel13.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(20, 20, 20));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel13);

        jPcentro.add(jPanel5);

        jPanel11.setBackground(new java.awt.Color(140, 162, 192));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel11.setFont(new java.awt.Font("Linux Libertine Mono O", 0, 14)); // NOI18N
        jPanel11.setLayout(new java.awt.GridLayout(1, 0));

        jLabel15.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(20, 20, 20));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel15);

        jPcentro.add(jPanel11);

        jPanel6.setBackground(new java.awt.Color(140, 162, 192));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel6.setFont(new java.awt.Font("Linux Libertine Mono O", 0, 14)); // NOI18N
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jLabel16.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(20, 20, 20));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel16);

        jPcentro.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(140, 162, 192));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel7.setFont(new java.awt.Font("Linux Libertine Mono O", 0, 14)); // NOI18N
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        jLabel17.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(20, 20, 20));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel17);

        jPcentro.add(jPanel7);

        jPanel12.setBackground(new java.awt.Color(140, 162, 192));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel12.setFont(new java.awt.Font("Linux Libertine Mono O", 0, 14)); // NOI18N
        jPanel12.setLayout(new java.awt.GridLayout(1, 0));

        jLabel18.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(20, 20, 20));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel18);

        jPcentro.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(140, 162, 192));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel13.setFont(new java.awt.Font("Linux Libertine Mono O", 0, 14)); // NOI18N
        jPanel13.setLayout(new java.awt.GridLayout(1, 0));

        jLabel19.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(20, 20, 20));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel13.add(jLabel19);

        jPcentro.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(140, 162, 192));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel14.setFont(new java.awt.Font("Linux Libertine Mono O", 0, 14)); // NOI18N
        jPanel14.setLayout(new java.awt.GridLayout(1, 0));

        jLabel20.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(20, 20, 20));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel14.add(jLabel20);

        jPcentro.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(140, 162, 192));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel15.setFont(new java.awt.Font("Linux Libertine Mono O", 0, 14)); // NOI18N
        jPanel15.setLayout(new java.awt.GridLayout(1, 0));

        jLabel21.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(20, 20, 20));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel15.add(jLabel21);

        jPcentro.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(140, 162, 192));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel16.setFont(new java.awt.Font("Linux Libertine Mono O", 0, 14)); // NOI18N
        jPanel16.setLayout(new java.awt.GridLayout(1, 0));

        jLabel22.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(20, 20, 20));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel22);

        jPcentro.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(140, 162, 192));
        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel17.setFont(new java.awt.Font("Linux Libertine Mono O", 0, 14)); // NOI18N
        jPanel17.setLayout(new java.awt.GridLayout(1, 0));

        jLabel23.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(20, 20, 20));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel17.add(jLabel23);

        jPcentro.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(140, 162, 192));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel18.setFont(new java.awt.Font("Linux Libertine Mono O", 0, 14)); // NOI18N
        jPanel18.setLayout(new java.awt.GridLayout(1, 0));

        jLabel24.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(20, 20, 20));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel18.add(jLabel24);

        jPcentro.add(jPanel18);

        jPanel19.setBackground(new java.awt.Color(140, 162, 192));
        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel19.setFont(new java.awt.Font("Linux Libertine Mono O", 0, 14)); // NOI18N
        jPanel19.setLayout(new java.awt.GridLayout(1, 0));

        jLabel25.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(20, 20, 20));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel19.add(jLabel25);

        jPcentro.add(jPanel19);

        jPanel20.setBackground(new java.awt.Color(140, 162, 192));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel20.setFont(new java.awt.Font("Linux Libertine Mono O", 0, 14)); // NOI18N
        jPanel20.setLayout(new java.awt.GridLayout(1, 0));

        jLabel26.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(20, 20, 20));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel20.add(jLabel26);

        jPcentro.add(jPanel20);

        jPanel21.setBackground(new java.awt.Color(140, 162, 192));
        jPanel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel21.setFont(new java.awt.Font("Linux Libertine Mono O", 0, 14)); // NOI18N
        jPanel21.setLayout(new java.awt.GridLayout(1, 0));

        jLabel27.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(20, 20, 20));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel21.add(jLabel27);

        jPcentro.add(jPanel21);

        Muestra.add(jPcentro, java.awt.BorderLayout.CENTER);

        getContentPane().add(Muestra);

        menuBar.setToolTipText("Barra de herramientas");
        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menuOne.setText("Usuarios PV");
        menuOne.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        menuOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOneActionPerformed(evt);
            }
        });

        usersItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        usersItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/user.png"))); // NOI18N
        usersItem.setText("Ver");
        usersItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersItemActionPerformed(evt);
            }
        });
        menuOne.add(usersItem);

        menuBar.add(menuOne);

        sep.setText("l");
        menuBar.add(sep);

        sep2.setText("l");
        menuBar.add(sep2);

        sep3.setText("l");
        menuBar.add(sep3);

        menuHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/help.png"))); // NOI18N
        menuHelp.setText("Ayuda");
        menuHelp.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        menuHelp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuHelp.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        documentItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        documentItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/help.png"))); // NOI18N
        documentItem.setText("Documentación");
        documentItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentItemActionPerformed(evt);
            }
        });
        menuHelp.add(documentItem);

        menuBar.add(menuHelp);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void moreC() {
        btnCierraS.setMnemonic(KeyEvent.VK_S);
    }
    private void btnShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShopActionPerformed
        Principal puntoV = new Principal();
        puntoV.setVisible(true);
        puntoV.setSize(this.getSize());
        puntoV.setLocationRelativeTo(null);
        super.setVisible(false);

    }//GEN-LAST:event_btnShopActionPerformed

    private void btnrhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrhActionPerformed
        rrHH.setAlwaysOnTop(true); // Siempre encima
//        iconuser.setSize(300, 200);
        rrHH.setLocationRelativeTo(this); // Centrar el diálogo
        this.widt = this.getWidth();
        this.heigt = this.getHeight();
        rrHH.setVisible(true);

    }//GEN-LAST:event_btnrhActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        Inventario inventario = new Inventario();
        inventario.setVisible(true);
        inventario.setSize(this.getSize());
        inventario.setLocationRelativeTo(null);
        super.setVisible(false);


    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnCierraSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCierraSActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.setVisible(false); //Aca tengo que hacer visible el login que hice invisible
    }//GEN-LAST:event_btnCierraSActionPerformed

    private void btnContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContaActionPerformed
        Conta contabilidad = new Conta();
        contabilidad.setVisible(true);
        contabilidad.setSize(this.getSize());
        super.setVisible(false);
    }//GEN-LAST:event_btnContaActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        InicioFrame inicio = new InicioFrame();
        super.setVisible(false);
        inicio.setVisible(true);
        inicio.setSize(this.getSize());
        rrHH.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        GestionEmpleados ge = new GestionEmpleados();
        super.setVisible(false);
        ge.setVisible(true);
        ge.setSize(this.getSize());
        rrHH.setVisible(false);
        GestionEmpleados.btnConsulta.doClick();


    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int answ = JOptionPane.showConfirmDialog(this, "¿Estas seguro de salir?", "!?", JOptionPane.YES_NO_OPTION);
        if (answ == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnNuevaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCActionPerformed
        holder();
        addNewUser.setAlwaysOnTop(true); // Siempre encima
        addNewUser.setLocationRelativeTo(null); // Centrar el diálogo
        addNewUser.setVisible(true);
    }//GEN-LAST:event_btnNuevaCActionPerformed

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        jButton1.doClick();
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void txtBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscaMouseClicked
        txtBusca.setText("");
    }//GEN-LAST:event_txtBuscaMouseClicked

    private void rbtnPVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnPVMouseClicked
        holder();
    }//GEN-LAST:event_rbtnPVMouseClicked

    private void rbtnRhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnRhMouseClicked
        holder();
    }//GEN-LAST:event_rbtnRhMouseClicked

    private void rbtnContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnContaMouseClicked
        holder();
    }//GEN-LAST:event_rbtnContaMouseClicked

    private void rbtnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnAdminMouseClicked
        holder();
    }//GEN-LAST:event_rbtnAdminMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtBusca.setText(txtBusca.getText().replaceAll("[^" + logica.sinEspeciales.replace("^", "").replace("+", "") + "]", "").toUpperCase());
        String ID = txtBusca.getText();
        String contra = passw.getText();
        String confirm = CPass.getPassword().toString();
        if (!ID.isEmpty()) {
            Controlador.logica.buscaIdna(ID);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtBuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyTyped
        String txt = txtBusca.getText().toUpperCase();
        if (!txt.matches(logica.serie)) {
            // Filtrar solo los caracteres válidos
            txtBusca.setText(txt.replaceAll("[^" + logica.sinEspeciales.replace("^", "").replace("+", "") + "]", ""));
        } else {
            txtBusca.setText(txt.replaceAll("[^" + logica.sinEspeciales.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtBuscaKeyTyped

    private void txtBuscaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscaFocusLost
        if (!idCuenta.isBlank()) {
            holder();
        }
    }//GEN-LAST:event_txtBuscaFocusLost

    private void txtBuscaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscaFocusGained
        txtBusca.setForeground(Color.black);
    }//GEN-LAST:event_txtBuscaFocusGained

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        createNewUsers();
//        addNewUser.setAlwaysOnTop(true);
    }//GEN-LAST:event_btnCreateActionPerformed
    public static void createNewUsers() {
        String ID = txtId.getText();
        String nameUsu = txtNameUsu.getText();
        String contra = passw.getText();
        String confirm = String.valueOf(CPass.getPassword());
        if (!ID.isEmpty() && !nameUsu.isEmpty() && !contra.isEmpty() && !confirm.isEmpty()) {
            if (contra.equals(confirm)) {

                if (rbtnPV.isSelected()) {
                    //registro en la tabla cuentas
                    confirmPass = String.valueOf(CPass.getPassword()) + "_pv";
                    Controlador.logica.newCuenta("p", ID, txtNameUsu.getText(), confirmPass);
                } else if (rbtnRh.isSelected()) {
                    confirmPass = String.valueOf(CPass.getPassword()) + "_rh";
                    Controlador.logica.newCuenta("r", ID, txtNameUsu.getText(), confirmPass);
                } else if (rbtnConta.isSelected()) {
                    confirmPass = String.valueOf(CPass.getPassword()) + "_ct";
                    Controlador.logica.newCuenta("c", ID, txtNameUsu.getText(), confirmPass);
                } else if (rbtnAdmin.isSelected()) {
                    confirmPass = String.valueOf(CPass.getPassword()) + "_adm";
                    Controlador.logica.newCuenta("a", ID, txtNameUsu.getText(), confirmPass);
                }
            } else {
                JOptionPane.showMessageDialog(addNewUser, "Las contraseñas deben coincidir");
                passw.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(addNewUser, "Debe de llenar todos los campos");
        }
    }
    private void CPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPassActionPerformed
        btnCreate.doClick();
    }//GEN-LAST:event_CPassActionPerformed

    private void menuOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOneActionPerformed
        Principal puntoV = new Principal();
        puntoV.setVisible(true);
        puntoV.setSize(this.getSize());
        puntoV.setLocationRelativeTo(null);
        super.setVisible(false);
    }//GEN-LAST:event_menuOneActionPerformed

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Principal p = new Principal();
        p.edit.doClick();
        p.setSize(1, 1);
        config.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Login log = new Login();
        log.setVisible(true);
        config.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        String content = p.jLabel1.getText();
        p.process(content);
        p.getFecha();
//        btnVender.doClick();
        String[] s = p.existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(p.venta, "El auto se ha agotado por el momento quedan 0 unidades");
            p.venta.setVisible(false);
        } else {
            p.btnVender.doClick();
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        String content = p.jLabel2.getText();
        p.process(content);
        p.getFecha();
//        btnVender.doClick();
        String[] s = p.existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(p.venta, "El auto se ha agotado por el momento quedan 0 unidades");
            p.venta.setVisible(false);
        } else {
            p.btnVender.doClick();
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        String content = p.jLabel3.getText();
        p.process(content);
        p.getFecha();
//        btnVender.doClick();
        String[] s = p.existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(p.venta, "El auto se ha agotado por el momento quedan 0 unidades");
            p.venta.setVisible(false);
        } else {
            p.btnVender.doClick();
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        String content = p.jLabel4.getText();
        p.process(content);
        p.getFecha();
//        btnVender.doClick();
        String[] s = p.existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(p.venta, "El auto se ha agotado por el momento quedan 0 unidades");
            p.venta.setVisible(false);
        } else {
            p.btnVender.doClick();
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        String content = p.jLabel5.getText();
        p.process(content);
        p.getFecha();
//        btnVender.doClick();
        String[] s = p.existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(p.venta, "El auto se ha agotado por el momento quedan 0 unidades");
            p.venta.setVisible(false);
        } else {
            p.btnVender.doClick();
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        String content = p.jLabel14.getText();
        p.process(content);
        p.getFecha();
//        btnVender.doClick();
        String[] s = p.existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(p.venta, "El auto se ha agotado por el momento quedan 0 unidades");
            p.venta.setVisible(false);
        } else {
            p.btnVender.doClick();
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        String content = p.jLabel15.getText();
        p.process(content);
        p.getFecha();
//        btnVender.doClick();
        String[] s = p.existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(p.venta, "El auto se ha agotado por el momento quedan 0 unidades");
            p.venta.setVisible(false);
        } else {
            p.btnVender.doClick();
        }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        String content = p.jLabel16.getText();
        p.process(content);
        p.getFecha();
//        btnVender.doClick();
        String[] s = p.existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(p.venta, "El auto se ha agotado por el momento quedan 0 unidades");
            p.venta.setVisible(false);
        } else {
            p.btnVender.doClick();
        }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        String content = p.jLabel17.getText();
        p.process(content);
        p.getFecha();
//        btnVender.doClick();
        String[] s = p.existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(p.venta, "El auto se ha agotado por el momento quedan 0 unidades");
            p.venta.setVisible(false);
        } else {
            p.btnVender.doClick();
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        String content = p.jLabel18.getText();
        p.process(content);
        p.getFecha();
//        btnVender.doClick();
        String[] s = p.existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(p.venta, "El auto se ha agotado por el momento quedan 0 unidades");
            p.venta.setVisible(false);
        } else {
            p.btnVender.doClick();
        }
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        String content = p.jLabel19.getText();
        p.process(content);
        p.getFecha();
//        btnVender.doClick();
        String[] s = p.existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(p.venta, "El auto se ha agotado por el momento quedan 0 unidades");
            p.venta.setVisible(false);
        } else {
            p.btnVender.doClick();
        }
    }//GEN-LAST:event_jLabel23MouseClicked
    private void showWrol() {
        logica.rolesModel.removeAllElements();
        listaRoles.removeAll();
        
        listaRoles.setModel(logica.rolesModel);
        listaRoles.setModel(logica.rolesModel);
        roles.setAlwaysOnTop(true);
        roles.setLocationRelativeTo(null);
        logica.rolesLista();
        roles.setVisible(true);
    }
    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        String content = p.jLabel20.getText();
        p.process(content);
        p.getFecha();
//        btnVender.doClick();
        String[] s = p.existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(p.venta, "El auto se ha agotado por el momento quedan 0 unidades");
            p.venta.setVisible(false);
        } else {
            p.btnVender.doClick();
        }
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        String content = p.jLabel21.getText();
        p.process(content);
        p.getFecha();
//        btnVender.doClick();
        String[] s = p.existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(p.venta, "El auto se ha agotado por el momento quedan 0 unidades");
            p.venta.setVisible(false);
        } else {
            p.btnVender.doClick();
        }
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        String content = p.jLabel22.getText();
        p.process(content);
        p.getFecha();
//        btnVender.doClick();
        String[] s = p.existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(p.venta, "El auto se ha agotado por el momento quedan 0 unidades");
            p.venta.setVisible(false);
        } else {
            p.btnVender.doClick();
        }
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        String content = p.jLabel23.getText();
        p.process(content);
        p.getFecha();
//        btnVender.doClick();
        String[] s = p.existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(p.venta, "El auto se ha agotado por el momento quedan 0 unidades");
            p.venta.setVisible(false);
        } else {
            p.btnVender.doClick();
        }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void txtNameUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameUsuActionPerformed
        passw.requestFocus();
    }//GEN-LAST:event_txtNameUsuActionPerformed

    private void passwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwActionPerformed
        CPass.requestFocus();
    }//GEN-LAST:event_passwActionPerformed

    private void usersItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersItemActionPerformed
        
        
        showWrol();
        
    }//GEN-LAST:event_usersItemActionPerformed

    private void documentItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentItemActionPerformed
        Files fm = new Files();
        fm.openDocumentation();
    }//GEN-LAST:event_documentItemActionPerformed
    private void titleAnima(){
    new Thread(new Runnable() {
            Random rand = new Random();
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                        Color nuevoColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
                        GoToIn.setForeground(nuevoColor);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }).start();
    }
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (listaRoles.getSelectedIndex() != -1) {
            String txt = listaRoles.getSelectedValue();
            logica.deleteRol(txt);
            logica.rolesModel.clear();
            showWrol();

        } else {
            JOptionPane.showMessageDialog(roles, "Debe seleccionar al menos un rol");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPasswordField CPass;
    private javax.swing.JLabel GoToIn;
    public static javax.swing.JPanel Muestra;
    public static javax.swing.JDialog addNewUser;
    private javax.swing.JButton btnCierraS;
    private javax.swing.JButton btnConta;
    public static javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.ButtonGroup btnGtipo;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnNuevaC;
    private javax.swing.JButton btnShop;
    private javax.swing.JButton btnrh;
    private javax.swing.JDialog config;
    private javax.swing.JMenuItem documentItem;
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPajustes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPbotones;
    private javax.swing.JPanel jPcentro;
    private javax.swing.JPanel jPizquierdo;
    private javax.swing.JPanel jPsuper;
    private javax.swing.JPanel jPsuperDialog;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel labelId;
    public static javax.swing.JLabel labelNameUsuario;
    public static javax.swing.JLabel labelPass;
    public static javax.swing.JList<String> listaRoles;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuOne;
    public static javax.swing.JTextField passw;
    public static javax.swing.JRadioButton rbtnAdmin;
    public static javax.swing.JRadioButton rbtnConta;
    public static javax.swing.JRadioButton rbtnPV;
    public static javax.swing.JRadioButton rbtnRh;
    public static javax.swing.JDialog roles;
    private javax.swing.JDialog rrHH;
    private javax.swing.JMenu sep;
    private javax.swing.JMenu sep2;
    private javax.swing.JMenu sep3;
    public static javax.swing.JTextField txtBusca;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtNameUsu;
    public static javax.swing.JLabel user;
    private javax.swing.JMenuItem usersItem;
    // End of variables declaration//GEN-END:variables
}
