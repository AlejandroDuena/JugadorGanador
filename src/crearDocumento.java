import java.io.FileWriter;
import java.io.PrintWriter;

public class crearDocumento {
    public static void main(String[] args) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        verificador vr = new verificador();
        int jugganador = vr.jug();
        int ressulfinal = vr.ressulfinal();

        try
        {
            fichero = new FileWriter("marcfinal.txt");
            pw = new PrintWriter(fichero);
            pw.println(jugganador +" "+ ressulfinal);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
