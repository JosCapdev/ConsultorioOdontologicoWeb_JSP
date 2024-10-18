package Servlets;

import Logica.Controladora;
import Logica.Secretario;
import java.io.IOException;
import java.sql.Date;
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
@WebServlet(name = "SvEditSec", urlPatterns = {"/SvEditSec"})
public class SvEditSec extends HttpServlet {
    Controladora control = new Controladora();   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("idSec"));
        Secretario sec= control.traerSec(id);
        
        HttpSession miSession = request.getSession();
        miSession.setAttribute("secEditar", sec);
        response.sendRedirect("editarSecretario.jsp");
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apell = request.getParameter("apellido");
        String tel = request.getParameter("telefono");
        String dir = request.getParameter("direccion");
        Date fechN = Date.valueOf(request.getParameter("fechNac"));
        String sector = request.getParameter("sector");
        
        Secretario sec =(Secretario)request.getSession().getAttribute("secEditar");
        sec.setDni(dni);
        sec.setNombre(nombre);
        sec.setApellido(apell);
        sec.setTelefono(tel);
        sec.setDireccion(dir);
        sec.setFechaNac(fechN);
        sec.setSector(sector);
        
        control.editarSec(sec);
        response.sendRedirect("SvSecretario");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
