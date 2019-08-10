package br.digitalhouse.CadastroCliente;

public class Gerente extends Funcionario implements Imposto{
    private String area;

    public Gerente(String nome, Data nascimento, float salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
    }

    @Override
    public float calculaImposto(){
        float CalImposto = (float) (super.getSalario() * 0.05);
        return CalImposto;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Area:" + area);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
