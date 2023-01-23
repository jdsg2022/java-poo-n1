package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Laborable;
import co.com.sofka.mycalendar.Programable;

import java.time.LocalDate;

public class Trabajo extends Actividad implements Laborable {

    public Trabajo(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
        if(titulo.isBlank());}

    @Override
    public boolean esValido() {
        return false;
    }
}