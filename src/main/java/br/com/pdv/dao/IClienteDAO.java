package br.com.pdv.dao;

import br.com.pdv.domain.Cliente;

public interface IClienteDAO {

    Boolean salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente);

}
