package SistemaBancario.Detalhes;

public class ContaCorrente extends ContaBancaria {
    private double taxaJuros = 0.01;

    public void cobrarTarifaMensal() {
        double juros = saldo * taxaJuros;
        saldo -= juros;
        System.out.printf("O seu juros foi de R$%.2f, e foi descontado do seu saldo atual. Valor atual %.2f", juros, saldo);
    }

}
