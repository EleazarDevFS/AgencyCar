package Vista;

import Controlador.logica;
import static Controlador.logica.mkmodel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Inventario extends javax.swing.JFrame {


    public static DefaultTableModel modeloInventario = new DefaultTableModel();

    /**
     * Creates new form Inventario
     */
    public Inventario() {
        initComponents();
//        this.setLocationRelativeTo(null);
        grupo2.add(Sname);
        grupo2.add(Smodel);
        grupo2.add(Sserie);
        Sname.doClick();
        modeloInventario = mkmodel();
        tableInventario.setModel(modeloInventario);
        Object[] obj = {};
        obj = logica.consultaInv();
        user2.setText(Controlador.logica.userNow);
        returnConta.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        grupo2 = new javax.swing.ButtonGroup();
        updateV = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        txtUdescripcion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtUcantidad = new javax.swing.JTextField();
        txtUnoserie = new javax.swing.JTextField();
        btnActualizaI = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtUmodelo = new javax.swing.JTextField();
        btnDescartaI = new javax.swing.JButton();
        txtUprecio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtUnombre = new javax.swing.JTextField();
        comboMarca = new javax.swing.JComboBox<>();
        comboTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        comboColor = new javax.swing.JComboBox<>();
        Sanio = new javax.swing.JTextField();
        addNewCar = new javax.swing.JDialog();
        panel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNoSerie = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDescrip = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        txtCant = new javax.swing.JTextField();
        btnRegistra = new javax.swing.JButton();
        btnDescarta = new javax.swing.JButton();
        config = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPprincipal = new javax.swing.JPanel();
        jPsuper = new javax.swing.JPanel();
        returnConta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        user2 = new javax.swing.JLabel();
        jPizquierdo = new javax.swing.JPanel();
        jPbotones = new javax.swing.JPanel();
        btnConsulta = new javax.swing.JButton();
        btnNV = new javax.swing.JButton();
        btnActu = new javax.swing.JButton();
        btnElimina = new javax.swing.JButton();
        jPcentro = new javax.swing.JPanel();
        Pan2 = new javax.swing.JPanel();
        jPbuscador = new javax.swing.JPanel();
        Sname = new javax.swing.JToggleButton();
        Smodel = new javax.swing.JToggleButton();
        Sserie = new javax.swing.JToggleButton();
        Search2 = new javax.swing.JTextField();
        Searching2 = new javax.swing.JButton();
        jPtabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInventario = new javax.swing.JTable();

        updateV.setTitle("Actualiza");
        updateV.setBackground(new java.awt.Color(113, 161, 166));
        updateV.setModal(true);
        updateV.setSize(new java.awt.Dimension(1000, 100));
        updateV.getContentPane().setLayout(new javax.swing.OverlayLayout(updateV.getContentPane()));

        jPanel7.setBackground(new java.awt.Color(140, 162, 192));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        txtUdescripcion.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        txtUdescripcion.setPreferredSize(new java.awt.Dimension(150, 24));
        txtUdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUdescripcionActionPerformed(evt);
            }
        });
        txtUdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUdescripcionKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 3, 0);
        jPanel7.add(txtUdescripcion, gridBagConstraints);

        jLabel16.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel16.setText("Precio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        jPanel7.add(jLabel16, gridBagConstraints);

        jLabel17.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel17.setText("No. serie");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        jPanel7.add(jLabel17, gridBagConstraints);

        jLabel19.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel19.setText("Descripción");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        jPanel7.add(jLabel19, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel15.setText("Marca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        jPanel7.add(jLabel15, gridBagConstraints);

        jLabel18.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel18.setText("Tipo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        jPanel7.add(jLabel18, gridBagConstraints);

        txtUcantidad.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        txtUcantidad.setPreferredSize(new java.awt.Dimension(150, 24));
        txtUcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUcantidadActionPerformed(evt);
            }
        });
        txtUcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUcantidadKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 4.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel7.add(txtUcantidad, gridBagConstraints);

        txtUnoserie.setEditable(false);
        txtUnoserie.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        txtUnoserie.setFocusable(false);
        txtUnoserie.setPreferredSize(new java.awt.Dimension(150, 24));
        txtUnoserie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnoserieActionPerformed(evt);
            }
        });
        txtUnoserie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnoserieKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 4.0;
        jPanel7.add(txtUnoserie, gridBagConstraints);

        btnActualizaI.setBackground(new java.awt.Color(100, 150, 100));
        btnActualizaI.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        btnActualizaI.setText("Actualizar");
        btnActualizaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizaIActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        jPanel7.add(btnActualizaI, gridBagConstraints);

        jLabel20.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel20.setText("Cantidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        jPanel7.add(jLabel20, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel14.setText("Modelo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        jPanel7.add(jLabel14, gridBagConstraints);

        txtUmodelo.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        txtUmodelo.setPreferredSize(new java.awt.Dimension(150, 24));
        txtUmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUmodeloActionPerformed(evt);
            }
        });
        txtUmodelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUmodeloKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 4.0;
        jPanel7.add(txtUmodelo, gridBagConstraints);

        btnDescartaI.setBackground(new java.awt.Color(150, 80, 80));
        btnDescartaI.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        btnDescartaI.setText("Cancelar  ");
        btnDescartaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartaIActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        jPanel7.add(btnDescartaI, gridBagConstraints);

        txtUprecio.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        txtUprecio.setPreferredSize(new java.awt.Dimension(150, 24));
        txtUprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUprecioActionPerformed(evt);
            }
        });
        txtUprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUprecioKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        jPanel7.add(txtUprecio, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel13.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 20, 9);
        jPanel7.add(jLabel13, gridBagConstraints);

        txtUnombre.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        txtUnombre.setPreferredSize(new java.awt.Dimension(150, 24));
        txtUnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnombreActionPerformed(evt);
            }
        });
        txtUnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnombreKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        jPanel7.add(txtUnombre, gridBagConstraints);

        comboMarca.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        comboMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", "Audi", "BMW", "Chevrolet", "Ford", "Honda", "Hyundai", "Jeep", "Kia", "Mazda", "Mercedes-Benz", "Nissan", "Subaru", "Tesla", "Toyota", "Volkswagen" }));
        comboMarca.setPreferredSize(new java.awt.Dimension(140, 29));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        jPanel7.add(comboMarca, gridBagConstraints);

        comboTipo.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir...", "Sedán", "Pickup", "Hatchback", "SUV", "Wagon", "Deportivo" }));
        comboTipo.setPreferredSize(new java.awt.Dimension(140, 29));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        jPanel7.add(comboTipo, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Nimbus Mono PS", 0, 17)); // NOI18N
        jLabel4.setText("Año");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel7.add(jLabel4, gridBagConstraints);

        jLabel21.setFont(new java.awt.Font("Nimbus Mono PS", 0, 17)); // NOI18N
        jLabel21.setText("Color");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel7.add(jLabel21, gridBagConstraints);

        comboColor.setFont(new java.awt.Font("Nimbus Mono PS", 0, 15)); // NOI18N
        comboColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Azul", "Amarillo", "Verde", "Naranja", "Violeta", "Blanco", "Negro", "Gris", "Marrón", "Beige", "Rosa", "Celeste", "Turquesa", "Lila", "Dorado", "Plateado", "Fucsia", "Coral", "Mostaza" }));
        comboColor.setPreferredSize(new java.awt.Dimension(140, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        jPanel7.add(comboColor, gridBagConstraints);

        Sanio.setFont(new java.awt.Font("Nimbus Mono PS", 0, 15)); // NOI18N
        Sanio.setPreferredSize(new java.awt.Dimension(140, 28));
        Sanio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SanioKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        jPanel7.add(Sanio, gridBagConstraints);

        updateV.getContentPane().add(jPanel7);

        updateV.setModal(true);
        updateV.setLocationRelativeTo(null);

        addNewCar.setTitle("Agrega Nuevo Auto");
        addNewCar.setModal(true);
        addNewCar.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                addNewCarWindowClosing(evt);
            }
        });
        addNewCar.getContentPane().setLayout(new javax.swing.OverlayLayout(addNewCar.getContentPane()));

        panel1.setBackground(new java.awt.Color(140, 162, 192));
        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        panel1.setPreferredSize(new java.awt.Dimension(920, 70));
        panel1.setLayout(new java.awt.GridBagLayout());

        jLabel5.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel5.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 2, 9);
        panel1.add(jLabel5, gridBagConstraints);

        txtNombre.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(170, 24));
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 0);
        panel1.add(txtNombre, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel6.setText("Modelo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 4, 9);
        panel1.add(jLabel6, gridBagConstraints);

        txtModel.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        txtModel.setPreferredSize(new java.awt.Dimension(170, 24));
        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });
        txtModel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModelKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 4.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 0);
        panel1.add(txtModel, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel7.setText("Marca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 0, 9);
        panel1.add(jLabel7, gridBagConstraints);

        txtMarca.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        txtMarca.setPreferredSize(new java.awt.Dimension(170, 24));
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 4.0;
        panel1.add(txtMarca, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel8.setText("Precio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 2, 9);
        panel1.add(jLabel8, gridBagConstraints);

        txtPrecio.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecio.setPreferredSize(new java.awt.Dimension(170, 24));
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 0);
        panel1.add(txtPrecio, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel9.setText("No. serie");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 4, 9);
        panel1.add(jLabel9, gridBagConstraints);

        txtNoSerie.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        txtNoSerie.setPreferredSize(new java.awt.Dimension(170, 24));
        txtNoSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoSerieActionPerformed(evt);
            }
        });
        txtNoSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoSerieKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 4.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 0);
        panel1.add(txtNoSerie, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel10.setText("Tipo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 0, 9);
        panel1.add(jLabel10, gridBagConstraints);

        txtTipo.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        txtTipo.setPreferredSize(new java.awt.Dimension(170, 24));
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });
        txtTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 4.0;
        panel1.add(txtTipo, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel11.setText("Descripción");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 2, 9);
        panel1.add(jLabel11, gridBagConstraints);

        txtDescrip.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        txtDescrip.setPreferredSize(new java.awt.Dimension(170, 24));
        txtDescrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripActionPerformed(evt);
            }
        });
        txtDescrip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 0);
        panel1.add(txtDescrip, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel12.setText("Cantidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        panel1.add(jLabel12, gridBagConstraints);

        jTextField8.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        jTextField8.setPreferredSize(new java.awt.Dimension(130, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 4.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 0);
        panel1.add(jTextField8, gridBagConstraints);

        txtCant.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        txtCant.setPreferredSize(new java.awt.Dimension(170, 24));
        txtCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantActionPerformed(evt);
            }
        });
        txtCant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 4.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 0);
        panel1.add(txtCant, gridBagConstraints);

        btnRegistra.setBackground(new java.awt.Color(100, 150, 100));
        btnRegistra.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        btnRegistra.setText("Registrar");
        btnRegistra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistra.setPreferredSize(new java.awt.Dimension(160, 25));
        btnRegistra.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnRegistra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 4, 2, 4);
        panel1.add(btnRegistra, gridBagConstraints);

        btnDescarta.setBackground(new java.awt.Color(150, 80, 80));
        btnDescarta.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        btnDescarta.setText("Cancelar");
        btnDescarta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDescarta.setPreferredSize(new java.awt.Dimension(160, 25));
        btnDescarta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnDescarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 0);
        panel1.add(btnDescarta, gridBagConstraints);

        addNewCar.getContentPane().add(panel1);

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
            .addGap(0, 384, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 2, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 2, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        config.getContentPane().add(jPanel1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Inventario");
        setSize(new java.awt.Dimension(1180, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPprincipal.setLayout(new java.awt.BorderLayout());

        jPsuper.setBackground(new java.awt.Color(140, 162, 192));
        jPsuper.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        returnConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/vuel.png"))); // NOI18N
        returnConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnContaMouseClicked(evt);
            }
        });
        jPsuper.add(returnConta);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/Hous.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPsuper.add(jLabel2);

        jLabel1.setText("  ");
        jPsuper.add(jLabel1);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jPanel6.setForeground(new java.awt.Color(20, 20, 20));
        jPanel6.setMinimumSize(new java.awt.Dimension(700, 60));
        jPanel6.setPreferredSize(new java.awt.Dimension(700, 60));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(20, 20, 20));
        jLabel3.setText("Inventario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 200);
        jPanel6.add(jLabel3, gridBagConstraints);

        user2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/usuarioGrande.png"))); // NOI18N
        user2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user2MouseExited(evt);
            }
        });
        jPanel6.add(user2, new java.awt.GridBagConstraints());

        jPsuper.add(jPanel6);

        jPprincipal.add(jPsuper, java.awt.BorderLayout.PAGE_START);

        jPizquierdo.setBackground(new java.awt.Color(140, 162, 192));
        jPizquierdo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPizquierdo.setMinimumSize(new java.awt.Dimension(106, 16));
        jPizquierdo.setPreferredSize(new java.awt.Dimension(200, 556));

        jPbotones.setBackground(new java.awt.Color(255, 255, 255));
        jPbotones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPbotones.setPreferredSize(new java.awt.Dimension(190, 190));
        jPbotones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        btnConsulta.setBackground(new java.awt.Color(113, 161, 166));
        btnConsulta.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        btnConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/accept.png"))); // NOI18N
        btnConsulta.setText("Consultar");
        btnConsulta.setPreferredSize(new java.awt.Dimension(185, 35));
        btnConsulta.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnConsulta.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        jPbotones.add(btnConsulta);

        btnNV.setBackground(new java.awt.Color(113, 161, 166));
        btnNV.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        btnNV.setForeground(new java.awt.Color(255, 255, 255));
        btnNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/add.png"))); // NOI18N
        btnNV.setText("Nuevo");
        btnNV.setPreferredSize(new java.awt.Dimension(185, 35));
        btnNV.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnNV.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNVActionPerformed(evt);
            }
        });
        jPbotones.add(btnNV);

        btnActu.setBackground(new java.awt.Color(113, 161, 166));
        btnActu.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        btnActu.setForeground(new java.awt.Color(255, 255, 255));
        btnActu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/note_edit.png"))); // NOI18N
        btnActu.setText("Actualizar");
        btnActu.setPreferredSize(new java.awt.Dimension(185, 35));
        btnActu.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnActu.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnActu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActuActionPerformed(evt);
            }
        });
        jPbotones.add(btnActu);

        btnElimina.setBackground(new java.awt.Color(113, 161, 166));
        btnElimina.setFont(new java.awt.Font("Nimbus Mono PS", 0, 18)); // NOI18N
        btnElimina.setForeground(new java.awt.Color(255, 255, 255));
        btnElimina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/delete.png"))); // NOI18N
        btnElimina.setText("Eliminar");
        btnElimina.setPreferredSize(new java.awt.Dimension(185, 35));
        btnElimina.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnElimina.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });
        jPbotones.add(btnElimina);

        jPizquierdo.add(jPbotones);

        jPprincipal.add(jPizquierdo, java.awt.BorderLayout.LINE_START);

        jPcentro.setBackground(new java.awt.Color(255, 255, 255));
        jPcentro.setLayout(new javax.swing.BoxLayout(jPcentro, javax.swing.BoxLayout.Y_AXIS));

        Pan2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pan2.setLayout(new java.awt.BorderLayout());

        jPbuscador.setPreferredSize(new java.awt.Dimension(964, 60));

        Sname.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        Sname.setText("Nombre");
        jPbuscador.add(Sname);

        Smodel.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        Smodel.setText("Modelo");
        jPbuscador.add(Smodel);

        Sserie.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        Sserie.setText("No. serie");
        jPbuscador.add(Sserie);

        Search2.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        Search2.setPreferredSize(new java.awt.Dimension(600, 24));
        Search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search2ActionPerformed(evt);
            }
        });
        Search2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Search2KeyTyped(evt);
            }
        });
        jPbuscador.add(Search2);

        Searching2.setFont(new java.awt.Font("Nimbus Mono PS", 0, 14)); // NOI18N
        Searching2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Images/zoom.png"))); // NOI18N
        Searching2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Searching2ActionPerformed(evt);
            }
        });
        jPbuscador.add(Searching2);

        Pan2.add(jPbuscador, java.awt.BorderLayout.PAGE_START);

        jPtabla.setLayout(new javax.swing.OverlayLayout(jPtabla));

        tableInventario.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        tableInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Modelo", "Marca", "Precio", "No.serie", "Tipo", "Descripción", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableInventario);
        if (tableInventario.getColumnModel().getColumnCount() > 0) {
            tableInventario.getColumnModel().getColumn(0).setResizable(false);
            tableInventario.getColumnModel().getColumn(1).setResizable(false);
            tableInventario.getColumnModel().getColumn(2).setResizable(false);
            tableInventario.getColumnModel().getColumn(3).setResizable(false);
            tableInventario.getColumnModel().getColumn(4).setResizable(false);
            tableInventario.getColumnModel().getColumn(5).setResizable(false);
            tableInventario.getColumnModel().getColumn(6).setResizable(false);
            tableInventario.getColumnModel().getColumn(7).setResizable(false);
        }

        jPtabla.add(jScrollPane1);

        Pan2.add(jPtabla, java.awt.BorderLayout.CENTER);

        jPcentro.add(Pan2);

        jPprincipal.add(jPcentro, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPprincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        InicioFrame inicio = new InicioFrame();
        inicio.setSize(this.getSize());
        inicio.setLocation(this.getLocation());
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNVActionPerformed

        addNewCar.setAlwaysOnTop(true); // Siempre encima
        addNewCar.setSize(600, 300);
        addNewCar.setLocationRelativeTo(this); // Centrar el diálogo
        addNewCar.setVisible(true);
    }//GEN-LAST:event_btnNVActionPerformed

    private void btnRegistraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraActionPerformed
        String nombre = txtNombre.getText().trim();
    String precio = txtPrecio.getText().trim(); 
    String descrip = txtDescrip.getText().trim();
    String modelo = txtModel.getText().trim();
    String noserie = txtNoSerie.getText().trim();
    String cantidad = txtCant.getText().trim(); 
    String marca = txtMarca.getText().trim();
    String tipo = txtTipo.getText().trim();
        if (!nombre.isEmpty() && !precio.isEmpty() && !descrip.isEmpty() && !modelo.isEmpty()
                && !noserie.isEmpty() && !cantidad.isEmpty() && !marca.isEmpty() && !tipo.isEmpty()) {
            int cant = Integer.parseInt(cantidad);
            Double money = Double.parseDouble(precio);
            logica.insertInventario(tipo, descrip, cant, marca, modelo, noserie, money, nombre);
            addNewCar.setVisible(false);
            clearNewCar();
        } else {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistraActionPerformed

    private void btnDescartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartaActionPerformed
        addNewCar.setVisible(false);
        clearNewCar();
    }//GEN-LAST:event_btnDescartaActionPerformed
    private void clearNewCar(){
        txtNombre.setText("");
        txtNoSerie.setText("");
        txtMarca.setText("");
        txtModel.setText("");
        txtPrecio.setText("");
        txtTipo.setText("");
        txtDescrip.setText("");
        txtCant.setText("");
    }
    private void btnActuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActuActionPerformed
        if (tableInventario.getSelectedRow() != -1) {
            String st = (String) tableInventario.getValueAt(tableInventario.getSelectedRow(), 0);
            logica.actualizaI(st);
            updateV.setAlwaysOnTop(true); // Siempre encima
            updateV.setSize(600, 350);
            updateV.setLocationRelativeTo(this); // Centrar el diálogo
            updateV.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar al menos un elemnto de la tabla");
        }
    }//GEN-LAST:event_btnActuActionPerformed

    private void addNewCarWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_addNewCarWindowClosing
        btnActu.setVisible(true);
        btnElimina.setVisible(true);
    }//GEN-LAST:event_addNewCarWindowClosing

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int answ = JOptionPane.showConfirmDialog(this, "¿Estas seguro de salir?", "!?", JOptionPane.YES_NO_OPTION);
        if (answ == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        modeloInventario.setRowCount(0);
        tableInventario.setModel(modeloInventario);
        logica.consultaInv();

    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnActualizaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizaIActionPerformed
        String nombre = txtUnombre.getText(), precio = txtUprecio.getText(),
                descrip = txtUdescripcion.getText(), modelo = txtUmodelo.getText(),
                noserie = txtUnoserie.getText(), cantidad = txtUcantidad.getText(),
                marca = (String) comboMarca.getSelectedItem(), tipo = (String) comboTipo.getSelectedItem();
        String color=(String) comboColor.getSelectedItem();
        int anio=Integer.parseInt( Sanio.getText());
        if (!nombre.isEmpty() && !precio.isEmpty() && !descrip.isEmpty() && !modelo.isEmpty()
                && !noserie.isEmpty() && !cantidad.isEmpty() && !marca.isEmpty() && !tipo.isEmpty()&&anio>1900&&anio<3000) {
            
            int cant = Integer.parseInt(cantidad);
            Double money = Double.parseDouble(precio);
            
            String st = (String) tableInventario.getValueAt(tableInventario.getSelectedRow(), 0);
            
            if(!marca.equals("Elegir...")&&!tipo.equals("Elegir...")){
                logica.actuInventario(st, tipo, descrip, cant, marca, modelo, noserie, money, nombre,anio,color);
            }else{
                JOptionPane.showMessageDialog(updateV, "Debe seleccionar un tipo y una marca","WARNING", JOptionPane.WARNING_MESSAGE);
            }
            updateV.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(updateV, "Debe rellenar todos los campos el año debe ser mayor a 1900 y menor a 3000", "WARNING", JOptionPane.WARNING_MESSAGE);
        }

        //  updateV.setVisible(false);

    }//GEN-LAST:event_btnActualizaIActionPerformed

    private void btnDescartaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartaIActionPerformed
        updateV.setVisible(false);
    }//GEN-LAST:event_btnDescartaIActionPerformed

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
        if (tableInventario.getSelectedRow() != -1) {
            String idcar = (String) tableInventario.getValueAt(tableInventario.getSelectedRow(), 0);
            int seg=JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar el registro del vehiculo con id="+idcar);            
            if(seg==JOptionPane.YES_OPTION){
                Controlador.logica.deleteCar(idcar);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento de la tabla", "WARNING", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminaActionPerformed

    private void txtUcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUcantidadActionPerformed
      btnActualizaI.doClick();
    }//GEN-LAST:event_txtUcantidadActionPerformed

    private void Searching2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Searching2ActionPerformed
        String busca=Search2.getText().toUpperCase();
        if(Sname.isSelected()){
            busca=Search2.getText();
        }
            
        Search2.setText(busca);
        Search2.setText(busca.replaceAll("[^" + logica.sinEspeciales.replace("^", "").replace("+", "") + "]", ""));
        
        if (Sname.isSelected()) {
            String name = Search2.getText();
            if (!name.isEmpty()) {
                name=name.replaceAll("[^" + logica.sinEspeciales.replace("^", "").replace("+", "") + "]", "");
                Search2.setText(name.toUpperCase());
                Inventario.modeloInventario.setRowCount(0);
                logica.buscaNombre(name);
                if (tableInventario.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "No se encontrarón coincidencias");
                    btnConsulta.doClick();
                }
            }
        } else if (Smodel.isSelected()) {
            String modelo = Search2.getText();
            if (!modelo.isEmpty()) {
                modelo=modelo.replaceAll("[^" + logica.sinEspeciales.replace("^", "").replace("+", "") + "]", "");
                Search2.setText(modelo.toUpperCase());
                Inventario.modeloInventario.setRowCount(0);
                logica.buscaModelo(modelo);
                if (tableInventario.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "No se encontrarón coincidencias");
                    btnConsulta.doClick();
                }
            }
        } else if (Sserie.isSelected()) {
            String id = Search2.getText();
            if (!id.isEmpty()) {
                id=id.replaceAll("[^" + logica.sinEspeciales.replace("^", "").replace("+", "") + "]", "");
                Search2.setText(id.toUpperCase());
                Inventario.modeloInventario.setRowCount(0);
                logica.buscaId(id);
                if (tableInventario.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "No se encontrarón coincidencias");
                    btnConsulta.doClick();
                }
            }
        }
    }//GEN-LAST:event_Searching2ActionPerformed

    private void user2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user2MouseClicked
        config.setAlwaysOnTop(true); // Siempre encima
        config.setSize(442, 218);
        config.setLocationRelativeTo(null); // Centrar el diálogo
        config.setVisible(true);
    }//GEN-LAST:event_user2MouseClicked

    private void user2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user2MouseEntered

    }//GEN-LAST:event_user2MouseEntered

    private void user2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user2MouseExited

    }//GEN-LAST:event_user2MouseExited

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

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        String texto = txtNombre.getText();
        if (!texto.matches(logica.nombress)) {
            // Filtrar solo los caracteres válidos
            txtNombre.setText(texto.replaceAll("[^" + logica.nombress.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
         String texto = txtPrecio.getText();
        if (!texto.matches(logica.precios)) {
            // Filtrar solo los caracteres válidos
            txtPrecio.setText(texto.replaceAll("[^" + logica.precios.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtDescripKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripKeyTyped
         String texto = txtDescrip.getText();
        if (!texto.matches(logica.descripciones)) {
            // Filtrar solo los caracteres válidos
            txtDescrip.setText(texto.replaceAll("[^" + logica.descripciones.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtDescripKeyTyped

    private void txtModelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModelKeyTyped
         String texto = txtModel.getText();
        if (!texto.matches(logica.modelos)) {
            // Filtrar solo los caracteres válidos
            txtModel.setText(texto.replaceAll("[^" + logica.modelos.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtModelKeyTyped

    private void txtNoSerieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoSerieKeyTyped
         String texto = txtNoSerie.getText();
        if (!texto.matches(logica.serie)) {
            // Filtrar solo los caracteres válidos
            txtNoSerie.setText(texto.replaceAll("[^" + logica.serie.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtNoSerieKeyTyped

    private void txtCantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantKeyTyped
         String texto = txtCant.getText();
        if (!texto.matches(logica.cantidades)) {
            // Filtrar solo los caracteres válidos
            txtCant.setText(texto.replaceAll("[^" + logica.cantidades.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtCantKeyTyped

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
         String texto = txtMarca.getText();
        if (!texto.matches(logica.marcas)) {
            // Filtrar solo los caracteres válidos
            txtMarca.setText(texto.replaceAll("[^" + logica.marcas.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void txtTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoKeyTyped
         String texto = txtTipo.getText();
        if (!texto.matches(logica.tipos)) {
            // Filtrar solo los caracteres válidos
            txtTipo.setText(texto.replaceAll("[^" + logica.tipos.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtTipoKeyTyped

    private void txtUnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnombreKeyTyped
         char c = evt.getKeyChar();

        // Solo permitir números y controlar la longitud
        if (Character.isDigit(c) || txtUnombre.getText().length() >= 10) {
            evt.consume(); // Bloquea la entrada inválida
            return;
        }
        String texto = txtUnombre.getText();
        if (!texto.matches(logica.nombress)) {
            // Filtrar solo los caracteres válidos
            txtUnombre.setText(texto.replaceAll("[^" + logica.nombress.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtUnombreKeyTyped

    private void txtUprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUprecioKeyTyped
         char c = evt.getKeyChar();
         
        // Solo permitir números y controlar la longitud
        if (!Character.isDigit(c)) {
            evt.consume(); // Bloquea la entrada inválida
            return;
        }
        String texto = txtUprecio.getText();
        if (!texto.matches(logica.precios)) {
            // Filtrar solo los caracteres válidos
            txtUprecio.setText(texto.replaceAll("[^" + logica.precios.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtUprecioKeyTyped

    private void txtUdescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUdescripcionKeyTyped
        String texto = txtUdescripcion.getText();
        if (!texto.matches(logica.descripciones)) {
            // Filtrar solo los caracteres válidos
            txtUdescripcion.setText(texto.replaceAll("[^" + logica.descripciones.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtUdescripcionKeyTyped

    private void txtUmodeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUmodeloKeyTyped
        String texto = txtUmodelo.getText();
        if (!texto.matches(logica.modelos)) {
            // Filtrar solo los caracteres válidos
            txtUmodelo.setText(texto.replaceAll("[^" + logica.modelos.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtUmodeloKeyTyped

    private void txtUnoserieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnoserieKeyTyped
      String texto = txtUnoserie.getText();
        if (!texto.matches(logica.serie)) {
            // Filtrar solo los caracteres válidos
            txtUnoserie.setText(texto.replaceAll("[^" + logica.serie.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtUnoserieKeyTyped

    private void txtUcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUcantidadKeyTyped
         char c = evt.getKeyChar();

        // Solo permitir números y controlar la longitud
        if (!Character.isDigit(c) || txtUcantidad.getText().length() >= 10) {
            evt.consume(); // Bloquea la entrada inválida
            return;
        }
        String texto = txtUcantidad.getText();
        if (!texto.matches(logica.cantidades)) {
            // Filtrar solo los caracteres válidos
            txtUcantidad.setText(texto.replaceAll("[^" + logica.cantidades.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_txtUcantidadKeyTyped

    private void Search2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search2KeyTyped
        
        if(Sserie.isSelected()){
            String txt=Search2.getText().toUpperCase();
            if (!txt.matches(logica.serie)) {
                // Filtrar solo los caracteres válidos
                Search2.setText(txt.replaceAll("[^" + logica.serie.replace("^", "").replace("+", "") + "]", ""));
            }else{
                Search2.setText(txt.replaceAll("[^" + logica.serie.replace("^", "").replace("+", "") + "]", ""));
            }
        }
        if(Sname.isSelected()){
            String txt=Search2.getText();
            if (!txt.matches(logica.serie)) {
                // Filtrar solo los caracteres válidos
                Search2.setText(txt.replaceAll("[^" + logica.serie.replace("^", "").replace("+", "") + "]", ""));
            }else{
                Search2.setText(txt.replaceAll("[^" + logica.serie.replace("^", "").replace("+", "") + "]", ""));
            }
        }
        if(Smodel.isSelected()){
            String txt=Search2.getText();
            if (!txt.matches(logica.serie)) {
                // Filtrar solo los caracteres válidos
                Search2.setText(txt.replaceAll("[^" + logica.serie.replace("^", "").replace("+", "") + "]", ""));
            }else{
                Search2.setText(txt.replaceAll("[^" + logica.serie.replace("^", "").replace("+", "") + "]", ""));
            }
        }
    }//GEN-LAST:event_Search2KeyTyped

    private void returnContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnContaMouseClicked
       Conta c = new Conta();
       c.setLocation(this.getLocation());
       c.setSize(this.getSize());
        c.setVisible(true);
        returnConta.setVisible(false);
        this.setVisible(false);
        
    }//GEN-LAST:event_returnContaMouseClicked

    private void txtUnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnombreActionPerformed
        txtUprecio.requestFocus();
    }//GEN-LAST:event_txtUnombreActionPerformed

    private void txtUprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUprecioActionPerformed
        txtUdescripcion.requestFocus();
    }//GEN-LAST:event_txtUprecioActionPerformed

    private void txtUdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUdescripcionActionPerformed
        txtUmodelo.requestFocus();
    }//GEN-LAST:event_txtUdescripcionActionPerformed

    private void txtUmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUmodeloActionPerformed
        txtUnoserie.requestFocus();
    }//GEN-LAST:event_txtUmodeloActionPerformed

    private void txtUnoserieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnoserieActionPerformed
       txtUcantidad.requestFocus();
    }//GEN-LAST:event_txtUnoserieActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtModel.requestFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        txtMarca.requestFocus();
    }//GEN-LAST:event_txtModelActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
       txtPrecio.requestFocus();
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        txtNoSerie.requestFocus();
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtNoSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoSerieActionPerformed
       txtTipo.requestFocus();
    }//GEN-LAST:event_txtNoSerieActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
       txtDescrip.requestFocus();
    }//GEN-LAST:event_txtTipoActionPerformed

    private void txtDescripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripActionPerformed
        txtCant.requestFocus();
    }//GEN-LAST:event_txtDescripActionPerformed

    private void txtCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantActionPerformed
        btnRegistra.doClick();
    }//GEN-LAST:event_txtCantActionPerformed

    private void Search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search2ActionPerformed
        Searching2.doClick();
    }//GEN-LAST:event_Search2ActionPerformed

    private void SanioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SanioKeyTyped
       char c = evt.getKeyChar();
         
        // Solo permitir números y controlar la longitud
        if (!Character.isDigit(c)) {
            evt.consume(); // Bloquea la entrada inválida
            return;
        }
        String texto = Sanio.getText();
        if (!texto.matches(logica.cantidades)) {
            // Filtrar solo los caracteres válidos
            Sanio.setText(texto.replaceAll("[^" + logica.cantidades.replace("^", "").replace("+", "") + "]", ""));
        }
    }//GEN-LAST:event_SanioKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Pan2;
    public static javax.swing.JTextField Sanio;
    public static javax.swing.JTextField Search2;
    public static javax.swing.JButton Searching2;
    public static javax.swing.JToggleButton Smodel;
    public static javax.swing.JToggleButton Sname;
    public static javax.swing.JToggleButton Sserie;
    public static javax.swing.JDialog addNewCar;
    private javax.swing.JButton btnActu;
    public static javax.swing.JButton btnActualizaI;
    public static javax.swing.JButton btnConsulta;
    public static javax.swing.JButton btnDescarta;
    public static javax.swing.JButton btnDescartaI;
    private javax.swing.JButton btnElimina;
    private javax.swing.JButton btnNV;
    public static javax.swing.JButton btnRegistra;
    public static javax.swing.JComboBox<String> comboColor;
    public static javax.swing.JComboBox<String> comboMarca;
    public static javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JDialog config;
    public static javax.swing.ButtonGroup grupo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    public static javax.swing.JPanel jPbotones;
    private javax.swing.JPanel jPbuscador;
    private javax.swing.JPanel jPcentro;
    private javax.swing.JPanel jPizquierdo;
    private javax.swing.JPanel jPprincipal;
    private javax.swing.JPanel jPsuper;
    private javax.swing.JPanel jPtabla;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField jTextField8;
    public static javax.swing.JPanel panel1;
    public static javax.swing.JLabel returnConta;
    public static javax.swing.JTable tableInventario;
    public static javax.swing.JTextField txtCant;
    public static javax.swing.JTextField txtDescrip;
    public static javax.swing.JTextField txtMarca;
    public static javax.swing.JTextField txtModel;
    public static javax.swing.JTextField txtNoSerie;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtPrecio;
    public static javax.swing.JTextField txtTipo;
    public static javax.swing.JTextField txtUcantidad;
    public static javax.swing.JTextField txtUdescripcion;
    public static javax.swing.JTextField txtUmodelo;
    public static javax.swing.JTextField txtUnombre;
    public static javax.swing.JTextField txtUnoserie;
    public static javax.swing.JTextField txtUprecio;
    public static javax.swing.JDialog updateV;
    public static javax.swing.JLabel user2;
    // End of variables declaration//GEN-END:variables
}
