package cr.co.bawo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cr.co.bawo.data.UsuarioData;
import cr.co.bawo.domain.Usuario;

@Service
public class UsuarioBusiness {
	
	@Autowired
	private UsuarioData usuarioData;
	
	public Usuario find(String nombre, String contrasenna) {
		return usuarioData.find(nombre, contrasenna);
	}
	
	public Usuario insert(String nombre, String contrasenna) {
		return usuarioData.insert(nombre, contrasenna);
	}
	
	public Usuario update(String nombre, String contrasenna) {
		return usuarioData.update(nombre, contrasenna);
	}
	
	public Usuario delete(String nombre, String contrasenna) {
		return usuarioData.delete(nombre, contrasenna);
	}
}
