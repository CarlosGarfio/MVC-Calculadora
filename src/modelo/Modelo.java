package modelo;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Modelo {

    private double n1;
    private double n2;
    private char signo;

    public Modelo() {
        this.n1 = 0;
        this.n2 = 0;
        this.signo=' ';
    }

    public void set(JButton Signo, JTextField no) {
        signo = Signo.getText().charAt(0);
        this.n2 = Double.parseDouble(no.getText());
        Calcular(signo);
    }

    public void Calcular(char signo) {
        switch (signo) {
            case '+':
                n1 += n2;
                setN1(n1);
                break;
            case '-':
                n1 -= n2;
                setN1(n1);
                break;

            case '/':
                n1 /= n2;
                setN1(n1);
                break;

            case 'x':
                n1 *= n2;
                setN1(n1);
                break;

            case '=':
                setN1(n1);
                break;
            case 'C':
                setN1(0);
                setN2(0);
                setSigno(' ');                
                break;
            default:
        }
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public char getSigno() {
        return signo;
    }

    public void setSigno(char signo) {
        this.signo = signo;
    }
    
}
