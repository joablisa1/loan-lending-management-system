package com.loanlendingmanagementsystem.service;

import com.loanlendingmanagementsystem.commons.ApiCommon;
import com.loanlendingmanagementsystem.model.Lending;
import com.loanlendingmanagementsystem.model.Loans;
import com.loanlendingmanagementsystem.model.User;
import com.loanlendingmanagementsystem.repository.LendingRepository;
import com.loanlendingmanagementsystem.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LendingService {
    @Autowired
    LendingRepository lendingRepository;
    @Autowired
    LoanRepository loanRepository;

    public void saveLending(Lending lending){
        List<Loans> loansList=loanRepository.findAll();
        double amount=0.0;
        for (Loans loans1: loansList){
            amount+=loans1.getAmount();
        }

        ApiCommon apiCommon=new ApiCommon();
//        a=p(1+rt)
        double simpleInterest=lending.getBorrowedAmount() * 1 + Math.pow(apiCommon.RATE,apiCommon.TIME);
        double totalAmount= amount + simpleInterest;

        User user=new User();
        lending.setUser(user);
        lending.setAmount(totalAmount);
        lending.setBorrowedAmount(simpleInterest);
        lendingRepository.save(lending);
    }
    public List<Lending> findLendings(){
        return lendingRepository.findAll();
    }
}
