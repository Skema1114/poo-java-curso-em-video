package aula12;

public class Ave extends Animal {
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void fazerNinho() {
        System.out.println("Ave construindo um ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Ave voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Ave comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Ave emitindo som de ave");
    }
}
