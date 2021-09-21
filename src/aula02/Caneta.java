package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo : " + this.modelo + ", Cor: " + this.cor + ", Ponta: " + this.ponta + ", Carga: " + this.carga + ", Tampada: " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada) {
            System.out.println("Erro, não posso rabiscar com a caneta tampada");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
