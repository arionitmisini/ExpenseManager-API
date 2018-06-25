package com.arioniti.expenxemanager.expensemanager.controller;

import com.arioniti.expenxemanager.expensemanager.models.Expense;
import com.arioniti.expenxemanager.expensemanager.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/expense")
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        List<Expense> result = expenseService.findAll();

        return new ResponseEntity<>(result, HttpStatus.OK);
    }


}
