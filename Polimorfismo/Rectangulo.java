package Polimorfismo;
import java.util.Scanner;

public class Rectangulo  extends Figura{
    Scanner leer = new Scanner(System.in);

    private float b;
    private float h;
    public float getB(){
        return b;
    }
    public void setB(Float b){
        this.b = b;
    }
    public float getH(){
        return h;
    }
    public void setH(Float h){
        this.h = h;
    }
    public void IngresarDatosR(){
        System.out.println("Ingrese la base del rectangulo en cm");
        b = leer.nextFloat();
        System.out.println("Ingrese la altura del rectangulo en cm");
        h = leer.nextFloat();
    }
    @Override
    public void calcularArea() {
        float area = b*h;
        System.out.println("El area del rectangulo con base "+this.b+" y altura "+this.h+" es igual a "+area); 
    }
    
}
