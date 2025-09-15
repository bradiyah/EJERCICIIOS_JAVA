import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una temperatura en Cº");
        if (sc.hasNextInt()) { //validamos que la entrada sea un numero
            int grados = sc.nextInt();


            if (grados < 0) {
                System.out.println("Hace frio");
            } else if (grados > 30) {
                System.out.println("Hace calo");
            } else {
                System.out.println("Clima templado");
            }


        }
        ;


        //Ej.2: Detector de color fav:


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


        // Ejercicios por mi cuenta:
        //1-Numero positivo o negativo:
        System.out.println("Introduce un numero");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("El numero " + num + "es negativo");
        } else if (num >= 0) {
            System.out.println("El numero" + num + "es positivo o 0");

        }

        //Ej. par o impar:
        System.out.println("Introduce un numero");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");

        }
    }

        //Ej.aprobado o suspenso:

        double nota = -1;

        System.out.print("Introduce la nota: ");
        String entrada = sc.nextLine();
        entrada = entrada.replace("," , ".");


         nota = sc.nextDouble();

        if (nota >= 5){
            System.out.println("Ha aprobado");
        } else {
            System.out.println("suspenso");
        }

        sc.close ();


    }


}












