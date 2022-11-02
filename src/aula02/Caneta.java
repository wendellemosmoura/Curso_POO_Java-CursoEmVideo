package aula02;

public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;

    public void status(){
        System.out.println("Uma caneta cor " + this.cor);
        System.out.println("Uma caneta ponta " + this.ponta);
        System.out.println("Uma caneta modelo " + this.modelo);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Carga da caneta " + this.carga);
    }

    public void rabiscar(){
        if (this.tampada) {
            System.out.println("ERRO, não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}
