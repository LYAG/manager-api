package sdv.mq.manager.service.impl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sdv.mq.manager.entity.Client;
import sdv.mq.manager.repository.ClientRepository;
import sdv.mq.manager.service.ClientService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getClientById(Long id) {
        Optional<Client> optionalUser = clientRepository.findById(id);
        return optionalUser.get();
    }

    @Override
    public List<Client> getAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public Client updateClient(Client client) {
        Client existingClient = clientRepository.findById(client.getId()).get();
        existingClient.setPrenom(client.getPrenom());
        existingClient.setNom(client.getNom());
        existingClient.setDateNaissance(client.getDateNaissance());
        Client updateClient = clientRepository.save(existingClient);
        return updateClient;
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
