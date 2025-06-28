package SistemaBancario.Model;

import java.util.Scanner;

public class ContaBancaria {
    Scanner read = new Scanner(System.in);
    protected double saldo;
    private String titular;


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar() {
        System.out.println("Valor a ser depositado: ");
        double valor = read.nextDouble();
        if (valor <= 0) {
            System.out.println("Digite um deposito válido");
        } else {
            saldo += valor;
            System.out.printf("Déposito de R$%.2f realizado com sucesso! Seu saldo atual é de R$%.2f", valor, saldo);
        }
    }

    public void sacar() {
        System.out.println("Valor a ser sacado");
        double valor = read.nextDouble();
        if (saldo <= 0) {
            System.out.printf("Você não pode sacar dinheiro pois você tem %.2f", saldo);
        } else if (valor > saldo) {
            System.out.printf("Não é possível sacar R$%.2f pois seu saldo atual é de R$%.2f", valor, saldo);
        } else {
            saldo -= valor;
            System.out.printf("Você sacou R$%.2f com sucesso! Seu saldo atual é de R$%.2f", valor, saldo);
        }
    }

    public void consultarSaldo() {
        if (saldo < 0) {
            System.out.println("Sem saldo");
        }else {
            System.out.printf("Saldo de R$%.2f", saldo);
        }
    }
}
