package Assignment4;

public class Bank {

    int accNumber;
    String accHolderName;
    double accBalance;
    String accType;

    public Bank(int accNumber, String accHolderName, double accBalance, String accType) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.accBalance = accBalance;
        this.accType = accType;
    }

    public void deposit(int accNumber,String accHolderName,double accBalance,String accType){

        System.out.println("money is deposited into "+accNumber+" in the name of "+accHolderName+" with balance"+accBalance+" in "+accType);

    }

    public void withdraw(int accNumber,String accHolderName,double accBalance,String accType){

        System.out.println("money is withdrawn from "+accNumber+" in the name of "+accHolderName+" with balance "+accBalance+" in "+accType);

    }

    public static void main(String[] args) {

        Bank b = new Bank(121552,"John",5254.5,"Savings account");
        b.deposit(4551,"smith",45511.55,"Savings Account");
        b.withdraw(78456,"sat",515.15,"Checking account");

    }
}
