package Vista;

import Controlador.Files;
import Controlador.Hora;
import Controlador.logica;
import static Controlador.logica.shopPromo;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.event.KeyEvent.*;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * // * @author eleaz
 */
public class Principal extends javax.swing.JFrame {

    public static Login logS = new Login();
    public static int cantidadVender = 1;
    public static double precio = 0;
    public static boolean existNo = false;
    public static final String ventas = "ventas";

//public static FormEmpleado nuevoemp = new FormEmpleado();
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        group.add(Sname);
        group.add(Smodel);
        group.add(Sid);
        config.setModal(true);
        Sid.doClick();
        user.setText(Controlador.logica.userNow);
        btnVender.setVisible(false);
        cantidad.setText("x_" + cantidadVender);
        Hora hr = new Hora();
        hr.start();
        btnRegistraCliente.setVisible(false);
        btnSearchCliente.setVisible(false);
        lbdes2.setVisible(false);

        chooser.setDialogTitle("Guardar PDF");
        chooser.setFileSelectionMode(chooser.DIRECTORIES_ONLY);  // Solo permite seleccionar directorios
    }

    public static void llenaPerfil() {
        txtID.setText(Controlador.logica.idNow);
        Controlador.logica.llenaPerfil(Controlador.logica.idNow);
    }

    private void llenaShop(ArrayList nombres) {
        try {
            jLabel1.setText((String) nombres.get(0));
            jLabel2.setText((String) nombres.get(1));
            jLabel3.setText((String) nombres.get(2));
            jLabel4.setText((String) nombres.get(3));
            jLabel5.setText((String) nombres.get(4));
            jLabel14.setText((String) nombres.get(5));
            jLabel15.setText((String) nombres.get(6));
            jLabel16.setText((String) nombres.get(7));
            jLabel17.setText((String) nombres.get(8));
            jLabel18.setText((String) nombres.get(9));
            jLabel19.setText((String) nombres.get(10));
            jLabel20.setText((String) nombres.get(11));
            jLabel21.setText((String) nombres.get(12));
            jLabel22.setText((String) nombres.get(13));
            jLabel23.setText((String) nombres.get(14));
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group = new javax.swing.ButtonGroup();
        config = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        venta = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtClienteId = new javax.swing.JTextField();
        txtTelefonoC = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        txtApellidoM = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtNombreC = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtDireccionC = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        lbdes = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        cantidad = new javax.swing.JLabel();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        btnDescuento = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        btnSearchCliente = new javax.swing.JButton();
        btnRegistraCliente = new javax.swing.JButton();
        existence = new javax.swing.JLabel();
        lbdes2 = new javax.swing.JLabel();
        EditaPerfil = new javax.swing.JDialog();
        jPanel15 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        Historial = new javax.swing.JDialog();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAhistorial = new javax.swing.JTextArea();
        factura = new javax.swing.JDialog();
        jPanel17 = new javax.swing.JPanel();
        downloadPdf = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        saveFile = new javax.swing.JDialog();
        chooser = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        Muestra = new javax.swing.JPanel();
        jPsuper = new javax.swing.JPanel();
        labelVacio = new javax.swing.JLabel();
        labelTresP = new javax.swing.JLabel();
        Sid = new javax.swing.JToggleButton();
        labelSeparador1 = new javax.swing.JLabel();
        Smodel = new javax.swing.JToggleButton();
        labelSeparador = new javax.swing.JLabel();
        Sname = new javax.swing.JToggleButton();
        Search = new javax.swing.JTextField();
        BtnSearch = new javax.swing.JButton();
        labelvacio2 = new javax.swing.JLabel();
        GoToIn = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jPinferior = new javax.swing.JPanel();
        btnVender = new javax.swing.JButton();
        jPcentral = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();

        config.setTitle("Configuración");
        config.setModal(true);
        config.setSize(new java.awt.Dimension(240, 160));
        config.getContentPane().setLayout(new javax.swing.OverlayLayout(config.getContentPane()));

        jPanel10.setBackground(new java.awt.Color(50, 140, 250));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 10));
        jPanel10.setMinimumSize(new java.awt.Dimension(146, 4));
        jPanel10.setPreferredSize(new java.awt.Dimension(235, 130));
        jPanel10.setLayout(new java.awt.GridLayout(0, 1));

        jButton3.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jButton3.setText("Administración");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 162, 192), 5));
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton3);

        jButton4.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jButton4.setText("Terminar dia");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 162, 192), 5));
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton4);

        edit.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        edit.setText("Editar perfil");
        edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 162, 192), 5));
        edit.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        edit.setMinimumSize(new java.awt.Dimension(126, 20));
        edit.setPreferredSize(new java.awt.Dimension(126, 25));
        edit.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel10.add(edit);

        jButton2.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jButton2.setText("Cerrar sesión");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 162, 192), 5));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton2.setMinimumSize(new java.awt.Dimension(126, 20));
        jButton2.setPreferredSize(new java.awt.Dimension(126, 25));
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton2);

        config.getContentPane().add(jPanel10);

        venta.setTitle("Formulario de ventas");
        venta.setModal(true);
        venta.setSize(new java.awt.Dimension(737, 537));
        venta.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                ventaWindowClosing(evt);
            }
        });
        venta.getContentPane().setLayout(new javax.swing.OverlayLayout(venta.getContentPane()));

        jPanel1.setBackground(new java.awt.Color(140, 162, 192));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 7));
        jPanel1.setMinimumSize(new java.awt.Dimension(737, 537));
        jPanel1.setPreferredSize(new java.awt.Dimension(737, 537));
        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Linux Libertine Mono O", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(20, 20, 20));
        jLabel6.setText("Formulario de venta");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(220, 10, 340, 20);

        jLabel7.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel7.setText("ID del cliente");
        jLabel7.setPreferredSize(new java.awt.Dimension(130, 24));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 60, 150, 24);

        jLabel8.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel8.setText("Telefono:");
        jLabel8.setPreferredSize(new java.awt.Dimension(130, 24));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 100, 150, 24);

        jLabel9.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel9.setText("Apellido paterno:");
        jLabel9.setPreferredSize(new java.awt.Dimension(130, 24));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 240, 150, 24);

        jLabel10.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel10.setText("Fecha:");
        jLabel10.setPreferredSize(new java.awt.Dimension(130, 24));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 360, 120, 24);

        jLabel11.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel11.setText("IDauto:");
        jLabel11.setPreferredSize(new java.awt.Dimension(130, 24));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(370, 66, 100, 24);

        jLabel12.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel12.setText("Datos de cliente");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(50, 36, 180, 18);

        jLabel13.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel13.setText("Datos de auto y compra");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(357, 36, 220, 18);

        txtClienteId.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtClienteId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteIdActionPerformed(evt);
            }
        });
        txtClienteId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClienteIdKeyTyped(evt);
            }
        });
        jPanel1.add(txtClienteId);
        txtClienteId.setBounds(160, 60, 200, 28);

        txtTelefonoC.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtTelefonoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoCActionPerformed(evt);
            }
        });
        txtTelefonoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoCKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefonoC);
        txtTelefonoC.setBounds(160, 100, 200, 28);

        txtApellidoP.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
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
        jPanel1.add(txtApellidoP);
        txtApellidoP.setBounds(160, 230, 190, 28);

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(120, 120, 120));
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setText("YYYY/MM/DD");
        txtFecha.setFocusable(false);
        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaMouseClicked(evt);
            }
        });
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        jPanel1.add(txtFecha);
        txtFecha.setBounds(160, 360, 190, 28);

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtId.setFocusable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId);
        txtId.setBounds(480, 60, 190, 28);

        jButton6.setBackground(new java.awt.Color(100, 150, 100));
        jButton6.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(250, 250, 250));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/cart_go.png"))); // NOI18N
        jButton6.setText("Realizar venta");
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(540, 450, 180, 28);

        jButton7.setBackground(new java.awt.Color(150, 80, 80));
        jButton7.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/cancel.png"))); // NOI18N
        jButton7.setText("Cancelar");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(388, 450, 140, 28);

        txtApellidoM.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
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
        jPanel1.add(txtApellidoM);
        txtApellidoM.setBounds(160, 280, 190, 28);

        jLabel24.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel24.setText("Apellido materno:");
        jLabel24.setPreferredSize(new java.awt.Dimension(130, 24));
        jPanel1.add(jLabel24);
        jLabel24.setBounds(20, 280, 150, 24);

        txtNombreC.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtNombreC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCActionPerformed(evt);
            }
        });
        txtNombreC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreC);
        txtNombreC.setBounds(160, 140, 200, 28);

        jLabel25.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel25.setText("Nombre:");
        jLabel25.setPreferredSize(new java.awt.Dimension(130, 24));
        jPanel1.add(jLabel25);
        jLabel25.setBounds(20, 140, 120, 24);

        txtDireccionC.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtDireccionC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionCKeyTyped(evt);
            }
        });
        jPanel1.add(txtDireccionC);
        txtDireccionC.setBounds(160, 320, 190, 28);

        jLabel26.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel26.setText("Direccion:");
        jLabel26.setPreferredSize(new java.awt.Dimension(130, 24));
        jPanel1.add(jLabel26);
        jLabel26.setBounds(20, 320, 150, 24);

        lbdes.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        lbdes.setText("Descuento:");
        lbdes.setPreferredSize(new java.awt.Dimension(130, 24));
        jPanel1.add(lbdes);
        lbdes.setBounds(370, 390, 100, 24);

        txtDescuento.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtDescuento.setText("0");
        txtDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuentoActionPerformed(evt);
            }
        });
        txtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyTyped(evt);
            }
        });
        jPanel1.add(txtDescuento);
        txtDescuento.setBounds(480, 390, 100, 28);

        jLabel28.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel28.setText("Precio unitario:");
        jLabel28.setPreferredSize(new java.awt.Dimension(130, 24));
        jPanel1.add(jLabel28);
        jLabel28.setBounds(370, 350, 150, 24);

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtPrecio.setFocusable(false);
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecio);
        txtPrecio.setBounds(510, 350, 140, 28);

        jLabel29.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel29.setText("Monto total:");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(370, 420, 100, 30);

        txtMonto.setEditable(false);
        txtMonto.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtMonto.setFocusable(false);
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        jPanel1.add(txtMonto);
        txtMonto.setBounds(480, 420, 140, 30);

        jLabel30.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel30.setText("Modelo:");
        jLabel30.setPreferredSize(new java.awt.Dimension(130, 24));
        jPanel1.add(jLabel30);
        jLabel30.setBounds(370, 310, 100, 40);

        txtModelo.setEditable(false);
        txtModelo.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtModelo.setFocusable(false);
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        jPanel1.add(txtModelo);
        txtModelo.setBounds(480, 310, 140, 28);

        jLabel31.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel31.setText("Cantidad:");
        jLabel31.setPreferredSize(new java.awt.Dimension(130, 24));
        jPanel1.add(jLabel31);
        jLabel31.setBounds(370, 90, 100, 30);

        cantidad.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        cantidad.setText("x_0");
        jPanel1.add(cantidad);
        cantidad.setBounds(520, 100, 30, 20);

        plus.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        jPanel1.add(plus);
        plus.setBounds(480, 90, 30, 28);

        minus.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        jPanel1.add(minus);
        minus.setBounds(550, 90, 28, 28);

        jLabel33.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel33.setText("Año:");
        jLabel33.setPreferredSize(new java.awt.Dimension(130, 24));
        jPanel1.add(jLabel33);
        jLabel33.setBounds(370, 270, 100, 40);

        txtAnio.setEditable(false);
        txtAnio.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtAnio.setFocusable(false);
        txtAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioActionPerformed(evt);
            }
        });
        jPanel1.add(txtAnio);
        txtAnio.setBounds(480, 270, 140, 28);

        jLabel34.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel34.setText("Color:");
        jLabel34.setPreferredSize(new java.awt.Dimension(130, 24));
        jPanel1.add(jLabel34);
        jLabel34.setBounds(370, 230, 100, 40);

        txtColor.setEditable(false);
        txtColor.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtColor.setFocusable(false);
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        jPanel1.add(txtColor);
        txtColor.setBounds(480, 230, 140, 28);

        jLabel35.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel35.setText("Marca:");
        jLabel35.setPreferredSize(new java.awt.Dimension(130, 24));
        jPanel1.add(jLabel35);
        jLabel35.setBounds(370, 190, 100, 40);

        txtMarca.setEditable(false);
        txtMarca.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtMarca.setFocusable(false);
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        jPanel1.add(txtMarca);
        txtMarca.setBounds(480, 190, 140, 28);

        jLabel36.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel36.setText("Tipo:");
        jLabel36.setPreferredSize(new java.awt.Dimension(130, 24));
        jPanel1.add(jLabel36);
        jLabel36.setBounds(370, 150, 100, 30);

        txtTipo.setEditable(false);
        txtTipo.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtTipo.setFocusable(false);
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTipo);
        txtTipo.setBounds(480, 150, 140, 28);

        btnDescuento.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        btnDescuento.setText("Aplicar");
        btnDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescuentoActionPerformed(evt);
            }
        });
        jPanel1.add(btnDescuento);
        btnDescuento.setBounds(590, 390, 90, 28);

        jLabel32.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jLabel32.setText("Nombre:");
        jPanel1.add(jLabel32);
        jLabel32.setBounds(370, 120, 90, 40);

        txtN.setEditable(false);
        txtN.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        txtN.setFocusable(false);
        txtN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNActionPerformed(evt);
            }
        });
        jPanel1.add(txtN);
        txtN.setBounds(480, 120, 140, 28);

        btnSearchCliente.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        btnSearchCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/zoom.png"))); // NOI18N
        btnSearchCliente.setToolTipText("Buscar");
        btnSearchCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchCliente);
        btnSearchCliente.setBounds(340, 60, 26, 26);

        btnRegistraCliente.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        btnRegistraCliente.setText("Registar nuevo cliente");
        btnRegistraCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistraCliente);
        btnRegistraCliente.setBounds(150, 450, 210, 28);

        existence.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        existence.setText("En existencia: ");
        jPanel1.add(existence);
        existence.setBounds(580, 90, 150, 30);

        lbdes2.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        lbdes2.setText("0");
        jPanel1.add(lbdes2);
        lbdes2.setBounds(640, 360, 8, 18);

        venta.getContentPane().add(jPanel1);

        EditaPerfil.setTitle("Editar Perfil");
        EditaPerfil.setModal(true);
        EditaPerfil.setSize(new java.awt.Dimension(532, 317));

        jPanel15.setBackground(new java.awt.Color(140, 162, 192));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel15.setMinimumSize(new java.awt.Dimension(532, 317));
        jPanel15.setPreferredSize(new java.awt.Dimension(532, 317));
        jPanel15.setLayout(null);

        jLabel37.setFont(new java.awt.Font("Nimbus Mono PS", 0, 24)); // NOI18N
        jLabel37.setText("Editar perfil");
        jPanel15.add(jLabel37);
        jLabel37.setBounds(160, 10, 250, 30);

        jLabel39.setFont(new java.awt.Font("Nimbus Mono PS", 0, 15)); // NOI18N
        jLabel39.setText("Editar ubicacion:");
        jPanel15.add(jLabel39);
        jLabel39.setBounds(8, 100, 170, 30);

        jLabel40.setFont(new java.awt.Font("Nimbus Mono PS", 0, 15)); // NOI18N
        jLabel40.setText("Editar e-mail:");
        jPanel15.add(jLabel40);
        jLabel40.setBounds(10, 140, 140, 30);

        jLabel41.setFont(new java.awt.Font("Nimbus Mono PS", 0, 15)); // NOI18N
        jLabel41.setText("Editar telefono:");
        jPanel15.add(jLabel41);
        jLabel41.setBounds(10, 180, 150, 30);

        jLabel42.setFont(new java.awt.Font("Nimbus Mono PS", 0, 15)); // NOI18N
        jLabel42.setText("Tu ID es:");
        jPanel15.add(jLabel42);
        jLabel42.setBounds(8, 58, 140, 30);

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Nimbus Mono PS", 0, 15)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setFocusable(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel15.add(txtID);
        txtID.setBounds(160, 60, 320, 28);

        txtUbicacion.setFont(new java.awt.Font("Nimbus Mono PS", 0, 15)); // NOI18N
        txtUbicacion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacionActionPerformed(evt);
            }
        });
        jPanel15.add(txtUbicacion);
        txtUbicacion.setBounds(160, 100, 320, 28);

        txtEmail.setFont(new java.awt.Font("Nimbus Mono PS", 0, 15)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
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
        jPanel15.add(txtEmail);
        txtEmail.setBounds(160, 140, 320, 28);

        txtPhone.setFont(new java.awt.Font("Nimbus Mono PS", 0, 15)); // NOI18N
        txtPhone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });
        jPanel15.add(txtPhone);
        txtPhone.setBounds(160, 180, 320, 28);

        jButton10.setFont(new java.awt.Font("Nimbus Mono PS", 0, 15)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/user_edit.png"))); // NOI18N
        jButton10.setText("Guardar cambios");
        jButton10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton10);
        jButton10.setBounds(280, 210, 200, 28);

        EditaPerfil.getContentPane().add(jPanel15, java.awt.BorderLayout.CENTER);

        Historial.setTitle("HIstorial de ventas");
        Historial.setModal(true);
        Historial.setSize(new java.awt.Dimension(519, 740));
        Historial.getContentPane().setLayout(new javax.swing.OverlayLayout(Historial.getContentPane()));

        jPanel16.setBackground(new java.awt.Color(140, 162, 192));
        jPanel16.setMinimumSize(new java.awt.Dimension(400, 740));
        jPanel16.setPreferredSize(new java.awt.Dimension(400, 740));
        jPanel16.setLayout(new java.awt.GridLayout(1, 0));

        txtAhistorial.setEditable(false);
        txtAhistorial.setBackground(new java.awt.Color(255, 255, 255));
        txtAhistorial.setColumns(20);
        txtAhistorial.setFont(new java.awt.Font("Nimbus Mono PS", 0, 15)); // NOI18N
        txtAhistorial.setRows(5);
        txtAhistorial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 162, 192), 2));
        jScrollPane1.setViewportView(txtAhistorial);

        jPanel16.add(jScrollPane1);

        Historial.getContentPane().add(jPanel16);

        factura.setTitle("Ventana de factura");
        factura.setModal(true);
        factura.setPreferredSize(new java.awt.Dimension(175, 170));
        factura.setSize(new java.awt.Dimension(175, 170));
        factura.getContentPane().setLayout(new javax.swing.OverlayLayout(factura.getContentPane()));

        jPanel17.setBackground(new java.awt.Color(140, 162, 192));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        downloadPdf.setFont(new java.awt.Font("Linux Libertine Display O", 1, 18)); // NOI18N
        downloadPdf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        downloadPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/savepdf.png"))); // NOI18N
        downloadPdf.setText("Guardar PDF");
        downloadPdf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        downloadPdf.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        downloadPdf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                downloadPdfMouseClicked(evt);
            }
        });

        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/accept.png"))); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnOk))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(downloadPdf)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(downloadPdf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOk)
                .addGap(9, 9, 9))
        );

        factura.getContentPane().add(jPanel17);

        saveFile.setSize(new java.awt.Dimension(703, 344));
        saveFile.getContentPane().setLayout(new javax.swing.OverlayLayout(saveFile.getContentPane()));

        chooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooserActionPerformed(evt);
            }
        });
        saveFile.getContentPane().add(chooser);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Principal");
        setSize(new java.awt.Dimension(900, 656));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        Muestra.setLayout(new java.awt.BorderLayout());

        jPsuper.setBackground(new java.awt.Color(140, 162, 192));
        jPsuper.setPreferredSize(new java.awt.Dimension(990, 80));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 6, 25);
        flowLayout1.setAlignOnBaseline(true);
        jPsuper.setLayout(flowLayout1);

        labelVacio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVacio.setText("                    ");
        labelVacio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelVacio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelVacioMouseClicked(evt);
            }
        });
        jPsuper.add(labelVacio);

        labelTresP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/TresPWhiteN.png"))); // NOI18N
        labelTresP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelTresPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelTresPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelTresPMouseExited(evt);
            }
        });
        jPsuper.add(labelTresP);

        Sid.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        Sid.setText("ID");
        Sid.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Sid.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidActionPerformed(evt);
            }
        });
        jPsuper.add(Sid);

        labelSeparador1.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        labelSeparador1.setText("|");
        jPsuper.add(labelSeparador1);

        Smodel.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        Smodel.setText("Modelo");
        Smodel.setToolTipText("Buscar por modelo");
        Smodel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Smodel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Smodel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SmodelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SmodelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SmodelMouseExited(evt);
            }
        });
        Smodel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmodelActionPerformed(evt);
            }
        });
        jPsuper.add(Smodel);

        labelSeparador.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        labelSeparador.setText("|");
        jPsuper.add(labelSeparador);

        Sname.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        Sname.setText("Nombre");
        Sname.setToolTipText("Buscar por marca");
        Sname.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Sname.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Sname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SnameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SnameMouseExited(evt);
            }
        });
        Sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnameActionPerformed(evt);
            }
        });
        jPsuper.add(Sname);

        Search.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        Search.setPreferredSize(new java.awt.Dimension(500, 22));
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SearchKeyTyped(evt);
            }
        });
        jPsuper.add(Search);

        BtnSearch.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        BtnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/zoom.png"))); // NOI18N
        BtnSearch.setToolTipText("Buscar");
        BtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchActionPerformed(evt);
            }
        });
        jPsuper.add(BtnSearch);

        labelvacio2.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        jPsuper.add(labelvacio2);

        GoToIn.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        GoToIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/Hous.png"))); // NOI18N
        GoToIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoToInMouseClicked(evt);
            }
        });
        jPsuper.add(GoToIn);

        user.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/usuarioGrande.png"))); // NOI18N
        user.setText("User");
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
        });
        jPsuper.add(user);

        Muestra.add(jPsuper, java.awt.BorderLayout.PAGE_START);

        jPinferior.setBackground(new java.awt.Color(140, 162, 192));
        jPinferior.setPreferredSize(new java.awt.Dimension(1101, 50));
        jPinferior.setLayout(new java.awt.GridBagLayout());

        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });
        jPinferior.add(btnVender, new java.awt.GridBagConstraints());

        Muestra.add(jPinferior, java.awt.BorderLayout.PAGE_END);

        jPcentral.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jPcentral.setLayout(new java.awt.GridLayout(3, 5));

        jPanel2.setBackground(new java.awt.Color(140, 162, 192));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel2.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setToolTipText("Click");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel1);

        jPcentral.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(140, 162, 192));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel3.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setToolTipText("Click");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2);

        jPcentral.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(140, 162, 192));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel4.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jLabel3.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setToolTipText("Click");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel3);

        jPcentral.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(140, 162, 192));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel5.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jLabel4.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setToolTipText("Click");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel4);

        jPcentral.add(jPanel5);

        jPanel7.setBackground(new java.awt.Color(140, 162, 192));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel7.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        jLabel5.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel5);

        jPcentral.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(140, 162, 192));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel8.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jLabel14.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setToolTipText("Click");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel14);

        jPcentral.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(140, 162, 192));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel9.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        jLabel15.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setToolTipText("Click");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel15);

        jPcentral.add(jPanel9);

        jPanel11.setBackground(new java.awt.Color(140, 162, 192));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel11.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jPanel11.setLayout(new java.awt.GridLayout(1, 0));

        jLabel16.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setToolTipText("Click");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel16);

        jPcentral.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(140, 162, 192));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel12.setToolTipText("");
        jPanel12.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jPanel12.setLayout(new java.awt.GridLayout(1, 0));

        jLabel17.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setToolTipText("Click");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel17);

        jPcentral.add(jPanel12);

        jPanel6.setBackground(new java.awt.Color(140, 162, 192));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel6.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jLabel18.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel18);

        jPcentral.add(jPanel6);

        jPanel13.setBackground(new java.awt.Color(140, 162, 192));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel13.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jPanel13.setLayout(new java.awt.GridLayout(1, 0));

        jLabel19.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setToolTipText("Click");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel13.add(jLabel19);

        jPcentral.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(140, 162, 192));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel14.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jPanel14.setLayout(new java.awt.GridLayout(1, 0));

        jLabel20.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setToolTipText("Click");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel14.add(jLabel20);

        jPcentral.add(jPanel14);

        jPanel18.setBackground(new java.awt.Color(140, 162, 192));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel18.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jPanel18.setLayout(new java.awt.GridLayout(1, 0));

        jLabel21.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setToolTipText("Click");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel18.add(jLabel21);

        jPcentral.add(jPanel18);

        jPanel19.setBackground(new java.awt.Color(140, 162, 192));
        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel19.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jPanel19.setLayout(new java.awt.GridLayout(1, 0));

        jLabel22.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setToolTipText("Click");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel19.add(jLabel22);

        jPcentral.add(jPanel19);

        jPanel20.setBackground(new java.awt.Color(140, 162, 192));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel20.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jPanel20.setLayout(new java.awt.GridLayout(1, 0));

        jLabel23.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel20.add(jLabel23);

        jPcentral.add(jPanel20);

        Muestra.add(jPcentral, java.awt.BorderLayout.CENTER);

        getContentPane().add(Muestra);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static void muestraPanel(JPanel p) {
        Muestra.removeAll();
        Muestra.add(p, BorderLayout.CENTER);
        Muestra.revalidate();
        Muestra.repaint();

    }
    private void labelTresPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTresPMouseClicked
        config.setAlwaysOnTop(true); // Siempre encima
        config.setSize(300, 200);
        config.setLocationRelativeTo(null); // Centrar el diálogo
        config.setVisible(true);

    }//GEN-LAST:event_labelTresPMouseClicked

    private void labelTresPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTresPMouseEntered
        labelTresP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/TresPBlack.png")));
    }//GEN-LAST:event_labelTresPMouseEntered

    private void labelTresPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTresPMouseExited
        labelTresP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/TresPWhiteN.png")));
    }//GEN-LAST:event_labelTresPMouseExited

    private void SmodelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SmodelMouseClicked

    }//GEN-LAST:event_SmodelMouseClicked

    private void SmodelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SmodelMouseEntered
        Smodel.setForeground(Color.blue);
    }//GEN-LAST:event_SmodelMouseEntered

    private void SmodelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SmodelMouseExited
        Smodel.setForeground(Color.black);
    }//GEN-LAST:event_SmodelMouseExited

    private void SmodelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmodelActionPerformed
        Search.requestFocus();
        BtnSearch.doClick();
    }//GEN-LAST:event_SmodelActionPerformed

    private void SnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SnameMouseEntered
        Sname.setForeground(Color.blue);
    }//GEN-LAST:event_SnameMouseEntered

    private void SnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SnameMouseExited
        Sname.setForeground(Color.black);
    }//GEN-LAST:event_SnameMouseExited

    private void SnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SnameActionPerformed
        Search.requestFocus();
        BtnSearch.doClick();
    }//GEN-LAST:event_SnameActionPerformed

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
        char key = evt.getKeyChar();
        String sea = Search.getText();
        if (!sea.isEmpty()) {
            if (key == VK_ENTER) {
                BtnSearch.doClick();
            }
        }

    }//GEN-LAST:event_SearchKeyReleased

    private void BtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchActionPerformed
        Search.requestFocus();
        Search.setText(Search.getText().replaceAll("[^" + logica.sinEspeciales.replace("^", "").replace("+", "") + "]", ""));
        select();

    }//GEN-LAST:event_BtnSearchActionPerformed
    private void select() {
        String Searched = Search.getText().toUpperCase();
        if (Sid.isSelected()) {
            Controlador.logica.buscaPv(Searched);
            llenaShop(Controlador.logica.pv);
        } else if (Smodel.isSelected()) {
            Controlador.logica.buscaPvm(Searched);
            llenaShop(Controlador.logica.pv);
        } else if (Sname.isSelected()) {
            Controlador.logica.buscaPvname(Searched);
            llenaShop(Controlador.logica.pv);
        }
    }
    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        venta.setAlwaysOnTop(true); // Siempre encima
        venta.setSize(737, 537);
        venta.setLocationRelativeTo(null); // Centrar el diálogo
        venta.setVisible(true);
    }//GEN-LAST:event_btnVenderActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int answ = JOptionPane.showConfirmDialog(this, "¿Estas seguro de salir?", "!?", JOptionPane.YES_NO_OPTION);
        if (answ == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void labelVacioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelVacioMouseClicked
        InicioFrame inicio = new InicioFrame();
        inicio.setVisible(true);
        inicio.setSize(this.getSize());
        this.setVisible(false);

    }//GEN-LAST:event_labelVacioMouseClicked
    private void mouseclick() {
        venta.setAlwaysOnTop(true); // Siempre encima
        venta.setSize(837, 537);
        venta.setLocationRelativeTo(null); // Centrar el diálogo
        venta.setVisible(true);

    }
    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        EditaPerfil.setAlwaysOnTop(true); // Siempre encima
        EditaPerfil.setSize(538, 342);
        EditaPerfil.setLocationRelativeTo(null); // Centrar el diálogo
        config.setVisible(false);
        llenaPerfil();
        EditaPerfil.setVisible(true);
    }//GEN-LAST:event_editActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login log = new Login();
        log.setVisible(true);
        config.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String telefono = txtPhone.getText();
        String mail = txtEmail.getText();
        String ubicacion = txtUbicacion.getText();

        if (telefono.isEmpty() || mail.isEmpty() || ubicacion.isEmpty()) {
            EditaPerfil.setVisible(false);
            config.setVisible(false);
            JOptionPane.showMessageDialog(null, "Cambios realizados exitosamente");

        } else {

            Modelo.Updates.contactoEmpleado(Controlador.logica.idNow, ubicacion, mail, telefono);
            EditaPerfil.setVisible(false);
            config.setVisible(false);

        }
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void GoToInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoToInMouseClicked
        InicioFrame inicio = new InicioFrame();
        inicio.setVisible(true);
        inicio.setSize(this.getSize());
        this.setVisible(false);
    }//GEN-LAST:event_GoToInMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        String content = jLabel1.getText();
        process(content);
        getFecha();
