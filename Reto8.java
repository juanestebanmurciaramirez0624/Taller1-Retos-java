import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        int  references, price, money;
        double discount,acumulador,exchange;
        acumulador = 0;
        Scanner leer= new Scanner(System.in);
        int random=(int)(Math.random()*4+1);
        System.out.println("Ingrese cantidad de productos");
        references = leer.nextInt();
        for (int x = 1; x <= references ; x++) {
            System.out.println("Digite el precio del producto");
            price = leer.nextInt();
            acumulador = acumulador + price;
            System.out.println("El Total a pagar es: "+acumulador);
    }
        if (acumulador > 50000) {
            System.out.println("Su compra fue beneficiada con la promosion del aniversario");
            switch (random) {
                case 1:
                System.out.println("Saco una bola roja por lo cual tiene 10% de descuento");
                discount=acumulador*0.1;
                acumulador=acumulador-discount;
                System.out.println("El valor total de su compra con el descuento es: "+acumulador);
                    break;
                case 2:
                System.out.println("Saco una bola azul por lo cual tiene 30% de descuento");
                discount=acumulador*0.3;
                acumulador=acumulador-discount;
                System.out.println("El valor total de su compra con el descuento es: "+acumulador);
                break;
                case 3:
                System.out.println("Saco una bola amarrilla por lo cual tiene 50% de descuento");
                discount=acumulador*0.5;
                acumulador=acumulador-discount;
                System.out.println("El valor total de su compra con el descuento es: "+acumulador);
                break;
                case 4:
                System.out.println("Saco una bola blanca por lo cual su compra es gratis");
                acumulador=acumulador-acumulador;
                System.out.println("valor a pagar: "+acumulador);
                break;
            }
            }
            else{
                System.out.println("Su compra no es mayor a 50000 por lo cual no tiene descuento");
                System.out.println("valor a pagar: "+acumulador);
            }
            System.out.println("Digite el valor del billete");
            money = leer.nextInt();
            exchange = money-acumulador;
            System.out.println("Su cambio es de: "+exchange);
            leer.close();
    }
    
}