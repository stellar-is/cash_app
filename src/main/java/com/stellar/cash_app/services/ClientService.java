package com.stellar.cash_app.services;

import com.stellar.cash_app.models.Client;
import com.stellar.cash_app.models.dtos.ClientDTO;

public interface ClientService {
    ClientDTO saveClient(String name, Double limit);

    ClientDTO findById(Long clientId);
}
