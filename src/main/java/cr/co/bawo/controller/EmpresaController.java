package cr.co.bawo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cr.co.bawo.business.EmpresaBusiness;
import cr.co.bawo.domain.Empresa;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/company")
public class EmpresaController {

	@Autowired
	EmpresaBusiness empresaBusiness;
	
	@GetMapping("/")
	public Empresa find(Model model) {
		return empresaBusiness.find();
	}
	
	//@PostMapping("/info")
	//public Empresa insert(Model model, @RequestParam("nombre") String nombre, @RequestParam("vision") String vision, @RequestParam("mision") String mision,
	//		@RequestParam("historia") String historia, @RequestParam("telefono1") String telefono1, @RequestParam("telefono2") String telefono2,
	//		@RequestParam("correo") String correo, @RequestParam("direccion") String direccion, @RequestParam("facebook") String facebook,
	//		@RequestParam("instagram") String instagram, @RequestParam("whatsapp") String whatsapp, @RequestParam("urlLogo") String urlLogo) {
	//	return empresaBusiness.insert(nombre, vision, mision, historia, telefono1, telefono2, correo, direccion, facebook, instagram, whatsapp, urlLogo);
	//}
	
	//@PutMapping("/info")
	//public Empresa update(Model model, @RequestParam("nombre") String nombre, @RequestParam("vision") String vision, @RequestParam("mision") String mision,
	//		@RequestParam("historia") String historia, @RequestParam("telefono1") String telefono1, @RequestParam("telefono2") String telefono2,
	//		@RequestParam("correo") String correo, @RequestParam("direccion") String direccion, @RequestParam("facebook") String facebook,
	//		@RequestParam("instagram") String instagram, @RequestParam("whatsapp") String whatsapp, @RequestParam("urlLogo") String urlLogo) {
	//	return empresaBusiness.insert(nombre, vision, mision, historia, telefono1, telefono2, correo, direccion, facebook, instagram, whatsapp, urlLogo);
	//}
}
