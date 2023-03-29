package Principal;

import Salud.Empleado;
import Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Persona juan = new Persona("TI", 1020725297, "juan", "murcia", 51, 1.68, 17, "Masculino");
        Empleado usuario = new Empleado(null, 0, 0, null);
        usuario.pedirDatosPersona();
        usuario.pedirDatos(); 
        usuario.calcularHonorarios();
        usuario.mostrarempleado();
        double total=usuario.getIMC(0);
        if (total < 20 ) {
            System.out.println("el peso está por debajo de lo ideal"); 
        }
        else if (total >= 20 && total <= 25) {
            System.out.println("Su peso es el ideal");
        }
        else if (total > 25) {
            System.out.println("Usted tiene soprepeso");  
        }
        usuario.mostrarPersona();
        usuario.calcularimc();
        usuario.mayorEdad();
        juan.mostrarPersona();
    }       
    }

