package persistencia;

import domain.Cliente;
import java.util.List;

public class ClienteDTO {
    
    ClienteDAO clienteDao = new ClienteDAO();
    
    public List<Cliente> listarClientes(){
        return clienteDao.listarClientes();
    }
    
    public Cliente buscarCliente(Cliente cliente){
        return clienteDao.buscarCliente(cliente);
    }
    
    public void insertarCliente(Cliente cliente){
        clienteDao.insertarCliente(cliente);
    }
    
    public void actualizarCliente(Cliente cliente){
        clienteDao.actualizarCliente(cliente);
    }
    
    public void eliminarCliente(Cliente cliente){
        clienteDao.eliminarCliente(cliente);
    }
    
}
