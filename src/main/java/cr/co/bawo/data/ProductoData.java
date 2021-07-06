package cr.co.bawo.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import cr.co.bawo.domain.Categoria;
import cr.co.bawo.domain.Imagen;
import cr.co.bawo.domain.Producto;

@Repository
public class ProductoData {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Producto> findAll() {
		
		List<Producto> Productos = jdbcTemplate.query("Call getAllProductos()",
				(rs, rowNum) -> new Producto(rs.getInt("codigo"), rs.getString("nombre"), rs.getFloat("precio"),
						rs.getString("informacion_nutricional"), rs.getString("descripcion"), new Imagen(rs.getInt("codigo_imagen"), 
								rs.getString("nombre_imagen"), rs.getString("url_imagen"), rs.getInt("codigo_empresa")),
						new Categoria(rs.getInt("codigo_categoria"), rs.getString("nombre_categoria"),
								rs.getBoolean("visibilidad_categoria"))));
		

		return Productos;
	}

	public List<Producto> findByName(String name) {
		List<Producto> productos = jdbcTemplate.query("Call getProductoByName('" + name + "')",
				(rs, rowNum) -> new Producto(rs.getInt("codigo"), rs.getString("nombre"), rs.getFloat("precio"),
						rs.getString("informacion_nutricional"), rs.getString("descripcion"),  new Imagen(rs.getInt("codigo_imagen"), 
								rs.getString("nombre_imagen"), rs.getString("url_imagen"), rs.getInt("codigo_empresa")),
						new Categoria(rs.getInt("codigo_categoria"), rs.getString("nombre_categoria"),
								rs.getBoolean("visibilidad_categoria"))));
		return productos;
	}

	public List<Producto> findByCategory(int categoryCode) {
		List<Producto> productos = jdbcTemplate.query("Call getProductoByCategoria('" + categoryCode + "')",
				(rs, rowNum) -> new Producto(rs.getInt("codigo"), rs.getString("nombre"), rs.getFloat("precio"),
						rs.getString("informacion_nutricional"), rs.getString("descripcion"),  new Imagen(rs.getInt("codigo_imagen"), 
								rs.getString("nombre_imagen"), rs.getString("url_imagen"), rs.getInt("codigo_empresa")),
						new Categoria(rs.getInt("codigo_categoria"), rs.getString("nombre_categoria"),
								rs.getBoolean("visibilidad_categoria"))));
		return productos;
	}


	public void insert(String nombre, float precio, String informacionNutricional, String descripcion, String imagen,
			int codigoCategoria) {
		jdbcTemplate.update("Call saveProducto('" + nombre + "','" + precio + "','" + informacionNutricional + "','"
				+ descripcion + "','" + imagen + "','" + codigoCategoria + "')");
	}


	public void delete(int codigo) {
		this.jdbcTemplate.update("Call deleteProducto('" + codigo + "')");
	}
}
