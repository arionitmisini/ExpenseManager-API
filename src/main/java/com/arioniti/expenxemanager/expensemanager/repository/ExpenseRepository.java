package com.arioniti.expenxemanager.expensemanager.repository;

import com.arioniti.expenxemanager.expensemanager.models.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ExpenseRepository extends MongoRepository<Expense, String> {

    List<Expense> findByMonthAndYear(String month, int year);

    List<Expense> findByYear(int year);

}
