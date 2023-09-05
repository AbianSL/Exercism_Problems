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
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    synchronized void withdraw(int amount) throws BankAccountActionInvalidException {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
    
    private int balance;
}
