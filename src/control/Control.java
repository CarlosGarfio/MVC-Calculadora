package control;

import modelo.Modelo;
import vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control {

    private Modelo modelo;
    private Vista vista;

    private double numero = 0d;
    private char operator = 0;
    private String append="";

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

    public void appendTextValue(char value) {
        append+=value;
        vista.jTextField1.setText(append);
    }
    
    class Actions implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == vista.ADD) {
                    operator = '+';
                    append="";
                    numero=Double.parseDouble(vista.jTextField1.getText());
                } else if (e.getSource() == vista.SUB) {
                    operator = '-';
                    append="";
                    numero=Double.parseDouble(vista.jTextField1.getText());
                } else if (e.getSource() == vista.DIVIDE) {
                    operator = '/';
                    append="";
                    numero=Double.parseDouble(vista.jTextField1.getText());
                } else if (e.getSource() == vista.MULTIPLY) {
                    operator = '*';
                    append="";
                    numero=Double.parseDouble(vista.jTextField1.getText());
                } else if (e.getSource() == vista.EQUALS) {
                    setTextValue(modelo.Calcular(numero, Double.parseDouble(vista.jTextField1.getText()), operator));
                    append="";
                } else if (e.getSource() == vista.C) {
                    operator = 0;
                    numero = 0d;
                    append="";
                    setTextValue(0.0d);
                }  else if (e.getSource() == vista.BP) {
                    appendTextValue('.');
                }else if (e.getSource() == vista.B0) {
                    appendTextValue('0');
                } else if (e.getSource() == vista.B1) {
                    appendTextValue('1');
                } else if (e.getSource() == vista.B2) {
                    appendTextValue('2');
                } else if (e.getSource() == vista.B3) {
                    appendTextValue('3');
                } else if (e.getSource() == vista.B4) {
                    appendTextValue('4');
                } else if (e.getSource() == vista.B5) {
                    appendTextValue('5');
                } else if (e.getSource() == vista.B6) {
                    appendTextValue('6');
                } else if (e.getSource() == vista.B7) {
                    appendTextValue('7');
                } else if (e.getSource() == vista.B8) {
                    appendTextValue('8');
                } else if (e.getSource() == vista.B9) {
                    appendTextValue('9');
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
