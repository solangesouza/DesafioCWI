package Service;

import Entity.Pauta;
import Repository.PautaRepository;

public class PautaService {
	public static String CAMPO_TITULO_OBRIGATORIO = "Campo 'Titulo' é obrigatório";
	
	public void execute(Pauta pauta) throws Exception{

		validaRegrasDeNegocio(pauta);
		PautaRepository.save(pauta);
		
		
	}

	private void validaRegrasDeNegocio(Pauta pauta) throws Exception {
		if(pauta.getTitulo() == null)
			throw new Exception("Campo 'Titulo' é obrigatório");
		
		
		
	}

}
