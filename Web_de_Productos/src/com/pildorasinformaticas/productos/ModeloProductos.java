package com.pildorasinformaticas.productos;

import java.sql.*;
import java.util.*;
import java.util.Date;

import javax.sql.DataSource;

public class ModeloProductos {

	
	private DataSource origenDatos;
	
	public ModeloProductos(DataSource origenDatos) {
		 
		this.origenDatos=origenDatos;
		
	}
	
	public List<Productos> getProductos() throws Exception{
		
		List<Productos> productos= new ArrayList<>();
		
		Connection miConexion=null;
		
		Statement miStatement=null;
		
		ResultSet miResultSet=null;
		
	//-----establecer la conexion--
		
		
		miConexion=origenDatos.getConnection();
		
		
	//--- crear setencia Sql Y STATEMENT------
		
		String instruccionSql="SELECT * FROM PRODUCTOS";
		
		miStatement=miConexion.createStatement();
		
	//-----ejecutar sentencia Sql-------
		
		miResultSet=miStatement.executeQuery(instruccionSql);
		
	//----recorrer el resultset obtenido-----
		
		while(miResultSet.next()) {
			
			String c_art=miResultSet.getString("CODIGOARTICULO");
			String seccion=miResultSet.getString("SECCION");
			String n_art=miResultSet.getString("NOMBREARTICULO");
			double precio=miResultSet.getDouble("PRECIO");
			Date fecha=miResultSet.getDate("FECHA");
			String importado=miResultSet.getString("IMPORTADO");
			String p_org=miResultSet.getString("PAISDEORIGEN");
			
			Productos temProd=new Productos(c_art,seccion,n_art,precio,fecha, importado,p_org);
			
			productos.add(temProd);
			
		}
		return productos;
	}

	public void agregarElNuevoProducto(Productos nuevoProducto) {
		// TODO Auto-generated method stub
		
		//obtener la conexion
		
		Connection miConexion=null;
		
		PreparedStatement miStatement=null;
		
		//crear instruccion sql que inserte el producto
		
		try {
			
			miConexion=origenDatos.getConnection();	
				
			
		
			String sql="INSERT INTO PRODUCTOS (CODIGOARTICULO, SECCION, NOMBREARTICULO, PRECIO, FECHA, IMPORTADO, PAISDEORIGEN) "+
					"VALUES(?,?,?,?,?,?,?)";
		
			miStatement=miConexion.prepareStatement(sql);
			
			//establecer parametros para el producto
			
			miStatement.setString(1, nuevoProducto.getcArt());
			miStatement.setString(2, nuevoProducto.getSeccion());			
			miStatement.setString(3, nuevoProducto.getnArt());		
			miStatement.setDouble(4, nuevoProducto.getPrecio());
			
			java.util.Date utilDate=nuevoProducto.getFecha();
			java.sql.Date fechaConvertida=new java.sql.Date(utilDate.getTime());
			miStatement.setDate(5, fechaConvertida);
			
			
			miStatement.setString(6, nuevoProducto.getImportado());
			miStatement.setString(7, nuevoProducto.getpOrig());
			
		
		
		//ejecutar la instruccion sql
			
			miStatement.execute();
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}

	public Productos getProducto(String codigoArticulo) {
		// TODO Auto-generated method stub
		
		//Establecer la conexion
			Productos elProducto=null;
			
			Connection miConexion=null;
			
			PreparedStatement miStatement=null;
			
			ResultSet miResultSet=null;
			
			String cArticulo=codigoArticulo;
			
			try {
				//establecer la conexion con la bbdd
					miConexion=origenDatos.getConnection();
				//crear sql que busque el producto
					String sql="SELECT * FROM PRODUCTOS WHERE CODIGOARTICULO=?";
					
				//crear consulta preparada
					miStatement=miConexion.prepareStatement(sql);
				//establecer los parametros
					miStatement.setString(1, cArticulo);
				//Ejecutar la consulta
					miResultSet=miStatement.executeQuery();
				//obtener los datos de respuesta
					if(miResultSet.next()) {
						
						String c_art=miResultSet.getString("CODIGOARTICULO");
						String seccion=miResultSet.getString("SECCION");
						String n_art=miResultSet.getString("NOMBREARTICULO");
						double precio=miResultSet.getDouble("PRECIO");
						Date fecha=miResultSet.getDate("FECHA");
						String importado=miResultSet.getString("IMPORTADO");
						String p_org=miResultSet.getString("PAISDEORIGEN");
						
						elProducto=new Productos(c_art,seccion,n_art,precio,fecha, importado, p_org);
					}else {
						throw new Exception("No hemos encontrado el producto con codigo articulo= "+ cArticulo);
					}
			}catch(Exception e){
				
			}
		return elProducto;
	}

	public void actualizarProducto(Productos productoActualizado) throws Exception {
		// TODO Auto-generated method stub
		
		
		Connection miConexion=null;
		
		PreparedStatement miStatement=null;
		
		//Establecer la conexion
		
		miConexion=origenDatos.getConnection();
		
		//crear sentencia SQL
		
		String sql="UPDATE PRODUCTOS SET SECCION=? , NOMBREARTICULO=?, PRECIO=? " +
					"FECHAR=?, IMPORTADO=?, PAISDEORIGEN=? WHERE CODIGOARTICULO=?";
		
		//Crear la consulta preparada
		
		miStatement=miConexion.prepareStatement(sql);
		
		//Establecer los paametros
		
		miStatement.setString(1, productoActualizado.getSeccion());
		miStatement.setString(2, productoActualizado.getnArt());
		miStatement.setDouble(3, productoActualizado.getPrecio());
		
		java.util.Date utilDate=productoActualizado.getFecha();
		java.sql.Date fechaConvertida=new java.sql.Date(utilDate.getTime());
		
		miStatement.setDate(4, fechaConvertida);
		miStatement.setString(5, productoActualizado.getImportado());
		miStatement.setString(6, productoActualizado.getpOrig());
		miStatement.setString(7, productoActualizado.getcArt());
		
		//Ejecutar la instruccion SQL
		
		miStatement.execute();
		
	}


	
	
}
