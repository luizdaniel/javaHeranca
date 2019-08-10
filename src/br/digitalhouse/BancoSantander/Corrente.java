package br.digitalhouse.BancoSantander;

public class Corrente extends Conta{
    private double limite;//2000

    public void deposito(Cheque cheque) {
        System.out.println("Realizando deposito de cheque...  quantia: R$" + cheque.getValor());
        this.setSaldo(getSaldo() + cheque.getValor());
        System.out.println("Deposito realizado " + this.getCliente().getNome() + ", novo saldo R$" + this.getSaldo());
    }

    @Override
    public void saque(double quantia) {//quantia=1000
        System.out.println("Realizando saque... quantia: R$" + quantia);

        //saldo=600
        if (this.getSaldo() < quantia) {
            System.out.println("Saldo insuficiente, sacando do limite, cuidado");

            if (limite > quantia) {
                this.setSaldo(getSaldo() - (limite - quantia));//saldo=-400
                this.limite -= quantia;//limite=1000
            } else {
                System.out.println("Saldo insuficiente, vc ta sem grana " + this.getCliente().getNome() + " :(");
            }
        }else{
            //(saldo=-400 - quantia=1000) = -1400
            this.setSaldo(this.getSaldo() - quantia);
        }

        System.out.println("Saque realizado" + this.getCliente().getNome() + ", novo saldo R$" + this.getSaldo());
    }

}
