import java.util.Scanner; 
public class EstCondicionalE{
  static Scanner sc = new Scanner(System.in);

  static void ventaLapices(){
    //Definir Variables
    int cantidadLap;
    double pago;
    //Datos entrada
    System.out.println("Ingrese la cantidad de Lapices a comprar:");
    cantidadLap=sc.nextInt();
    //Proceso
    if (cantidadLap>=1000) {
      pago=cantidadLap*0.85;
    } else {
      pago=cantidadLap*0.90;
    }
    //Datos de Salida
    System.out.println("El pago a realizar es:"+pago);
  }

  public static void main(String[] args) {    
    System.out.println("Hello World");   
    ventaLapices();

  }

}