package cr.co.bawo.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cr.co.bawo.domain.Categoria;
import cr.co.bawo.domain.Producto;
import cr.co.bawo.domain.Producto;

@Repository
public class ProductoData {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Producto> findAll() {
		List<Producto> Productos = jdbcTemplate.query("Call getAllProductos()",
				(rs, rowNum) -> new Producto(rs.getInt("codigo"), rs.getString("nombre"), rs.getFloat("precio"),
						rs.getString("informacion_nutricional"), rs.getString("descripcion"), rs.getString("imagen"),
						new Categoria(rs.getInt("codigo_categoria"), rs.getString("nombre_categoria"),
								rs.getBoolean("visibilidad_categoria"))));
		return Productos;
	}

	public List<Producto> findByName(String name) {
		List<Producto> productos = jdbcTemplate.query("Call getProductoByName('" + name + "')",
				(rs, rowNum) -> new Producto(rs.getInt("codigo"), rs.getString("nombre"), rs.getFloat("precio"),
						rs.getString("informacion_nutricional"), rs.getString("descripcion"), rs.getString("imagen"),
						new Categoria(rs.getInt("codigo_categoria"), rs.getString("nombre_categoria"),
								rs.getBoolean("visibilidad_categoria"))));
		return productos;
	}

	public List<Producto> findByCategory(int categoryCode) {
		List<Producto> productos = jdbcTemplate.query("Call getProductoByCategoria('" + categoryCode + "')",
				(rs, rowNum) -> new Producto(rs.getInt("codigo"), rs.getString("nombre"), rs.getFloat("precio"),
						rs.getString("informacion_nutricional"), rs.getString("descripcion"), rs.getString("imagen"),
						new Categoria(rs.getInt("codigo_categoria"), rs.getString("nombre_categoria"),
								rs.getBoolean("visibilidad_categoria"))));
		return productos;
	}

	public Producto find(int codigo) {
		Producto producto = this.jdbcTemplate.queryForObject("Call getProductoByCode('" + codigo + "')",
				new RowMapper<Producto>() {
					public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {
						Producto producto = new Producto();
						producto.setCodigo(rs.getInt("codigo"));
						producto.setNombre(rs.getString("nombre"));
						producto.setPrecio(rs.getFloat("precio"));
						producto.setInformacionNutricional(rs.getString("informacion_nutricional"));
						producto.setDescripcion(rs.getString("descripcion"));
						producto.setImagen(rs.getString("imagen"));
						Categoria categoria = new Categoria();
						categoria.setCodigo(rs.getInt("codigo_categoria"));
						categoria.setNombre(rs.getString("nombre_categoria"));
						categoria.setVisibilidad(rs.getBoolean("visibilidad_categoria"));
						producto.setCategoria(categoria);
						return producto;
					}
				});
		return producto;
	}

	public void insert(String nombre, float precio, String informacionNutricional, String descripcion, String imagen,
			int codigoCategoria) {
		jdbcTemplate.update("Call saveProducto('" + nombre + "','" + precio + "','" + informacionNutricional + "','"
				+ descripcion + "','" + imagen + "','" + codigoCategoria + "')");
	}

	public Producto update(int codigo, String nombre, float precio, String informacionNutricional, String descripcion,
			String imagen, int codigoCategoria) {
		Producto producto = jdbcTemplate.queryForObject(
				"Call updateProducto('"+codigo+"','" + nombre + "','" + precio + "','" + informacionNutricional + "','" + descripcion
						+ "','" + imagen + "','" + codigoCategoria + "')",
				(rs, rowNum) -> new Producto(rs.getInt("codigo"), rs.getString("nombre"), rs.getFloat("precio"),
						rs.getString("informacion_nutricional"), rs.getString("descripcion"), rs.getString("imagen"),
						new Categoria(rs.getInt("codigo_categoria"), rs.getString("nombre_categoria"),
								rs.getBoolean("visibilidad_categoria"))));
		return producto;
	}

	public void delete(int codigo) {
		this.jdbcTemplate.update("Call deleteProducto('" + codigo + "')");
	}
}
