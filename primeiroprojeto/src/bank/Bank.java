package bank;

public class Bank {
    Client client;

    Bank() {
        this.client = new Client("Iago Carvalho", TypeAccount.Saving, 3500);
    }

    Client getClient() {
        return this.client;
    }

    void showCurrentBalance() {
        System.out.printf("The current balance is $%.2f\n", this.client.getBalance());
    }

    void newDeposit(float value) {
        this.client.balance += value;
    }

    boolean newWithdrawal(float value) {
        if (this.client.balance < value) {
            return false;
        }

        this.client.balance -= value;
        return true;
    }
}
