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

        if (age < 12 ){
            System.out.println("No puede entrar");
        } else if (age <= 17) {
            System.out.println("Necesita adulto");
            
        } else {
            System.out.println("Puede entrar solo");
        }

        //Ej.6: Semaforo:


        System.out.println("Hay un semaforo de color...?");
        String Semaforo = sc.next();

        if ( Semaforo.equalsIgnoreCase("rojo")){
            System.out.println("Detente");
        } else if (Semaforo.equalsIgnoreCase("ambar")) {
            System.out.println("Precaucion");
        } else if (Semaforo.equalsIgnoreCase("verde")) {
            System.out.println("puede avanzar");
        }
        sc.close ();


    }


}












