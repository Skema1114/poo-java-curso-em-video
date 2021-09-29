package aula11;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public void estaTrabalhando() {
        if (this.isTrabalhando()) {
            System.out.println(this.getNome() + " está trabalhando!");
        } else {
            System.out.println(this.getNome() + " NÃO está trabalhando!");
        }
    }

    public void mudaTrabalho() {
        this.setTrabalhando(!this.isTrabalhando());
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
