package es.pildorasinformaticas.servletpruebas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistroUsuarios
 */
@WebServlet("/RegistroUsuarios")
public class RegistroUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter salida=response.getWriter();
		
		salida.println("<html><body>");
		
		salida.println("Nombre introducido" + request.getParameter("nombre"));
		
		salida.println("<br><br>");
		
		salida.println("Apellido intuducido " + request.getParameter("apellido"));
		
		salida.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		response.setContentType("text/html");
		
		PrintWriter salida=response.getWriter();
		
		salida.println("<html><body>");
		
		salida.println("Nombre introducido" + request.getParameter("nombre"));
		
		salida.println("<br><br>");
		
		salida.println("Apellido intuducido " + request.getParameter("apellido"));
		
		salida.println("</body></html>");
	}

}
