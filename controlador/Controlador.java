package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener {

    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.jButtonSumar.addActionListener(this);
        this.vista.jButtonRestar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setNumero1(Double.valueOf(vista.jTextFieldNumero1.getText()));
        modelo.setNumero2(Double.valueOf(vista.jTextFieldNumero2.getText()));
        if (e.getSource() == vista.jButtonSumar) {
            modelo.sumar();
            vista.jTextFieldResultado.setText(String.valueOf(modelo.getResultado()));
        } else if (e.getSource() == vista.jButtonRestar) {
            modelo.restar();
            vista.jTextFieldResultado.setText(String.valueOf(modelo.getResultado()));
        }
    }
}
