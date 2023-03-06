public class Reto6 {
    public static void main(String[] args) {
        int diceOne = (int)(Math. random()*6+1); 
        int diceTwo = (int)(Math. random()*6+1); 
        System.out.println("En el primer dado saco "+diceOne+" y en el segundo dado saco "+diceTwo);
        if (diceOne+diceTwo == 2) {
            System.out.println("Saco un total de 2 usted gano");
        }
        else if(diceOne+diceTwo == 3){
            System.out.println("Saco un total de 3 usted gano");
        }
        else if(diceOne+diceTwo == 12){
            System.out.println("Saco un total de 12 usted gano");
        }
        else if(diceOne+diceTwo == 11){
            System.out.println("Saco un total de 11 usted gano");
        }
        else if(diceOne == diceTwo){
            System.out.println("Saco par usted gano");
        }
    else if(diceOne+diceTwo == 7){
        System.out.println("Saco un total de 7 usted gano");
}
else {
    System.out.println("Perdio");
}
}
}

