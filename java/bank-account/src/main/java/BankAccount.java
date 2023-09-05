class BankAccount {

    void open() {
      isOpen = true;
      balance = 0;
    }

    void close() {
      isOpen = false;
    }

    synchronized int getBalance() throws BankAccountActionInvalidException {
      if (!isOpen){
        throw new BankAccountActionInvalidException("Account closed");
      }
      return balance;
    }

    synchronized void deposit(int amount) throws BankAccountActionInvalidException { 
       if (!isOpen){
        throw new BankAccountActionInvalidException("Account closed");
      } else if (amount < 0) {
        throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
      }
      balance += amount;
    }

    synchronized void withdraw(int amount) throws BankAccountActionInvalidException {
      if (!isOpen){
        throw new BankAccountActionInvalidException("Account closed");
      } else if (balance == 0) {
        throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
      } else if (amount > balance) {
        throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account"); 
      } else if (amount < 0) {
        throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");  
      } 
      balance -= amount; 
    }
    
    private boolean isOpen;
    private int balance;
}
