package Interfaz;

import java.util.Scanner;

public class PiedraPapelTijera implements Juego{
    Scanner leer = new Scanner(System.in);
    String name;
    int option;
    int random = (int)(Math.random()*3+1);
    @Override
    public void iniciar() {
        System.out.println("Ingrese su nommbre");
        name = leer.nextLine();
    }

    @Override
    public void jugar() {
       System.out.println("Jugador"+name+" Digite 1 para piedra o 2 para tijera o 3 para papel");
       option = leer.nextInt();
    }

    @Override
    public void finalizar() {
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
}
}
