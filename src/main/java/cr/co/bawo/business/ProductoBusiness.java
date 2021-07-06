package cr.co.bawo.business;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import cr.co.bawo.data.ProductoData;
import cr.co.bawo.domain.Categoria;
import cr.co.bawo.domain.Producto;

@Service
public class ProductoBusiness {

	@Autowired
	ProductoData productoData;
	
	public List<Producto> findAll() {
		return productoData.findAll();
	}

	public List<Producto> findByName(String name) {
		return productoData.findByName(name);
	}

	public List<Producto> findByCategory(int categoryCode) {
		return productoData.findByCategory(categoryCode);
	}


	public void insert(String nombre, float precio, String informacionNutricional, String descripcion, String imagen,
			int codigoCategoria) {
		productoData.insert(nombre, precio, informacionNutricional, descripcion, imagen, codigoCategoria);
	}


	public void delete(int codigo) {
		productoData.delete(codigo);;
	}
}
