package Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Entity.Sessao;
import Service.SessaoSaveService;

public class SessaoController {

	@RequestMapping(value="/save" , method=RequestMethod.POST)
	public ResponseEntity<Entity.Pauta> save(
			@RequestBody Sessao Sessao) {
		
		SessaoSaveService.execute(Sessao);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
}
