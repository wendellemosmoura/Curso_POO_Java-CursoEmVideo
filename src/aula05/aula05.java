package aula05;

public class aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Wendel");
        p1.abrirConta("CP");
        p1.depositar(100);
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(1112);
        p2.setDono("Jane");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        p2.fecharConta();
        p2.estadoAtual();

    }
}