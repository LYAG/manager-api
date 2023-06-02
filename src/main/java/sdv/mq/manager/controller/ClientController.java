package sdv.mq.manager.controller;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sdv.mq.manager.entity.Client;
import sdv.mq.manager.service.ClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/clients")
public class ClientController {

    private ClientService clientService;

    // build create User REST API
    @PostMapping
    public ResponseEntity<Client> updateClient(@RequestBody Client client){
        Client savedCliente = clientService.updateClient(client);
        return new ResponseEntity<>(savedCliente, HttpStatus.CREATED);
    }

    // build get client by id REST API
    // http://localhost:8080/api/clients/1
    @GetMapping("{id}")
    public ResponseEntity<Client> getClientById(@PathVariable("id") Long id){
        Client client = clientService.getClientById(id);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }

    // Build Get All Users REST API
    // http://localhost:8080/api/clients
    @GetMapping
    public ResponseEntity<List<Client>> getAllUsers(){
        List<Client> users = clientService.getAllClient();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    // Build Update Client REST API
    @PutMapping("{id}")
    // http://localhost:8081/api/clients/1
    public ResponseEntity<Client> updateClient(@PathVariable("id") Long id,
                                           @RequestBody Client client){
        client.setId(id);
        Client updatedClient = clientService.updateClient(client);
        return new ResponseEntity<>(updatedClient, HttpStatus.OK);
    }

    // Build Delete Client REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long id){
        clientService.deleteClient(id);
        return new ResponseEntity<>("Client successfully deleted!", HttpStatus.OK);
    }
}