package com.vamsi.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.vamsi.entity.BankAccount;

@Component
public class BankAccountDaoImpl implements BankAccountDao {
    private List<BankAccount> listOfAccounts = new ArrayList<>();

    @Override
    public void createAccount(BankAccount bankAccount) {
        listOfAccounts.add(bankAccount);
    }

    @Override
    public List<BankAccount> displayAccountDetails() {
        return listOfAccounts;
    }

	@Override
	public void deleteAccount(int actNumber) {
		// TODO Auto-generated method stub
		BankAccount accountToRemove = null;
		for(BankAccount b: listOfAccounts) {
			if(b.getActNumber() == actNumber) {
				accountToRemove = b;
				break;
			}
		}
		
		if(accountToRemove != null) {
			listOfAccounts.remove(accountToRemove);
			System.out.println("Account deleted successfully.\n");
		} 
		else System.out.println("Account with actNumber: "+actNumber+" not Found!\n");
	}

	@Override
	public void updateAccount(int actNumber, String customerName) {
		// TODO Auto-generated method stub
		BankAccount accountToUpdate = null;
		for(BankAccount b: listOfAccounts) {
			if(b.getActNumber() == actNumber) {
				accountToUpdate = b;
				break;
			}
		}
		
		if(accountToUpdate != null) {
			accountToUpdate.setCustomerName(customerName);
			System.out.println("Account updated successfully.\n");
		}
		else System.out.println("Account with actNumber: "+actNumber+" not Found!\n");
	}
}
