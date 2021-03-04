package cr.co.bawo.data;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cr.co.bawo.domain.Usuario;

@Repository
public class UsuarioData {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Usuario find(String nombre, String contrasenna) {
		Usuario usuario = this.jdbcTemplate.queryForObject(
		        "Call getUsuario('"+nombre+"','"+contrasenna+"')",
		        new RowMapper<Usuario>() {
		            public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		                Usuario usuario = new Usuario();
		                usuario.setUsuario(rs.getString("usuario"));
		                usuario.setContrasenna(rs.getString("contrasenna"));
		                return usuario;
		            }
		        });
		return usuario;
	}
	
	public Usuario update(String nombre, String contrasenna) {
		this.jdbcTemplate.update("Call updateUsuario('"+nombre+"','"+contrasenna+"')");
		return new Usuario(nombre, contrasenna);
	}
	
	public Usuario insert(String nombre, String contrasenna) {
		this.jdbcTemplate.update("Call saveUsuario('"+nombre+"','"+contrasenna+"')");
		return new Usuario(nombre, contrasenna);
	}
	
	public Usuario delete(String nombre, String contrasenna) {
		this.jdbcTemplate.update("Call deleteUsuario('"+nombre+"','"+contrasenna+"')");
		return new Usuario(nombre, contrasenna);
	}
}
