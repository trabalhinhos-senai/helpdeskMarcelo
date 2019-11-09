package helpdesk.helpdesk.Chamado;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ChamadoController {
	
	private final ChamadoRepository ChamadoRepository;
	
	ChamadoController(final ChamadoRepository ChamadoRepository) {
	    this.ChamadoRepository = ChamadoRepository;
	}
	
	private static ChamadoEntity toEntity(final ChamadoDTO chamadoDTO) {
		final String solicitante = chamadoDTO.getSolicitante();
		final String titulo = chamadoDTO.getTitulo();
		final String descricao = chamadoDTO.getDescricao();
		final String status = chamadoDTO.getStatus();
		final String dataAbertura = chamadoDTO.getDataAbertura();
		final String dataAlvo = chamadoDTO.getDataAlvo();
		final int clienteId = chamadoDTO.getClienteId();
		final int tipoAtividadeId = chamadoDTO.getTipoAtividadeId();
		final int prioridadeChamadoid = chamadoDTO.getPrioridadeChamadoid();
		final int usuarioId = chamadoDTO.getUsuarioId();
		return new ChamadoEntity(solicitante, titulo, descricao, status, dataAbertura, dataAlvo, clienteId, tipoAtividadeId, prioridadeChamadoid, usuarioId);
	} 
	
	private static ChamadoDTO toDTO(final ChamadoEntity chamadoEntity) {
		final String solicitante = chamadoEntity.getSolicitante();
		final String titulo = chamadoEntity.getTitulo();
		final String descricao = chamadoEntity.getDescricao();
		final String status = chamadoEntity.getStatus();
		final String dataAbertura = chamadoEntity.getDataAbertura();
		final String dataAlvo = chamadoEntity.getDataAlvo();
		final int clienteId = chamadoEntity.getClienteId();
		final int tipoAtividadeId = chamadoEntity.getTipoAtividadeId();
		final int prioridadeChamadoid = chamadoEntity.getPrioridadeChamadoid();
		final int usuarioId = chamadoEntity.getUsuarioId();
		return new ChamadoDTO(solicitante, titulo, descricao, status, dataAbertura, dataAlvo, clienteId, tipoAtividadeId, prioridadeChamadoid, usuarioId);
	}
	
	private static void updateEntityFromDTO(final ChamadoDTO chamadoDTO, final ChamadoEntity chamadoEntity) {
		chamadoEntity.setSolicitante(chamadoDTO.getSolicitante());
		chamadoEntity.setTitulo(chamadoDTO.getTitulo());
		chamadoEntity.setDescricao(chamadoDTO.getDescricao());
		chamadoEntity.setStatus(chamadoDTO.getStatus());
		chamadoEntity.setDataAbertura(chamadoDTO.getDataAbertura());
		chamadoEntity.setDataAlvo(chamadoDTO.getDataAlvo());
		chamadoEntity.setClienteId(chamadoDTO.getClienteId());
		chamadoEntity.setTipoAtividadeId(chamadoDTO.getTipoAtividadeId());
		chamadoEntity.setPrioridadeChamadoid(chamadoDTO.getPrioridadeChamadoid());
		chamadoEntity.setUsuarioId(chamadoDTO.getUsuarioId());	
	}
	
	List<ChamadoDTO> getAllChamados(){
		final List<ChamadoDTO> chamados = new ArrayList<>();
		this.ChamadoRepository.findAll().forEach(chamadoEntity -> chamados.add(ChamadoController.toDTO(chamadoEntity)));
		return chamados;
	}
	
	ChamadoDTO getChamado(final Long id) {
		final Optional<ChamadoEntity> optionalChamado = this.ChamadoRepository.findById(id);
		if(optionalChamado.isPresent()) {
			return ChamadoController.toDTO(optionalChamado.get());
		}
		return ChamadoDTO.NULL_VALUE;
	}
	
	ChamadoDTO removeChamado(final Long id) {
		final Optional<ChamadoEntity> optionalChamado = this.ChamadoRepository.findById(id);
		if(optionalChamado.isPresent()) {
			final ChamadoEntity chamadoEntity = optionalChamado.get();
			this.ChamadoRepository.delete(chamadoEntity);
			return ChamadoController.toDTO(chamadoEntity);
		}
		return ChamadoDTO.NULL_VALUE;
	}
	
	Long insertChamado(final ChamadoDTO ChamadoDTO) {
		final ChamadoEntity chamadoEntity = ChamadoController.toEntity(ChamadoDTO);
		this.ChamadoRepository.save(chamadoEntity);
		return chamadoEntity.getId();
	}
	
	ChamadoDTO updateChamado(final Long id, final ChamadoDTO chamadoDTO) {
		final Optional<ChamadoEntity> optionalChamado = this.ChamadoRepository.findById(id);
		if(optionalChamado.isPresent()) {
			final ChamadoEntity chamadoEntity = optionalChamado.get();
			final ChamadoDTO oldChamado = ChamadoController.toDTO(chamadoEntity);
			ChamadoController.updateEntityFromDTO(chamadoDTO, chamadoEntity);
			this.ChamadoRepository.save(chamadoEntity);
			return oldChamado;
		}
		return ChamadoDTO.NULL_VALUE;
	}	
	
}
