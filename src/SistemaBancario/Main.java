package SistemaBancario;
import java.util.Scanner;
import SistemaBancario.Model.ContaCorrente;
import static java.lang.System.exit;



public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int opcao;
        ContaCorrente usuario1 = new ContaCorrente();
        System.out.println("Bem vindo ao banco!\nQual seu nome?");
        usuario1.setTitular(read.nextLine());

        while (true) {
            System.out.printf("""
            \nBom te ver por aqui %s, oque deseja fazer?
            Opcao 1: Depositar
            Opcao 2: Sacar
            Opcao 3: Verificar saldo
            Opcao 4: Verificar juros
            Opcao 5: Sair
            """, usuario1.getTitular());
            opcao = read.nextInt();
            switch (opcao){
                case 1:
                    usuario1.depositar();
                    break;
                case 2:
                    usuario1.sacar();
                    break;
                case 3:
                    usuario1.consultarSaldo();
                    break;
                case 4:
                    usuario1.cobrarTarifaMensal();
                    break;
                case 5:
                    exit(1);
            }
        }
    }
}
