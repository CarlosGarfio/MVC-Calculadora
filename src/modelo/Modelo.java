package modelo;

public class Modelo {

    public double Calcular(double n1, double n2, char signo) {
        switch (signo) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '/':
                if (n2 == 0) {
                    return 0;
                }
                return n1/n2;
            case '*':
                return n1 * n2;
        }
        return 0;
    }
}
