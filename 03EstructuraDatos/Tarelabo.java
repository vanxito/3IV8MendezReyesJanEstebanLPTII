import java.util.Scanner;

class Tarelabo {
    public static void main(String[] args) {
        Scanner respuesta = new Scanner(System.in);
        int e1, mensaje2, numerobinario, m, num1, num2, c, cn, cne;
        double n, r, ab1, ab2;
        char msj1;
        String bin;
        do {
            do {
                System.out.println("Nombre todo kawaii: Mendez Reyes Jan Esteban u.u");
                System.out.println("Grupo: 3IV8");
                System.out.println("Holiwis");
                System.out.println("Escoja cual de los siguientes problemitas requiere resolver:");
                System.out.println("1. Abonito");
                System.out.println("2. Num decimales a binarios");
                System.out.println("3. Conversor de unidades de temperatura");
                System.out.println("4. Identificador de numeros positivos y negativos uwu");
                mensaje2 = respuesta.nextInt();
            } while (mensaje2 < 0 || mensaje2 > 5);

            switch (mensaje2) {
                case 1:
                    do {
                        System.out.println("Cual es su edad?");
                        e1 = respuesta.nextInt();
                    } while (e1 < 0);
                    do {
                        System.out.println("Ingrese el abono");
                        ab1 = respuesta.nextFloat();
                    } while (e1 < 0);

                    if (e1 <= 65 && e1 >= 21 || e1 < 21) {
                        System.out.println("No hay abonos con gente de " + e1 + " años de edad TT");
                    } else if (e1 > 65 && e1 <= 128) {
                        ab2 = ab1 * 0.40;
                        System.out.println("Su abono es de " + ab2);
                    } else if (e1 < 21 && e1 >= 18) {
                        System.out.println("Sus padres son socios? s/n");
                        msj1 = respuesta.next().charAt(1);
                        switch (msj1) {
                            case 's':
                                ab2 = ab1 * 0.45;
                                System.out.println("Su abono es de " + ab2);
                                break;
                            case 'n':
                                ab2 = ab1 * 0.25;
                                System.out.println("Su abono es de " + ab2);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el numero positivo entero que desee convertir a binario uwu");
                    numerobinario = respuesta.nextInt();
                    bin = "";
                    if (numerobinario > 0) {
                        while (numerobinario > 0) {
                            if (numerobinario % 2 == 0) {
                                bin = "0" + bin;
                            } else {
                                bin = "1" + bin;
                            }
                            numerobinario = (int) numerobinario / 2;
                        }
                    } else if (numerobinario == 0) {
                        bin = "0";
                    } else {
                        bin = "\n N0 se pudo converitir el numero, ingrese solo positivos uwu";
                    }
                    System.out.println("El numero binario es: " + bin);
                    break;
                case 3:
                    System.out.println("Introduzca la temperatura en celcius: ");
                    n = respuesta.nextDouble();
                    System.out.println("A que unidad de temperatura desea convertir uwu ?");
                    System.out.println("1. FAHRENHEIT");
                    System.out.println("2. KELVINE");
                    System.out.println("3. RANKINE");
                    mensaje2 = respuesta.nextInt();
                    switch (mensaje2) {
                        case 1:
                            r = (9 * n / 5) + 32;
                            System.out.println(n + " grados celicuis es  " + r + " en grados fahrenheit");
                            break;
                        case 2:
                            r = n + 273.15;
                            System.out.println(n + " grados celicuis es  " + r + " en grados kelvine");
                            break;
                        case 3:
                            r = (9 * n / 5) + 491.67;
                            System.out.println(n + " grados celicuis es  " + r + " en grados kelvine");
                            break;
                    }
                    break;
                case 4:
                    c = 0;
                    cn = 0;
                    cne = 0;
                    do {
                        System.out.println("Cuantos numeros desea introducir?");
                        num1 = respuesta.nextInt();
                    } while (num1 < 0);
                    for (m = 0; m < num1; m++) {
                        System.out.println("Introduzca un numero:");
                        num2 = respuesta.nextInt();
                        if (num2 > 0) {
                            c++;
                        } else if (num2 < 0) {
                            cn++;
                        } else if (num2 == 0) {
                            cne++;
                        }
                    }
                    System.out.println("Son " + c + " numeros positivos");
                    System.out.println("Son " + cn + " numeros negativos");
                    System.out.println("Son " + cne + " numeros iguales a 0 ");
                    break;
            }

            System.out.println("Desea repetir y resolver algun otro problemita? y/n");
            msj1 = respuesta.next().charAt(0);
            ;
        } while (msj1 == 'Y' || msj1 == 'y');
    }
}
