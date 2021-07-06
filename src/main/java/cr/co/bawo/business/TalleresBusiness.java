package cr.co.bawo.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cr.co.bawo.data.TalleresData;
import cr.co.bawo.domain.Talleres;

@Service
public class TalleresBusiness {
	@Autowired
	TalleresData talleresData;
	
	public List<Talleres> findAll() {
		return talleresData.findAll();
	}


}


