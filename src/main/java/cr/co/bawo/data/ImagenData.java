package cr.co.bawo.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cr.co.bawo.domain.Imagen;

@Repository
public class ImagenData {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Imagen> findAll() {
		List<Imagen> imagenes = jdbcTemplate.query("Call getImagenes()",
				(rs, rowNum) -> new Imagen(rs.getInt("codigo_imagen"), rs.getString("nombre"), rs.getString("url_imagen"),
						rs.getInt("codigo_empresa")));
		return imagenes;
	}

	public Imagen findImage(int codigo) {
		Imagen imagen = this.jdbcTemplate.queryForObject("Call getImagen('" + codigo + "')",
				new RowMapper<Imagen>() {
					public Imagen mapRow(ResultSet rs, int rowNum) throws SQLException {
						Imagen imagen = new Imagen();
						imagen.setCodigoImagen(rs.getInt("codigo_imagen"));
						imagen.setNombre(rs.getString("nombre"));
						imagen.setUrlImagen(rs.getString("url_imagen"));
						imagen.setCodigoEmpresa(rs.getInt("codigo_empresa"));
						return imagen;
					}
				});
		return imagen;
	}

	public void insert(String nombre, String urlImagen, int codigoEmpresa) {
		jdbcTemplate.update("Call saveImagen('" + nombre + "','" + urlImagen + "','"
				+ codigoEmpresa + "')");
	}

	public Imagen update(int codigoImagen, String nombre, String urlImagen) {
		Imagen imagen = jdbcTemplate.queryForObject(
				"Call updateImagen('" + codigoImagen + "','" + nombre + "','" + urlImagen + "')",
				(rs, rowNum) -> new Imagen(rs.getInt("codigo_imagen"), rs.getString("nombre"), rs.getString("url_imagen"), rs.getInt("codigo_empresa")));
		return imagen;
	}

	public void delete(int codigoImagen) {
		this.jdbcTemplate.update("Call deleteImagen('" + codigoImagen + "')");
	}
}
