import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una temperatura en Cº");
        if (sc.hasNextInt()) { // se valida que la entrada sea un numero
            int grados = sc.nextInt();


            if (grados < 0) {
                System.out.println("Hace frio");
            } else if (grados > 30) {
                System.out.println("Hace calo");
            } else {
                System.out.println("Clima templado");
            }





            //Ej.2: Detector de color fav:
            System.out.println("Ingresa un color");
            String color = sc.nextLine();

            sc.nextLine();

            if (color == "rojo" || color == "azul" || color == "verde") {
                System.out.println("Es un color primario");
            } else {
                System.out.println("Otro color");
            }



            //Ej.3: Radar de velocidad:
            System.out.println("Ingresa velocidad de coche");
            int speed = sc.nextInt();
            sc.nextLine(); // <-- limpia el salto de línea

            if (speed >= 120) {
                System.out.println("Multa");
            } else {
                System.out.println("Velocidad correcta");
            }



            //Ej.4: Animales:

            System.out.print("Escribe un animal: ");
            String animal = sc.nextLine();

            if (animal.equalsIgnoreCase("perro") || animal.equalsIgnoreCase("gato")) {
                System.out.println("Es doméstico");
            } else if (animal.equalsIgnoreCase("tigre") || animal.equalsIgnoreCase("león")) {
                System.out.println("Salvaje");
            }



            //Ej.5: Entrada a un concierto:

            System.out.println("Ingrese la edad");

            int age = sc.nextInt();

            if (age < 12) {
                System.out.println("No puede entrar");
            } else if (age <= 17) {
                System.out.println("Necesita adulto");

            } else {
                System.out.println("Puede entrar solo");
            }


            //Ej.6: Semaforo:


            System.out.println("Hay un semaforo de color...?");
            String Semaforo = sc.next();

            if (Semaforo.equalsIgnoreCase("rojo")) {
                System.out.println("Detente");
            } else if (Semaforo.equalsIgnoreCase("ambar")) {
                System.out.println("Precaucion");
            } else if (Semaforo.equalsIgnoreCase("verde")) {
                System.out.println("puede avanzar");
            }




            //Ej.7: Juego de adivinanza:
            System.out.println("Ingresa un numero");
            int number_secret = 24;
            int suposicion;


            System.out.println("El numero es de 1 al 30");
            suposicion = sc.nextInt();

            if (suposicion < number_secret) {
                System.out.println("El numero es menor, try again");
            } else if (suposicion > number_secret) {
                System.out.println("Ahora esta por encima, prueba otra vez");

            } else {
                System.out.println("Acertó! Well done!");
            }



            //Ej.8: Comparador de palabras:
            sc.nextLine();
            System.out.println("Ingresa 1 palabra");
            String palabra1 = sc.nextLine();


          System.out.println("Ingresa la otra palabra");
            String palabra2 = sc.nextLine();


            if (palabra1.equalsIgnoreCase(palabra2)) {
                System.out.println("Conciden");
            } else {
                System.out.println("No coinciden :( ");
            }


            //Ej.10: Calculadora basica:
            System.out.println("Pon 1 numero: ");
            double num1 = sc.nextDouble();
            sc.nextLine();
            System.out.println("Pon el otro numero:  ");
            double num2 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Escribe la operacion a realizar: +, - , / , *  ");

            String operacion = sc.nextLine();


            double resultado;


            switch (operacion) {
                case "+":
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "-":
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "*":
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: no se puede dividir entre 0");
                    }
                    break;
                //default:
                    //System.out.println("Operación no válida.");

            }

            sc.close();
        }
    }
}












