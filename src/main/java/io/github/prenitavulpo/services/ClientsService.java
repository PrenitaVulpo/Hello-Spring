package io.github.prenitavulpo.services;

import io.github.prenitavulpo.models.Client;
import io.github.prenitavulpo.repositories.ClientsRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientsService {
    public void saveClient(Client client){
        validadeClient(client);
        ClientsRepository clientsRepository = new ClientsRepository();
        clientsRepository.persistClient(client);
    }

    public void validadeClient(Client client){}
}
