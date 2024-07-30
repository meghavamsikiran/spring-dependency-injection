package com.vamsi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.vamsi.dao.BankAccountDao;
import com.vamsi.entity.BankAccount;

@Component
public class BankAccountServiceImpl implements BankAccountService {
    private BankAccountDao bankAccountDao;

    @Autowired
    public BankAccountServiceImpl(BankAccountDao bankAccountDao) {
        this.bankAccountDao = bankAccountDao;
    }

    @Override
    public void createAccount(BankAccount bankAccount) {
        bankAccountDao.createAccount(bankAccount);
    }

    @Override
    public void displayAccountDetails() {
        List<BankAccount> accounts = bankAccountDao.displayAccountDetails();
        if (accounts == null || accounts.isEmpty()) {
            System.out.println("===> No accounts found.\n");
        } else {
	        for (BankAccount account : accounts) {
	            System.out.println("\nAccount Number: " + account.getActNumber());
	            System.out.println("Customer Name: " + account.getCustomerName()+"\n");
	        }
        }
    }

	@Override
	public void deleteAccount(int actNumber) {
		// TODO Auto-generated method stub
		bankAccountDao.deleteAccount(actNumber);
	}

	@Override
	public void updateAccount(int actNumber, String customerName) {
		// TODO Auto-generated method stub
		bankAccountDao.updateAccount(actNumber, customerName);
	}
}
