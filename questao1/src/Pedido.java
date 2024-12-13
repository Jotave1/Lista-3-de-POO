import java.time.LocalDateTime;

public class Pedido {
    private static Integer contadorId = 1; //para identificar cada pedido, será criado um Id para cada um.
    private Integer id;
    private String endereco;
    private LocalDateTime horaCompra;   
    private LocalDateTime horaEntrega;
    private Integer quantBotijoes;
    private Double totalCompra;
    private String status; //para dizer se a compra foi confirmada, entregue, etc.
    private String codigoConfirmacao;

    public Pedido(String endereco) {
        this.id = contadorId++;
        this.endereco = endereco;
        this.horaCompra = LocalDateTime.now();
        this.status = "Pendente";
    }


    public Integer getId() {
        return id;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public LocalDateTime getHoraCompra() {
        return horaCompra;
    }


    public LocalDateTime getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(LocalDateTime horaEntrega) {
        this.horaEntrega = horaEntrega;
    }


    public Integer getQuantBotijoes() {
        return quantBotijoes;
    }

    public void setQuantBotijoes(Integer quantBotijoes) {
        this.quantBotijoes = quantBotijoes;
    }


    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(Double totalCompra) {
        this.totalCompra = totalCompra;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getCodigoConfirmacao() {
        return codigoConfirmacao;
    }

    public void setCogidoConfirmacao(String codigoConfirmacao) {
        this.codigoConfirmacao = codigoConfirmacao;
    }


    public void calcularTotal(Double precoUnitario) {
        this.totalCompra = quantBotijoes * precoUnitario;
    }
}