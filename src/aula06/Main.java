package aula06;

public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.play();
        c.pause();
        c.abrirMenu();
        c.fecharMenu();
    }
}