import java.util.Scanner;

public class Reto3  {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Digite 1 para cara o 2 para sello ");
        int random=(int)(Math.random()*2+1);
        int  coin = lectura.nextInt();
        if (coin == 1 && random == 1 || coin == 2 && random == 2){
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
       lectura.close();
}
}
}