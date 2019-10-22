package br.com.unipac.cliente.api.clienteapi.resources;

import br.com.unipac.cliente.api.clienteapi.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.unipac.cliente.api.clienteapi.daoInterfaces.*;

import java.util.List;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteResources {
	
	@Autowired
	private ClienteDAO dao;
	
//	@RequestMapping(method = RequestMethod.POST,
//			consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
//			produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	@ResponseBody
//	public ResponseEntity<Boolean> salvar(@ResponseBody Cliente cliente){
//		boolean resultado = dao.salvar(cliente);
//		return new ResponseEntity<Boolean>(resultado, HttpStatus.CREATED);
//	}
	

}
