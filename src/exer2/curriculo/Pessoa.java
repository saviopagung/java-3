package exer2.curriculo;

public class Pessoa {
    String nome;
    int idade;
    String sexo;
    String profissao;

    public Pessoa(String nome, int idade, String sexo, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.profissao = profissao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public String getProfissao() {
        return profissao;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " | Idade: " + idade + " | Sexo: " + sexo + " | Profissao: " + profissao;
    }
}
