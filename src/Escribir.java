import java.io.File;
import java.io.FileWriter;

public class Escribir {
    public static void main(String[] args) {
        String Rondas = "5\n" +
                "140 82\n" +
                "89 134\n" +
                "90 110\n" +
                "112 106\n" +
                "88 90\n";
        try{
            File archivo=new File("ronda.txt");
            FileWriter escribir=new FileWriter(archivo,true);
            escribir.write(Rondas);
            escribir.close();
        } catch (Exception e){
            System.out.println("Error al escribir.");
        }
    }
}
