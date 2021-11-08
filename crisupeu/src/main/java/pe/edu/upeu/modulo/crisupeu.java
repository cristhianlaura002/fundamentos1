package pe.edu.upeu.modulo;

public class crisupeu{
  public string nombre="juan";
  private string dni="";
  public scanner sc=new scanner(system.in);

  public void saludo(){
    system.out.printin("hola" +nombre);
  }
}
paquete  pe.edu.upeu.app ;
importar  pe.edu.upeu.modulo. * ;
/ **
 * ¡Hola Mundo!
 *
 * /
 Aplicación de clase  pública {
    
   públicas  estáticas  subprogramas sp;
    public  static  void  main ( String [] args ) {
        Sistema . fuera . println ( " ¡Hola mundo! " );
         sp = nuevos  Subprogramas ();
         sp . saludo ();
         sp . otroSaludo ( " Raúl " );

    }
}