package bank;

public class Client {
    String name;
    TypeAccount typeAccount;
    float balance;

    Client(String name, TypeAccount typeAccount, float initialBalance) {
        this.name = name;
        this.typeAccount = typeAccount;
        this.balance = initialBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeAccount getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(TypeAccount typeAccount) {
        this.typeAccount = typeAccount;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
