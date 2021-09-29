package aula12;

public class Aula12 {
    public void pratica() {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(35.5f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        r.setPeso(20);
        r.setCorEscama("Verde");
        r.alimentar();
        r.locomover();
        r.emitirSom();

        p.setPeso(5);
        p.setCorEscama("Laranja");
        p.alimentar();
        p.locomover();
        p.emitirSom();
        p.soltarBolha();

        a.setPeso(3);
        a.setCorPena("Branco");
        a.alimentar();
        a.locomover();
        a.emitirSom();
        a.fazerNinho();

        System.out.println("-------------------------------------");

        Canguru ca = new Canguru();
        Cachorro ka = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga ta = new Tartaruga();
        Goldfish go = new Goldfish();
        Arara ar = new Arara();

        ca.locomover();
        ka.locomover();
        ca.emitirSom();
        ka.emitirSom();
    }
}
