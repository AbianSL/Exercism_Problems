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
      balance -= amount; 
    }
    
    private int balance;
}
