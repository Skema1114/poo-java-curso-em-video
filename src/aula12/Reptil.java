package aula12;

public class Reptil extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Réptil rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Réptil comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Réptil emitindo som de réptil");
    }
}
