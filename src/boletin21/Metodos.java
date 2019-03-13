package boletin21;


import Utils.PedirValor;
import java.util.ArrayList;



public class Metodos {
    
    Libros obx = new Libros();

public Libros crearLibro(){
    String n,t,cod;
    int p,u;
    n = PedirValor.pedirString("Introduce el nombre del autor del libro: ");
    t = PedirValor.pedirString("Introduce el titulo del libro: ");
    cod = PedirValor.pedirString("Introduce el ISBM del libro: ");
    p = PedirValor.enteiro("Introduce el precio del libro: ");
    u = PedirValor.enteiro("Introduce el numero de unidades del libro");
    Libros lib = new Libros(n, t, cod, p, u);
    return lib;
}

public void añadir(ArrayList<Libros>lis){
    Libros lib = crearLibro();
    int atopado = 0;
    for ( Libros libr : lis){
        if(lib.getISBN().equalsIgnoreCase(libr.getISBN())){
           lib.setUnidades(libr.getUnidades()+1);
           atopado = 1;
           break;
        }    
    }
    if (atopado == 0);
    lis.add(lib);
}

public void ver(ArrayList<Libros>lis){
    for(Libros lib: lis){
        System.out.println(lib);
    }
}

public void venderLibros (ArrayList<Libros>lis, String nombre){
    
    for ( Libros libr: lis){
        if (libr.getTitulo()== null ? nombre == null : libr.getTitulo().equals(nombre)){
                libr.setUnidades(libr.getUnidades() - 1);
        }
        break;
    }
}

public void eliminarLibros (ArrayList <Libros> lis){
    for (int i = 0; i < lis.size(); i++){
        lis.get(i);
        if (obx.getUnidades() == 0)
            lis.remove(i);
    }
    
}

}