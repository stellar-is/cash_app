package com.stellar.cash_app.services.impl;

import com.stellar.cash_app.mappers.ClientsMapper;
import com.stellar.cash_app.models.dtos.ClientDTO;
import com.stellar.cash_app.repos.ClientRepo;
import com.stellar.cash_app.services.ClientService;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    private ClientsMapper clientsMapper;
    private final ClientRepo clientRepo;

    public ClientServiceImpl(ClientRepo clientRepo) {
        this.clientsMapper = ClientsMapper.INSTANCE;
        this.clientRepo = clientRepo;
    }

    @Override
    public ClientDTO saveClient(String name, Double limit) {
        ClientDTO clientDTO = new ClientDTO(name,limit);
      return clientsMapper.toDto(clientRepo.save(clientsMapper.toEntity(clientDTO)));
    }

    @Override
    public ClientDTO findById(Long clientId) {
        return clientsMapper.toDto(clientRepo.findById(clientId).get());
    }
}
