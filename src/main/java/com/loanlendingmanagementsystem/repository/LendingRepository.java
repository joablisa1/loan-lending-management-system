package com.loanlendingmanagementsystem.repository;

import com.loanlendingmanagementsystem.model.Lending;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LendingRepository  extends JpaRepository<Lending,Long> {
}
