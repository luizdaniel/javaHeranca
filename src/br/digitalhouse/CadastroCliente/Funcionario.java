package br.digitalhouse.CadastroCliente;

public class Funcionario extends Pessoa implements Imposto{
    private float salario;

    public Funcionario(String nome, Data nascimento, float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    @Override
    public float calculaImposto() {
        float CalImposto = (float) (salario * 0.03);
        return CalImposto;
    }

    @Override
    public void imprimeDados() {
        float salComImp=salario - calculaImposto();
        System.out.println("O valor é:" + salComImp);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


}
