package Interfaz;

import java.util.Scanner;

public class CaraSello implements Juego {  //IMPLEMENTA INTERFAS 
    Scanner leer = new Scanner(System.in);
    String name;
    int option;
    int random = (int)(Math.random()*2+1);
    @Override
    public void iniciar() {
        System.out.println("Ingrese su nombre");
        name = leer.nextLine();
    }

    @Override
    public void jugar() {
        System.out.println("Jugador: "+name+" Digite 1 para cara o 2 para sello");
        option = leer.nextInt();

    }

    @Override
    public void finalizar() {
        if (option == 1 && random == 1 || option == 2 && random == 2){
            switch (random) {
                case 1:
                    System.out.println("Salio cara usted Gano");
                    break;
                case 2:
                    System.out.println("Salio sello usted Gano");
                    break;
        }
    }
        else{
            switch (random) {
                case 1:
                    System.out.println("Salio cara usted Perdio");
                    break;
                case 2:
                    System.out.println("Salio sello usted Perdio");
                    break;        }

    }
    
}
}
