package aula05;

import java.util.Objects;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("Conta " + getNumConta());
        System.out.println("Tipo " + getTipo());
        System.out.println("Dono " + getDono());
        System.out.println("Saldo " + getSaldo());
        System.out.println("Status " + getStatus());
    }

    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (Objects.equals(t, "CC")) {
            setSaldo(50);
        } else {
            setSaldo(150);
            System.out.println("Conta aberta com sucesso");
        }
    }

    public void fecharConta(){
        if (getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
        } else if (getSaldo() < 0){
            System.out.println("Conta não pode ser fechada pois tem débito");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }

    }

    public void depositar(float v) {
        if (getStatus()) {
            setSaldo(getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }

    public void sacar(float v) {
        if (getStatus()) {
            if (getSaldo() >= v) {
                setSaldo(getSaldo() - v);
                System.out.println("Saque realizado na conta de " + getDono());
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if ("CC".equals(getTipo())) {
            v = 12;
        } else if ("CP".equals(getTipo())) {
            v = 20;
        }
        if (getStatus()) {
            setSaldo(getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }

    public ContaBanco() {
        setSaldo(0);
        setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

