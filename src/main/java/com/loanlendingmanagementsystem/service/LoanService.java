package com.loanlendingmanagementsystem.service;

import com.loanlendingmanagementsystem.model.Loans;
import com.loanlendingmanagementsystem.model.User;
import com.loanlendingmanagementsystem.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {
    @Autowired
    LoanRepository loanRepository;

    public List<Loans> findLoansList(){
        return loanRepository.findAll();
    }
    public void saveLoan(Loans loans){
        User user =new User();
        loans.setUser(user);
        loanRepository.save(loans);
    }
}
