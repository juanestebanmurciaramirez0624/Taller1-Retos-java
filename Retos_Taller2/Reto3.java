package Retos_Taller2;

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String producto;
        int precio;
        String [][] machine = new String [4][4];
        for(int fila=0;fila<3;fila++)
{
for(int columna=0;columna<3;columna++)
{
        System.out.println("Ingrese el nombre del producto");
        machine[fila][columna]=leer.next();
        
    }
}
for(int i=0;i<3;i++)
{
    for(int j =0;j<3;j++){
        System.out.println("Ingrese el precio del prodcuto");
        machine[i][j]=leer.next();
    }
}
for(int i =0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(machine[i][j]+"\t");
}
System.out.println("");
}
for(int fila =0;fila<3;fila++)
{
for(int columna=0;columna<3;columna++)
{
System.out.print(machine[fila][columna]+"\t");
}
System.out.println("");
}
}
}


