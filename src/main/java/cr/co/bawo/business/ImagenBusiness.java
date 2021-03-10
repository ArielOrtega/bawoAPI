package cr.co.bawo.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cr.co.bawo.data.ImagenData;
import cr.co.bawo.domain.Imagen;

@Service
public class ImagenBusiness {

	@Autowired
	ImagenData imagenData;
	
	public List<Imagen> findAll() {
		return imagenData.findAll();
	}

	public Imagen find(int codigo) {
		return imagenData.find(codigo);
	}

	public void insert(String nombre, String urlImagen, int codigoEmpresa) {
		imagenData.insert(nombre, urlImagen, codigoEmpresa);
	}

	public Imagen update(int codigoImagen, String nombre, String urlImagen) {
		return imagenData.update(codigoImagen, nombre, urlImagen);
	}

	public void delete(int codigoImagen) {
		imagenData.delete(codigoImagen);
	}
}
