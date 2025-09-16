import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /** System.out.println("Ingresa una temperatura en Cº");
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




            //EJERCICIOS BUCLES (LOOPS):
          //Ej.1: Contando simple (for):

      System.out.println("Esto es un cuenteo, ingrese numero");
          int N = sc.nextInt();

          for (int i = 1 ; i <= N; i++  ){
            System.out.println(i);
          }
      System.out.println("-----------");

          //Ej.2: Cuenta regresiva (for):
      System.out.println("Cuenta regresiva, ingrese numero");

          int N2 = sc.nextInt();

          for (int i = N2; i>=1; i-- ){
            System.out.println(i);
          }

      System.out.println("-----------");


          // Ej.3: Tabla multiplicar (for):

      System.out.println("Esto sera una tabla de multiplicar, ingresa cualquier num");

          int n = sc.nextInt();

          for (int i = 1; i <=10; i++){
            int resultado = n* i;
            System.out.println(n + "x"+ i + "="+ resultado);
          }
      System.out.println("------");

          //Ej.4: Sumatoria (for):
           System.out.println("Sumatoria, ingrese num");
          int N3 = sc.nextInt();
          for(int i= 1; i <=N3; i++){
            int answer = N3 + i;
            System.out.println(N3 + "+" + i + "=" + answer);
          }
          System.out.println("------");

         //Ej.5: Numeros pares (while):

           System.out.println("Numeros pares, ingrese un numero N");
          int N4 = sc.nextInt();

           int i = 2;

         while ( i <= N4 ){
        System.out.println(i);
        i+=2;
         }

        System.out.println("---------");

      //Ej.6: Adivinar numero (while):

      int  num_secreto;
      int intento;

      System.out.println("Ingresa numero secreto");
      num_secreto = sc.nextInt();

      System.out.println("Ahora adivina el numero");
      intento = sc.nextInt();

      while( intento != num_secreto){
        System.out.println("Numero incorrecto, pruebe de nuevo");
        intento = sc.nextInt();
      }
      System.out.println("El numero correcto es...."+ num_secreto);

     //Ej.7: Menu repetitivo (do-while)
      int option;
      do {
        System.out.println("\n --- MENU ---");
        System.out.println("1 - Home");
        System.out.println("2 - What we do");
        System.out.println("3 - Contact us");
        System.out.println("0 - Exit");


        option = sc.nextInt();

        switch (option) {
          case 0:
            System.out.println("Adiós");
            break;
          case 1:
            System.out.println("Menu principal, inicio");
            break;
          case 2:
            System.out.println("Que hacemos?");
            break;
          case 3:
            System.out.println("Nuestro contacto");
            break;
          default:
            System.out.println("Eliga una opcion");
        }


      }  while (option != 0) ;

      System.out.println("-------------");

      //Ej.8: Suma hasta 0 (do-while):
      int numero;
      int suma = 0;

      do {
        System.out.println("Ingresa num (o  0 para irse )");
        numero = sc.nextInt();
        suma+= numero;
      } while (numero != 0);

      System.out.println("La suma total es: " + " " +  suma);

      System.out.println("------------");



      // Ej.9: Validar contraseña (while):

      sc.nextLine();
      final String CONTRASENHA_CORRECTA = "java123"; // la clave "secreta"

      String entrada;
      do {
        System.out.print("Introduce la contraseña: ");
        entrada = sc.nextLine();
        if (!entrada.equals(CONTRASENHA_CORRECTA)) {
          System.out.println("Contraseña incorrecta, inténtalo de nuevo.");
        }
      } while (!entrada.equals(CONTRASENHA_CORRECTA));
      System.out.println("¡Acceso concedido!");

      System.out.println("-----------");


      // Ej.10: Numeros impares (for):
      System.out.println("Ingrese un numero par: ");
      int nImPar = sc.nextInt();

      System.out.println("Numeros impares del 1 al " + nImPar + ":" );

      for ( int i = 1; i <= nImPar ; i++){
        if ( i % 2 != 0 ){
          System.out.println(i);
        }
     }

      System.out.println("------");


      **/// EJERCICIOS BUCLES TOP:
      // EJ.1: CALCULADORA DE INTERES COMPUESTO (for):

      System.out.println("Indique cantidad de dinero: ");
      double cantidad = sc.nextDouble();

      System.out.println("Indique tasa de interes anual: ");
      double tasa_interes_anual = sc.nextDouble();

      System.out.println("Numero de ños que mantendra la inversion: ");
      int num_years_inversion = sc.nextInt();

      for (int i = 1; i <= num_years_inversion; i++){
         double interes = cantidad * (tasa_interes_anual/ 100);
         cantidad+= interes;
        System.out.printf("Año %d: saldo = %.2f €%n", i, cantidad);

      }
     ;
      sc.close();
    }
}

















