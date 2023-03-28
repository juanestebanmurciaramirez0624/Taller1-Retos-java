package Interfaz;
import java.util.Scanner;
public class Prueba {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int option;
        CaraSello coin = new CaraSello();
        PiedraPapelTijera rock = new PiedraPapelTijera();
        System.out.println("Digite 1 para jugar Carasellaso o digite 2 para jugar piedra, papel o tijera");
        option = leer.nextInt();
        switch(option){
            case 1:
            coin.iniciar();
            coin.jugar();
            coin.finalizar();
            break;
            case 2:
            rock.iniciar();
            rock.jugar();
            rock.finalizar();
        }
    leer.close();
    }
}
