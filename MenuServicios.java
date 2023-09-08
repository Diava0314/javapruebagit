
package javaapplication8;

import java.util.Scanner;


public class MenuServicios {

  
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int opcion, total;
            total = 0;

            do {
                System.out.println("\n");
                System.out.println("1. Pago de Electricidad");
                System.out.println("2. Pago de Agua");
                System.out.println("3. Pago de Internet");
                System.out.println("4. Salir");

                opcion = scanner.nextInt();

                switch (opcion) {

                    case 1:
                        System.out.println("A. Factura de Electricidad, valor: $100");
                        System.out.println("B. Factura de Electricidad, valor: $150");

                        scanner.nextLine();
                        String seleccionElectricidad = scanner.nextLine();

                        switch (seleccionElectricidad) {

                            case "A":
                                System.out.println("Has seleccionado Factura de Electricidad, valor: $100");
                                total = total + 100;
                                break;
                            case "B":
                                System.out.println("Has seleccionado Factura de Electricidad, valor: $150");
                                total = total + 150;
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("A. Factura de Agua, valor: $50");
                        System.out.println("B. Factura de Agua, valor: $75");

                        scanner.nextLine();
                        String seleccionAgua = scanner.nextLine();

                        switch (seleccionAgua) {

                            case "A":
                                System.out.println("Has seleccionado Factura de Agua, valor: $50");
                                total = total +50;
                                break;
                            case "B":
                                System.out.println("Has seleccionado Factura de Agua, valor: $75");
                                total = total + 75;
                                break;
                            default:
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("A. Pago de Internet, valor: $80");
                        System.out.println("B. Pago de Internet, valor: $100");

                        scanner.nextLine();
                        String seleccionInternet = scanner.nextLine();

                        switch (seleccionInternet) {

                            case "A":
                                System.out.println("Has seleccionado Pago de Internet, valor: $80");
                                total = total + 80;
                                break;
                            case "B":
                                System.out.println("Has seleccionado Pago de Internet, valor: $100");
                                total = total + 100;
                                break;
                            default:
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Gracias por realizar sus pagos.");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }

            } while (opcion != 4);

            System.out.println("El total a pagar es: $" + total);
        }
    }
    
}
