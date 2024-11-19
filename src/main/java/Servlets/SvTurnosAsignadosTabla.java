package Servlets;

import Logica.Controladora;
import Logica.Paciente;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "SvTurnosAsignadosTabla", urlPatterns = {"/SvTurnosAsignadosTabla"})
public class SvTurnosAsignadosTabla extends HttpServlet {
    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("idPacTurn"));
        Paciente pac= control.traerPacient(id);
        
        HttpSession miSession = request.getSession();
        miSession.setAttribute("pacientTurnTab", pac);
        response.sendRedirect("altaTurno.jsp");
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
