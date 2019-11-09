package helpdesk.helpdesk.Usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
(name = "tb_usuario")
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
	
	protected UsuarioEntity() {
	}
	
	public UsuarioEntity(final String nomeUsuario, final String loginUsuario, final String senhaUsuario, final Integer grupoAcessoId,
			final Integer configId) {
		this.nomeUsuario = nomeUsuario;
		this.loginUsuario = loginUsuario;
		this.senhaUsuario = senhaUsuario;
		this.grupoAcessoId = grupoAcessoId;
		this.configId = configId;
	}
	
	@Override
	public String toString() {
		return "UsuarioEntity [id=" + id + ", nomeUsuario=" + nomeUsuario + ", loginUsuario=" + loginUsuario + ", senhaUsuario=" + senhaUsuario + ", grupoAcessoId=" + grupoAcessoId + ", configId=" + configId + "]";
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
