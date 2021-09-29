package aula11;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void totalSalario() {
        System.out.println("O salario total de " + this.getNome() + " é R$ " + this.getSalario());
    }

    public void receberAumento(float valor) {
        this.setSalario(this.getSalario() + valor);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
