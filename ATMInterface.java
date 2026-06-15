import java.util.Scanner;
class ATM{
    double balance = 1000;
    void checkBalance(){
        System.out.println("Current Balance = "+balance);
    }
    void deposit(double amount){
        balance += amount;
        System.out.println(amount+"  Deposited Successfully");
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance -= amount;
            System.out.println(amount+" withdraw successfully");
        }
        else
            System.out.println("Insufficient Balance");
    }
}
public class BankAccount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();
        int choice;
        do{
            System.out.println("1.check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    atm.checkBalance();
                    break;
            case 2:
                System.out.println("Enter the amount to deposit");
                double depositamount = sc.nextDouble();
                atm.deposit(depositamount);
                break;
                case 3:
                    System.out.println("Enter the amount to withdraw");
                    double withdrawamount = sc.nextDouble();
                    atm.withdraw(withdrawamount);
                    break;
                    case 4:
                        System.out.println("Thank you for using ATM");
                        break;
                        default:
                            System.out.println("Invalid Choice");
            }
        }
        while(choice != 4);
        sc.close();
}
}