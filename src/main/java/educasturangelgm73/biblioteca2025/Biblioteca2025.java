/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package educasturangelgm73.biblioteca2025;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

//oscar estuvo aqui
/**
 * Proyecto biblio epica
 * @author angel
 */
public class Biblioteca2025 {
 
    private ArrayList <Libro> libros;
    private ArrayList <Usuario> usuarios;
    private ArrayList <Prestamo> prestamos;
    private ArrayList <Prestamo> prestamosHist;

    public Biblioteca2025() {
        this.libros = new ArrayList();
        this.usuarios = new ArrayList();
        this.prestamos = new ArrayList();
        this.prestamosHist = new ArrayList();
    }
    
    public static void main(String[] args) {
       Biblioteca2025 b= new Biblioteca2025();
       b.cargaDatos(); 
       b.fueraPlazo();
       b.menu();
    }
    
    //<editor-fold defaultstate="collapsed" desc="MENUS">
    public void menu(){
        Scanner sc=new Scanner (System.in);
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tBIBLIOTECA\n");
            System.out.println("\t\t\t\t1 - LIBROS");
            System.out.println("\t\t\t\t2 - USUARIOS");
            System.out.println("\t\t\t\t3 - PRESTAMOS");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    menuLibros();
                    break;
                }    
                case 2:{
                    menuUsuarios();
                    break;
                } 
                case 3:{
                    menuPrestamos();
                    break;
                } 
            }
        }while (opcion != 9);
    }

    private void menuLibros() {
        Scanner sc=new Scanner (System.in);
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tLIBROS\n");
            System.out.println("\t\t\t\t1 - NUEVO LIBRO");
            System.out.println("\t\t\t\t2 - ELIMINAR LIBRO");
            System.out.println("\t\t\t\t3 - MODIFICAR LIBRO");
            System.out.println("\t\t\t\t4 - LISTADOS");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    nuevoLibro();
                    break;
                }    
                case 2:{
                    eliminarLibro();
                    break;
                } 
                case 3:{
                    modificarLibros();
                    break;
                } 
                case 4:{
                    listaLibros();
                    break;
                } 
            }
        }while (opcion != 9);
    }

    private void menuUsuarios() {
        Scanner sc=new Scanner (System.in);
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tUSUARIOS");
            System.out.println("\t\t\t\t1 - NUEVO USUARIO");
            System.out.println("\t\t\t\t2 - ELIMINAR USUARIO");
            System.out.println("\t\t\t\t3 - LISTADOS");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    nuevoUsuario();
                    break;
                }    
                case 2:{
                    eliminarUsuario();
                    break;
                } 
                case 3:{
                    listaUsuarios();
                    break;
                } 
                
            }
        }while (opcion != 9);
    }

    private void menuPrestamos() {
        Scanner sc=new Scanner (System.in);
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tPRESTAMOS\n");
            System.out.println("\t\t\t\t1 - NUEVO PRESTAMO");
            System.out.println("\t\t\t\t2 - DEVOLUCION PRESTAMO");
            System.out.println("\t\t\t\t3 - PRORROGAR PRESTAMO");
            System.out.println("\t\t\t\t4 - LISTADO GENERAL PRESTAMOS");
            System.out.println("\t\t\t\t5 - LISTADO PRESTAMOS USUARIO");
            System.out.println("\t\t\t\t6 - LISTADO PRESTAMOS LIBRO (USUARIOS QUE LO LEEN)");
            System.out.println("\t\t\t\t7 - LIBRO MAS LEIDO)");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    nuevoPrestamo();
                    break;
                }    
                case 2:{
                    devolucion();
                    break;
                } 
                case 3:{
                    prorroga();
                    break;
                } 
                case 4:{
                    listaPrestamos();
                    break;
                } 
                case 5:{
                    listaPrestamosUsu();
                    break;
                } 
                case 6:{
                    listaPrestamosLibro();
                    break;
                } 
                case 7:{
                    librotop();
                    break;
                 }
                }
            
        }while (opcion != 9);
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="GESTION LIBROS">
     private void nuevoLibro() {
         Scanner sc=new Scanner(System.in);           
        System.out.println("Nuevo libro:");
        System.out.println("ISBN: ");
        String isbn= sc.nextLine();
        System.out.println("Título: ");
        String titulo=sc.nextLine();
        System.out.println("Autor: ");
        String autor=sc.nextLine();
        System.out.println("Género:");
        String genero=sc.nextLine();
        System.out.println("Ejemplares");
        int ejemplares=sc.nextInt();
        
           System.out.println(new Libro(isbn,titulo,autor,genero,ejemplares));
       libros.add(new Libro(isbn,titulo,autor,genero,ejemplares));
    }

    private void eliminarLibro() {
           Scanner sc=new Scanner(System.in);  
        System.out.println("ISBN del libro a eliminar");
        String isbn= sc.nextLine();
        
        int pos= buscaIsbn(isbn);
        if(pos==-1){
            System.out.println("El libro que buscas no esta registrado");
        }else{
            System.out.println("Esta seguro de que desea borrar el libro?");
            System.out.println("Si o no");
            String confirmacion = sc.nextLine();
            if (confirmacion.equalsIgnoreCase("si")){
                System.out.println("El libro ha sido eliminado");
                libros.remove(pos);
            }else{
                System.out.println("Operacion cancelada con exito");
            }
            
        }
    }

    private void modificarLibros() {
            Scanner sc=new Scanner(System.in); 
        System.out.println("Dime el ISBN del libro que quieres modificar: ");
        String isbn= sc.nextLine();
        
        int pos= buscaIsbn(isbn);
        if (pos==-1) {
            System.out.println("El libro que buscas no esta registrado");
        } else {
            System.out.println("Pulsa + si quieres aumentar el número de ejemplares o - si quieres disminuir la cantidad de estos");
            String confirm= sc.nextLine();
            if (confirm.equals("+")) {
                 if (confirm.equals("+")) {
                System.out.println("¿Cuantos ejemplares quieres añadir?");
                int mas= sc.nextInt();
                int ejemplar= libros.get(pos).getEjemplares();
                int calculo2= ejemplar + mas;  
                libros.get(pos).setEjemplares(calculo2);
                System.out.println("Operacion realizada con exito");
            } 
                else if (confirm.equals("-")) {
                System.out.println("¿Cuantos ejemplares quieres quitar?");
                int menos=sc.nextInt();
                int ejemplar= libros.get(pos).getEjemplares();
                int calculo2= ejemplar - menos; 
                libros.get(pos).setEjemplares(calculo2);
                System.out.println("Operacion realizada con exito");
          
            }
            } else {
                     System.out.println("No se ha detectado ningun simbolo +/-");
            }
           
          
        }
    }
    
    private void listaLibros() {
        for (Libro l : libros) {
            System.out.println(l);
        }
    }
    
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GESTION USUARIOS">
    private void nuevoUsuario() {
        Scanner sc=new Scanner(System.in);  
        System.out.println("Introduce el nombre");
        String nombre= sc.nextLine();
        System.out.println("Introduce el DNI");
        String dni= sc.nextLine();
        System.out.println("Introduce el numero de telefono");
        String telefono= sc.nextLine();
        System.out.println("Introduce el email");
        String email=sc.nextLine();
         System.out.println(new Usuario(nombre,dni,telefono,email));
       usuarios.add(new Usuario(nombre,dni,telefono,email));
    }

    private void eliminarUsuario() {
           Scanner sc=new Scanner(System.in);  
           System.out.println("Introduce el DNI a eliminar");
           String dni= sc.nextLine();
           int pos =buscaDni(dni);
           if (pos==-1){
               System.out.println("El usuario que buscas no se encuentra en la lista");
            }else{
               System.out.println("Estas seguro que quieres borrarlo");
               System.out.println("Teclee si para confirmar");
               String confirmacion= sc.nextLine();
               if (confirmacion.equals("si")){
                   System.out.println("El usuario ha sido borrado");
                   usuarios.remove(pos);
                   
                }else{
                        System.out.println("Operacion cancelada con exito");
           }
        
    }
    }
 

    private void listaUsuarios() {
        for (Libro libro : libros) {
            System.out.println(libro);
            
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GESTION PRESTAMOS">
    private void nuevoPrestamo() {
        System.out.println("Identificacion del usuario:");
        String dni=solicitaDni();
        int posUsuario = buscaDni(dni);
        
        if (posUsuario==-1){
            System.out.println("No es aun usuario de la biblioteca");
        }else{
            System.out.println("Identificacion del libro:"); 
            String isbn=solicitaIsbn();
            int posLibro=buscaIsbn(isbn);
           
            if (posLibro==-1){
                System.out.println("El ISBN pertenece a un libro inexistente");
            } else if (libros.get(posLibro).getEjemplares()>0){
                if ((buscaPrestamo(dni,isbn))==-1){
                    LocalDate hoy=LocalDate.now();
                    prestamos.add(new Prestamo(libros.get(posLibro),usuarios.get(posUsuario),hoy,hoy.plusDays(15)));
                    libros.get(posLibro).setEjemplares(libros.get(posLibro).getEjemplares()-1);
                    }else{
                        System.out.println("Ese usuario ya tiene ese mismo libro en prestamo");
                    }
                }else{
                    System.out.println("No quedan unidades disponibles del libro");
                }
        }
    }
    private void devolucion() {
        System.out.println("Datos para la prorroga del préstamo:");
        String isbnLibro=solicitaIsbn();
        int pos=buscaPrestamo(solicitaDni(),isbnLibro);
        if (pos==-1){
            System.out.println("No hay ningun préstamo con esos datos");
        }else{
            prestamos.get(pos).setFechaDev(LocalDate.now());
            libros.get(buscaIsbn(isbnLibro))
              .setEjemplares(libros.get(buscaIsbn(isbnLibro)).getEjemplares()+1);
            prestamosHist.add(prestamos.get(pos));
            prestamos.remove(pos);
        }
    }
    private void prorroga() {
        System.out.println("Datos para la prorroga del préstamo:");
        
        String dni = solicitaDni();
        String isbn = solicitaIsbn();
        int pos=buscaPrestamo(dni,isbn);
        //int pos=buscaPrestamo(solicitaDni(),solicitaIsbn());
        if (pos==-1){
            System.out.println("No hay ningun préstamo con esos datos");
        }else{
            prestamos.get(pos).setFechaDev(prestamos.get(pos).getFechaDev().plusDays(15));
            prestamos.get(pos).setFechaPrest(LocalDate.now());
        }
    }

    private void listaPrestamos() {
        System.out.println("Listado de prestamos activos");
        for (Prestamo p : prestamos) {
            if (p.getFechaDev().isBefore(LocalDate.now())){
                        System.out.print("Libro fuera de plazo: ");
            }
            System.out.println(p);  
        }
        
        System.out.println("\nListado de prestamos historicos");
        for (Prestamo p : prestamosHist) {
            System.out.println(p);  
        }
    }
    
    private void listaPrestamosUsu(){
        String dni=solicitaDni();
        int pos=buscaDni(dni);
        
        if (pos==-1){
            System.out.println("No tengo a nadie con ese DNI");
        }else{
            System.out.println("Prestamos activos de: "
                    + usuarios.get(pos).getNombre());
            for (Prestamo p : prestamos) {
                if (p.getUsuarioPrest().getDni().equals(dni)){
                    if (p.getFechaDev().isBefore(LocalDate.now())){
                        System.out.print("Libro fuera de plazo: ");
                    }
                    System.out.println(p);  
                }
            }
            System.out.println("\nPrestamos ya devueltos por: "
                    + usuarios.get(pos).getNombre());
            for (Prestamo p : prestamosHist) {
                if (p.getUsuarioPrest().getDni().equals(dni)){
                    System.out.println(p);  
                }
            }
        }
    }
    
    private void listaPrestamosLibro(){
        String isbn=solicitaIsbn();
        int pos=buscaIsbn(isbn);
        if (pos==-1){
             System.out.println("No tengo ningún libro con ese ISBN");
        }else{
            System.out.println("Usuarios/as que lo estan leyendo");
            for (Prestamo p : prestamos) {
                if (p.getLibroPrest().getIsbn().equals(isbn)){
                    System.out.println(p.getUsuarioPrest());
                }
            }
            
            System.out.println("Usuarios/as que ya lo han leido");
            for (Prestamo p : prestamosHist) {
                if (p.getLibroPrest().getIsbn().equals(isbn)){
                    System.out.println(p.getUsuarioPrest());
                }
            }
        }
    }
            
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="METODOS AUXILIARES">
    /**
     * Método para solicitar por teclado el DNI de un usuario. pdte de validación
     * @return (String) dni del usuario tecleado
     */
    public String solicitaDni(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Teclea el dni del usuario:");
        String dni=sc.next();
        return dni;
    }
    /**
     * Método para solicitar por teclado el ISBN de un libro. pdte de validación
     * @return (String) isbn del libro tecleado
     */
    public String solicitaIsbn(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Teclea el isbn del libro:");
        String isbn=sc.next();
        return isbn;
    }
    
    /**
     * Método para buscar un dni en la colección usuarios
     * @param dni (String) del usuario a buscar en la colección
     * @return posición (int) del usuario en el Arraylist, valor -1 si no se encuentra
     */
    public int buscaDni(String dni){
        int pos=-1;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getDni().equals(dni)){
                pos=i;
                break;
            }
        }
        return pos;       
    }
    
     /**
     * Método para buscar un libro en la colección libros
     * @param isbn (String) del libro a buscar en la colección
     * @return posición (int) del libro el Arraylist, valor -1 si no se encuentra
     */
    public int buscaIsbn(String isbn){
        int pos=-1;
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIsbn().equals(isbn)){
                pos=i;
                break;
            }
        }
        return pos;       
    }
    
    public void cargaDatos(){
        libros.add(new Libro("1-11","El Hobbit","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-22","El Silmarillon","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-33","El Médico","N. Gordon","Aventuras",4)); 
        libros.add(new Libro("1-44","Chamán","N. Gordon","Aventuras",3)); 
        libros.add(new Libro("1-55","Momo","M. Ende","Aventuras",2)); 
        libros.add(new Libro("1-66","Paraíso inhabitado","A.M.Matute","Aventuras",2)); 
        libros.add(new Libro("1-77","Olvidado Rey Gudú","A.M.Matute","Aventuras",2)); 
        libros.add(new Libro("1-88","El último barco","D.Villar","Novela Negra",3)); 
        libros.add(new Libro("1-99","Ojos de agua","D.Villar","Novela Negra",0)); 

        usuarios.add(new Usuario("11","Ana","ana@email.com","621111111")); 
        usuarios.add(new Usuario("22","David","david@email.com","622222222")); 
        usuarios.add(new Usuario("33","Bea","bea@email.com","623333333")); 
        usuarios.add(new Usuario("44","Lucas","lucas@email.com","624444444")); 
        usuarios.add(new Usuario("55","Carlota","carlota@email.com","625555555")); 
        usuarios.add(new Usuario("66","Juan","juan@email.com","626666666"));
        
        LocalDate hoy= LocalDate.now();
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(8),usuarios.get(2), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(4), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(6),usuarios.get(2), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(1), hoy,hoy.plusDays(15)));
    
        for (Libro l:libros) {
            System.out.println(l);
        }
        System.out.println("");
        for (Usuario u:usuarios) {
            System.out.println(u);
        }
        System.out.println("");
        for (Prestamo p:prestamos) {
            System.out.println(p);
        }
    }
        public void fueraPlazo(){
        System.out.println("Prestamos fuera de plazo:");
        for (Prestamo p : prestamos) {
            if (p.getFechaDev().isBefore(LocalDate.now())){
                    System.out.println(p);
            }
        }
    }
          public int buscaPrestamo(String dni, String isbn){
        int pos=-1;
        for (int i = 0; i < prestamos.size(); i++) {
            if (prestamos.get(i).getUsuarioPrest().getDni().equals(dni)
                && prestamos.get(i).getLibroPrest().getIsbn().equals(isbn)){   
                pos=i;
                break;
            }
        }
        return pos;       
    }
          
         private void librotop(){
           ArrayList <Integer> contadoresLibro=new ArrayList();
           int contador = 0;  
           for (Libro l : libros) {
                 contador= 0;
                 for (Prestamo p:prestamos) {
                     if(l==p.getLibroPrest())
                         contador++;
                   
               }
                    for (Prestamo p:prestamosHist) {
                     if(l==p.getLibroPrest())
                         contador++;
             }
                contadoresLibro.add(contador);
                    
           }
           int posMasleido=0;
           int max=contadoresLibro.get(0);
             for (int i = 1; i < libros.size(); i++) {
                if (contadoresLibro.get(i)>max){
                    max=contadoresLibro.get(i);
                    posMasleido=i;
          
                }
                 
             }
             System.out.println("El libro/s mas leido/s es/son");
             System.out.println(libros.get(posMasleido));
         } 
//</editor-fold>
 

}
