package br.com.pdv.services;


import br.com.pdv.dao.IClienteDAO;
import br.com.pdv.domain.Cliente;

public class ClienteService implements IClienteService {
    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO){
        this.clienteDAO = clienteDAO;
    }
    @Override
    public Boolean salvar(Cliente cliente) {
       return clienteDAO.salvar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return clienteDAO.buscarPorCPF(cpf);
    }
    @Override
    public void excluir(Long cpf) {
        // TODO Auto-generated method stub
       
    }
    

}
