package control;

import modelo.Modelo;
import vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control {

    private Modelo modelo;
    private Vista vista;

    public Control(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;

        vista.ADD.addActionListener(new Actions());
        vista.SUB.addActionListener(new Actions());
        vista.MULTIPLY.addActionListener(new Actions());
        vista.DIVIDE.addActionListener(new Actions());
        vista.EQUALS.addActionListener(new Actions());
        vista.C.addActionListener(new Actions());
        vista.B1.addActionListener(new Actions());
        vista.B2.addActionListener(new Actions());
        vista.B3.addActionListener(new Actions());
        vista.B4.addActionListener(new Actions());
        vista.B5.addActionListener(new Actions());
        vista.B6.addActionListener(new Actions());
        vista.B7.addActionListener(new Actions());
        vista.B8.addActionListener(new Actions());
        vista.B9.addActionListener(new Actions());
        vista.B0.addActionListener(new Actions());
    }

    public void setTextValue(double value) {
        vista.jTextField1.setText(Double.toString(value));
    }

    class Actions implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == vista.ADD) {
                    modelo.set(vista.ADD, vista.jTextField1);
                    setTextValue(modelo.getN1());
                } else if (e.getSource() == vista.SUB) {
                    modelo.set(vista.SUB, vista.jTextField1);
                    setTextValue(modelo.getN1());
                } else if (e.getSource() == vista.DIVIDE) {
                    modelo.set(vista.DIVIDE, vista.jTextField1);
                    setTextValue(modelo.getN1());
                } else if (e.getSource() == vista.MULTIPLY) {
                    modelo.set(vista.MULTIPLY, vista.jTextField1);
                    setTextValue(modelo.getN1());
                } else if (e.getSource() == vista.EQUALS) {
                    modelo.set(vista.EQUALS, vista.jTextField1);
                    setTextValue(modelo.getN1());
                } else if (e.getSource() == vista.C) {
                    modelo.set(vista.C, vista.jTextField1);
                    setTextValue(modelo.getN1());
                } else if (e.getSource() == vista.B1) {
                    modelo.setN2(1);
                    setTextValue(1);
                } else if (e.getSource() == vista.B2) {
                    modelo.setN2(2);
                    setTextValue(2);
                } else if (e.getSource() == vista.B3) {
                    modelo.setN2(3);
                    setTextValue(3);
                } else if (e.getSource() == vista.B4) {
                    modelo.setN2(4);
                    setTextValue(4);
                } else if (e.getSource() == vista.B5) {
                    modelo.setN2(5);
                    setTextValue(5);
                } else if (e.getSource() == vista.B6) {
                    modelo.setN2(6);
                    setTextValue(6);
                } else if (e.getSource() == vista.B7) {
                    modelo.setN2(7);
                    setTextValue(7);
                } else if (e.getSource() == vista.B8) {
                    modelo.setN2(8);
                    setTextValue(8);
                } else if (e.getSource() == vista.B9) {
                    modelo.setN2(9);
                    setTextValue(9);
                }
            } catch (Exception ex) {
            }
        }
    }
}
