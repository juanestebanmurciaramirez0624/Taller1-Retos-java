package Polimorfismo;

import java.util.Scanner;

public class Cuadrado extends Figura{
    Scanner leer = new Scanner(System.in);
    private float lado; // encapsulado
    public float getLado(){
        return lado;
    }
    public void setLado(float lado){
    this.lado = lado;
    }
    public void IngresarDatos(){
        System.out.println("Ingrese el lado del cuadrado en cm");
        lado = leer.nextFloat();
    }
    @Override // Sobreescribir - Notacion 
    public void calcularArea() { // extends nos permite crear un subclase de una super clase 
    float area = lado*lado;
    System.out.println("El area del cuadrado de lado "+this.lado+" es igual a "+area);
    } 

}
