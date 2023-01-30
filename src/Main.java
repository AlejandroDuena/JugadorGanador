import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Marcador final de los jugadores.");
        System.out.println("El puntaje maximo es de 10000.");
        System.out.println("Numero de rondas: ");
        int rondas = scanner.nextInt();
        int PuntajeMay1 = 0;
        int PuntajeMay2 = 0;
        int Dif = 0;
        /*int i = 10000;
        int Diferencia;
        System.out.println("Marcadores finales de los jugadores.");
        System.out.println("El puntaje que se ingrese no debe ser mayor a 10000.");
        System.out.println("Ingrese el puntaje de la primera ronda del jugador 1: ");
        int Jug1R1 = Jug.nextInt();
        if (Jug1R1 >= i){
            System.out.println("El puntaje sobrepasa el limite.(Limite de 10000).");
            System.out.println("Favor de ingresar de nuevo el puntaje.");
        }
        System.out.println("Ingrese el puntaje de la segunda ronda del jugador 1: ");
        int Jug1R2 = Jug.nextInt();
        if (Jug1R2 >= i){
            System.out.println("El puntaje sobrepasa el limite.(Limite de 10000).");
            System.out.println("Favor de ingresar de nuevo el puntaje.");
        }
        System.out.println("Ingrese el puntaje de la tercera ronda del jugador 1: ");
        int Jug1R3 = Jug.nextInt();
        if (Jug1R3 >= i){
            System.out.println("El puntaje sobrepasa el limite.(Limite de 10000).");
            System.out.println("Favor de ingresar de nuevo el puntaje.");
        }
        System.out.println("Ingrese el puntaje de la cuarta ronda del jugador 1: ");
        int Jug1R4 = Jug.nextInt();
        if (Jug1R4 >= i){
            System.out.println("El puntaje sobrepasa el limite.(Limite de 10000).");
            System.out.println("Favor de ingresar de nuevo el puntaje.");
        }
        System.out.println("Ingrese el puntaje de la quinta ronda del jugador 1: ");
        int Jug1R5 = Jug.nextInt();
        if (Jug1R5 >= i){
            System.out.println("El puntaje sobrepasa el limite.(Limite de 10000).");
            System.out.println("Favor de ingresar de nuevo el puntaje.");
        }
        System.out.println("Los resultados del primer jugador son ronda 1ra: "+ Jug1R1);
        System.out.println("Los resultados del primer jugador son ronda 2da: "+ Jug1R2);
        System.out.println("Los resultados del primer jugador son ronda 3ra: "+ Jug1R3);
        System.out.println("Los resultados del primer jugador son ronda 4ta: "+ Jug1R4);
        System.out.println("Los resultados del primer jugador son ronda 5ta: "+ Jug1R5);
    System.out.println("Ingrese el puntaje de la primera ronda del jugador 2: ");
    int Jug2R1 = Jug.nextInt();
        if (Jug2R1 >= i){
        System.out.println("El puntaje sobrepasa el limite.(Limite de 10000).");
        System.out.println("Favor de ingresar de nuevo el puntaje.");
    }
        System.out.println("Ingrese el puntaje de la segunda ronda del jugador 2: ");
    int Jug2R2 = Jug.nextInt();
        if (Jug2R2 >= i){
        System.out.println("El puntaje sobrepasa el limite.(Limite de 10000).");
        System.out.println("Favor de ingresar de nuevo el puntaje.");
    }
        System.out.println("Ingrese el puntaje de la tercera ronda del jugador 2: ");
    int Jug2R3 = Jug.nextInt();
        if (Jug2R3 >= i){
        System.out.println("El puntaje sobrepasa el limite.(Limite de 10000).");
        System.out.println("Favor de ingresar de nuevo el puntaje.");
    }
        System.out.println("Ingrese el puntaje de la cuarta ronda del jugador 2: ");
    int Jug2R4 = Jug.nextInt();
        if (Jug2R4 >= i){
        System.out.println("El puntaje sobrepasa el limite.(Limite de 10000).");
        System.out.println("Favor de ingresar de nuevo el puntaje.");
    }
        System.out.println("Ingrese el puntaje de la quinta ronda del jugador 2: ");
    int Jug2R5 = Jug.nextInt();
        if (Jug2R5 >= i){
        System.out.println("El puntaje sobrepasa el limite.(Limite de 10000).");
        System.out.println("Favor de ingresar de nuevo el puntaje.");
    }
        System.out.println("Los resultados del segundo jugador son ronda 1ra: "+ Jug2R1);
        System.out.println("Los resultados del segundo jugador son ronda 2da: "+ Jug2R2);
        System.out.println("Los resultados del segundo jugador son ronda 3ra: "+ Jug2R3);
        System.out.println("Los resultados del segundo jugador son ronda 4ta: "+ Jug2R4);
        System.out.println("Los resultados del segundo jugador son ronda 5ta: "+ Jug2R5);*/
        for (int i = 0; i < rondas; i++) {
            System.out.println("Ingrese el puntaje de la ronda numero " + (i + 1) + " del jugador numero 1: ");
            int jug1 = scanner.nextInt();
            if (i == 0) {
                PuntajeMay1 = jug1;
            } else if (jug1 > PuntajeMay1) {
                PuntajeMay1 = jug1;
            }
            for (int j = 0; j < rondas; j++) {
                System.out.println("Ingrese el puntaje de la ronda numero " + (j + 1) + " del jugador numero 2: ");
                int jug2 = scanner.nextInt();
                if (j == 0) {
                    PuntajeMay2 = jug2;
                } else if (jug2 > PuntajeMay2) {
                    PuntajeMay1 = jug2;
                }
                Dif = jug1-jug2;
            }
            System.out.println("La ronda con el mayor puntaje optenido es: " + Dif);
        }
    }
}
