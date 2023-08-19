import java.util.Scanner;

public class contraseña {

    public static void main(String[] args){

        Scanner askpassword = new Scanner(System.in);
        
        final String contraseña= "elfierrogolpiadordeparejafilices";
        String datapasssword;

        do {
            //aqui se solicita la contraseña
            System.out.println("introduce la contraseña: ");
             datapasssword=askpassword.nextLine();
            
        } while (datapasssword.equals(contraseña)==false);  //.equals compadores de falso y verdadero
            System.out.println("contraseña correcta <3");

            askpassword.close();  
        
        //System.out.println("CUAL ES LA CONTRASSEÑA? =" + contraseña);
    }
    
}
