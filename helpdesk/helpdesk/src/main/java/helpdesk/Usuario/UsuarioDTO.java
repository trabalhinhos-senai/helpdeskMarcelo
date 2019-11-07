package helpdesk.Usuario;

public class UsuarioDTO {

	public static final UsuarioDTO NULL_VALUE = new UsuarioDTO("", "", "", 0, 0);
	
	 private final String nomeUsuario;
	 private final String loginUsuario;
	 private final String senhaUsuario;
	 private final int grupoAcessoId;
	 private final int configId;
	 
	 public UsuarioDTO(String nomeUsuario, String loginUsuario, 
			 		String senhaUsuario, int grupoAcessoId, int configId) {
						this.nomeUsuario = nomeUsuario;
						this.loginUsuario = loginUsuario;
						this.senhaUsuario = senhaUsuario;
						this.grupoAcessoId = grupoAcessoId;
						this.configId = configId;
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
	 
	 
	
}
