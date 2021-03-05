package cr.co.bawo.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cr.co.bawo.domain.Categoria;
import cr.co.bawo.domain.Usuario;

@Repository
public class CategoriaData {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Categoria> find() {
		List<Categoria> categorias = jdbcTemplate.query("Call getAllCategorias()", (rs,
				rowNum) -> new Categoria(rs.getInt("codigo"), rs.getString("nombre"), rs.getBoolean("visibilidad")));
		return categorias;
	}

	public Categoria insert(String nombre) {
		Categoria categoria = jdbcTemplate.queryForObject("Call saveCategoria('"+nombre+"')", (rs, rowNum) ->
        new Categoria(rs.getInt("codigo"), rs.getString("nombre"), rs.getBoolean("visibilidad")));
		return categoria;
	}

	public Categoria update(int codigo, boolean visibilidad) {
		Categoria categoria = jdbcTemplate.queryForObject("Call updateCategoria('"+codigo+"',"+visibilidad+")", (rs, rowNum) ->
        new Categoria(rs.getInt("codigo"), rs.getString("nombre"), rs.getBoolean("visibilidad")));
		return categoria;
	}

	public void delete(int codigo) {
		this.jdbcTemplate.update("Call deleteCategoria('" + codigo + "')");
	}
}
