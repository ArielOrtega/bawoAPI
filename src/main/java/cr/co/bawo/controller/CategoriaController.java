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

import cr.co.bawo.business.CategoriaBusiness;
import cr.co.bawo.domain.Categoria;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/category")
public class CategoriaController {

	@Autowired
	private CategoriaBusiness categoriaBusiness;
	
	@GetMapping("/view/AllCategories")
	public List<Categoria> find(Model model) {
		return categoriaBusiness.find();
	}
	
	//@PostMapping("/category")
	//public Categoria insert(Model model, @RequestParam("nombre") String nombre) {
	//	return categoriaBusiness.insert(nombre);
	//}
	
	//@PutMapping("/category")
	//public Categoria update(Model model, @RequestParam("codigo") int codigo, @RequestParam("visibilidad") boolean visibilidad) {
	//	return categoriaBusiness.update(codigo, visibilidad);
	//}
	
	//@DeleteMapping("/category")
	//public void delete(Model model, @RequestParam("codigo") int codigo) {
	//	 categoriaBusiness.delete(codigo);
	//}
}
