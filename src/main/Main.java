package main;

import control.Control;
import modelo.Modelo;
import vista.Vista;

public class Main {

    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        new Control(modelo, vista);
    }
}
