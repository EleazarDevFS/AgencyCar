package Vista;

import Controlador.Files;
import static Controlador.logica.searchUserNow;
import static Controlador.logica.userNow;
import Modelo.Conexion; //Modelo importacion
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import java.awt.BorderLayout;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Login extends javax.swing.JFrame {

    public static Conexion conn = new Conexion();
    private static boolean conOrno = false;
    public static boolean passC = false;
    public Login() {
        initComponents();
        pass.setEchoChar('*'); //Cambia el caracter para rremplazar passsword en el JPassword
        this.setLocationRelativeTo(null);
        nolook.setVisible(false);
        Files.getList();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Muestra = new javax.swing.JPanel();
        JP1 = new javax.swing.JPanel();
        labelInicioSesion = new javax.swing.JLabel();
        jLusuario = new javax.swing.JLabel();
        jLpassword = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        look = new javax.swing.JLabel();
        nolook = new javax.swing.JLabel();
        btnLogeo = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        JP2 = new javax.swing.JPanel();
        labelBienvenido = new javax.swing.JLabel();
        hrLogin = new javax.swing.JSeparator();
        logoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        setSize(new java.awt.Dimension(670, 370));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        Muestra.setBackground(new java.awt.Color(150, 180, 255));
        Muestra.setLayout(new javax.swing.BoxLayout(Muestra, javax.swing.BoxLayout.LINE_AXIS));

        JP1.setBackground(new java.awt.Color(140, 162, 192));
        JP1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JP1.setPreferredSize(new java.awt.Dimension(230, 0));
        JP1.setLayout(null);

        labelInicioSesion.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        labelInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        labelInicioSesion.setText("Inicio de sesión:");
        JP1.add(labelInicioSesion);
        labelInicioSesion.setBounds(50, 20, 143, 26);

        jLusuario.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLusuario.setForeground(new java.awt.Color(255, 255, 255));
        jLusuario.setText("Usuario:");
        JP1.add(jLusuario);
        jLusuario.setBounds(20, 80, 60, 20);

        jLpassword.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLpassword.setForeground(new java.awt.Color(255, 255, 255));
        jLpassword.setText("Contraseña:");
        JP1.add(jLpassword);
        jLpassword.setBounds(20, 140, 120, 20);

        pass.setFont(new java.awt.Font("DejaVu Sans Light", 1, 14)); // NOI18N
        pass.setToolTipText("Inserte su contraseña");
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passKeyReleased(evt);
            }
        });
        JP1.add(pass);
        pass.setBounds(20, 160, 177, 27);

        look.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ver.png"))); // NOI18N
        look.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lookMouseClicked(evt);
            }
        });
        JP1.add(look);
        look.setBounds(200, 150, 21, 40);

        nolook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ocultar.png"))); // NOI18N
        nolook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nolookMouseClicked(evt);
            }
        });
        JP1.add(nolook);
        nolook.setBounds(200, 160, 20, 20);

        btnLogeo.setBackground(new java.awt.Color(113, 161, 166));
        btnLogeo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogeo.setForeground(new java.awt.Color(255, 255, 255));
        btnLogeo.setText("Login");
        btnLogeo.setToolTipText("Iniciar sesión");
        btnLogeo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        btnLogeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogeoActionPerformed(evt);
            }
        });
        JP1.add(btnLogeo);
        btnLogeo.setBounds(50, 220, 120, 21);

        user.setFont(new java.awt.Font("Nimbus Mono PS", 0, 15)); // NOI18N
        user.setToolTipText("Inserte su usuario (ej: admin_adm)");
        JP1.add(user);
        user.setBounds(20, 100, 177, 28);

        Muestra.add(JP1);

        JP2.setBackground(new java.awt.Color(255, 255, 255));
        JP2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JP2.setPreferredSize(new java.awt.Dimension(470, 370));
        JP2.setLayout(null);

        labelBienvenido.setFont(new java.awt.Font("Nimbus Mono PS", 0, 48)); // NOI18N
        labelBienvenido.setText("¡Bienvenido!");
        JP2.add(labelBienvenido);
        labelBienvenido.setBounds(60, 20, 348, 60);

        hrLogin.setBackground(new java.awt.Color(150, 150, 150));
        hrLogin.setPreferredSize(new java.awt.Dimension(0, 4));
        JP2.add(hrLogin);
        hrLogin.setBounds(-10, 70, 480, 10);

        logoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logot.png"))); // NOI18N
        JP2.add(logoLogin);
        logoLogin.setBounds(110, 110, 250, 150);

        Muestra.add(JP2);

        getContentPane().add(Muestra);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //ActionPermormed para el boton "btnLogeo"
    private void btnLogeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogeoActionPerformed
      enterSesion();
    }//GEN-LAST:event_btnLogeoActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
