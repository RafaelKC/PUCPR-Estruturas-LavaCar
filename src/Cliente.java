import Enums.TipoCliente;

import java.util.ArrayList;
import java.util.UUID;

public class Cliente {
    private UUID Id;
    private TipoCliente Tipo;
    private Pessoa Pessoa;
    private Empresa Empresa;
    private ArrayList<Carro> Carros;

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public TipoCliente getTipo() {
        return Tipo;
    }

    public void setTipo(TipoCliente tipo) {
        Tipo = tipo;
    }

    public Pessoa getPessoa() {
        return Pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        Pessoa = pessoa;
    }

    public Empresa getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(Empresa empresa) {
        Empresa = empresa;
    }

    public ArrayList<Carro> getCarros() {
        return Carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        Carros = carros;
    }
}
