package cr.co.bawo.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cr.co.bawo.data.CategoriaData;
import cr.co.bawo.domain.Categoria;

@Service
public class CategoriaBusiness {

	@Autowired
	CategoriaData categoriaData;
	
	public List<Categoria> find() {
		return categoriaData.find();
	}

	public Categoria insert(String nombre) {
		return categoriaData.insert(nombre);
	}

	public Categoria update(int codigo, boolean visibilidad) {
		return categoriaData.update(codigo, visibilidad);
	}

	public void delete(int codigo) {
		categoriaData.delete(codigo);
	}
}
