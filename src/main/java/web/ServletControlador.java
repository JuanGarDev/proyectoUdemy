package web;

import domain.Cliente;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import persistencia.ClienteDTO;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       
        //el Servlet recupera la informacion de los clientes
        List<Cliente> clientes = new ClienteDTO().listarClientes();
        //pone al alcance la lista de clientes
        request.setAttribute("clientes", clientes);
        //envia la informacion hacia el jsp de clientes
        request.getRequestDispatcher("clientes.jsp").forward(request, response);
    }
}
