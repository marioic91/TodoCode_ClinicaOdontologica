package servlets;

import com.mycompany.clinicaodontologica.logica.ControladoraL;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

@WebServlet(name = "SvLogin", urlPatterns = {"/SvLogin"})
public class SvLogin extends HttpServlet {
    ControladoraL controladoraL = new ControladoraL();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nombreUsuario = request.getParameter("nombre");
        String contrasenia = request.getParameter("contrasenia");
        
        boolean validacion = controladoraL.validacion(nombreUsuario,contrasenia);
        
        if(validacion==true){
            HttpSession miSesion = request.getSession(true);
            miSesion.setAttribute("nombre", nombreUsuario);
            response.sendRedirect("index.jsp");
        }
        else{
            response.sendRedirect("loginError.jsp");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
