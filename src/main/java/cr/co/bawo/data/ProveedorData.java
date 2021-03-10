package cr.co.bawo.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cr.co.bawo.domain.Proveedor;

@Repository
public class ProveedorData {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Proveedor> findAll() {
		List<Proveedor> proveedores = jdbcTemplate.query("Call getAllProveedores()",
				(rs, rowNum) -> new Proveedor(rs.getInt("codigo"), rs.getString("nombre"), rs.getString("descripcion"),
						rs.getString("url_imagen")));
		return proveedores;
	}

	public Proveedor find(int codigo) {
		Proveedor proveedor = this.jdbcTemplate.queryForObject("Call getProveedor('" + codigo + "')",
				new RowMapper<Proveedor>() {
					public Proveedor mapRow(ResultSet rs, int rowNum) throws SQLException {
						Proveedor proveedor = new Proveedor();
						proveedor.setCodigo(rs.getInt("codigo"));
						proveedor.setNombre(rs.getString("nombre"));
						proveedor.setDescripcion(rs.getString("descripcion"));
						proveedor.setUrlImagen(rs.getString("url_imagen"));
						return proveedor;
					}
				});
		return proveedor;
	}

	public void insert(String nombre, String descripcion, String urlImagen) {
		jdbcTemplate.update("Call saveProveedor('" + nombre + "','" + descripcion + "','"+ urlImagen + "')");
	}

	public Proveedor update(int codigo, String nombre, String descripcion, String urlImagen) {
		Proveedor proveedor = jdbcTemplate.queryForObject(
				"Call updateProveedor('" + codigo + "','" + nombre + "','" + descripcion + "','" + descripcion + "')",
				(rs, rowNum) -> new Proveedor(rs.getInt("codigo"), rs.getString("nombre"), rs.getString("descripcion"), rs.getString("url_imagen")));
		return proveedor;
	}

	public void delete(int codigo) {
		this.jdbcTemplate.update("Call deleteProveedor('" + codigo + "')");
	}
}