//        prin.tp.setVisible(true);
    }//GEN-LAST:event_formComponentResized

    private void lookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lookMouseClicked
        look.setVisible(false);
        nolook.setVisible(true);
        pass.setEchoChar((char) 0);

    }//GEN-LAST:event_lookMouseClicked

    private void nolookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nolookMouseClicked
        nolook.setVisible(false);
        look.setVisible(true);
        pass.setEchoChar('*');
    }//GEN-LAST:event_nolookMouseClicked

    private void passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyReleased
        char key = evt.getKeyChar();
        if (key == VK_ENTER) {
            btnLogeo.doClick();
        }
    }//GEN-LAST:event_passKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int answ = JOptionPane.showConfirmDialog(this, "¿Estas seguro de salir?", "!?", JOptionPane.YES_NO_OPTION);
        if (answ == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing
    public static void muestraPanel(JPanel p) {
        Muestra.removeAll();
        Muestra.add(p, BorderLayout.CENTER);
        Muestra.revalidate();
        Muestra.repaint();

    }
    private void enterSesion(){
      String usuario = user.getText().trim();
        String password = String.valueOf(pass.getPassword());
        Conexion.setUser(usuario);
        Conexion.setPassword(password);
        String window = "";
        try {
            String[] windows = Conexion.getPassword().split("_");
            window = windows[1];
        } catch (Exception e) {

        }
        //System.out.println(Conexion.getUser() + " " + Conexion.getPassword());
        conOrno = conn.conectagency();//Abre conexion a la BD
        if (conOrno) {//Abre conexion a la BD
            String users = Conexion.getUser();
            if (window.equals("adm")) {
                InicioFrame ini = new InicioFrame();
                this.setVisible(false);               
                userNow = usuario;
                searchUserNow(Conexion.getPassword());
                ini.user.setText(Controlador.logica.userNow);
                ini.setVisible(true);
                
            } else if (window.equals("pv")) {
                Principal pv = new Principal();
                this.setVisible(false);            
                pv.setLocation(250, 50);
//                pv.setLocationRelativeTo(null);
                pv.setSize(900, 856);
                searchUserNow(Conexion.getPassword());
                userNow = usuario;
                pv.GoToIn.setVisible(false);
                pv.user.setText(Controlador.logica.userNow);
                pv.setVisible(true);
                
            } else if (window.equals("ct")) {

                Conta ct = new Conta();
                this.setVisible(false);
                ct.GoToIn.setVisible(false);
                
                searchUserNow(Conexion.getPassword());
                userNow = usuario;
                ct.user.setText(Controlador.logica.userNow);
                ct.setVisible(true);
                
            } else if (window.equals("rh")) {

                GestionEmpleados rh = new GestionEmpleados();
                rh.btnConsulta.doClick();
                rh.GoToIn.setVisible(false);
                this.setVisible(false);
                
                searchUserNow(Conexion.getPassword());
                userNow = usuario;
                rh.user.setText(Controlador.logica.userNow);
                rh.setVisible(true);
                
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            //GraphiteLookAndFeel
            //AeroLookAndFeel
            //Look and feel's que podriamos utilizar
            UIManager.setLookAndFeel(new AeroLookAndFeel()); // linea para cambiar LookAndFeel
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel JP1;
    public static javax.swing.JPanel JP2;
    public static javax.swing.JPanel Muestra;
    private javax.swing.JButton btnLogeo;
    private javax.swing.JSeparator hrLogin;
    private javax.swing.JLabel jLpassword;
    private javax.swing.JLabel jLusuario;
    private javax.swing.JLabel labelBienvenido;
    private javax.swing.JLabel labelInicioSesion;
    private javax.swing.JLabel logoLogin;
    private javax.swing.JLabel look;
    private javax.swing.JLabel nolook;
    private javax.swing.JPasswordField pass;
    public static javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
