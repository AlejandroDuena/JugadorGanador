import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Creador {
    public static void main(String[] args) {
        Lector LD = new Lector();
        if(args.length < 2){
            System.out.println("Se requieren 2 archivos, uno de entrada y otro de salida.");
            System.exit(-1);
        }
        String entradaArchivo;
        entradaArchivo = args[0];
        String salidaArchivo;
        salidaArchivo = args[1];
        LD.leerArchivo(entradaArchivo);
        Verificador ver = new Verificador();
        ver.setlector(LD);
        ver.resfinal();
        int jugganador = ver.getJugganador();
        int ventaja = ver.getVentaja();
        FileWriter fichero = null;
        PrintWriter pw = null;

        try
        {
            fichero = new FileWriter(salidaArchivo);
            pw = new PrintWriter(fichero);
            pw.println(jugganador +" "+ ventaja);
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
