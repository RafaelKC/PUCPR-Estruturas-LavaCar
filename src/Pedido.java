import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Pedido {
    private UUID Id;
    private Date DataPedido;
    private ArrayList<Servico> Servicos;

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public Date getDataPedido() {
        return DataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        DataPedido = dataPedido;
    }

    public ArrayList<Servico> getServicos() {
        return Servicos;
    }

    public void setServicos(ArrayList<Servico> servicos) {
        Servicos = servicos;
    }

    public ArrayList<UUID> getIdsServicos() {
        ArrayList<UUID> resultado = new ArrayList<>();
        Servicos.forEach(s -> resultado.add(s.getId()));
        return resultado;
    }

    public double getTotalPedido() {
        double resultado = 0;
        for (Servico s : Servicos) {
            resultado += s.getValor();
        }
        return resultado;
    }
}
