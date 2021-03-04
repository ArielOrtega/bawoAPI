package cr.co.bawo.data;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cr.co.bawo.domain.Usuario;

@SpringBootTest
public class UsuarioDataTest {

	@Autowired
	private UsuarioData usuarioData;
	
	@Test
	public void findUsuario() {
		Usuario usuario = usuarioData.findUsuario("administrador", "bawo2021");
		assertNotNull(usuario);
	}
}
