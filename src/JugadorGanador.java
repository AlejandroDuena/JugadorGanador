import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class JugadorGanador {
    public static void main(String[] args) {
        String Rondas = "";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File ("ronda.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            while((Rondas=br.readLine())!=null);
        }
        catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                FileReader lector = new FileReader("Rondas");
                BufferedReader contenido = new BufferedReader(lector);
                while ((Rondas = contenido.readLine()) != null) {
                    System.out.println(Rondas);
                }
            } catch (Exception e) {
                System.out.println("Error al escribir.");
            }
        }
    }
}