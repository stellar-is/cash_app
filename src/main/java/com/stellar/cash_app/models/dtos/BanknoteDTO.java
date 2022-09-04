package com.stellar.cash_app.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BanknoteDTO {
    private Long id;
    private Double value;

    public BanknoteDTO(Double value) {
        this.value = value;
    }
}
