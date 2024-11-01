package br.com.pdv.dao;

import br.com.pdv.domain.Cliente;

public interface IClienteDAO {

    void salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);

}
