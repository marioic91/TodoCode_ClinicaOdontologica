package servlets;

import com.mycompany.clinicaodontologica.logica.ControladoraL;
import com.mycompany.clinicaodontologica.logica.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvEditarUsuario", urlPatterns = {"/SvEditarUsuario"})
public class SvEditarUsuario extends HttpServlet {
    ControladoraL controladoraL = new ControladoraL();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        int id = Integer.parseInt(request.getParameter("id"));
        Usuario usuario = controladoraL.buscarUsuario(id);
        
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("usuario", usuario);
        
        response.sendRedirect("editarUsuario.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nombre = request.getParameter("nombre");
        String contrasenia = request.getParameter("contrasenia");
        String rol = request.getParameter("rol");
        
        Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
        usuario.setNombre(nombre);
        usuario.setContrasenia(contrasenia);
        usuario.setRol(rol);
        
        controladoraL.editarUsuario(usuario);
                
        response.sendRedirect("SvUsuarios");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