//        btnVender.doClick();
        String[] s = existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(venta, "El auto se ha agotado por el momento quedan 0 unidades");
            venta.setVisible(false);
        } else {
            btnVender.doClick();
        }
    }//GEN-LAST:event_jLabel1MouseClicked
    public static void getFecha() {
        String hf = labelTresP.getText();
        String[] fechaHora = hf.split(" ");
        txtFecha.setText(fechaHora[0]);

    }

    public static void process(String content) {
        if (Sid.isSelected()) {
            logica.llenaVentaID(content);
        } else if (Smodel.isSelected()) {

            logica.llenaVentaModelo(content);
        } else if (Sname.isSelected()) {
            logica.llenaVentaBrand(content);
        }
    }

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered

    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        String content = jLabel2.getText();
        process(content);
        getFecha();
//        btnVender.doClick(); 
        String[] s = existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(venta, "El auto se ha agotado por el momento quedan 0 unidades");
            venta.setVisible(false);
        } else {
            btnVender.doClick();
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        String content = jLabel3.getText();
        process(content);// TODO add your handling code here:
        getFecha();
        String[] s = existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(venta, "El auto se ha agotado por el momento quedan 0 unidades");
            venta.setVisible(false);
        } else {
            btnVender.doClick();
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        String content = jLabel4.getText();
        process(content);
        getFecha();

        String[] s = existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(venta, "El auto se ha agotado por el momento quedan 0 unidades");
            venta.setVisible(false);
        } else {
            btnVender.doClick();
        }

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        String content = jLabel5.getText();
        process(content);
        getFecha();
        String[] s = existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(venta, "El auto se ha agotado por el momento quedan 0 unidades");
            venta.setVisible(false);
        } else {
            btnVender.doClick();
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked

        String content = jLabel14.getText();
        process(content);
        getFecha();
        String[] s = existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(venta, "El auto se ha agotado por el momento quedan 0 unidades");
            venta.setVisible(false);
        } else {
            btnVender.doClick();
        }
