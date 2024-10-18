package Servlets;

import Logica.Controladora;
import Logica.Secretario;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jose
 */
@WebServlet(name = "SvSecretario", urlPatterns = {"/SvSecretario"})
public class SvSecretario extends HttpServlet {
    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Secretario> listaSecretarios = new ArrayList<Secretario>();
        listaSecretarios = control.getSecretarios();
        HttpSession miSession = request.getSession();
        miSession.setAttribute("listaSec", listaSecretarios);
        response.sendRedirect("verSecretarios.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Secretario sec = new Secretario();
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apell = request.getParameter("apellido");
        String tel = request.getParameter("telefono");
        String dir = request.getParameter("direccion");
        Date fechN = Date.valueOf(request.getParameter("fechNac"));
        String sector = request.getParameter("sector");
        sec.setDni(dni);
        sec.setNombre(nombre);
        sec.setApellido(apell);
        sec.setTelefono(tel);
        sec.setDireccion(dir);
        sec.setFechaNac(fechN);
        sec.setSector(sector);
        control.crearSec(sec);
        response.sendRedirect("index.jsp");
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
