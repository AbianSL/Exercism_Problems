class BankAccount {

    void open() {
      balance = 0;
    }

    void close() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    synchronized int getBalance() throws BankAccountActionInvalidException {
      return balance;
    }

    synchronized void deposit(int amount) throws BankAccountActionInvalidException { 
      balance += amount;
    }

    synchronized void withdraw(int amount) throws BankAccountActionInvalidException {
      if (balance == 0) {
        throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
      } else if (amount > balance) {
        throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account"); 
      }
      balance -= amount; 
    }
    
    private int balance;
}
