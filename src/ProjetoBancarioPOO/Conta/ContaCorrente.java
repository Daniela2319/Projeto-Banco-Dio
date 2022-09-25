package ProjetoBancarioPOO.Conta;

import ProjetoBancarioPOO.Cliente.Cliente;
import ProjetoBancarioPOO.Conta.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void statusImprimirExtrato() {
        System.out.println("===Extrato Conta Corrente===");
        super.imprimirInformComunsStatus();
    }
}

