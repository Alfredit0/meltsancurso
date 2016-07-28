/**
 *
 * @author Alfredo Reyes
 * @version 1.0
 */
import javax.swing.JOptionPane;
import java.lang.*;

public class MyOwnJavaArray {
    //Constante del numero de nombre que se van a guardar
    private static final int NUMNOMBRES=3;
    //Constructor vacio
    public MyOwnJavaArray() {
    }
    
    public static void main(String[] args) {
        // Declara una matriz de dos dimensiones
        String names [][]= new String [NUMNOMBRES][2];        
        String longName="";
        //Recorre la matriz el numero de nombres en inserta nombre y apellido
        for (int i=0; i<NUMNOMBRES; i++) {                    
            names[i][0] = JOptionPane.showInputDialog("Ingresa tu nombre");
            names[i][1] = JOptionPane.showInputDialog("Ingresa tu apellido");
        }             
        //Ciclo For mediante el cual se dertermina el nombre mas largo
        for (int i = 0; i < NUMNOMBRES; i++) {
            if (names[i][0].length()>longName.length()) {
               longName=names[i][0];
            }
        }

        JOptionPane.showMessageDialog(null, "El nombre mas largo es: "+ longName);
    }
    
}