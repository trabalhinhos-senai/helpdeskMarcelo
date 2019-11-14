package helpdesk.helpdesk.Usuario;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
(name = "tb_usuario")
public class UsuarioEntity  {
	@Column
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nomeUsuario;
	@Column
	private String loginUsuario;
	@Column
	private String senhaUsuario;
	
	
	protected UsuarioEntity() {
	}
	
	public UsuarioEntity(final String nomeUsuario, final String loginUsuario, final String senhaUsuario) {
		this.nomeUsuario = nomeUsuario;
		this.loginUsuario = loginUsuario;
		this.senhaUsuario = senhaUsuario;
		
	}
	
	@Override
	public String toString() {
		return "UsuarioEntity [id=" + id + ", nomeUsuario=" + nomeUsuario + ", loginUsuario=" + loginUsuario + ", senhaUsuario=" + senhaUsuario + "]";
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


	
}