//        btnVender.doClick();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked

        String content = jLabel15.getText();
        process(content);
        getFecha();
        String[] s = existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(venta, "El auto se ha agotado por el momento quedan 0 unidades");
            venta.setVisible(false);
        } else {
            btnVender.doClick();
        }
        //btnVender.doClick();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked

        String content = jLabel16.getText();
        process(content);
        getFecha();
        String[] s = existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(venta, "El auto se ha agotado por el momento quedan 0 unidades");
            venta.setVisible(false);
        } else {
            btnVender.doClick();
        }
        //btnVender.doClick();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked

        String content = jLabel17.getText();
        process(content);
        getFecha();
        String[] s = existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(venta, "El auto se ha agotado por el momento quedan 0 unidades");
            venta.setVisible(false);
        } else {
            btnVender.doClick();
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked

        String content = jLabel18.getText();
        process(content);
        getFecha();
        String[] s = existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(venta, "El auto se ha agotado por el momento quedan 0 unidades");
            venta.setVisible(false);
        } else {
            btnVender.doClick();
        }
        // btnVender.doClick();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked

        String content = jLabel19.getText();
        process(content);
        getFecha();
        String[] s = existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(venta, "El auto se ha agotado por el momento quedan 0 unidades");
            venta.setVisible(false);
        } else {
            btnVender.doClick();
        }
        // btnVender.doClick();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked

        String content = jLabel20.getText();
        process(content);
        getFecha();
        String[] s = existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(venta, "El auto se ha agotado por el momento quedan 0 unidades");
            venta.setVisible(false);
        } else {
            btnVender.doClick();
        }
        //btnVender.doClick();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked

        String content = jLabel21.getText();
        process(content);
        getFecha();
        String[] s = existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(venta, "El auto se ha agotado por el momento quedan 0 unidades");
            venta.setVisible(false);
        } else {
            btnVender.doClick();
        }
        //btnVender.doClick();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked

        String content = jLabel22.getText();
        process(content);
        getFecha();
        String[] s = existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(venta, "El auto se ha agotado por el momento quedan 0 unidades");
            venta.setVisible(false);
        } else {
            btnVender.doClick();
        }
        // btnVender.doClick();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked

        String content = jLabel23.getText();
        process(content);
        getFecha();
        String[] s = existence.getText().split(":");
        int e = Integer.parseInt(s[1]);
        if (!(e >= 1)) {
            JOptionPane.showMessageDialog(venta, "El auto se ha agotado por el momento quedan 0 unidades");
            venta.setVisible(false);
        } else {
            btnVender.doClick();
        }
        // btnVender.doClick();
    }//GEN-LAST:event_jLabel23MouseClicked

    private void SidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidActionPerformed
        Search.requestFocus();
        BtnSearch.doClick();
    }//GEN-LAST:event_SidActionPerformed

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        config.setAlwaysOnTop(true); // Siempre encima
        config.setSize(300, 200);
        config.setLocationRelativeTo(null); // Centrar el diálogo
        config.setVisible(true);
    }//GEN-LAST:event_userMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        config.setVisible(false);
        Historial.setLocationRelativeTo(null);
        Historial.setAlwaysOnTop(true);
        Files.muestraHistorial();
        Historial.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton2.doClick();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void SearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyTyped
        if (Sname.isSelected()) {
            char c = evt.getKeyChar();

            // Solo permitir números y controlar la longitud
            if (!Character.isDigit(c) || Search.getText().length() >= 10) {
                evt.consume(); // Bloquea la entrada inválida
                return;
            }
        }
    }//GEN-LAST:event_SearchKeyTyped

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
        char c = evt.getKeyChar();

        // Solo permitir números y controlar la longitud
        if (!Character.isDigit(c) || txtPhone.getText().length() >= 10) {
            evt.consume(); // Bloquea la entrada inválida
            return;
        }
    }//GEN-LAST:event_txtPhoneKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyTyped

    private void btnRegistraClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraClienteActionPerformed
        String id = txtClienteId.getText();
        String tel = txtTelefonoC.getText();
        String nom = txtNombreC.getText();
        String apP = txtApellidoP.getText();
        String apM = txtApellidoM.getText();
        String dir = txtDireccionC.getText();
        logica.registraCliente(id, tel, nom, apP, apM, dir);
    }//GEN-LAST:event_btnRegistraClienteActionPerformed

    private void btnSearchClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchClienteActionPerformed
        String id = txtClienteId.getText().toUpperCase();
        if (!id.isEmpty() && id.length() > 17 && id.length() < 19) {
            logica.buscaClienteId(id);
        } else
            JOptionPane.showMessageDialog(venta, "El id  del cliente debe tener 18 caracteres", "Sugerencia!", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnSearchClienteActionPerformed

    private void txtNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        if (cantidadVender > 1) {
            cantidadVender--;
            cantidad.setText("x_" + cantidadVender);
            String pre = txtMonto.getText();
            double precioPlus = Double.parseDouble(pre);
            txtMonto.setText("" + (precioPlus - precio));
            //        double precioAux=precio/cantidadVender;
            //        if(cantidadVender>1){
            //            precio=precio-precioAux;
            //        }
            //        txtMonto.setText(""+precio);
        }
    }//GEN-LAST:event_minusActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        String[] x = existence.getText().split(":");
        int max = Integer.parseInt(x[1]);
        if (cantidadVender < max) {
            cantidadVender++;
            cantidad.setText("x_" + cantidadVender);
            String precioPlus = txtMonto.getText();
            double prec = Double.parseDouble(precioPlus);
            txtMonto.setText("" + (prec + precio));
        }
    }//GEN-LAST:event_plusActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        jButton6.doClick();
    }//GEN-LAST:event_txtMontoActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtDescuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyTyped
        char c = evt.getKeyChar();

        // Solo permitir números y controlar la longitud
        if (!Character.isDigit(c)) {
            evt.consume(); // Bloquea la entrada inválida
            return;
        }
    }//GEN-LAST:event_txtDescuentoKeyTyped

    private void txtDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentoActionPerformed
        btnDescuento.doClick();
    }//GEN-LAST:event_txtDescuentoActionPerformed

    private void txtDireccionCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionCKeyTyped

        String texto = txtApellidoP.getText();
        if (!texto.matches(logica.descripciones)) {
            // Filtrar solo los caracteres válidos
            txtApellidoP.setText(texto.replaceAll("[^" + logica.descripciones.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtDireccionCKeyTyped

    private void txtNombreCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCKeyTyped
        char c = evt.getKeyChar();

        // Solo permitir números y controlar la longitud
        if (Character.isDigit(c)) {
            evt.consume(); // Bloquea la entrada inválida
            return;
        }

        String texto = txtNombreC.getText();
        if (!texto.matches(logica.nombress)) {
            // Filtrar solo los caracteres válidos
            txtNombreC.setText(texto.replaceAll("[^" + logica.nombress.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtNombreCKeyTyped

    private void txtApellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMKeyTyped
        char c = evt.getKeyChar();

        // Solo permitir números y controlar la longitud
        if (Character.isDigit(c)) {
            evt.consume(); // Bloquea la entrada inválida
            return;
        }

        String texto = txtApellidoM.getText();
        if (!texto.matches(logica.nombress)) {
            // Filtrar solo los caracteres válidos
            txtApellidoM.setText(texto.replaceAll("[^" + logica.nombress.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtApellidoMKeyTyped

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        venta.setVisible(false);
        cleanTxt();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (!txtClienteId.getText().isEmpty() && !txtTelefonoC.getText().isEmpty()
                && !txtNombreC.getText().isEmpty() && !txtApellidoP.getText().isEmpty()
                && !txtDireccionC.getText().isEmpty()) {
            String id = txtClienteId.getText().toUpperCase();
            if (!id.isEmpty() && id.length() > 17 && id.length() < 19) {

            } else {
                JOptionPane.showMessageDialog(venta, "El id  del cliente debe tener 18 caracteres", "Sugerencia!", JOptionPane.WARNING_MESSAGE);
            }

            btnRegistraCliente.doClick();
            logica.registraAll();
            String[] cant = cantidad.getText().split("_");

            Files.generarFactura(txtClienteId.getText(), txtNombreC.getText(),
                    txtApellidoP.getText(), txtApellidoM.getText(), txtTelefonoC.getText(),
                     txtDireccionC.getText(), txtFecha.getText(), txtId.getText(),
                    txtN.getText(), txtTipo.getText(), txtMarca.getText(), txtColor.getText(),
                     txtAnio.getText(), txtModelo.getText(), Integer.parseInt(cant[1]),
                    Double.parseDouble(txtPrecio.getText()), Double.parseDouble(lbdes2.getText()));
            cleanTxt();
            factura.setAlwaysOnTop(true);
            factura.setLocationRelativeTo(null);
            factura.setVisible(true);
            venta.setVisible(false);

            venta.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(venta, "Hay al menos un campo obligatorio vacio");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMouseClicked

    }//GEN-LAST:event_txtFechaMouseClicked

    private void txtApellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPKeyTyped
        char c = evt.getKeyChar();

        // Solo permitir números y controlar la longitud
        if (Character.isDigit(c)) {
            evt.consume(); // Bloquea la entrada inválida
            return;
        }

        String texto = txtApellidoP.getText();
        if (!texto.matches(logica.nombress)) {
            // Filtrar solo los caracteres válidos
            txtApellidoP.setText(texto.replaceAll("[^" + logica.nombress.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtApellidoPKeyTyped

    private void txtTelefonoCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoCKeyTyped
        char c = evt.getKeyChar();

        // Solo permitir números y controlar la longitud
        if (!Character.isDigit(c) || txtTelefonoC.getText().length() >= 10) {
            evt.consume(); // Bloquea la entrada inválida
            return;
        }
    }//GEN-LAST:event_txtTelefonoCKeyTyped

    private void txtClienteIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteIdKeyTyped

        if (txtClienteId.getText().length() >= 18) {
            evt.consume();
            return;
        }
        String texto = txtClienteId.getText().toUpperCase();
        txtClienteId.setText(texto);
        if (!texto.matches(logica.sinEspeciales)) {
            // Filtrar solo los caracteres válidos
            txtClienteId.setText(texto.replaceAll("[^" + logica.sinEspeciales.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtClienteIdKeyTyped

    private void btnDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescuentoActionPerformed
        double tl = Double.parseDouble(txtMonto.getText());
        double dc = Double.parseDouble(txtDescuento.getText());

        if ((tl / 2) > dc) {
            double total = tl - dc;
            txtMonto.setText(String.valueOf(total)); // Mantiene el formato decimal
            lbdes2.setText("" + dc);
            lbdes.setLocation(txtDescuento.getLocation());
            txtDescuento.setVisible(false);
            btnDescuento.setVisible(false);

        }
    }//GEN-LAST:event_btnDescuentoActionPerformed

    private void downloadPdfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downloadPdfMouseClicked
        String nompdf = "Facturas\\Factura_" + txtClienteId.getText() + ".pdf";
        Files.convertirTxtAPdf("factura.txt", nompdf);
        factura.setVisible(false);
        JOptionPane.showMessageDialog(null, "PDF Descargado con éxito.", "Good", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_downloadPdfMouseClicked
    private void cleanTxt() {
        txtClienteId.setText("");
        txtTelefonoC.setText("");
        txtNombreC.setText("");
        txtApellidoP.setText("");
        txtApellidoM.setText("");
        txtDireccionC.setText("");
        txtDescuento.setText("0");
        txtDescuento.setVisible(true);
        btnDescuento.setVisible(true);
    }
    private void chooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chooserActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        factura.setVisible(false);
    }//GEN-LAST:event_btnOkActionPerformed

    private void ventaWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ventaWindowClosing
        cleanTxt();
    }//GEN-LAST:event_ventaWindowClosing

    private void txtClienteIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteIdActionPerformed
        txtTelefonoC.requestFocus();
    }//GEN-LAST:event_txtClienteIdActionPerformed

    private void txtTelefonoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoCActionPerformed
        txtNombreC.requestFocus();
    }//GEN-LAST:event_txtTelefonoCActionPerformed

    private void txtNombreCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCActionPerformed
        txtApellidoP.requestFocus();
    }//GEN-LAST:event_txtNombreCActionPerformed

    private void txtApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoPActionPerformed
        txtApellidoM.requestFocus();
    }//GEN-LAST:event_txtApellidoPActionPerformed

    private void txtApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMActionPerformed
        txtDireccionC.requestFocus();
    }//GEN-LAST:event_txtApellidoMActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        txtDescuento.requestFocus();
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        txtUbicacion.requestFocus();
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacionActionPerformed
        txtEmail.requestFocus();
    }//GEN-LAST:event_txtUbicacionActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        txtPhone.requestFocus();
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        jButton10.doClick();
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        BtnSearch.doClick();
    }//GEN-LAST:event_SearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BtnSearch;
    public static javax.swing.JDialog EditaPerfil;
    public static javax.swing.JLabel GoToIn;
    private javax.swing.JDialog Historial;
    public static javax.swing.JPanel Muestra;
    public static javax.swing.JTextField Search;
    public static javax.swing.JToggleButton Sid;
    public static javax.swing.JToggleButton Smodel;
    public static javax.swing.JToggleButton Sname;
    public static javax.swing.JButton btnDescuento;
    private javax.swing.JButton btnOk;
    public static javax.swing.JButton btnRegistraCliente;
    public static javax.swing.JButton btnSearchCliente;
    public static javax.swing.JButton btnVender;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JLabel cantidad;
    public static javax.swing.JFileChooser chooser;
    public static javax.swing.JDialog config;
    private javax.swing.JLabel downloadPdf;
    public static javax.swing.JButton edit;
    public static javax.swing.JLabel existence;
    private javax.swing.JDialog factura;
    public static javax.swing.ButtonGroup group;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton6;
    public static javax.swing.JButton jButton7;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel19;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel20;
    public static javax.swing.JLabel jLabel21;
    public static javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel23;
    public static javax.swing.JLabel jLabel24;
    public static javax.swing.JLabel jLabel25;
    public static javax.swing.JLabel jLabel26;
    public static javax.swing.JLabel jLabel28;
    public static javax.swing.JLabel jLabel29;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel30;
    public static javax.swing.JLabel jLabel31;
    public static javax.swing.JLabel jLabel32;
    public static javax.swing.JLabel jLabel33;
    public static javax.swing.JLabel jLabel34;
    public static javax.swing.JLabel jLabel35;
    public static javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    public static javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPcentral;
    private javax.swing.JPanel jPinferior;
    private javax.swing.JPanel jPsuper;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel labelSeparador;
    public static javax.swing.JLabel labelSeparador1;
    public static javax.swing.JLabel labelTresP;
    public static javax.swing.JLabel labelVacio;
    private javax.swing.JLabel labelvacio2;
    public static javax.swing.JLabel lbdes;
    public static javax.swing.JLabel lbdes2;
    public static javax.swing.JButton minus;
    public static javax.swing.JButton plus;
    public static javax.swing.JDialog saveFile;
    public static javax.swing.JTextArea txtAhistorial;
    public static javax.swing.JTextField txtAnio;
    public static javax.swing.JTextField txtApellidoM;
    public static javax.swing.JTextField txtApellidoP;
    public static javax.swing.JTextField txtClienteId;
    public static javax.swing.JTextField txtColor;
    public static javax.swing.JTextField txtDescuento;
    public static javax.swing.JTextField txtDireccionC;
    public static javax.swing.JTextField txtEmail;
    public static javax.swing.JTextField txtFecha;
    public static javax.swing.JTextField txtID;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtMarca;
    public static javax.swing.JTextField txtModelo;
    public static javax.swing.JTextField txtMonto;
    public static javax.swing.JTextField txtN;
    public static javax.swing.JTextField txtNombreC;
    public static javax.swing.JTextField txtPhone;
    public static javax.swing.JTextField txtPrecio;
    public static javax.swing.JTextField txtTelefonoC;
    public static javax.swing.JTextField txtTipo;
    public static javax.swing.JTextField txtUbicacion;
    public static javax.swing.JLabel user;
    public static javax.swing.JDialog venta;
    // End of variables declaration//GEN-END:variables
}
