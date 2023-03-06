import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese los meses del bebe");
        double mont = lectura.nextDouble();
        if (mont < 12) {
            System.out.println("Ingrese el peso del bebe");       
            double weight = lectura.nextDouble();
            double total = (weight+10)/(mont*10)*8;
            System.out.println("La dosis de la vacuna es: "+total+" ml");                      
        }
        else{
            System.out.println("El bebe es mayor de un año la dosis no aplica");

        }
        lectura.close();
    }
}