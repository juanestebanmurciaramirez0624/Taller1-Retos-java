package Polimorfismo;
import java.util.Scanner;

public class Triangulo extends Figura {
    Scanner leer = new Scanner(System.in);

    private float b;
    private float h;
    public float getB(){
        return b;
    }
    public void setB(float b){
    this.b = b;
    }
    public float getH(){
        return h;
    }
    public void setH(float h){
    this.h = h;
    }
    public void IngresarDatosT(){
        System.out.println("Ingrese la base del triangulo en cm");
        b = leer.nextFloat();
        System.out.println("Ingrese la altura del triangulo en cm");
        h = leer.nextFloat();
    }
    @Override
    public void calcularArea() {
        float area = (b*h)/2;
        System.out.println("El area del triangulo con base "+this.b+" y altura "+this.h+" es igual a "+area);
    }
    
}
