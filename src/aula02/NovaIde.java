package aula02;

public class NovaIde {
    String nome;
    String linguagem;
    boolean configurado;

    void status() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Linguagem: " + this.linguagem);
        System.out.println("Configurado: " + this.configurado);
    }

    void programar() {
        if (this.configurado) {
            System.out.println("Programando...");
        } else {
            System.out.println("Erro, preciso configurar a IDE antes.");
        }
    }

    void configurar() {
        this.configurado = true;
    }

    void instalarIde(String nomeIde, String linguagemIde) {
        this.nome = nomeIde;
        this.linguagem = linguagemIde;
    }
}


