import java.util.Scanner;

public class VacunaDeTipoABYC {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edad, sexo;
        System.out.print("Ingresa el valor de edad: ");
        edad = in.nextInt();
        in.nextLine();
        System.out.println("Selecciona el valor de sexo.");
        System.out.println("\t1.- mujer");
        System.out.println("\t2.- hombre");
        System.out.print("\t: ");
        do {
            sexo = in.nextInt();
            in.nextLine();
            if (sexo<1||sexo>2)
                System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
        } while (sexo<1||sexo>2);
        if((sexo==2&&edad>=16&&edad<70)||edad<16)
            System.out.println("A");
        if(sexo==1&&edad>=16&&edad<70)
            System.out.println("B");
        if(edad>70)
            System.out.println("C");
    }

}