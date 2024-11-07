package br.com.pdv;


import org.junit.Before;
import org.junit.Test;

import br.com.pdv.dao.ClienteDaoMock;
import br.com.pdv.dao.IClienteDAO;
import br.com.pdv.domain.Cliente;
import junit.framework.Assert;

public class ClienteDAOTest {
 private IClienteDAO clienteDao;
 private Cliente cliente;

 public ClienteDAOTest(){
    clienteDao = new ClienteDaoMock();
 } 

 @Before
  public void init(){
    cliente = new Cliente();
    cliente.setCpf(32145698787L);
    cliente.setNome("Virgulino");
    cliente.setCidade("São Paulo");
    cliente.setEnd("End");
    cliente.setEstado("SP");
    cliente.setTel(987987987l);
    clienteDao.salvar(cliente);
  }
 
  @Test
  public void pesquisarCliente(){
    Cliente clienteConsultado = clienteDao.buscarPorCPF(cliente.getCpf());
    Assert.assertNotNull(clienteConsultado);
  }

  @Test
  public void salvarCliente(){
   Boolean retorno = clienteDao.salvar(cliente);
   Assert.assertTrue(retorno);
  }

  @Test
  public void excluirCliente(){
   clienteDao.excluir(cliente.getCpf());
  }

  @Test
  public void alterarCliente(){
   cliente.setNome("Israel");
   clienteDao.alterar(cliente);

   Assert.assertEquals("Israel",cliente.getNome());
  }
}
