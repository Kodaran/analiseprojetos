package consultorioveterinario;

import java.util.List;

public class OrdemServico {

    private List<Item> itens;
    private double valorTotal;
    private Cliente cliente;

    public OrdemServico(List<Item> itens, Cliente cliente) {
        this.itens = itens;
        this.cliente = cliente;
    }

    public OrdemServico() {
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
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

    public Fatura executar() {

        Fatura fatura = new Fatura();
        OrdemServico ordemServico = new OrdemServico();

        double valorOrdem = 0;

        for (int i = 0; i < itens.size(); i++) {
            valorOrdem += itens.get(i).getQuantidade() * itens.get(i).getValorUnitario();
        }

        ordemServico.setValorTotal(valorOrdem);
        fatura.setStatus("Em aberto.");
        fatura.setOrdemServico(ordemServico);

        return fatura;
    }
}
