import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secretNumber = new Random().nextInt(100);
        System.out.println(secretNumber);
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        boolean hitNumber = true;

        try {
            while (contador <= 4) {

                System.out.println("Escriba un numero del 1 al 100");
                int userNumber = teclado.nextInt();
                contador++;
                checkNumber(userNumber, secretNumber);
                if (userNumber == secretNumber) {
                    System.out.println();
                    break;
                }

//            if (userNumber == secretNumber) {
//                hitNumber = true;
//                System.out.println("Ha adivinado el numero secreto");
//                System.out.println("Felicitaciones, el numero secreto era: " + secretNumber);
//                break;
//            } else if (userNumber > secretNumber) {
//                hitNumber = false;
//                System.out.println("El numero ingresado es mayor que el numero secreto");
//            } else if (userNumber < secretNumber) {
//                hitNumber = false;
//                System.out.println("El numero ingresado es menor que el numero secreto");
//            }
            }
        } catch (Exception e) {
            System.out.println("Algo salio mal");
        }

        if (contador >= 4) {
            System.out.println("Has agotado tus 5 intentos");
        } else {
            System.out.println("Gracias por participar en el juego de adivinanzas");
        }
    }

            public static void checkNumber ( int user, int secret){
                if (user == secret) {
                    System.out.println("Ha encontrado el numero secreto");
                } else if (user > secret) {
                    System.out.println("El numero ingresado es mayor que el numero secreto");
                } else if (user < secret) {
                    System.out.println("El numero ingresado es menor que el numero secreto");
                }

            }
        }
