import Enums.TipoFuncionario;

import java.util.Date;
import java.util.UUID;

public class Funcionario {
    public UUID Id;
    public Date DataContratacao;
    public TipoFuncionario Tipo;
    public Pessoa Pessoa;

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public Date getDataContratacao() {
        return DataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        DataContratacao = dataContratacao;
    }

    public TipoFuncionario getTipo() {
        return Tipo;
    }

    public void setTipo(TipoFuncionario tipo) {
        Tipo = tipo;
    }

    public Pessoa getPessoa() {
        return Pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        Pessoa = pessoa;
    }
}
