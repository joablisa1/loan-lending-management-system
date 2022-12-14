package com.loanlendingmanagementsystem.repository;

import com.loanlendingmanagementsystem.model.Loans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loans,Long> {
}
