package br.com.pdv;

import org.junit.Before;
import org.junit.Test;

import br.com.pdv.dao.ClienteDaoMock;
import br.com.pdv.dao.IClienteDAO;
import br.com.pdv.domain.Cliente;
import br.com.pdv.services.ClienteService;
import br.com.pdv.services.IClienteService;
import junit.framework.Assert;

/**
 * @author israel.alves
 */
public class ClienteServiceTest {

  private IClienteService clienteService;

  private Cliente cliente;
  public ClienteServiceTest(){
    IClienteDAO dao = new ClienteDaoMock();
    clienteService =  new ClienteService(dao);
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
  }

  @Test
  public void pesquisarCliente(){
    Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
    Assert.assertNotNull(clienteConsultado);
  }
  
  @Test
  public void salvarCliente(){
   Boolean retorno = clienteService.salvar(cliente);
   Assert.assertTrue(retorno);
  }
  
  @Test
  public void excluirCliente(){
   clienteService.excluir(cliente.getCpf());
  }
}
