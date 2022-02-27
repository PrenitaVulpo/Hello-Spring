package io.github.prenitavulpo.services;

import io.github.prenitavulpo.models.Client;
import io.github.prenitavulpo.repositories.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientsService {

    private ClientsRepository clientsRepository;

    @Autowired
    public ClientsService(ClientsRepository clientsRepository){
        this.clientsRepository = clientsRepository;
    }

    public void saveClient(Client client){
        validadeClient(client);
        this.clientsRepository.persistClient(client);
    }

    public void validadeClient(Client client){}
}
