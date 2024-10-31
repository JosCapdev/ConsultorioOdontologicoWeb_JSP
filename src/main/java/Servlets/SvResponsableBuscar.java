package Servlets;

import Logica.Controladora;
import Logica.Paciente;
import Logica.Responsable;
import java.io.IOException;
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
@WebServlet(name = "SvResponsableBuscar", urlPatterns = {"/SvResponsableBuscar"})
public class SvResponsableBuscar extends HttpServlet {
    Controladora control = new Controladora();
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("idPacient"));
        Paciente pac = control.traerPacient(id);
        Responsable resp= pac.getUnResposable();
        String pacienteDatos = pac.getNombre()+" "+pac.getApellido()+" "+pac.getDni();
        HttpSession miSession = request.getSession();
        miSession.setAttribute("pacientBuscar", pacienteDatos);
        miSession.setAttribute("respBuscar", resp);
        response.sendRedirect("verResponsableDelPaciente.jsp");
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {      
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
