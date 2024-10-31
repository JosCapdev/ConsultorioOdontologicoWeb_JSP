package Servlets;

import Logica.Controladora;
import Logica.Paciente;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jose
 */
@WebServlet(name = "SvElimPacient", urlPatterns = {"/SvElimPacient"})
public class SvElimPacient extends HttpServlet {
    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("idPacient"));
        Paciente pac = control.traerPacient(id);
        int idResp = pac.getUnResposable().getId();
        if(idResp!=0){
            control.eliminarResp(idResp);
        }
        control.eliminarPacient(id);
        response.sendRedirect("SvPaciente");
   
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
