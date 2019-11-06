package helpdesk.helpdesk;

public class Usuario {

	public static final Usuario NULL_VALUE = new Usuario(-1, "", "", "", 0, 0);
	
	 private final int id;
	 private final String nomeUsuario;
	 private final String loginUsuario;
	 private final String senhaUsuario;
	 private final int grupoAcessoId;
	 private final int configId;
	 
	 public Usuario(int id, String nomeUsuario, String loginUsuario, 
			 		String senhaUsuario, int grupoAcessoId, int configId) {
						this.id = id;
						this.nomeUsuario = nomeUsuario;
						this.loginUsuario = loginUsuario;
						this.senhaUsuario = senhaUsuario;
						this.grupoAcessoId = grupoAcessoId;
						this.configId = configId;
	}
	 
	public int getId() {
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
	 
	 
	
}
