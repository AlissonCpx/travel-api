package travelapi.travelapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import travelapi.travelapi.model.ClientModel;
import travelapi.travelapi.repository.ClientRepository;

import java.util.List;

@RestController
@RequestMapping("/Client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public List<ClientModel> list() {
        List<ClientModel> clients = clientRepository.findAll();
        return clients;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClientModel add(@RequestBody ClientModel cli) {
        return clientRepository.save(cli);
    }

    @GetMapping("/one")
    public ClientModel getOne(@RequestParam Long id) {
        ClientModel cli = clientRepository.findById(id).get();
        if (cli != null) {
            return cli;
        }
        return null;
    }
}
