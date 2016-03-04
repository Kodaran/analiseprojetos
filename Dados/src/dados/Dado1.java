package dados;

import java.util.Random;

public class Dado1 {

    public int valor;
    
    public int rolar() {    
        Random gerador = new Random();
        return valor = gerador.nextInt(5) + 1;       
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
}
