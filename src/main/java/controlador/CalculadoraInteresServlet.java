package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.CalculadoraInteresModelo;

@WebServlet("/calculadoraInteres")
public class CalculadoraInteresServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        double capital = Double.parseDouble(request.getParameter("capital"));
        double tasaInteresAnual = Double.parseDouble(request.getParameter("tasaInteresAnual"));
        int años = Integer.parseInt(request.getParameter("años"));

        CalculadoraInteresModelo calculadoraModelo = new CalculadoraInteresModelo(capital, tasaInteresAnual, años);
        double interes = calculadoraModelo.calcularInteresSimple();

        request.setAttribute("interes", interes);
        request.getRequestDispatcher("calculadoraInteres.jsp").forward(request, response);
    }
}
