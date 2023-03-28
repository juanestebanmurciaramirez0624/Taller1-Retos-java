package Salud;

public class Principal {
    public static void main(String[] args) {
        Persona juan = new Persona("TI", 1020725297, "juan", "murcia", 51, 1.68, 17, "Masculino");
        Empleado usuario = new Empleado(null, 0, 0, null);
        usuario.pedirDatosPersona();
        usuario.pedirDatos(); 
        usuario.calcularHonorarios();
        usuario.mostrarempleado();/*
        usuario.mostrarPersona();
        usuario.calcularimc();
        usuario.mayorEdad();
        juan.mostrarPersona();
         */
    }
}
