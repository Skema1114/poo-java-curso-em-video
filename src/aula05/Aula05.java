package aula05;

public class Aula05 {
    public void pratica() {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(1114);
        c1.setDono("Rafael");
        c1.abrirConta("CC");

        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(2300);
        c2.setDono("Ruandervanderleiderssom");
        c2.abrirConta("CP");

        c1.depositar(100);
        c2.depositar(500);

        c2.sacar(100);

        c1.sacar(150);
        c1.fecharConta();

        c1.estadoAtual();
        c2.estadoAtual();
    }
}
