package Pessoa;

public class Pessoa {
    protected String nome;

    // Construtor da classe Pessoa
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Método para gerar a saudação - sobrescrito nas subclasses
    public String obterSaudacao() {
        return "Olá " + nome + "!";
    }

    // Método enviarEmail - usa a saudação
    public void enviarEmail(String mensagem) {
        System.out.println(obterSaudacao() + "\n" + mensagem);
    }
}
