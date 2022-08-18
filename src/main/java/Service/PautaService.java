package Service;

import Entity.Pauta;
import Repository.PautaRepository;

public class PautaService {
	public static String CAMPO_TITULO_OBRIGATORIO = "Campo 'Titulo' é obrigatório";
	
	public void execute(Pauta pauta){

		validaRegrasDeNegocio(pauta);
		PautaRepository.save(pauta);
		
		
	}

	private void validaRegrasDeNegocio(Pauta pauta) {
		if(pauta.getTitulo() == null)
			throw new ApiException("Campo 'Titulo' é obrigatório");
		
			throw new ApiException(CAMPO_TITULO_OBRIGATORIO);
		
	}

}
