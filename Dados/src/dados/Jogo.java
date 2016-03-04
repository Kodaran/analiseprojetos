package dados;

public class Jogo {

    public boolean jogar(int valor1, int valor2) {

        System.out.println(valor1 + valor2);
        
        int soma = valor1 + valor2;

        if (soma == 7) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Dado1 dado1 = new Dado1();
        Dado2 dado2 = new Dado2();

        Jogo jogo = new Jogo();

        int valor1 = dado1.rolar();
        int valor2 = dado2.rolar();

        boolean deuCerto = jogo.jogar(valor1, valor2);

        System.out.println(deuCerto);
    }
}
