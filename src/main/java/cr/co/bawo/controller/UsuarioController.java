package cr.co.bawo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cr.co.bawo.business.UsuarioBusiness;
import cr.co.bawo.domain.Usuario;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/user")
public class UsuarioController {

	@Autowired
	private UsuarioBusiness usuarioBusiness;
	
	@GetMapping("/about")
	public Usuario find(Model model, @RequestParam("usuario") String usuario, @RequestParam("contrasenna") String contrasenna) {
		return usuarioBusiness.find(usuario, contrasenna);
	}
	
	//@PostMapping("/user")
	//public Usuario insert(Model model, @RequestParam("usuario") String usuario, @RequestParam("contrasenna") String contrasenna) {
	//	return usuarioBusiness.insert(usuario, contrasenna);
	//}
	
	//@PutMapping("/user")
	//public Usuario update(Model model, @RequestParam("usuario") String usuario, @RequestParam("contrasenna") String contrasenna) {
	//	return usuarioBusiness.update(usuario, contrasenna);
	//}
	
	//@DeleteMapping("/user")
	//public Usuario delete(Model model, @RequestParam("usuario") String usuario, @RequestParam("contrasenna") String contrasenna) {
	//	return usuarioBusiness.delete(usuario, contrasenna);
	//}
}
