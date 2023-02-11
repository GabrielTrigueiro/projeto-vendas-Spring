package io.github.gabriel.service;

import io.github.gabriel.model.Cliente;
import io.github.gabriel.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository  repository;

    @Autowired
    public ClientesService(ClientesRepository repository) {
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        this.repository.persist(cliente);
    }

    public void validarCliente(Cliente cliente) {
        //aplica validações
    }

}
