package com.stellar.cash_app.repos;

import com.stellar.cash_app.models.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OperationRepo extends JpaRepository<Operation,Long> {
}
