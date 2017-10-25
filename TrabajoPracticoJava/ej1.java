import java.util.Scanner;
class ej1{

public static void main(String[] args) {
  Scanner teclado=new Scanner(System.in);
  System.out.println("Ejercicio N°1");
  int A,A1,suma = 0;

  do {
        System.out.println("Ingrese Valor a la Variable A :");
        A = teclado.nextInt();
        System.out.println("Ingrese Valor a la Variable A1 :");
        A1 = teclado.nextInt();
        suma += (A + A1);
    } while (A != 0 || A1 != 0);

  System.out.print("La suma de los valores es: ");
  System.out.print(suma + "\n");

}

}
