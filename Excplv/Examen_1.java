import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio1 {

    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));   

    public int leer(int valor, String msg) {
        System.out.println(msg);
        try {
            valor=Integer.parseInt(br.readLine());
        }
        catch(Exception e) {
            valor=leer(valor,msg);  
        }
        System.out.println();
        return valor;
    }

    public long leer(long valor, String msg){  
        System.out.print(msg);
        try{
          valor=Long.parseLong(br.readLine());
        }
        catch(Exception e){
          valor=leer(valor, msg);
        }
        System.out.println();
        return valor;
    }
    public double leer(double valor, String msg) {
        System.out.println(msg);
        try {
            valor=Double.parseDouble(br.readLine());
        }
        catch (Exception e) {
            valor=leer(valor,msg);
        }
        System.out.println();
        return valor;    
    }


    public char leer(char valor, String msg) {
        System.out.println(msg);
        try {
            valor=br.readLine().charAt(0);
        }
        catch (Exception e) {
            valor=leer(valor,msg);
        }
        System.out.println();
        return valor;    
    }


    public String leer(String valor, String msg) {
        System.out.println(msg);
        try {
            valor=br.readLine();
        }
        catch (Exception e) {

            valor=leer(valor,msg);
        }
        System.out.println();
        return valor;      
    }  
    public boolean leer(boolean valor, String msg) {
        System.out.println(msg);
        try {
            valor=Boolean.parseBoolean(br.readLine());
        }
        catch (Exception e) {

            valor=leer(valor,msg);
        }
        System.out.println();
        return valor;        
    }
}




import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        int i, suma = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un n??mero: ");
        n = sc.nextInt();
        for (i = 1; i < n; i++) {                              
            if (n % i == 0) {
                suma = suma + i;   
            }
        }
        if (suma == n) {                           
            System.out.println("Perfecto");
        } else {
          System.out.println("No es perfecto");


        }
    }
}

import java.util.Scanner;

public class ejercicio3 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
     double descuento, monto_de_pago, monto_del_descuento, precio_del_producto;
     String nombre_del_producto;
     String tecla_repetir;
     do {
       System.out.print("Ingresa la categoria del vehiculo: ");
        nombre_del_producto = in.nextLine();
        System.out.print("Ingresa la cantidad de impuesto: ");
        descuento = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor del vehiculo: ");
          precio_del_producto = in.nextDouble();
          in.nextLine();
          in.nextLine();
          monto_del_descuento=descuento*precio_del_producto/100;
          monto_de_pago=precio_del_producto-monto_del_descuento;
          System.out.println("categoria del vehiculo: " + nombre_del_producto);
          System.out.println("Valor de monto de pago: " + monto_de_pago);
          System.out.println("Valor de monto del descuento: " + monto_del_descuento);
          System.out.println();
          do {
            System.out.print("\u00BFDeseas repetir el proceso? (S/N): ");
             tecla_repetir = in.nextLine();
            } while (!tecla_repetir.equalsIgnoreCase("s") && !tecla_repetir.equalsIgnoreCase("n"));
        } while (tecla_repetir.equalsIgnoreCase("s"));
    }

}



import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] ARGS)
    {
        Scanner obtenerNumero = new Scanner(System.in);
        int numero,i,j;

        System.out.print("indica la tabla de multiplicar: ");
        numero = obtenerNumero.nextInt();

        for(i = 1; i<=numero; i++)
        {
            for(j = 1; j <= 20; j++)
            {
                System.out.println(i + " X " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}


class ejercicio5 {
    static int [] vec = {312, 614, 88, 22, 54};

    void ordenar (int [] v, int cant) {
        if (cant > 1) {
            for (int f = 0 ; f < cant - 1 ; f++)
                if (v [f] > v [f + 1]) {
                    int aux = v [f];
                    v [f] = v [f + 1];
                    v [f + 1] = aux;
                }
            ordenar (v, cant - 1);
        }
    }

    void imprimir () {
        for (int f = 0 ; f < vec.length ; f++)
            System.out.print (vec [f] + "  ");
        System.out.println("\n");
    }


    public static void main (String [] ar)  {
        Recursivdad r = new Recursivdad();
        r.imprimir ();
        r.ordenar (vec, vec.length);
        r.imprimir ();
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        for (int numeroDeTabla = 1; numeroDeTabla <= 20; numeroDeTabla++) {

            imprimirTabla(numeroDeTabla);
        }
    }

    public static void imprimirTabla(int numeroDeTabla) {
        for (int x = 1; x <= 20; x++) {
            String formato = "%d x %d = %d";
            String linea = String.format(formato, numeroDeTabla, x, numeroDeTabla * x);
            System.out.println(linea);
        }
    }
}