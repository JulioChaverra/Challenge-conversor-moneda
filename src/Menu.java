import java.util.Scanner;

public class Menu {
        public int mostrarMenu() {
            System.out.println("*****************************************");
            System.out.println(" Sea bienvenido/a al Conversor de Moneda ");
            System.out.println("*****************************************");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Salir");
            System.out.print("Elija una opción válida: ");

            Scanner lectura = new Scanner(System.in);
            while (!lectura.hasNextInt()) {
                lectura.next(); // descartar lo que no sea número
                System.out.print("Ingrese un número (1-7): ");
            }
            return lectura.nextInt();
        }
}
