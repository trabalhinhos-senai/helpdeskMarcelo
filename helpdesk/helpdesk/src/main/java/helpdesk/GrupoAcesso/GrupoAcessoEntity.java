package helpdesk.GrupoAcesso;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GrupoAcessoEntity {
	@Column
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nomeGrupo;
	
	protected GrupoAcessoEntity() {
		
	}
	
	public GrupoAcessoEntity(String nomeGrupo) {
		super();
		this.nomeGrupo = nomeGrupo;
	}
	
	@Override
	public String toString() {
		return "GrupoAcessoEntity [id=" + id + ", nomeGrupo=" + nomeGrupo + "]";
	}
	
	public String getNomeGrupo() {
		return nomeGrupo;
	}

	public void setNomeGrupo(String nomeGrupo) {
		if(nomeGrupo != null)
			this.nomeGrupo = nomeGrupo;
	}

	public Long getId() {
		return id;
	}
}
