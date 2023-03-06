import java.util.Scanner;

public class Reto5 {
        public static void main(String[] args) {
            Scanner lectura = new Scanner(System.in);
            System.out.println("Digite su nombre");
            String name = lectura.nextLine();
            System.out.println("Digite su apellido");
            String lastName = lectura.nextLine();
            System.out.println("su nombre se compone de "+name.length()+" letras y su apellido se compone de "+lastName.length()+ " letras"); //name.length() sirve para saber el numero de letras de la variable
            System.out.println("Su nombre es: "+name.toUpperCase());//.toUpperCase() convierte en mayuscula
            System.out.println("Su apellido es: "+lastName.toLowerCase());//.toLowerCase() convierte en minuscula
            String fullname = name+" "+lastName;
            System.out.println("Su nombre completo es: "+fullname );
            System.out.println("Su apodo es: "+name.substring(0,2)+lastName);//.substring permite tomar x letras de la variable
            lectura.close();
        }
    }