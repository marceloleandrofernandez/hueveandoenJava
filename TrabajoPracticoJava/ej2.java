import java.util.Scanner;
class ej2{

public static void main(String[] args) {

int suma = 0;
float total =0;
for (int i = 0;i < 60 ;i += 2 ) {
  suma += i;
  System.out.println("Varialble incrementada de dos en dos :"+i);
  System.out.println("Variable suma :"+suma);

}
total = suma/2;
System.out.println("El Total de \"suma\" dividido 2 es "+ total);
}
}
