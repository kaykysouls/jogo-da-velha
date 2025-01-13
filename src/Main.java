import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome de jogador: ");
        String nome = input.nextLine();

        var jogador = new Jogador(nome);
        var palavra = new Palavra();
        var jogo = new Jogo(palavra, jogador);

        jogo.iniciarJogo();

        input.close();
    }
}
