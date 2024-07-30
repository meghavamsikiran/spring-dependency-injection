package com.vamsi.service;

import java.util.List;
import com.vamsi.entity.BankAccount;

public interface BankAccountService {
    void createAccount(BankAccount bankAccount);
    void displayAccountDetails();
    void deleteAccount(int actNumber);
    void updateAccount(int actNumber, String customerName);
}
