/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package educasturangelgm73.biblioteca2025;

import java.time.LocalDate;

/**
 *
 * @author alu10d
 */
public class Prestamo {
    private Libro libroPrest;
    private Usuario usuarioPrest;
    private LocalDate fechaPrest;
    private LocalDate fechaDev;

    public Prestamo(Libro libroPrest, Usuario usuarioPrest, LocalDate fechaPrest, LocalDate fechaDev) {
        this.libroPrest = libroPrest;
        this.usuarioPrest = usuarioPrest;
        this.fechaPrest = fechaPrest;
        this.fechaDev = fechaDev;
    }

    public Libro getLibroPrest() {
        return libroPrest;
    }

    public void setLibroPrest(Libro libroPrest) {
        this.libroPrest = libroPrest;
    }

    public Usuario getUsuarioPrest() {
        return usuarioPrest;
    }

    public void setUsuarioPrest(Usuario usuarioPrest) {
        this.usuarioPrest = usuarioPrest;
    }

    public LocalDate getFechaPrest() {
        return fechaPrest;
    }

    public void setFechaPrest(LocalDate fechaPrest) {
        this.fechaPrest = fechaPrest;
    }

    public LocalDate getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(LocalDate fechaDev) {
        this.fechaDev = fechaDev;
    }

    @Override
    public String toString() {
        return  libroPrest + "-" + usuarioPrest + "-" + fechaPrest + "-" + fechaDev + '-';
    }
    
    
    
}
