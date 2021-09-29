package aula11;

public class Aula11 {
    public void pratica() {
        // Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();

        Tecnico t1 = new Tecnico();
        t1.setNome("Jurandir");
        t1.setCurso("Eletricista");
        t1.setIdade(27);
        t1.setSexo("M");
        t1.praticar();

        Professor p1 = new Professor();
        p1.setNome("Vanda");
        p1.setIdade(20);
        p1.setSexo("F");
        p1.setEspecialidade("IoT");
        p1.setSalario(4200.98f);
        p1.receberAumento(1000f);
        p1.totalSalario();

        Funcionario f1 = new Funcionario();
        f1.setNome("Ruanda");
        f1.setIdade(19);
        f1.setSexo("F");
        f1.setTrabalhando(true);
        f1.setSetor("Funcionária Pública");
        f1.mudaTrabalho();
        f1.estaTrabalhando();
    }
}
