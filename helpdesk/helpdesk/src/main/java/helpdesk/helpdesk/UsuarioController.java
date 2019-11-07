package helpdesk.helpdesk;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;

@Controller
public class UsuarioController {
	
	private final UsuarioRepository usuarioRepository;
	
	UsuarioController(UsuarioRepository usuarioRepository) {
	    this.usuarioRepository = usuarioRepository;
	}
	
	private static UsuarioEntity toEntity(final UsuarioDTO usuarioDTO) {
		final Long Id = usuarioDTO.getId();
		final String nomeUsuario = usuarioDTO.getNomeUsuario();
		final String loginUsuario = usuarioDTO.getLoginUsuario();
		final String senhaUsuario = usuarioDTO.getSenhaUsuario();
		final int grupoAcessoId = usuarioDTO.getGrupoAcessoId();
		final int configId = usuarioDTO.getConfigId();
		return new UsuarioEntity(Id, nomeUsuario, loginUsuario, senhaUsuario, grupoAcessoId, configId);
	} 
	
	private static UsuarioDTO toDTO(final UsuarioEntity usuarioEntity) {
		final Long Id = usuarioEntity.getId();
		final String nomeUsuario = usuarioEntity.getNomeUsuario();
		final String loginUsuario = usuarioEntity.getLoginUsuario();
		final String senhaUsuario = usuarioEntity.getSenhaUsuario();
		final int grupoAcessoId = usuarioEntity.getGrupoAcessoId();
		final int configId = usuarioEntity.getConfigId();
		return new UsuarioDTO(Id, nomeUsuario, loginUsuario, senhaUsuario, grupoAcessoId, configId);
	}
	
	private static void updateEntityFromFTO(final UsuarioDTO usuarioDTO, final UsuarioEntity usuarioEntity) {
		usuarioEntity.setNomeUsuario(usuarioDTO.getNomeUsuario());
		usuarioEntity.setLoginUsuario(usuarioDTO.getLoginUsuario());
		usuarioEntity.setSenhaUsuario(usuarioDTO.getSenhaUsuario());
		usuarioEntity.setGrupoAcessoId(usuarioDTO.getGrupoAcessoId());
		usuarioEntity.setConfigId(usuarioDTO.getConfigId());
		
	}
	
	List<UsuarioDTO> getAllUsuarios(){
		final List<UsuarioDTO> usuarios = new ArrayList<>();
		this.usuarioRepository.findAll().forEach(usuarioEntity -> usuarios.add(UsuarioController.toDTO(usuarioEntity)));
		return usuarios;
	}
	
	UsuarioDTO getUsuario(final Long id) {
		final Optional<UsuarioEntity> optionalUsuario = this.usuarioRepository.findById(id);
		if(optionalUsuario.isPresent()) {
			return UsuarioController.toDTO(optionalUsuario.get());
		}
		return UsuarioDTO.NULL_VALUE;
	}
	
	UsuarioDTO removeUsuario(final Long id) {
		final Optional<UsuarioEntity> optionalUsuario = this.usuarioRepository.findById(id);
		if(optionalUsuario.isPresent()) {
			final UsuarioEntity usuarioEntity = optionalUsuario.get();
			this.usuarioRepository.delete(usuarioEntity);
			return UsuarioController.toDTO(usuarioEntity);
		}
		return UsuarioDTO.NULL_VALUE;
	}
	
	Long insertUsuario(final UsuarioDTO usuarioDTO) {
		final UsuarioEntity usuarioEntity = UsuarioController.toEntity(usuarioDTO);
		this.usuarioRepository.save(usuarioEntity);
		return usuarioEntity.getId();
	}
	
	UsuarioDTO updateUsuario(final Long id, final UsuarioDTO usuarioDTO) {
		final Optional<UsuarioEntity> optionalUsuario = this.usuarioRepository.findById(id);
		if(optionalUsuario.isPresent()) {
			final UsuarioEntity usuarioEntity = optionalUsuario.get();
			final UsuarioDTO oldUsuario = UsuarioController.toDTO(usuarioEntity);
			UsuarioController.updateEntityFromFTO(usuarioDTO, usuarioEntity);
			this.usuarioRepository.save(usuarioEntity);
			return oldUsuario;
		}
		return UsuarioDTO.NULL_VALUE;
	}
	
	public boolean isExistsProductByIdentifier(final Long id) {
		return this.usuarioRepository.existsById(id);
	}
	
}
