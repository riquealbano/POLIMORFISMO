package Pessoa;

//Classe Professor herda de Pessoa
public class Professor extends Pessoa {

    // Construtor da classe Professor
    public Professor(String nome) {
        super(nome); // Chama o construtor da superclasse Pessoa
    }

    // Sobrescreve o método obterSaudacao para incluir "Prof."
    @Override
    public String obterSaudacao() {
        return "Olá Prof. " + nome + "!";
    }
}