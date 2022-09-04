package com.stellar.cash_app.repos;

import com.stellar.cash_app.models.Banknote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanknoteRepo extends JpaRepository<Banknote,Long> {
}
