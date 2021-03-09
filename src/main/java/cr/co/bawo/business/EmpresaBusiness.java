package cr.co.bawo.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cr.co.bawo.data.EmpresaData;
import cr.co.bawo.domain.Empresa;

@Service
public class EmpresaBusiness {

	@Autowired
	EmpresaData empresaData;
	
	public Empresa find() {
		return empresaData.find();
	}

	public Empresa insert(String nombre, String vision, String mision, String historia, String telefono1,
			String telefono2, String correo, String direccion, String facebook, String instagram, String whatsapp,
			String urlLogo) {
		return empresaData.insert(nombre, vision, mision, historia, telefono1, telefono2, correo, direccion, facebook, instagram, whatsapp, urlLogo);
	}
}
