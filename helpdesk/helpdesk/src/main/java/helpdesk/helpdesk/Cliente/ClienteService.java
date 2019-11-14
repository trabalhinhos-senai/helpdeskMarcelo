package helpdesk.helpdesk.Cliente;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cliente")
public class ClienteService {

	private final ClienteController clienteController;

	ClienteService(final ClienteController clienteController){
		this.clienteController = clienteController;
	}

	@GetMapping("/list")
	public List<ClienteDTO> List() {
		return this.clienteController.getAllClientes();
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<ClienteDTO> getUsuario(@PathVariable(value = "id") @Valid Long id) {
		final ClienteDTO clienteDTO = this.clienteController.getCliente(id);
		if (clienteDTO.equals(ClienteDTO.NULL_VALUE)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(clienteDTO, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<ClienteDTO> removeUsuario(@PathVariable final Long id) {
		final ClienteDTO removedCliente = this.clienteController.removeCliente(id);
		if (removedCliente.equals(ClienteDTO.NULL_VALUE)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(removedCliente, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<ClienteDTO> updateCliente(@PathVariable final Long id,
			@RequestBody final ClienteDTO clienteDTO) {
		final ClienteDTO oldCliente = this.clienteController.updateCliente(id, clienteDTO);
		if (oldCliente.equals(ClienteDTO.NULL_VALUE)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(oldCliente, HttpStatus.OK);
	}

	@PostMapping
	public Long insertUsuario(@RequestBody final ClienteDTO clienteDTO) {
		return this.clienteController.insertCliente(clienteDTO);
	}

}
