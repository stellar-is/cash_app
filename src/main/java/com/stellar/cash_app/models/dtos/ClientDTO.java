package com.stellar.cash_app.models.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClientDTO {
    private Long id;
    private String name;
    private Double withdrawalLimit;
    public ClientDTO(String name, Double withdrawalLimit) {
        this.name = name;
        this.withdrawalLimit = withdrawalLimit;
    }

}
