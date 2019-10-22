package br.com.unipac.cliente.api.clienteapi.resources;

import br.com.unipac.cliente.api.clienteapi.daoInterfaces.ClienteDAO;
import br.com.unipac.cliente.api.clienteapi.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteResources {

    @Autowired
    private ClienteDAO dao;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public ResponseEntity<List<Cliente>> listarTodos() {

        List<Cliente> clientes = dao.listaTodos();

        return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public ResponseEntity<Boolean> alterar(@PathParam(value = "id") Long id, @RequestBody Cliente cliente) {

        boolean resultado = dao.removerPorId(cliente);

        return new ResponseEntity<Boolean>(resultado, HttpStatus.OK);

    }


}
