package helpdesk.helpdesk.Chamado;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
(name = "tb_chamado")
public class ChamadoEntity {

	@Column
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private  String solicitante;
	private  String titulo;
	private  String descricao;
	private  String status;
	private  String dataAbertura;
	private  String dataAlvo;

	private  int clienteId;
	private  int tipoAtividadeId;
	private  int prioridadeChamadoid;
	private  int usuarioId;
		
	
	protected ChamadoEntity() {
		
	}
	
	public ChamadoEntity(String solicitante, String titulo, String descricao, String status,
			String dataAbertura, String dataAlvo, int clienteId, int tipoAtividadeId, int prioridadeChamadoid,
			int usuarioId) {
		this.solicitante = solicitante;
		this.titulo = titulo;
		this.descricao = descricao;
		this.status = status;
		this.dataAbertura = dataAbertura;
		this.dataAlvo = dataAlvo;
		this.clienteId = clienteId;
		this.tipoAtividadeId = tipoAtividadeId;
		this.prioridadeChamadoid = prioridadeChamadoid;
		this.usuarioId = usuarioId;
	}

	@Override
	public String toString() {
		return "ChamadoEntity [id=" + id + ", solicitante=" + solicitante + ", titulo=" + titulo + ", descricao="
				+ descricao + ", status=" + status + ", dataAbertura=" + dataAbertura + ", dataAlvo=" + dataAlvo
				+ ", clienteId=" + clienteId + ", tipoAtividadeId=" + tipoAtividadeId + ", prioridadeChamadoid="
				+ prioridadeChamadoid + ", usuarioId=" + usuarioId + "]";
	}

	//Getters
	public Long getId() {
		return id;
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

	//Setters
	public void setId(Long id) {
		if(id != null)
			this.id = id;
	}
	
	public void setSolicitante(String solicitante) {
		if(solicitante != null)
			this.solicitante = solicitante;
	}

	public void setTitulo(String titulo) {
		if(titulo != null)
			this.titulo = titulo;
	}

	public void setDescricao(String descricao) {
		if(descricao != null)
			this.descricao = descricao;
	}

	public void setDataAbertura(String dataAbertura) {
		if(dataAbertura != null)
			this.dataAbertura = dataAbertura;
	}

	public void setDataAlvo(String dataAlvo) {
		if(dataAlvo != null)
			this.dataAlvo = dataAlvo;
	}

	public void setClienteId(Integer clienteId) {
		if(clienteId != null)
			this.clienteId = clienteId;
	}

	public void setTipoAtividadeId(Integer tipoAtividadeId) {
		if(tipoAtividadeId != null)
			this.tipoAtividadeId = tipoAtividadeId;
	}

	public void setPrioridadeChamadoid(Integer prioridadeChamadoid) {
		if(prioridadeChamadoid != null)
			this.prioridadeChamadoid = prioridadeChamadoid;
	}

	public void setUsuarioId(Integer usuarioId) {
		if(usuarioId != null)
			this.usuarioId = usuarioId;
	}

	public void setStatus(String status) {
		if(status != null)
			this.status = status;
	}
	
		
}
