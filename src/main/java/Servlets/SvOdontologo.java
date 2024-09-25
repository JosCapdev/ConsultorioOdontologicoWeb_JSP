package Servlets;

import Logica.Controladora;
import Logica.Odontologo;
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

@WebServlet(name = "SvOdontologo", urlPatterns = {"/SvOdontologo"})
public class SvOdontologo extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Odontologo> listaOdontologos = new ArrayList<Odontologo>();
        listaOdontologos = control.getOdontologos();
        HttpSession miSession = request.getSession();
        miSession.setAttribute("listaOdonto", listaOdontologos);
        response.sendRedirect("verOdontologos.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Odontologo odonto = new Odontologo();
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apell = request.getParameter("apellido");
        String tel = request.getParameter("telefono");
        String dir = request.getParameter("direccion");
        Date fechN = Date.valueOf(request.getParameter("fechNac"));
        String espec = request.getParameter("especialidad");
        odonto.setDni(dni);
        odonto.setNombre(nombre);
        odonto.setApellido(apell);
        odonto.setTelefono(tel);
        odonto.setDireccion(dir);
        odonto.setFechaNac(fechN);
        odonto.setEspecialidad(espec);
        control.crearOdonto(odonto);
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
