package Entity;

public class Votacao {

		private int id_sessao;
		private int id_votacao;
		private int id_associado;
		private String status_voto;
		public int getId_sessao() {
			return id_sessao;
		}
		public void setId_sessao(int id_sessao) {
			this.id_sessao = id_sessao;
		}
		public int getId_votacao() {
			return id_votacao;
		}
		public void setId_votacao(int id_votacao) {
			this.id_votacao = id_votacao;
		}
		public int getId_associado() {
			return id_associado;
		}
		public void setId_associado(int id_associado) {
			this.id_associado = id_associado;
		}
		public String getStatus_voto() {
			return status_voto;
		}
		public void setStatus_voto(String status_voto) {
			this.status_voto = status_voto;
		}
		
		
}
