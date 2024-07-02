package Servlets;

import Logica.Controladora;
import Logica.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvEditUsuario", urlPatterns = {"/SvEditUsuario"})
public class SvEditUsuario extends HttpServlet {
    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Usuario usu = control.traerUser(id);
        
        HttpSession miSession = request.getSession();
        miSession.setAttribute("usuEditar", usu);
        response.sendRedirect("editarUsuario.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombreUser = request.getParameter("nombreUser");
        String contrasenia = request.getParameter("contrasenia");
        String rol = request.getParameter("rol");
        
        Usuario usu =(Usuario)request.getSession().getAttribute("usuEditar");
        usu.setNombreUsuario(nombreUser);
        usu.setContrasenia(contrasenia);
        usu.setRol(rol);
        
        control.editarUser(usu);
        response.sendRedirect("SvUsuarios");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
