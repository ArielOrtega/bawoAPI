package cr.co.bawo.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cr.co.bawo.domain.Talleres;

@Repository
public class TalleresData {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Talleres> findAll() {
		
		List<Talleres> talleres = jdbcTemplate.query("Call getAllTalleres",
				(rs, rowNum) -> new Talleres(rs.getInt("codigo"), rs.getString("nombre"), rs.getString("descripcion"),
						rs.getString("url_imagen")));
		return talleres;
	}

}
