import java.io.FileReader;
import java.io.BufferedReader;

class ej3{

public static void main(String[] args) {
String texto = "";
String[] separa;
int cantalu = 0, cantvar = 0, cantmujsol = 0;
try {
            FileReader lector = new FileReader("datos.txt");
            BufferedReader contenido = new BufferedReader(lector);
            while((texto = contenido.readLine()) != null){
                  System.out.println(texto);
                  cantalu++;
                  separa = texto.split(",");
                  if (separa[1].equals("1")) {
                     cantvar++;
                  }
                  if (separa[1].equals("2") && separa[2].equals("1")) {
                     cantmujsol++;
                  }
                }
}catch(Exception e){
                    System.out.println("Error al leer");
                   }
                   System.out.println("Totales");
System.out.println("Cantidad de Alumnos: "+(cantalu-1));
System.out.println("Cantidad de Varones: "+cantvar);
System.out.println("Cantidad de Mujeres Solteras: "+cantmujsol);
}
}
