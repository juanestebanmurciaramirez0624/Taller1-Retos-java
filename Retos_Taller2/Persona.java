package Retos_Taller2;
import java.util.Scanner;

public class Persona {
    Scanner leer = new Scanner(System.in);
    private String typeDoc;
    private int doc;
    private String name;
    private String lastname;
    private int wheit;
    private double height;
    private  int age;
    private String gender;
    public String getypeDoc(){
        return gender;

    };
    public Persona(){
    }
    public Persona(String typeDoc, int doc, String name, String lastname, int wheit, double height, int age, String gender){
        this.typeDoc = typeDoc;
        this.doc = doc; 
        this.name = name;
        this.lastname = lastname;
        this. wheit = wheit;
        this.height = height;
        this.age = age;
        this. gender = gender;
    }
    public void pedirDatos(){
        System.out.println("Ingrese su nombre: ");
        name = leer.nextLine();
        System.out.println("Ingrese su apellido:");
        lastname = leer.nextLine();
        System.out.println("Ingrese tipo de documento: ");
        typeDoc = leer.nextLine();
        System.out.println("Ingrese su numero de documento: ");
        doc = leer.nextInt();
        System.out.println("Ingrese su peso en kg: ");
        wheit = leer.nextInt();
        System.out.println("Ingrese su altura: ");
        height = leer.nextDouble();
        System.out.println("Ingrese su edad: ");
        age = leer.nextInt();
        System.out.println("Ingrese su genero: ");
        gender = leer.nextLine();
        }
    public void mostrarPersona(){
        System.out.println("Su tipo de documento es "+typeDoc+" identificado con el numero "+doc+" su nombre completo es "+name+" "+lastname+" su peso es "+wheit+" kg mientras que su altura es "+height+" cm tiene la edad de "+age+" y su genero es "+gender);
    }
    public void calcularimc (){
        double total=wheit/(height*height);
        System.out.println("Su imc es: "+total);
        if (total < 20 ) {
            System.out.println("el peso está por debajo de lo ideal"); 
        }
        else if (total >= 20 && total <= 25) {
            System.out.println("Su peso es el ideal");
        }
        else if (total > 25) {
            System.out.println("Usted tiene soprepeso");  
        }
    }
    public void mayorEdad(){
        if (age < 18) {
            System.out.println("Usted es menor de edad");
        }
        else if (age >= 18){
            System.out.println("Usted es mayor de edad");
        }
    }
    }