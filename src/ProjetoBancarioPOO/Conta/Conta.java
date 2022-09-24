package ProjetoBancarioPOO.Conta;

import InterfaceConta.IConta;

public abstract class Conta implements IConta {

    private int agencia;
    private int numero;
    private int saldo;


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {

    }
}
