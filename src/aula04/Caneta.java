package aula04;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;


    public Caneta(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampar();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void tampar() {
        tampada = true;
    }

    public void destampar() {
        tampada = false;
    }

    public void status() {
        System.out.println("Sobre a Caneta: ");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ponta: " + getPonta());
        System.out.println("Cor: " + getCor());
        System.out.println("Tampada " + tampada);
    }
}
