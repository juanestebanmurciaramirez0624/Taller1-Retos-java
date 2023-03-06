import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        double discount, total;
        System.out.println("Digite el valor de su compra");
        int value = lectura.nextInt();
        int random=(int)(Math.random()*4+1);
        if (value > 50000) {
            System.out.println("Su compra fue beneficiada con la promosion del aniversario");
            switch (random) {
                case 1:
                System.out.println("Saco una bola roja por lo cual tiene 10% de descuento");
                discount=value*0.1;
                total=value-discount;
                System.out.println("El valor total de su compra con el descuento es: "+total);
                    break;
                case 2:{}
                System.out.println("Saco una bola azul por lo cual tiene 30% de descuento");
                discount=value*0.3;
                total=value-discount;
                System.out.println("El valor total de su compra con el descuento es: "+total);
                break;
                case 3:
                System.out.println("Saco una bola amarrilla por lo cual tiene 50% de descuento");
                discount=value*0.5;
                total=value-discount;
                System.out.println("El valor total de su compra con el descuento es: "+total);
                break;
                case 4:
                System.out.println("Saco una bola blanca por lo cual su compra es gratis");
                total=value-value;
                System.out.println("valor a pagar: "+total);
                break;
            }
            }
            else{
                System.out.println("Su compra no es mayor a 50000 por lo cual no tiene descuento");
                System.out.println("valor a pagar: "+value);
            }
            lectura.close();
        }
    }
