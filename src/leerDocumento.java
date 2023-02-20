import java.io.*;
import java.lang.Math;
import java.util.Scanner;

public class leerDocumento {

    private int jug1;
    private int jug2;
    private int resfinal;

    private int rondas;

    String Rondas = "";
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;

    {
        archivo = new File("ronda.txt");
        try {
            fr = new FileReader(archivo);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        br = new BufferedReader(fr);
        int j1 = 0, j2 = 0;
        int resfinal;
        int rondas;
        while (true) {
            try {
                if (!((Rondas = br.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String[] resultados = Rondas.split(" ");
            if (resultados.length != 1) {

                j1 = j1 + Integer.parseInt(resultados[0]);
                setJug1(j1);
                j2 = j2 + Integer.parseInt(resultados[1]);
                setJug2(j2);
                resfinal = Math.abs(j1 - j2);
                setResfinal(resfinal);
                try {
                    Scanner sc = new Scanner(archivo);
                    rondas = sc.nextInt();
                    setRondas(rondas);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public int getJug1() {
        return jug1;
    }

    public void setJug1(int jug1) {
        this.jug1 = jug1;
    }

    public int getJug2() {
        return jug2;
    }

    public void setJug2(int jug2) {
        this.jug2 = jug2;
    }

    public int getResfinal() {
        return resfinal;
    }

    public void setResfinal(int resfinal) {
        this.resfinal = resfinal;
    }

    public int getRondas() {
        return rondas;
    }

    public void setRondas(int rondas) {
        this.rondas = rondas;
    }
}
