package br.com.pdv;

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
public class ClienteTest {

   private IClienteService clienteService;
    public ClienteTest(){
      IClienteDAO dao = new ClienteDaoMock();
      clienteService =  new ClienteService(dao);
    }
    @Test
    public void pesquisarCliente(){
      Cliente cliente = new Cliente();
      cliente.setCpf(32145698787l);
      cliente.setNome("Virgulino");
      cliente.setCidade("São Paulo");
      cliente.setEnd("End");
      cliente.setEstado("SP");
      cliente.setTel(987987987l);

      clienteService.salvar(cliente);

      Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());

      Assert.assertNotNull(clienteConsultado);
    }

}
