package pe.edu.upeu.modulo;

public class Recursividad{

public int factorial(int n){
if(n>1){

  return factorial(n-1)*n;
}
return 1;
}

}