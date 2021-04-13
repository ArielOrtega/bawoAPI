package cr.co.bawo.controller;

import java.util.List;

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

import cr.co.bawo.business.ProveedorBusiness;
import cr.co.bawo.domain.Proveedor;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/supplier")
public class ProveedorController {

	@Autowired
	ProveedorBusiness proveedorBusiness;
	
	@GetMapping("/")
	public List<Proveedor> find(Model model) {
		return proveedorBusiness.findAll();
	}
	
	@GetMapping("/find")
	public Proveedor findByName(Model model, @RequestParam("codigo") int codigo) {
		return proveedorBusiness.find(codigo);
	}
	
	//@PostMapping("/supplier")
	//public void insert(Model model, @RequestParam("nombre") String nombre, @RequestParam("descripcion") String descripcion, @RequestParam("urlImagen") String urlImagen) {
	//	 proveedorBusiness.insert(nombre, descripcion, urlImagen);
	//}
	
	//@PutMapping("/supplier")
	//public Proveedor update(Model model, @RequestParam("codigo") int codigo, @RequestParam("nombre") String nombre, @RequestParam("descripcion") String descripcion, @RequestParam("urlImagen") String urlImagen) {
	//	return proveedorBusiness.update(codigo, nombre, descripcion, urlImagen);
	//}
	
	//@DeleteMapping("/supplier")
	//public void delete(Model model, @RequestParam("codigo") int codigo) {
	//	 proveedorBusiness.delete(codigo);
	//}
}
