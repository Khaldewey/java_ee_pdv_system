package br.com.pdv.dao;

import br.com.pdv.domain.Cliente;

public class ClienteDaoMock implements IClienteDAO {

    @Override
    public Boolean salvar(Cliente cliente) {
       return true;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

    @Override
    public void excluir(Long cpf) {
        // TODO Auto-generated method stub
        
    }

}
