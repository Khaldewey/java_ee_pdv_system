package br.com.pdv.dao;

import br.com.pdv.domain.Cliente;

public class ClienteDaoMock implements IClienteDAO {

    @Override
    public void salvar(Cliente cliente) {
       
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

}
