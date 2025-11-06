
package Controlador;


import Vista.RegisterEmpleado;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;


public class SavePictures {
    private static final String RUTA_GUARDADO="/Controlador/fotos";

    public SavePictures(String ruta){
        cargarFoto(ruta);
    }
    
    private void cargarFoto(String ruta){
        File archivoFoto= new File(RUTA_GUARDADO);
        
        if(archivoFoto.exists()){
            Image ImaUser= new ImageIcon(ruta).getImage();
            ImageIcon iconofoto=new ImageIcon(ImaUser.getScaledInstance(45, 35, Image.SCALE_SMOOTH));
            RegisterEmpleado.user.setIcon(iconofoto);
            
        }else{
             RegisterEmpleado.user.setIcon(new ImageIcon("Vista/icons/Images/usuarioGrande.png"));
        }
    }
}
