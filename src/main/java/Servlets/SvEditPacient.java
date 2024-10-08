/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Logica.Controladora;
import Logica.Paciente;
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
@WebServlet(name = "SvEditPacient", urlPatterns = {"/SvEditPacient"})
public class SvEditPacient extends HttpServlet {
    Controladora control = new Controladora();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("idPacient"));
        Paciente pac= control.traerPacient(id);
        
        HttpSession miSession = request.getSession();
        miSession.setAttribute("pacientEditar", pac);
        response.sendRedirect("editarPaciente.jsp");
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
        String tipoSangre = request.getParameter("tipoSangre");
        boolean obraS = request.getParameter("option").equals("si")? true : false;
        
        Paciente pac = (Paciente) request.getSession().getAttribute("pacientEditar");
        pac.setDni(dni);
        pac.setNombre(nombre);
        pac.setApellido(apell);
        pac.setTelefono(tel);
        pac.setDireccion(dir);
        pac.setFechaNac(fechN);
        pac.setTipoSangre(tipoSangre);
        pac.setTieneOS(obraS);
        
        control.editarPacient(pac);
        response.sendRedirect("SvPaciente");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
