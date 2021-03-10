package cr.co.bawo.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cr.co.bawo.data.ProveedorData;
import cr.co.bawo.domain.Proveedor;

@Service
public class ProveedorBusiness {

	@Autowired
	ProveedorData proveedorData;
	
	public List<Proveedor> findAll() {
		return proveedorData.findAll();
	}

	public Proveedor find(int codigo) {
		return proveedorData.find(codigo);
	}

	public void insert(String nombre, String descripcion, String urlImagen) {
		proveedorData.insert(nombre, descripcion, urlImagen);
	}

	public Proveedor update(int codigo, String nombre, String descripcion, String urlImagen) {
		return proveedorData.update(codigo, nombre, descripcion, urlImagen);
	}

	public void delete(int codigo) {
		proveedorData.delete(codigo);
	}
}
