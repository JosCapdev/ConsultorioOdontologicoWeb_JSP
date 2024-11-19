/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Logica.Controladora;
import Logica.Odontologo;
import Logica.Paciente;
import Logica.Turno;
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
@WebServlet(name = "SvTurno", urlPatterns = {"/SvTurno"})
public class SvTurno extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Turno> listaTurnos = new ArrayList<Turno>();
        listaTurnos = control.getTurnos();
        HttpSession miSession = request.getSession();
        miSession.setAttribute("listaTurn", listaTurnos);
        response.sendRedirect("verTurnos.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Turno turn = new Turno();
        String dni = request.getParameter("dni");
        List<Paciente> listaPac = control.getPacientes();
        boolean pacienteEncontrado = false;

        for (Paciente pac : listaPac) {
            if (pac.getDni().equals(dni)) {
                turn.setPacient(pac);
                pacienteEncontrado = true;
                break; 
            }
        }

        if (!pacienteEncontrado) {
            response.sendRedirect("PacienteNoRegistrado.jsp");
            return;
        }
        Date fech = Date.valueOf(request.getParameter("fechaTurn"));
        String hora = request.getParameter("horaTurn");
        String afec = request.getParameter("afeccion");
        int idOdont = Integer.parseInt(request.getParameter("odontos"));
        Odontologo odonto = control.traerOdonto(idOdont);
        turn.setFechaTurno(fech);
        turn.setHoraTurno(hora);
        turn.setAfeccion(afec);
        turn.setOdont(odonto);
        control.crearTurno(turn);
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
