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

    public Recibo pagar(double dinheiroRecebido) {
        Recibo recibo = new Recibo();

        double valorFatura = ordemServico.getValorTotal();

        double restantePagar = valorFatura - dinheiroRecebido;

        if (restantePagar == 0) {
            this.setStatus("Pago");
        } else if (restantePagar > 0) {
            this.setStatus("Pagamento parcial.");
        } else if (restantePagar < 0) {
            this.setStatus("Juros / acréscimos.");
        }

        recibo.setValorFatura(restantePagar);

        return recibo;
    }
}
