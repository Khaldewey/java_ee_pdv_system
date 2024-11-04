package br.com.pdv.dao;

import br.com.pdv.domain.Cliente;

public class ClienteDAO implements IClienteDAO{

    @Override
    public Boolean salvar(Cliente cliente) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return null;
    }

    @Override
    public void excluir(Long cpf) {
        // TODO Auto-generated method stub
       
    }

}
