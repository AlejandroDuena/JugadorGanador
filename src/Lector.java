import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lector {
    private int jug1;
    private int jug2;
    private int rondas;
    List<Integer> lista = new ArrayList<>();
    String puntaje = "";
    File archivo = null;
    public void leerArchivo(String nombreEntrada) {
        archivo = new File(nombreEntrada);
        try{
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            rondas = Integer.parseInt(br.readLine());
            if(rondas > 10000){
                enviarError("El numero de rondas sobrepasa el limite.");
            }
            while((puntaje = br.readLine()) != null){
                String[] resultados = puntaje.split(" ");
                jug1 = jug1 + Integer.parseInt(resultados[0]);
                jug2 = jug2 + Integer.parseInt(resultados[1]);
                lista.add(jug1);
                lista.add(jug2);
            }
        } catch (Exception e){
            System.out.println("No se pudo encontrar el archivo.");
        }
    }
    public List<Integer> getLista(){
        return lista;
    }
    private void enviarError(String error){
        System.out.println(error);
        System.exit(-1);
    }
}
