package Retos_Taller2;
import java.util.Scanner;;
public class Reto1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double total;
        double promedio = 0;
        System.out.println("Ingrese el numero de notas: ");
        int num=leer.nextInt();
        int [] notas = new int [num];
            for (int i = 0; i<notas.length; i++) {
                System.out.println("ingrese las notas ");
                notas[i]=leer.nextInt();
            } 
            for (int i : notas) {
                promedio = promedio+i;
            }
            total= promedio/notas.length;
            if (total < 3){
                System.out.println("Su promedio es: "+total+" por lo que usted reprobo");
            }
            else if (total >= 3  && total <=4){
                System.out.println("Su promedio es: "+total+" por lo que usted paso raspando");
            }
            else if (total > 4 ){
                System.out.println("Su promedio es: "+total+" por lo que usted aprobo con buenos resultados");
                
            }
           leer.close(); 
    }
}
