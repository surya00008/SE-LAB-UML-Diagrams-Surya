public class Customer {
    private String customerName;
    private int AccNumber;
    private String Address;
    private String Phone;

    public void createAccount() {
        // Implementation for creating an account
    }

    public void deposit() {
        // Implementation for depositing money
    }

    public void withdraw() {
        // Implementation for withdrawing money
    }
}

public class Account {
    private int accNo;
    private String custName;
    private double balance;

    public void updateAcc() {
        // Implementation for updating account details
    }

    public void checkAcc() {
        // Implementation for checking account details
    }
}

public class Bank {
    private String custDetails;
    private String loanDetails;
    private int transNo;
    private String transDate;
    private String transTime;

    public void giveLoan() {
        // Implementation for giving a loan
    }

    public void updateDetails() {
        // Implementation for updating customer details
    }

    public void collectMoney() {
        // Implementation for collecting money
    }

    public void transaction() {
        // Implementation for performing a transaction
    }
}