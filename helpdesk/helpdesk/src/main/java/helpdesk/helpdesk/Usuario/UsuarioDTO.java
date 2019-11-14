package helpdesk.helpdesk.Usuario;

public class UsuarioDTO {

	public static final UsuarioDTO NULL_VALUE = new UsuarioDTO( -1l ,"", "", "");
	
	 private final Long id;
	 private final String nomeUsuario;
	 private final String loginUsuario;
	 private final String senhaUsuario;

	 
	 public UsuarioDTO(Long id, String nomeUsuario, String loginUsuario, String senhaUsuario) {
		 				this.id= id;
						this.nomeUsuario = nomeUsuario;
						this.loginUsuario = loginUsuario;
						this.senhaUsuario = senhaUsuario;
						
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

	 
	
}
