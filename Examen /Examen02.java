import java.util.Scanner;
public class TrabajoDos{
  static Scanner sc = new Scanner(System.in);
  static void salarioyPuntos(){
    // definir variables
    double puntos =0;
    String  bono ="";
    //datos de entrada
    System.out.println("Ingrese sus puntos");
    puntos=sc .nextDouble();  
    //proceso
    if (puntos>=100 && puntos<=200){
      bono="10% ";
    }
   else if (puntos>=201 && puntos<=300){
      bono="40% ";
    }
    else if(puntos>=301 && puntos<=400){
      bono="70% ";
      }
   else if(puntos>401){
     bono="80% ";
   }
   else{
      bono="No alcanzo bono";
   }
    //datos de salida
    System.out.println("gano :"+bono);
  }
    public static void main(String[] arg){
    salarioyPuntos();
  }
}