package aula14;

public class Aula14 {
    public void pratica() {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 12 de POO");
        v[1] = new Video("Aula 1 de PHP");
        v[2] = new Video("Aula 19 de Javascript");

        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "jubs");
        g[1] = new Gafanhoto("Jalene", 24, "F", "jalens");

        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
    }
}
