package Servlets;

import Logica.Controladora;
import Logica.Responsable;
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
@WebServlet(name = "SvEditResp", urlPatterns = {"/SvEditResp"})
public class SvEditResp extends HttpServlet {
    Controladora control = new Controladora();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {   
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("idResp"));
        Responsable resp= control.traerResponsable(id);
        
        HttpSession miSession = request.getSession();
        miSession.setAttribute("respEditar", resp);
        response.sendRedirect("editarResp.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apell = request.getParameter("apell");
        String tel = request.getParameter("telf");
        String dir = request.getParameter("direc");
        Date fechN = Date.valueOf(request.getParameter("fechNac"));
        String tipoResp = request.getParameter("parentesco");
        
        Responsable resp =(Responsable)request.getSession().getAttribute("respEditar");
        resp.setDni(dni);
        resp.setNombre(nombre);
        resp.setApellido(apell);
        resp.setTelefono(tel);
        resp.setDireccion(dir);
        resp.setFechaNac(fechN);
        resp.setTipoResp(tipoResp);
        
        control.editarResp(resp);
        response.sendRedirect("verPacientes.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
