/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package educasturangelgm73.biblioteca2025;

import java.util.ArrayList;

/**
 *
 * @author alu10d
 */
public class Biblioteca2025 {
    private ArrayList <Libro> libros;
    private ArrayList <Usuario> usuarios;
    private ArrayList <Prestamo> prestamos ;

    public Biblioteca2025() {
        this.libros = new ArrayList();
        this.usuarios = new ArrayList();
        this.prestamos = new ArrayList();
    }
    

    public static void main(String[] args) {
        Biblioteca2025 b= new Biblioteca2025();
        b.cargaDatos();
        b.menu();
        
       
    }

    private void cargaDatos() {
      
    }

    private void menu() {
        
    }
}