package br.com.pdv.services;

import br.com.pdv.domain.Cliente;

public interface IClienteService {

    void salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);

}
