package Pessoa;

//Classe Aluno herda de Pessoa
public class Aluno extends Pessoa {

    // Construtor da classe Aluno
    public Aluno(String nome) {
        super(nome); // Chama o construtor da superclasse Pessoa
    }

    // Sobrescreve o método obterSaudacao para incluir "Aluno"
    @Override
    public String obterSaudacao() {
        return "Olá Aluno " + nome + "!";
    }
}