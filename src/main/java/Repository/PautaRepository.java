package Repository;

import java.util.List;

import Entity.Pauta;

public interface PautaRepository {

	List<Pauta> findByIdOrPauta(Long id, String titulo);

	static void save(Pauta pauta) {
		// TODO Auto-generated method stub
		
	}
	
	
}
