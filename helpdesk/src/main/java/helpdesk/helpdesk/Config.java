package helpdesk.helpdesk;

public class Config {
	
	 private final int id;
	 private final String nomeEmpresa;
	 private final String telefoneEmpresa;
	 private final String emailEmpresa;
	 private final String enderecoEmpresa;
	 private final String cidade;
	 private final String bairro;
	 private final String estado;
	 private final int numeroEndereco;
	
	 
	 
	 
	 public Config(int id, String nomeEmpresa, String telefoneEmpresa, String emailEmpresa, 
			 String enderecoEmpresa, String cidade, String bairro, String estado, int numeroEndereco) {
				this.id = id;
				this.nomeEmpresa = nomeEmpresa;
				this.telefoneEmpresa = telefoneEmpresa;
				this.emailEmpresa = emailEmpresa;
				this.enderecoEmpresa = enderecoEmpresa;
				this.cidade = cidade;
				this.bairro = bairro;
				this.estado = estado;
				this.numeroEndereco = numeroEndereco;
	}
	 
	public int getId() {
		return id;
	}
	
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	
	public String getTelefoneEmpresa() {
		return telefoneEmpresa;
	}
	
	public String getEmailEmpresa() {
		return emailEmpresa;
	}
	
	public String getEnderecoEmpresa() {
		return enderecoEmpresa;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public int getNumeroEndereco() {
		return numeroEndereco;
	}
	 
	 
	
}
