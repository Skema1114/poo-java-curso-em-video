package aula15;

public class Aula15 {
    public void pratica() {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 12 de POO");
        v[1] = new Video("Aula 1 de PHP");
        v[2] = new Video("Aula 19 de Javascript");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "jubs");
        g[1] = new Gafanhoto("Jalene", 24, "F", "jalens");

        // System.out.println(v[0].toString());
        // System.out.println(v[1].toString());
        // System.out.println(v[2].toString());

        // System.out.println(g[0].toString());
        // System.out.println(g[1].toString());

        Visualizacao vz[] = new Visualizacao[5];
        vz[0] = new Visualizacao(g[0], v[2]);
        vz[0].avaliar();
        System.out.println(vz[0].toString());

        vz[1] = new Visualizacao(g[0], v[1]);
        vz[1].avaliar(87.0f);
        System.out.println(vz[1].toString());
    }
}
