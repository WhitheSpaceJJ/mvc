package main;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class Principal {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista, modelo);
        vista.setVisible(true);
    }
}
