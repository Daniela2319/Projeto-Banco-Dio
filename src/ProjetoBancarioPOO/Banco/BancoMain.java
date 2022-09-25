package ProjetoBancarioPOO.Banco;

import ProjetoBancarioPOO.Cliente.Cliente;
import ProjetoBancarioPOO.Conta.Conta;
import ProjetoBancarioPOO.Conta.ContaCorrente;
import ProjetoBancarioPOO.Conta.ContaPoupanca;

public class BancoMain {
    public static void main(String[] args) {

        Cliente dani = new Cliente();
        dani.setNome("Daniela Velter");

        Conta cc = new ContaCorrente(dani);
        cc.depositar(1000.0);

        Conta poupanca = new ContaPoupanca(dani);

        cc.tranferir(250.0, poupanca);

       cc.statusImprimirExtrato();
       poupanca.statusImprimirExtrato();


    }
}
