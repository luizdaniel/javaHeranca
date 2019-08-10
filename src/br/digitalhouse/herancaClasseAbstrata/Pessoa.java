package br.digitalhouse.herancaClasseAbstrata;

public abstract class Pessoa {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String sexo;

    public Pessoa(String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;
    }

    public abstract void  respirar(String nome);

    public void cadastroPessoa(String nome, String sobrenome){
        System.out.println("Dados da pessoa: " + nome + sobrenome);
    }

    public void cadastroPessoa(String nome, String sobrenome, String sexo){
        System.out.println("Dados atualizados: " + nome + " " + sexo);
    }

    public void cadastroPessoa(String nome){
        System.out.println("Dados simples: " + nome);
    }

    public boolean estudar(boolean status){
        return false;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

}
