package aula02;

public class Aula02 {
    public void pratica() {
        Caneta c1 = new Caneta();

        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;

        c1.tampar();
        c1.rabiscar();
        c1.status();

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";

        c2.destampar();
        c2.status();
        c2.rabiscar();

        NovaIde nide1 = new NovaIde();
        nide1.instalarIde("IntelliJ", "Java");
        nide1.status();
        nide1.programar();

        NovaIde nide2 = new NovaIde();
        nide2.instalarIde("VSCode", "Typescript");
        nide2.configurar();
        nide2.status();
        nide2.programar();
    }
}
