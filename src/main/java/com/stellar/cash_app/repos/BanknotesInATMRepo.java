package com.stellar.cash_app.repos;

import com.stellar.cash_app.models.BanknotesInATM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanknotesInATMRepo extends JpaRepository<BanknotesInATM,Long> {
}
