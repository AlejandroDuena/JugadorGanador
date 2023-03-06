import java.util.List;

public class Verificador {
    int ventaja = 0;
    int jugganador;
    public void resfinal () {

        List<Integer> lista = lector.getLista();

        for(int i = 0;i < lista.size();i+=2) {
           int vensecundaria = Math.abs(lista.get(i) - lista.get(i+1));
            System.out.println(vensecundaria);
           if(vensecundaria > ventaja){
               ventaja = vensecundaria;
               if(lista.get(i) > lista.get(i+1)){
                   jugganador = 1;
               } else {
                   jugganador = 2;
               }
           }
        }
    }

    public int getVentaja() {
        return ventaja;
    }

    public int getJugganador() {
        return jugganador;
    }

    private Lector lector;
    public void setlector(Lector lector){
        this.lector = lector;
    }
}
