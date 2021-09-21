package aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Modelo : " + this.modelo + ", Cor: " + this.cor + ", Ponta: " + this.ponta + ", Carga: " + this.carga + ", Tampada: " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada) {
            System.out.println("Erro, não posso rabiscar com a caneta tampada");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
