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

            sc.close();

        }

    }

}





