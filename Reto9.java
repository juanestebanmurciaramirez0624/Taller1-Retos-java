import java.util.Scanner;

public class Reto9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int repeat = 1;
        int bet, coin, value;
        int contador = 0;
        int total = 0;
        System.out.println("Digite el dinero global para apostar: ");
        value = leer.nextInt();
        while(repeat == 1){
            int random=(int)(Math.random()*2+1);
            System.out.println("Su valor global es: "+value+ " ¿Cuanto dinero desea apostar?");
            bet = leer.nextInt();
            System.out.println("Digite 1 para cara o 2 para sello: ");
            coin = leer.nextInt();
            if (coin == 1 && random == 1 || coin == 2 && random == 2) {
                switch (random) {
                    case 1:
                    contador=contador+1;
                    System.out.println("Salio cara usted Gana");
                    total=bet*2;
                    System.out.println("Su apuesta se duplica: "+total);
                    value=value+total;
                    System.out.println("El dinero que acumolo es: "+value);
                    System.out.println("Intentos: "+contador);   
                    break;    
                    case 2:
                    contador=contador+1;
                    System.out.println("Salio Sello usted Gana");
                    total=bet*2;
                    System.out.println("Su apuesta se duplica: "+total);
                    value=value+total;
                    System.out.println("El dinero que acumolo es: "+value);
                    System.out.println("Intentos: "+contador);         
                    break;    
                }
            }
            else{
                switch (random) {
                    case 1:
                    contador=contador+1;
                    System.out.println("Salio Cara usted perdio");
                    value=value-bet;
                    System.out.println("Perdio "+bet+" "+"Por lo cual el dinero que acumulo es: "+value);
                    System.out.println("Intentos: "+contador);            
                    break;
                    case 2:
                    contador=contador+1;
                    System.out.println("Salio Sello usted perdio");
                    value=value-bet;
                    System.out.println("Perdio "+bet+" "+"Por lo cual el dinero que acumulo es: "+value);    
                    System.out.println("Intentos: "+contador);     
                    break;  
            }
             } 
             System.out.println("Digite 1 para repetir o 2 para salir");
             repeat = leer.nextInt();
            } 
            leer.close();
        }
        }
