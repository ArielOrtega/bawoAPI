package cr.co.bawo.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cr.co.bawo.domain.Empresa;

@Repository
public class EmpresaData {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Empresa find() {
		List<Empresa> empresas = jdbcTemplate.query("Call getEmpresa()",
				(rs, rowNum) -> new Empresa(rs.getInt("codigo"), rs.getString("nombre"), rs.getString("vision"),
						rs.getString("mision"), rs.getString("historia"), rs.getString("telefono_1"),
						rs.getString("telefono_2"), rs.getString("correo"), rs.getString("direccion"),
						rs.getString("facebook"), rs.getString("instagram"), rs.getString("whatsapp"),
						rs.getString("url_logo")));
		return empresas.get(0);
	}

	public Empresa insert(String nombre, String vision, String mision, String historia, String telefono1,
			String telefono2, String correo, String direccion, String facebook, String instagram, String whatsapp,
			String urlLogo) {
		Empresa Empresa = jdbcTemplate.queryForObject(
				"Call saveEmpresa('" + nombre + "','" + vision + "','" + mision + "','" + historia + "','" + telefono1
						+ "','" + telefono2 + "','" + correo + "','" + direccion + "','" + facebook + "','" + instagram
						+ "','" + whatsapp + "','" + urlLogo + "')",
				(rs, rowNum) -> new Empresa(rs.getInt("codigo"), rs.getString("nombre"), rs.getString("vision"),
						rs.getString("mision"), rs.getString("historia"), rs.getString("telefono_1"),
						rs.getString("telefono_2"), rs.getString("correo"), rs.getString("direccion"),
						rs.getString("facebook"), rs.getString("instagram"), rs.getString("whatsapp"),
						rs.getString("url_logo")));
		return Empresa;
	}
}
