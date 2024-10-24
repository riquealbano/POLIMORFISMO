package Main;

// Import para pegar as classes de outro pacote
import Pessoa.Aluno;
import Pessoa.Professor;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Professor e Aluno
        Professor prof = new Professor("Bruce Wayne");
        Aluno estudante = new Aluno("Batman");

        // Mensagem para os emails
        String corpoMensagem = "Sou Bilionário!!!\n";
        String euSou = "I am Batman!\n";

        // Enviando email para o professor
        prof.enviarEmail(corpoMensagem);

        // Enviando email para o aluno
        estudante.enviarEmail(euSou);
    }
}