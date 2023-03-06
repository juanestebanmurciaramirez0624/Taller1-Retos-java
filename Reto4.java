import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite 1 para piedra o 2 para tijera o 3 para papel");
        int random=(int)(Math.random()*3+1);
        int option= lectura.nextInt();
        System.out.println("su oponente saco: ");
        switch (random) {
            case 1:
            System.out.println("papel");
            switch (option) {
                case 1:
                System.out.println("usted perdio");
                    break;
                case 2:
                System.out.println("usted gano");
                    break;
                case 3:
                System.out.println("es un empate");
                    break;
            }
            break;
            case 2:
            System.out.println("piedra");
            switch (option) {
                case 1:
                System.out.println("es un empate");
                    break;
                case 2:
                System.out.println("usted perdio");
                    break;
                case 3:
                System.out.println("usted gano");
                    break;
            }
            break;
            case 3:
            System.out.println("tijera");
            switch (option) {
                case 1:
                System.out.println("usted gano");
                    break;
                case 2:
                System.out.println("es un empate");
                    break;
                case 3:
                System.out.println("usted perdio");
                    break;
            }
            break;
        }
        lectura.close();
    }
}