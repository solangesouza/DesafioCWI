package Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Entity.Pauta;
import Response.PautaResponse;
import Service.PautaFindService;
import Service.PautaSaveService;

@RequestMapping("/")
@Controller

public class PautaController {
	
	 
	@Autowired
	private PautaFindService PautaFindService;
	
	
	@Autowired
	private PautaSaveService PautaSaveService;
	
	@GetMapping(value="/find")
	public ResponseEntity<List<PautaResponse>> get(
			@RequestParam(required=false) Long id,
			@RequestParam(required=false) String assunto,
			@RequestParam(required=false) Date data) {
		
		List<PautaResponse> lista = PautaFindService.execute(id, assunto, data);
		return ResponseEntity.ok(lista);
	}
	
	@RequestMapping(value="/save" , method=RequestMethod.POST)
	public ResponseEntity<Entity.Pauta> save(
			@RequestBody Pauta Pauta) {
		
		PautaSaveService.execute(Pauta);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	
}
