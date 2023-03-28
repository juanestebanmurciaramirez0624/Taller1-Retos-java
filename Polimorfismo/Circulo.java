package Polimorfismo;
import java.util.Scanner;
public class Circulo extends Figura {
    Scanner leer = new Scanner(System.in);

    private float ra;
    public float getR(){
        return ra;
    }
    public void setR(float r){
        this.ra = r;
    }
    public void IngresarDatosC(){
        System.out.println("Ingrese el radio del circulo en cm");
        ra = leer.nextFloat();
    }
    @Override
    public void calcularArea() {
      double area = 3.14*(ra*ra);
      System.out.println("El area del circulo con radio "+this.ra+" el igual a "+area);
    }
   
}
