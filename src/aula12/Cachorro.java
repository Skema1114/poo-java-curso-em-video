package aula12;

public class Cachorro extends Mamifero {

    public void enterrarOsso() {
        System.out.println("Cachorro enterrando o osso");
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanando o rabo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Cachorro latindo");
    }
}
