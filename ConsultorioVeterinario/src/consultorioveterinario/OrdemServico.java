package consultorioveterinario;

import java.util.ArrayList;

public class OrdemServico {

    private ArrayList<Item> itens;
    private double valorTotal;
    private Cliente cliente;

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void executar(Fatura fatura) {
       //TODO
    }

}
