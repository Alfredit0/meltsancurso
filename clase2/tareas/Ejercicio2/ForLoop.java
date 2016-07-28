/**
 * Busca un nombre en un arreglo de nombres definidos
 * @author Alfredo Reyes
 * @version 1.0
 */
import javax.swing.JOptionPane;

public class ForLoop {
    
    //Constructor vacion de ForLoop
    public ForLoop() {
    }
    
    public static void main(String[] args) {
        // Declara e inicializa un arreglo de String
        String names []={"Beah","Bianca","Lance","Belle","Nico","Yza","Gem","Ethan"};
        
        //Lee el nombre que se va a buscar
        String searchName = JOptionPane.showInputDialog("Enter either \"Yza\" or \"noname\"!");
        
        //Variable de tipo boolean para definir el estado de la busqueda
        boolean foundName =false;
        
        //Se emplea un ciclo while para recorrer el arreglo
        // Busca el nombre leido en el arreglo
        // Para ello compara el nombre en la posicion i con el nombre ingresado
        // Si son iguales la variable boolean pasa a ser true
        int i=0;
        while ( i<names.length){
            if (names [i ].equals(searchName)){
                foundName =true;
                break;
            }
           i++;
        }
        
        //Imprime en pantalla si fue encontrado o no el nombre
        if (foundName)
            JOptionPane.showMessageDialog(null, searchName + " is found!");
        else
            JOptionPane.showMessageDialog(null, searchName + " is not found!");
        
    }
    
}