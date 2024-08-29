package Servlets;

import Logica.Controladora;
import Logica.Odontologo;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvEditOdonto", urlPatterns = {"/SvEditOdonto"})
public class SvEditOdonto extends HttpServlet {
 Controladora control = new Controladora();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         int id = Integer.parseInt(request.getParameter("idOdont"));
        Odontologo odonto= control.traerOdonto(id);
        
        HttpSession miSession = request.getSession();
        miSession.setAttribute("odontoEditar", odonto);
        response.sendRedirect("editarOdontologo.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apell");
        String telefono = request.getParameter("telf");
        String direccion = request.getParameter("direc");
        String fechNac = request.getParameter("fechNac");
        String especialidad = request.getParameter("espec");
        
        Odontologo odonto =(Odontologo)request.getSession().getAttribute("odontoEditar");
        odonto.setDni(dni);
        odonto.setNombre(nombre);
        odonto.setApellido(apellido);
        odonto.setTelefono(telefono);
        odonto.setDireccion(direccion);
        odonto.setFechaNac(Date.valueOf(fechNac));
        odonto.setEspecialidad(especialidad);

        control.editarOdonto(odonto);
        response.sendRedirect("SvOdontologo");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
