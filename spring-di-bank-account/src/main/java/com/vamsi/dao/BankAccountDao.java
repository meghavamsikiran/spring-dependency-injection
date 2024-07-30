package com.vamsi.dao;

import java.util.List;
import com.vamsi.entity.BankAccount;

public interface BankAccountDao {
    void createAccount(BankAccount bankAccount);
    List<BankAccount> displayAccountDetails();
    void deleteAccount(int actNumber);
    void updateAccount(int actNumber, String customerName);
}
