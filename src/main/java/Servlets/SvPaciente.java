package Servlets;

import Logica.Controladora;
import Logica.Paciente;
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
@WebServlet(name = "SvPaciente", urlPatterns = {"/SvPaciente"})
public class SvPaciente extends HttpServlet {
    Controladora control = new Controladora();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Paciente> listaPacientes = new ArrayList<Paciente>();
        listaPacientes = control.getPacientes();
        HttpSession miSession = request.getSession();
        miSession.setAttribute("listaPac", listaPacientes);
        response.sendRedirect("verPacientes.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Paciente pac = new Paciente();
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apell = request.getParameter("apellido");
        String tel = request.getParameter("telefono");
        String dir = request.getParameter("direccion");
        Date fechN = Date.valueOf(request.getParameter("fechNac"));
        String tipoSangre = request.getParameter("tipoSangre");
        boolean obraS = request.getParameter("option").equals("si")? true : false;
        pac.setDni(dni);
        pac.setNombre(nombre);
        pac.setApellido(apell);
        pac.setTelefono(tel);
        pac.setDireccion(dir);
        pac.setFechaNac(fechN);
        pac.setTipoSangre(tipoSangre);
        pac.setTieneOS(obraS);
        control.crearPacient(pac);
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
