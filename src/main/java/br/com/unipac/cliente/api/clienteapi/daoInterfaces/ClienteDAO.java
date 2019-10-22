package br.com.unipac.cliente.api.clienteapi.daoInterfaces;

import br.com.unipac.cliente.api.clienteapi.models.Cliente;

import java.util.List;

public interface ClienteDAO {

    boolean salvar(Cliente cliente);

    boolean alterar(Long id, Cliente cliente);

    List<Cliente> listaTodos();

    boolean buscaPorId(Cliente cliente);

    boolean removerPorId(Cliente cliente);

}
