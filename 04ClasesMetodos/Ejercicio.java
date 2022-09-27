import java.util.Scanner;

class Ejercicio {

    /*
     * 1-Otra calculadora
     * 2-Conversion de unidades
     * 3-Creacion de cuadro magico
     * 4-Movimiento de un cuadro
     */

    // objetos

    // metodos o comportamientos
    // crearemos un metodo para el menu
    /*
     * -public es el acceso o el tipo de dato, clase o metodo cualquier elemento del
     * programa puede acceder a el
     * -private es de acceso restringido solo mediante reglas se puede acceder a el
     * -protected solo se puede tener acceso desde la misma clase y aplicando la
     * herencia de POO entre los hijos y padres
     * un metodo tambien es un tipo de dato aplicado
     */
    char op;
    Scanner entrada = new Scanner(System.in);

    public void menu() {
        System.out.println("Bienvenido a los metodos");
        System.out.println("Elije la opcion deseada");
        System.out.println("a-Calculadora");
        System.out.println("b-Conversion de unidades");
        System.out.println("c-Cuadro magico");
        System.out.println("d-Movimiento de un cuadro");
        op = entrada.next().charAt(0);
        switch (op) {
            case 'a':
                // vamos a hacer un metodo
                Ejercicio1();
                break;
            case 'b':
                // vamos a hacer un metodo
                Ejercicio2();
                break;
            case 'c':
                // vamos a hacer un metodo
                Ejercicio3();
                break;
            case 'd':
                // vamos a hacer un metodo
                Ejercicio4();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }

    public void Ejercicio1() {

    }

    public void Ejercicio2() {

    }

    public void Ejercicio3() {

    }

    public void Ejercicio4() {

    }

}
