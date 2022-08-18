package Service;

import java.sql.Date;
import java.util.List;

import Response.PautaResponse;

public interface PautaFindService {

	List<PautaResponse> execute(Long id, String assunto, java.util.Date data);

}
