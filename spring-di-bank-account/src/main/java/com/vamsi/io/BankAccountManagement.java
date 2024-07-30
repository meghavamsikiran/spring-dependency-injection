package com.vamsi.io;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.vamsi.AppConfig;
import com.vamsi.entity.BankAccount;
import com.vamsi.service.BankAccountService;

@Component
public class BankAccountManagement {
    private Scanner sc;
    private BankAccountService bankAccountService;

    @Autowired
    public BankAccountManagement(BankAccountService bankAccountService) {
        this.sc = new Scanner(System.in);
        this.bankAccountService = bankAccountService;
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BankAccountManagement bam = context.getBean(BankAccountManagement.class);
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Select an option:");
            System.out.println("1. Create Account");
            System.out.println("2. Display Account Details");
            System.out.println("3. Delete Account by actNumber");
            System.out.println("4. Update Account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bam.createAccount();
                    System.out.println("Account created successfully.\n");
                    break;
                case 2:
                    bam.displayAccountDetails();
                    break;
                case 3: 
                	bam.deleteAccount();
                	break;
                case 4:
                    bam.updateAccount();
                    break;
                case 5:
                    running = false;
                    System.out.println("Services Stopped!");
                    break;
                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        }
    }

    private void createAccount() {
        System.out.println("Enter actNumber: ");
        int actNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter customerName: ");
        String customerName = sc.nextLine();

        BankAccount bankAccount = new BankAccount();
        bankAccount.setActNumber(actNumber);
        bankAccount.setCustomerName(customerName);

        bankAccountService.createAccount(bankAccount);
    }

    private void displayAccountDetails() {
        bankAccountService.displayAccountDetails();
    }
    
    private void deleteAccount() {
    	System.out.println("Enter actNumber to delete account: ");
    	int actNumber = sc.nextInt();
    	bankAccountService.deleteAccount(actNumber);
 
    }
    
    private void updateAccount() {
    	System.out.println("Enter actNumber to update account: ");
    	int actNumber = sc.nextInt();
    	sc.nextLine();
    	System.out.println("Enter new Customer Name: ");
    	String customerName = sc.nextLine();
    	bankAccountService.updateAccount(actNumber, customerName);
    }
}
