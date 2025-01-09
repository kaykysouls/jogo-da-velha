public class Main {
    public static void main(String[] args) {
        var jogador = new Jogador("Amor da Evelyn");
        var palavra = new Palavra();
        var jogo = new Jogo(palavra, jogador);

        jogo.iniciarJogo();
    }
}
