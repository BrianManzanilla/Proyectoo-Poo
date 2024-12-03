package Vista;
import Modelo.Cuenta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
       boolean candado = true;       
       Scanner entrada = new Scanner(System.in);
       ArrayList<Cuenta> cuentas = new  ArrayList<>();
       int i;
       
       do{
       System.out.println("Elija su opcion: ");
       System.out.println("0 - Crear cuenta");
       System.out.println("1 - Elegir cuenta");
       System.out.println("2 - Retiro");
       System.out.println("3 - Pago");
       System.out.println("4 - Abono");
       System.out.println("5 - Transferencia");
       System.out.println("6 - Consultar saldos");
       System.out.println("7 - Terminar");
       int opcion = entrada.nextInt();
       
         switch(opcion){
             case 0:
                 int[] numCuenta= new int[6];
                 System.out.println("Digite el nombre del propietario de la cuenta: ");
                 String nombreCuenta = entrada.next();
                 double saldoCuenta = 0;
                 for( i=1 ; i<=numCuenta.length ; i++ ){
                     numCuenta[i] = (int)(Math.random() * 9) + 1;
                 }               
                 Cuenta cuenta = new Cuenta(nombreCuenta, saldoCuenta, numCuenta);
                 cuentas.add(cuenta);
                 System.out.println("Cuenta creada con exito");
                 break;                            
             case 1:
                 System.out.println("Elija la cuenta: ");
                 for(i=1 ; i <= cuentas.size(); i++){
                    for( i=1 ; i <= cuentas.size(); i++){
                     System.out.println( i + "- " + cuentas.get(i).getNombre() + "|" + Arrays.toString(cuentas.get(i).getID()) + "\n");
                     }
                    int eleccionCuenta = entrada.nextInt();
                 }
                 break;
             case 2:

                 break;
             case 3:

                 break;
             case 4:

                 break;
             case 5:

                 break;
             case 6:

                 break;
             case 7:

                 break;
             default: System.out.println("Elija una opcion valida. ");       
       }
       } while(candado);
       
    
       
    
    }
    
}
