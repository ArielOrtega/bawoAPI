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

import cr.co.bawo.business.ProductoBusiness;
import cr.co.bawo.domain.Producto;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/product")
public class ProductoController {
	
	@Autowired
	ProductoBusiness productoBusiness;

	@GetMapping("/")
	public List<Producto> find(Model model) {
		return productoBusiness.findAll();
	}
	
	@GetMapping("/name")
	public List<Producto> findByName(Model model, @RequestParam("nombre") String nombre) {
		return productoBusiness.findByName(nombre);
	}
	
	@GetMapping("/Category")
	public List<Producto> findByCategory(Model model, @RequestParam("codigoCategoria") int codigo) {
		return productoBusiness.findByCategory(codigo);
	}
	
	@GetMapping("/find")
	public Producto find(Model model , @RequestParam("codigo") int codigo) {
		return productoBusiness.find(codigo);
	}
	
	//@PostMapping("/product")
	//public void insert(Model model, @RequestParam("nombre") String nombre, @RequestParam("precio") float precio, @RequestParam("informacionNutricional") String informacionNutricional, @RequestParam("descripcion") String descripcion, @RequestParam("imagen") String imagen,
	//		@RequestParam("codigoCategoria") int codigoCategoria) {
	//	 productoBusiness.insert(nombre, precio, informacionNutricional, descripcion, imagen, codigoCategoria);
	//}
	
	//@PutMapping("/product")
	//public Producto update(Model model, @RequestParam("codigo") int codigo, @RequestParam("nombre") String nombre, @RequestParam("precio") float precio, @RequestParam("informacionNutricional") String informacionNutricional, @RequestParam("descripcion") String descripcion, @RequestParam("imagen") String imagen,
	//		@RequestParam("codigoCategoria") int codigoCategoria) {
	//	return productoBusiness.update(codigo, nombre, precio, informacionNutricional, descripcion, imagen, codigoCategoria);
	//}
	
	//@DeleteMapping("/product")
	//public void delete(Model model, @RequestParam("codigo") int codigo) {
	//	 productoBusiness.delete(codigo);
	//}
}
