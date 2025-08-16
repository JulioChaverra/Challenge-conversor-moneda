import java.util.Scanner;

public class App {

    private final Menu menu = new Menu();
    private final ConsultaTasaDeCambio consulta = new ConsultaTasaDeCambio();
    private final Scanner sc = new Scanner(System.in);
    private Moneda usd;

    public void ejecutar() {
        usd = consulta.buscaMoneda("USD");
        if (usd == null || !"success".equalsIgnoreCase(usd.result())) {
            System.out.println("No se pudieron obtener las tasas.");
            return;
        }

        int opcion;
        do {
            opcion = menu.mostrarMenu();
            if (opcion >= 1 && opcion <= 6) {
                double monto = pedirMonto();
                convertir(opcion, monto);
            } else if (opcion == 7) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción no válida.");
            }
            System.out.println();
        } while (opcion != 7);
    }

    private double pedirMonto() {
        System.out.print("Ingrese el monto a convertir: ");
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.print("Ingrese un número válido: ");
        }
        return sc.nextDouble();
    }

    private void convertir(int opcion, double monto) {
        double ars = usd.conversion_rates().ARS();
        double brl = usd.conversion_rates().BRL();
        double cop = usd.conversion_rates().COP();

        switch (opcion) {
            case 1 -> { // USD -> ARS
                double r = monto * ars;
                System.out.printf("%.2f USD = %.2f ARS%n", monto, r);
            }
            case 2 -> { // ARS -> USD
                double r = monto / ars;
                System.out.printf("%.2f ARS = %.2f USD%n", monto, r);
            }
            case 3 -> { // USD -> BRL
                double r = monto * brl;
                System.out.printf("%.2f USD = %.2f BRL%n", monto, r);
            }
            case 4 -> { // BRL -> USD
                double r = monto / brl;
                System.out.printf("%.2f BRL = %.2f USD%n", monto, r);
            }
            case 5 -> { // USD -> COP
                double r = monto * cop;
                System.out.printf("%.2f USD = %.2f COP%n", monto, r);
            }
            case 6 -> { // COP -> USD
                double r = monto / cop;
                System.out.printf("%.2f COP = %.2f USD%n", monto, r);
            }
        }
    }
}