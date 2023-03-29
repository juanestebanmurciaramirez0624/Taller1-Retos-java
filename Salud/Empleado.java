package Salud;

import java.util.Scanner;

public class Empleado extends Persona{
    Scanner leer = new Scanner(System.in);
    private String post;
    private int valuehours;
    private int hoursworked;
    private String department;
    private double total;
    public Empleado(String post, int valuehours, int hoursworked, String department){
        this.post = post;
        this.valuehours = valuehours;
        this.hoursworked = hoursworked;
        this.department = department;
    }
    public void pedirDatos(){
        System.out.println("Digite su cargo dentro de la empresa");
        post = leer.nextLine();
        System.out.println("Digite su departamento dentro de la empresa");
        department = leer.nextLine();
        System.out.println("Ingrese  el valor por hora: ");
        valuehours = leer.nextInt();
        System.out.println("Ingrese la cantidad de horas trabjadas: ");
        hoursworked = leer.nextInt();
    }
    public void calcularHonorarios(){
        total = valuehours*hoursworked;
        total = total * 0.966;
    }
    public void mostrarempleado(){
        System.out.println("Su tipo de documento es "+getTypeDoc()+", su numero de documento es "+getDoc()+" su nombre completo es "+getName()+" "+getLastName()+" su cargo en la empresa es "+post+" ha trabajado "+hoursworked+" horas, el valor por hora es "+valuehours+" por lo cual su total a pagar es "+total);
    }
    }
