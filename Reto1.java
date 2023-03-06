import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
    Scanner grados = new Scanner(System.in);
                    double F,C;
                    System.out.println("Porfavor ingrese el numero de grados Fahrenheit que desea convertir a grados Centigrados");
                    F= grados.nextDouble();
                    C=(F-32)/1.8;
                    System.out.println("Se ha convertido a "+C+"° Centigrados");
                    grados.nextLine();
                        grados.close();
    }
    
}

