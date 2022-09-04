package com.stellar.cash_app.repos;

import com.stellar.cash_app.models.OperationBanknotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationBanknotesRepo extends JpaRepository<OperationBanknotes, Long> {
}
