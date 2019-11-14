package helpdesk.helpdesk.Usuario;

public class UsuarioDTO {

	public static final UsuarioDTO NULL_VALUE = new UsuarioDTO("", "", "");
	
	 private final String nomeUsuario;
	 private final String loginUsuario;
	 private final String senhaUsuario;

	 
	 public UsuarioDTO(String nomeUsuario, String loginUsuario, 
			 		String senhaUsuario) {
						this.nomeUsuario = nomeUsuario;
						this.loginUsuario = loginUsuario;
						this.senhaUsuario = senhaUsuario;
						
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
