package br.com.unipac.cliente.api.clienteapi.resources;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.unipac.cliente.api.clienteapi.daoInterfaces.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteResources {
	
	@Autowired
	private ClienteDAO dao;
	
	

}
