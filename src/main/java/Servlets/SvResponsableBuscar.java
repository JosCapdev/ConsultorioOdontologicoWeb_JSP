package Servlets;

import Logica.Controladora;
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
        Responsable resp= control.traerResponsable(id);
        
        HttpSession miSession = request.getSession();
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
