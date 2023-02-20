public class verificador {
    leerDocumento LD = new leerDocumento();
    public int jug () {
        int jug1 = LD.getJug1();
        int jug2 = LD.getJug2();
        int jugganador = 1;
        int rondas = LD.getRondas();

        while (rondas >= 10000) {
            if (jug2 < jug1) {
                jugganador = 1;
            }
            if (jug1 < jug2) {
                jugganador = 2;
            }
        }
        return jugganador;
    }
    public int ressulfinal () {
        int resfinal = LD.getResfinal();
        int ressecundario = 0;
        int rondas = LD.getRondas();

        while (rondas >= 10000) {
            if (ressecundario < resfinal) {
                ressecundario = resfinal;
            }
        }
        return ressecundario;
    }
}
