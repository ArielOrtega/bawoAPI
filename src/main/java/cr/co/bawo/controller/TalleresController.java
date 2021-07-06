package cr.co.bawo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cr.co.bawo.business.TalleresBusiness;
import cr.co.bawo.domain.Talleres;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/talleres")
public class TalleresController {
	
	@Autowired
	TalleresBusiness talleresBusiness;

	@GetMapping("/view/allTalleres")
	public List<Talleres> findAll(Model model) {
		return talleresBusiness.findAll();
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
