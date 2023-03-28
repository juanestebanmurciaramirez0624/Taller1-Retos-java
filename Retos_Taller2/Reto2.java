package Retos_Taller2;

    import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int number;
            int i, win = 0, time1 = 0;
            System.out.println("Ingrese la cantidad de competidores: ");
            number = leer.nextInt();
            String [] name = new String [number];
            int [] time = new int [number];
            for (i = 0; i<number; i++) {
                System.out.println("ingrese el nombre del nadador numero " +(i+1)+":");
                name[i]=leer.next();
                System.out.println("ingrese el tiempo del competidor numero "+(i+1)+" en minutos:");
                time[i]=leer.nextInt();
            } 
            for (i = 0; i<number; i++) {
                if (time[i]<time[0]) {
                    time1 = time[i];
                    win = i;
                }
                System.out.println("El competidor numero "+(i+1)+" con nombre "+name[i]+ " tiene un tiempo de "+time[i]+ " minutos" );
            }
            System.out.println("El primer lugar es del competidor "+name[win]+" y su tiempo es de "+time1+" minutos");
            leer.close();
        }
    }
}
