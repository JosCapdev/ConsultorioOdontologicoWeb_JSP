package Servlets;

import Logica.Controladora;
import Logica.Paciente;
import Logica.Responsable;
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
@WebServlet(name = "SvResponsable", urlPatterns = {"/SvResponsable"})
public class SvResponsable extends HttpServlet {
    Controladora control = new Controladora();
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         List<Responsable> listaResponsables = new ArrayList<Responsable>();
        listaResponsables = control.getResponsables();
        HttpSession miSession = request.getSession();
        miSession.setAttribute("listaResp", listaResponsables);
        response.sendRedirect("verResponsables.jsp");
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Responsable resp = new Responsable();
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apell = request.getParameter("apellido");
        String tel = request.getParameter("telefono");
        String dir = request.getParameter("direccion");
        Date fechN = Date.valueOf(request.getParameter("fechNac"));
        String tipoResp = request.getParameter("parentesco");
        resp.setDni(dni);
        resp.setNombre(nombre);
        resp.setApellido(apell);
        resp.setTelefono(tel);
        resp.setDireccion(dir);
        resp.setFechaNac(fechN);
        resp.setTipoResp(tipoResp);
        control.crearResp(resp);
        
        Paciente pac = (Paciente) request.getSession().getAttribute("pacConResp");
        pac.setUnResposable(resp);
        control.crearPacient(pac);
        response.sendRedirect("index.jsp");
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
