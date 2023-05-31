package com.pildorasinformaticas.productos;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class ControladorProductos
 */
@WebServlet("/ControladorProductos")
public class ControladorProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ModeloProductos modeloProductos;
	
	@Resource(name="jdbc/Productos")
	private DataSource miPool;
	
	

	/* (non-Javadoc)
	 * @see javax.servlet.GenericServlet#init()
	 */
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		try {
		modeloProductos=new ModeloProductos(miPool);
		}catch(Exception e){
			 throw new ServletException(e);
		}
		
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//leer el parametro del formulario
		
		String elComando=request.getParameter("instuccion");
		
		//si no se envia el parametro , listar productos
		
		if(elComando==null) elComando="listar";
		
		//Redirigir el flunjo de ejecucion al metodo adecuado
		
		switch(elComando) {
		
			case "listar":
				obtenerProductos(request,response);
			break;
			
			case "InsertarBBDD":
				agregarProductos(request,response);
			break;
			
			case "cargar":
				try {
					cargarProductos(request,response);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break;
			
			case "actualizarBBDD":
				try {
					actualizaProducto(request, response);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			default:
				obtenerProductos(request,response);
		
		}
		
		
		
		
	}



	private void actualizaProducto(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		//leer los datos que le vienen del formulario actualizar
		
		String CodArticulo=request.getParameter("CArt");
		
		String Seccion=request.getParameter("seccion");
		
		String NombreArticulo=request.getParameter("NArt");
		
		SimpleDateFormat formatoFecha=new SimpleDateFormat("YYYY-MM-DD");
		
		Date Fecha=null;
		
		try {
			Fecha=formatoFecha.parse(request.getParameter("fecha"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		double Precio=Double.parseDouble(request.getParameter("precio"));
		
		String Importado=request.getParameter("importado");
		
		String PaisOrigen=request.getParameter("pOrig");
		
		//crear un objeto de tipo producto con la info del formulario
		
		Productos ProductoActualizado=new Productos(CodArticulo, Seccion ,NombreArticulo , Precio,Fecha ,Importado , PaisOrigen);
		
		//Actualizar la BBDD con la info del obj Producto
		
		modeloProductos.actualizarProducto(ProductoActualizado);
		
		//Volver al Listado con la info actualizada
		
		obtenerProductos(request, response);
	}



	private void cargarProductos(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		
		//leer el C. Articulo que viene del listado
		
			String codigoArticulo=request.getParameter("CArticulo");
		
		//Enviar C articulo a modelo
			
			Productos elProducto=modeloProductos.getProducto(codigoArticulo);
		
		// Colocar atributo correspondiente al C Articulo
			
			request.setAttribute("ProductoActualizar", elProducto);
		
		//Enviar Producto al Formulario de actualizar (jsp)
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("/actualizarProducto.jsp");
			
			dispatcher.forward(request, response);
		
	}



	private void agregarProductos(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		//leer informacion del producto del formulario
		
		String CodArticulo=request.getParameter("CArt");
		
		String Seccion=request.getParameter("seccion");
		
		String NombreArticulo=request.getParameter("NArt");
		
		SimpleDateFormat formatoFecha=new SimpleDateFormat("YYYY-MM-DD");
		
		Date Fecha=null;
		
		try {
			Fecha=formatoFecha.parse(request.getParameter("fecha"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		double Precio=Double.parseDouble(request.getParameter("precio"));
		
		String Importado=request.getParameter("importado");
		
		String PaisOrigen=request.getParameter("pOrig");
		
		//crear objeto tipo Producto
		
		Productos NuevoProducto=new Productos(CodArticulo, Seccion ,NombreArticulo , Precio,Fecha ,Importado , PaisOrigen);
		
		
		// enviar objeto al modelo y despues insertar el objeto Producto en la BBDD
		
		modeloProductos.agregarElNuevoProducto(NuevoProducto);
		
		
		//volver al listado de productos 
		
		obtenerProductos(request,response);
	}



	private void obtenerProductos(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		
		//obtener la lista de productos desde el modelo
		List<Productos>productos;
		
		try {
		
			productos=modeloProductos.getProductos();
			
		// agregar lista de productos al request
		
		
			request.setAttribute("LISTAPRODUCTOS", productos);
			
		//enviar ese request a la pagina JSP
			
			RequestDispatcher miDispatcher=request.getRequestDispatcher("/ListaProductos.jsp");
			
			miDispatcher.forward(request, response);
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	}
	

}
