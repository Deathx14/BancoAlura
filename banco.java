/*Programa creado por DANIELA VILLANUEVA M. 
Github Deathx14 
Dicord unicodee.14
IG Deathx14 
Mexico, S.L.P. ♥*/
import java.util.Scanner;
public class banco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double saldoUno = 1350.95;
        int opc = 0;
        int i = 0;

        String menu = """
                        *********************************************
                        **  Escriba el numero de la opcion deseada **
                        1 -Consultar saldo
                        2 -Retirar
                        3 -Depositar
                        4 -Salir
                """;
        while (opc != 4) {
            System.out.println(menu);
            System.out.println("Opcion seleccionada: ");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Consulta de saldo");
                    System.out.println("Su saldo actual es: $" + saldoUno);
                    break;
                case 2:
                    System.out.println("Retirar");
                    System.out.println("Su saldo actual es: $" + saldoUno);
                    System.out.println("¿Cuanto desea retirar?");
                    double retiro = teclado.nextDouble();

                    if (retiro > saldoUno) {
                        System.out.println("Saldo insuficiente, ingrese otra cantidad");
                        i++;
                    } else {
                        retiro = saldoUno - retiro;
                        System.out.println("Su saldo actualizado es: $" + retiro);
                    }
                    break;
                case 3:
                    System.out.println("Depositar");
                    System.out.println("¿Cual es la cantidad a depositar ");
                    double deposito = teclado.nextDouble();
                    saldoUno = deposito + saldoUno;
                    System.out.println("La cantidad actual ahora es: $" + saldoUno);
                    break;
                case 4:
                    System.out.println("Saliendo, Gracias por usar nuestro servicios");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
        }
    }    
}
