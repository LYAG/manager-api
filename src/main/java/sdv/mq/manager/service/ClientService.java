package sdv.mq.manager.service;

import sdv.mq.manager.entity.Client;

import java.util.List;

public interface ClientService {
    Client createClient(Client client);

     Client getClientById(Long id);

    List<Client> getAllClient();

    Client updateClient(Client client);

    void deleteClient(Long id);

}