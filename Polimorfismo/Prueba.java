package Polimorfismo;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuadrado cul = new Cuadrado();
        Triangulo tri = new Triangulo();
        Circulo cir = new Circulo();
        Rectangulo rec = new Rectangulo();
        int tipo, option = 1;
        while (option == 1) {
            System.out.println("Digite 1 para cuadrado, 2 para triangulo, 3 para circulo o 4 para rectangulo");
            tipo = leer.nextInt();
            switch (tipo) {
                case 1:
                    cul.IngresarDatos();
                    cul.calcularArea();
                    break;
                case 2:
                    tri.IngresarDatosT();
                    tri.calcularArea();
                break;
                case 3: 
                    cir.IngresarDatosC();
                    cir.calcularArea();
                break;
                case 4: 
                    rec.IngresarDatosR();
                    rec.calcularArea();
                break;
        }
        System.out.println("Digite 1 para continuar o 2 para salir");
        option = leer.nextInt();
        }
        leer.close();
    }

}
