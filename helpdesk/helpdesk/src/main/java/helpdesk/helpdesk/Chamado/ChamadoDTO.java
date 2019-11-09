package helpdesk.helpdesk.Chamado;

public class ChamadoDTO {
	
	 public static final ChamadoDTO NULL_VALUE = new ChamadoDTO("", "", "", "", "", "", 0, 0, 0, 0);
	
	 private final String solicitante;
	 private final String titulo;
	 private final String descricao;
	 private final String status;
	 private final String dataAbertura;
	 private final String dataAlvo;

	 private final int clienteId;
	 private final int tipoAtividadeId;
	 private final int prioridadeChamadoid;
	 private final int usuarioId;
	
	 
	 public ChamadoDTO(String solicitante, String titulo, String descricao, String status, String dataAbertura, String dataAlvo,
			int clienteId, int tipoAtividadeId, int prioridadeChamadoid, int usuarioId) {
		this.status = status;
		this.solicitante = solicitante;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataAbertura = dataAbertura;
		this.dataAlvo = dataAlvo;
		
		this.clienteId = clienteId;
		this.tipoAtividadeId = tipoAtividadeId;
		this.prioridadeChamadoid = prioridadeChamadoid;
		this.usuarioId = usuarioId;
	}
	 
	public String getSolicitante() {
		return solicitante;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getDataAbertura() {
		return dataAbertura;
	}
	public String getDataAlvo() {
		return dataAlvo;
	}
	public int getClienteId() {
		return clienteId;
	}
	public int getTipoAtividadeId() {
		return tipoAtividadeId;
	}
	public int getPrioridadeChamadoid() {
		return prioridadeChamadoid;
	}
	public int getUsuarioId() {
		return usuarioId;
	}

	public String getStatus() {
		return status;
	}
	
	 
	 
	
}
