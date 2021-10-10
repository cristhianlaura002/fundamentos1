import java.util.Scanner;

public class Brayner4BA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, n2, opcion, resultado;
        System.out.print("Ingresa el valor de n1: ");
        n1 = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de n2: ");
        n2 = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de opcion: ");
        opcion = in.nextDouble();
        in.nextLine();
        resultado=0;
        if(opcion==1)
            resultado=n1+n2;
        if(opcion==2)
            resultado=n1-n2;
        if(opcion==3)
            resultado=n1*n2;
        if(opcion==4)
            resultado=n1/n2;    
        System.out.println("Valor de resultado: " + resultado);
    }

}