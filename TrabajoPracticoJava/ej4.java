import java.io.FileReader;
import java.io.BufferedReader;

class ej4{

public static void main(String[] args) {
String texto = "";
String[] separa;
int cantvar = 0, cantmujsol = 0;
int cantmuj2030=0, cantmujcas3040=0,cantmujcas=0,cantvarsol25=0,cantvarcas=0;
try {
            FileReader lector = new FileReader("datos.txt");
            BufferedReader contenido = new BufferedReader(lector);
            while((texto = contenido.readLine()) != null){
                  System.out.println(texto);
                  separa = texto.split(",");
                  if (separa[1].equals("2") && (Integer.parseInt(separa[0])) >= 20 && (Integer.parseInt(separa[0]) <= 30) ) {
                    cantmuj2030++;
                  }
                  if (separa[1].equals("2") && separa[2].equals("2") && (Integer.parseInt(separa[0])) >= 30 && (Integer.parseInt(separa[0]) <= 40) ) {
                    cantmujcas3040++;
                  }
                  if (separa[1].equals("2") && separa[2].equals("2")) {
                    cantmujcas++;
                  }
                  if (separa[1].equals("1")) {
                     cantvar++;
                  }
                  if (separa[1].equals("1") && separa[2].equals("2") && (Integer.parseInt(separa[0])) == 25  ){
                     cantvarsol25++;
                  }
                  if (separa[1].equals("1") && separa[2].equals("1")) {
                    cantvarcas++;
                  }
                }
}catch(Exception e){
                    System.out.println("Error al leer");
                   }
                   System.out.println("Totales");
System.out.println("Cantidad de Mujeres entre 20 y 30 años: "+cantmuj2030);
System.out.println("Cantidad de Mujeres Casadas entre 30 y 40 años: "+cantmujcas3040);
System.out.println("Cantidad de Mujeres Casadas: "+cantmujcas);
System.out.println("Cantidad de Varones: "+cantvar);
System.out.println("Cantidad de Varones Solertos con edad 25: "+cantvarsol25);
System.out.println("Cantidad de Varones Casados: "+cantvarcas);
}
}
