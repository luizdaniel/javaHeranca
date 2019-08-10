package br.digitalhouse.BancoSantander;

public class Poupanca extends Conta{
    private double taxa;

    public void recolherJuros() {
        setSaldo(getSaldo() + (taxa / 100));
    }
}
