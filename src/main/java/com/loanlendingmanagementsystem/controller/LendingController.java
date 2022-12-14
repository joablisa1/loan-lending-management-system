package com.loanlendingmanagementsystem.controller;

import com.loanlendingmanagementsystem.model.Lending;
import com.loanlendingmanagementsystem.service.LendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LendingController {

    @Autowired
    LendingService lendingService;

    @GetMapping("/lending")
    public ResponseEntity<List<Lending>>findLendingListResponseEntity(){
        return new ResponseEntity<>(lendingService.findLendings(), HttpStatus.OK);
    }
    @PostMapping("/lending/save")
    public ResponseEntity<Lending>saveLendResponseEntity(@RequestBody Lending lending){
        lendingService.saveLending(lending);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
