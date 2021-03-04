package cr.co.bawo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cr.co.bawo.data.UsuarioData;
import cr.co.bawo.domain.Usuario;

@Service
public class UsuarioBusiness {
	
	@Autowired
	private UsuarioData usuarioData;
	
	public Usuario findUsuario(String nombre, String contrasenna) {
		return usuarioData.findUsuario(nombre, contrasenna);
	}
}
