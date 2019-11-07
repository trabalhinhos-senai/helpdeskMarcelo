package helpdesk.helpdesk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UsuarioEntity {
	@Column
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nomeUsuario;
	@Column
	private String loginUsuario;
	@Column
	private String senhaUsuario;
	@Column
	private Integer grupoAcessoId;
	@Column
	private Integer configId;
	
	public UsuarioEntity(Long id, String nomeUsuario, String loginUsuario, String senhaUsuario, Integer grupoAcessoId,
			Integer configId) {
		super();
		this.id = id;
		this.nomeUsuario = nomeUsuario;
		this.loginUsuario = loginUsuario;
		this.senhaUsuario = senhaUsuario;
		this.grupoAcessoId = grupoAcessoId;
		this.configId = configId;
	}
	
	public Long getId() {
		return id;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public String getLoginUsuario() {
		return loginUsuario;
	}
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public int getGrupoAcessoId() {
		return grupoAcessoId;
	}
	public int getConfigId() {
		return configId;
	}

	public void setId(Long id) {
		if(id != null)
			this.id = id;
	}

	public void setNomeUsuario(String nomeUsuario) {
		if(nomeUsuario != null)
			this.nomeUsuario = nomeUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		if(loginUsuario != null)
			this.loginUsuario = loginUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		if(senhaUsuario != null)
			this.senhaUsuario = senhaUsuario;
	}

	public void setGrupoAcessoId(Integer grupoAcessoId) {
		if(grupoAcessoId != null)
			this.grupoAcessoId = grupoAcessoId;
	}

	public void setConfigId(Integer configId) {
		if(configId != null)
			this.configId = configId;
	}
	
	
}
