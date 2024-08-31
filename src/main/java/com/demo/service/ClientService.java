package com.demo.service;

import com.demo.entity.Client;
import com.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService  {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getData() {
        return clientRepository.findAll();

    }

    public Client getUniqueData(String pan) {
        return clientRepository.findBypancard(pan);
    }

    public Client addData(Client client) {
        return clientRepository.save(client);
    }

    public void deleteData(String pan) {
        Client t = clientRepository.findBypancard(pan);
        clientRepository.delete(t);



    }
}
