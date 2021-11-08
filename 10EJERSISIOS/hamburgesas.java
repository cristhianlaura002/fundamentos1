public class Ejercicio1 {

static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    
    //Definir variables
    float salario;
    
    //Datos de entrada
    System.out.println("Ingrese el salario inicial");
    salario=sc.nextInt();
    
    //Proceso
    if (salario>=1500){

        for(int i = 1;i <= 6;i++){

         salario+=(salario*0.10);

          //Datos de salida

          System.out.println("  el salario en " +i+  " anho es  : "+salario);
          
        }
        System.out.println("  el salario al cabo de 6 anhos es "+salario);

      }
    else{
      System.out.println("el numero ingresado no es correcto");
    }
  }
    
}




import java.util.Scanner; 
public class Ejercicio2 {
static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    
    //Definir variables
    int h,th,fp,S=20,D=25,T=28,total=0;
    double resultado;
    //Datos de entrada

    System.out.println("Ingrese la cantidad  de hamburguesas:");
    h=sc.nextInt();

    for(int i = 0;i < h;i++){
    
      System.out.println("Selecciona el tipo de hamburguesas que desea.");
      System.out.println("\t1.- sensilla");
      System.out.println("\t2.- doble");
      System.out.println("\t3.- triple");
      System.out.print("\t: ");
        do {
        th = sc.nextInt();
        sc.nextLine();
        if (th<1||th>3)
        System.out.print("Valor incorrecto. Ingrese nuevamente.: ");
        }while (th<1||th>3);

      if(th==1){total=total+=S;}
      else if(th==2){total+=D;}
      else{total+=T;}
      
    }
    

    System.out.println("Ingrese el tipo de pago:");
    System.out.println("\t1.- Tarjeta");
    System.out.println("\t2.- Efectivo");
    System.out.print("\t: ");
      do {
      fp = sc.nextInt();
      sc.nextLine();
      if (fp<1||fp>3)
      System.out.print("Valor incorrecto. Ingrese nuevamente.: ");
      }while (fp<1||fp>3);
    if(fp==1){
      resultado=total+(total*0.05);
      System.out.print("El total a pagar es $ : "+resultado+"\nSe aplico un cargo del 5%\nGRASIAS POR SU COMPRA\n");
    }
    else {
      System.out.print("El total a pagar es $ : "+total+"\nGRASIAS POR SU COMPRA\n");
    }
  
  
  public class Ejercicio3 {

static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    
    //Definir variables
    int n,numero,a=0,b=0,c=0;
  
    //Datos de entrada
    System.out.println("Programa que determina numeros menores,mayores e iguales a cero");
    System.out.println("Ingresa la cantidad de numeros a ejecutar:");
    n=sc.nextInt();
    
    //Proceso
    for(int i = 0;i < n;i++){

      System.out.println("ingresa el numero");
      numero=sc.nextInt();
      if(numero>0){
        a=a+1;
      }
      else if(numero<0){
        b=b+1;
      }
      else {
        c=c+1;

      }
    }
    //Datos de salida
   System.out.println("numeros  mayores a 0 :"+a+"\nnumeros menores a 0 :"+b+"\nnumeros iguales a 0 :"+c);
  
        
  }
    
}
  

  }

        
}


import java.util.Scanner; 

public class Ejercicio4 {

static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    
    //Definir variables
    int n,color,verde=0,blanco=0,rojo=0;
  
    //Datos de entrada
    System.out.println("Programa que determina el color de focos");
    System.out.println("Ingrese la cantidad de focos");
    n=sc.nextInt();
    for(int i = 0;i < n;i++){

    System.out.println("Selecciona el color.");
    System.out.println("\t1.- verde");
    System.out.println("\t2.- blanco");
    System.out.println("\t3.- rojo");
    System.out.print("\t: ");
    do {
      color = sc.nextInt();
      sc.nextLine();
      if (color<1||color>3)
      System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
    } while (color<1||color>3);
    
    if(color==1){verde+=1;}
    else if(color==2){blanco+=1;}
    else {rojo+=1;} 
    }
    
    System.out.println("El total de focos verdes es :"+verde+"\nEl total de focos blancos es :"+blanco+"\nEl total de focos rojos es :"+rojo);    
  }
    
}

import java.util.Scanner; 

public class Ejercicio5 {

static Scanner sc = new Scanner(System.in);


