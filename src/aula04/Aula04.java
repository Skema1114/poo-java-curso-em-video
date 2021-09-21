package aula04;

public class Aula04 {
    public void pratica() {
        Caneta c1 = new Caneta("BIC", "Azul", 0.5f);

        //c1.modelo = "BIC";
        //c1.ponta = 0.5f;

        c1.setModelo("BIC");
        c1.setPonta(0.5f);
        c1.status();

        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());

        Caneta c2 = new Caneta("NIC", "Amarela", 0.4f);
        c2.status();

        Caneta c3 = new Caneta("NIC", "Amarela", 0.4f);
        c3.status();
    }
}
