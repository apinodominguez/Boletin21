package boletin21;

import Utils.PedirValor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Boletin21 {

    public static void main(String[] args) {
    
    ArrayList<Libros>lista = new ArrayList<>();
    Metodos obx = new Metodos();
    int op;
    
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("****MENU****\n 1 -> Visualizar libros disponibles\n2 -> Añadir nuevo libro\n3 -> Vender libros"));
            switch(op){
                case 1: obx.ver(lista);
                break;
                case 2: obx.añadir(lista);
                break;
                case 3: obx.venderLibros(lista, PedirValor.pedirString("Introduce el nombre del libro que se quiere vender: "));
                    obx.eliminarLibros(lista);
                break;
                case 4: 
                break;
            }
            
            
        }while (op < 8);
        
        
    }
    
}
