package cr.co.bawo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cr.co.bawo.business.ImagenBusiness;
import cr.co.bawo.domain.Imagen;

@RestController
public class ImagenController {

	@Autowired
	ImagenBusiness imagenBusiness;
	
	@GetMapping("/image")
	public List<Imagen> find(Model model) {
		return imagenBusiness.findAll();
	}
	
	@GetMapping("/image/find")
	public Imagen find(Model model, @RequestParam("codigoImagen") int codigoImagen) {
		return imagenBusiness.find(codigoImagen);
	}
	
	@PostMapping("/image")
	public void insert(Model model, @RequestParam("nombre") String nombre, @RequestParam("urlImagen") String urlImagen, @RequestParam("codigoEmpresa") int codigoEmpresa) {
		 imagenBusiness.insert(nombre, urlImagen, codigoEmpresa);
	}
	
	@PutMapping("/image")
	public Imagen update(Model model, @RequestParam("codigoImagen") int codigoImagen, @RequestParam("nombre") String nombre, @RequestParam("urlImagen") String urlImagen) {
		return imagenBusiness.update(codigoImagen, nombre, urlImagen);
	}
	
	@DeleteMapping("/image")
	public void delete(Model model, @RequestParam("codigoImagen") int codigoImagen) {
		 imagenBusiness.delete(codigoImagen);
	}
}
