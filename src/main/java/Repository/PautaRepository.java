package Repository;

import java.util.List;

import Entity.Pauta;

public interface PautaRepository {

	List<Pauta> findByIdOrPauta(Long id, String titulo);
	
	
}