  public static void main(String[] args) {
    
    
    int n=365;

    
    for(int i = 1;i <=n;i++){

      double resultado = (double)(Math.pow(3, i));
          
          
          
      System.out.println("El ahorro del dia  "+i+"  es:  "+resultado+"  pesos");
    }
    System.out.println("El ahorro de un anho  es:  "+(double)(Math.pow(3, n))+"  pesos");
    
  }
    
    

}

import java.util.Scanner; 
public class Ejercicio6 {

static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    
    //Definir variables
    int n=1,nota;
    String nombre;
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String blanco = "\033[37m";
    //Datos de entrada
    System.out.println("\tCONDICION DE ESTUDIANTE");
    do {
      System.out.print("Ingrese el nombre:  ");
      nombre=sc.nextLine();
      System.out.print("Ingrese la nota:  ");
      nota = sc.nextInt();
      
      if (nota>13) {
        System.out.println("\t"+ verde +nombre+ "  Aprobado");
      }
      else{
        System.out.println("\t"+ rojo +nombre+"   Reprobado");
      }
      System.out.print(blanco+"Desea continuar (1 = si)(# = No): ");
      n = sc.nextInt();
      sc.nextLine();

    }while (n==1);

  }
  
}


import java.util.Scanner; 

public class Ejercicio7 {

static Scanner sc = new Scanner(System.in);


  public static void main(String[] args) {
    
    //Definir variables
    int n;

    //Datos de entrada
    System.out.println("Ingrese un numero entero positivo");
    n=sc.nextInt();
    
    //Proceso
    if (n>0){

        int resultado = (int)(Math.pow(n, 3));
          
          //Datos de Salida
          
          System.out.println("el cubo del numero  "+n+"  es:  "+resultado);
        }
    else{
      System.out.println("el numero ingresado no es correcto");
    }
    }
    
    

}


import java.util.Scanner; 

public class Ejercicio8 {

static Scanner sc = new Scanner(System.in);


  public static void main(String[] args) {
    
    //Definir variables
    int k;

    //Datos de entrada
    System.out.println("Ingrese un numero entero positivo");
    k=sc.nextInt();
    
    //Proceso
    if (k>0){

        for(int i = 1;i <= 12;i++){

          //Datos de salida

          System.out.println(k+"  por  " +i+  "  es igual a: "+k*i);
        }

    }
    
    else{
      System.out.println("El numero ingresado no es correcto"+"\nintentalo nuevamente");

    }

    }

}

import java.util.Scanner; 

public class Ejercicio9 {

static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    
    //Definir variables
    int n=12,a,ahorro,total=0;
  
    //Datos de entrada
    System.out.println("\tPrograma que determina la inversion final");
    System.out.println("Ingrese los anhos de ahorro");
    a=sc.nextInt();
    a=(a*n);
    for(int i = 1;i <=a;i++){
    System.out.println("Ingrese el ahorro del mes."+i);
    System.out.print("\t: ");
    ahorro=sc.nextInt();

      if(ahorro>0){
      total+=ahorro;
      }
      else {
      System.out.println("Ingrese un numero valido");
      }
    }
    System.out.println("la inversion final es:\n"+(total+(total*0.1)));
    
  
  }
}


import java.util.Scanner; 

public class Ejercicio10 {

static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    
    //Definir variables
    int n,precio;
    double t1=0,t2=0,t3=0,d1=0;
    
  
    //Datos de entrada
    System.out.println("Programa que determina el precio a pagar");
    System.out.println("Ingrese la cantidad de articulos");
    n=sc.nextInt();
    for(int i = 1;i <=n;i++){
    System.out.println("\nIngrese el precio de del articulo."+i);
    System.out.print("\t: ");
    precio=sc.nextInt();
    
    if(precio>=200){
      t1=(precio-(precio*0.15));
      d1=(precio*0.15);
      System.out.print("el precio es; \n"+precio+"   su descuento es : "+d1);
    
    }else if(precio>100&&precio<200){
      t2=(precio-(precio*0.12));
      d2=(precio*0.12);
      System.out.print("el precio es; \n"+precio+"   su descuento es : "+d2);
    }else {
      t3=(precio-(precio*0.1));
       d3=(precio*0.12);
      System.out.print("el precio es; \n"+precio+"   su descuento es : "+d3);
  
    }
    System.out.print("\nel precio final :"+(t1+t2+t3)+"\nGRASIAS POR SU COMPRA\n");
  }
  
}