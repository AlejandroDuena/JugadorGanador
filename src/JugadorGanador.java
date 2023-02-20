import java.io.*;
import java.lang.Math;

public class JugadorGanador {

    public static void main(String[] args) {
        /*String Rondas = "";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            archivo = new File ("ronda.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            int j1=0,j2=0;
            int resfinal;
            int ressecundario = 0;
            int jugganador = 1;
            
            while((Rondas=br.readLine())!=null) {
                String[] resultados = Rondas.split(" ");
                if(resultados.length != 1) {

                    j1 = j1 + Integer.parseInt(resultados[0]);
                    j2 = j2 + Integer.parseInt(resultados[1]);
                    resfinal = Math.abs(j1-j2);

                    if (ressecundario < resfinal) {
                        ressecundario = resfinal;

                        if (j1 < j2) {
                            jugganador = 2;
                        }
                        else if (j2 < j1) {
                            jugganador = 1;
                        }
                    }
                }
            }

            try
            {
                fichero = new FileWriter("marcfinal.txt");
                pw = new PrintWriter(fichero);
                pw.println(jugganador +" "+ ressecundario);
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
        catch(Exception e){
            e.printStackTrace();
        }*/
    }
}