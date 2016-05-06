package consultorioveterinario;

public class Fatura {
    private OrdemServico ordemServico;
    private String status;

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void pagar(Recibo recibo){
    //TODO
    }
}
