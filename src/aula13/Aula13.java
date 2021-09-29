package aula13;

public class Aula13 {
    public void pratica() {
        // Animal a = new Animal();
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();

        m.emitirSom();
        l.emitirSom();
        c.emitirSom();

        System.out.println("------------------------");

        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
}
