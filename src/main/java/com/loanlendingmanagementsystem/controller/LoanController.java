package com.loanlendingmanagementsystem.controller;

import com.loanlendingmanagementsystem.model.Loans;
import com.loanlendingmanagementsystem.model.User;
import com.loanlendingmanagementsystem.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LoanController {
    @Autowired
    LoanService loanService;


    @GetMapping("/loan")
    public ResponseEntity<List<Loans>> findAllListLoanResponseEntity(){
        return new ResponseEntity<>(loanService.findLoansList(), HttpStatus.OK);
    }
    @PostMapping("/loans/save")
    public ResponseEntity<Loans> saveUserResponseEntity(@RequestBody Loans loans){
        loanService.saveLoan(loans);
        return  new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
