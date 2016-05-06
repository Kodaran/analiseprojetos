package consultorioveterinario;

public class Servico {
    private String nomeServico;
    private double valor;

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void tipoServico(){
        Servico servico = new Servico();
        servico.setNomeServico(nomeServico);
        servico.setValor(valor);
    }
    
}
