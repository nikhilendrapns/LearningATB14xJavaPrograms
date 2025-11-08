package Java_Question;
/*ATM Withdrawal Simulation. (Follow Below Steps to Write Program)
Steps to Write the Program

1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
2️⃣ Take user input for the amount they want to withdraw.
3️⃣ Check withdrawal conditions:
    The amount should be greater than zero.
    The amount should be a multiple of 100 (common ATM rule).
    The amount should not exceed the account balance.
4️⃣ Deduct the amount from the balance if conditions are met.
5️⃣ Display the updated balance or an error message if the withdrawal fails.*/

import java.util.Scanner;
public class Q26_ATM_Withdrwal {
    public static void main(String[] args) {
        int balance=10000;
        Scanner scanner=new Scanner(System.in);
        int withdrwalAmount;
        System.out.println("Enter the amount to withdraw ");
        if(scanner.hasNextInt())
        {
            withdrwalAmount= scanner.nextInt();
            if(withdrwalAmount>0)
            {
                if(withdrwalAmount%100==0)
                {
                    if(withdrwalAmount<=balance)
                    {
                        balance=balance-withdrwalAmount;
                    }
                    else System.out.println("You dont have sufficient balance");
                }
                else System.out.println("Enter amount in multiples of 100");
            }
            else System.out.println("Enter amount more than 0");
        }
        else {System.out.println("Enter a valid amount");
            return;}

        System.out.println("Balance = "+balance);
    }
}

/*
  public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be withdrawn");
        int Acc_bal=10000;
        int new_acc_bal;
        if(!sc.hasNextInt())
        {
            System.out.println("Enter a valid input");
        }
        else {
            int amount_withdraw=sc.nextInt();
            if(amount_withdraw > 0 && amount_withdraw %100==0 && amount_withdraw <= Acc_bal)
            {
                new_acc_bal= Acc_bal-amount_withdraw;
                System.out.println("The new balance amount after withdraw is " + new_acc_bal);
            }
            else
            {
                System.out.println("Withdraw failed.Enter a valid amount greater than 0, in multiples of 100 less than the account balance");
            }
        }

    }
}
 */

/*
public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Amount want to withdraw");
            int amount =scanner.nextInt();
            int account_balance=10000;
                    if (amount <= 0) {
                        System.out.println("❌ Invalid amount. Must be greater than zero.");
                    } else if (amount % 100 != 0) {
                        System.out.println("❌ Amount must be a multiple of 100.");
                    } else if (amount > account_balance) {
                        System.out.println("❌ Insufficient balance.");
                    } else {
                        // Step 4: Deduct amount
                        account_balance -= amount;
                        // Step 5: Display updated balance
                        System.out.println("Withdrawal successful!");
                        System.out.println("Current balance: ₹" + account_balance);
                    }

                    scanner.close();
                }
            }
 */
/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any amount you want to withdraw: ");
        long withdrawal_amount = scanner.nextLong();
        long acc_balance = 10000;
        long updated_balance;
        if (withdrawal_amount > 0){
            if (withdrawal_amount % 100 == 0){
                if (withdrawal_amount < acc_balance){
                    updated_balance = acc_balance - withdrawal_amount;
                    System.out.println("Updated account balance is :"+updated_balance);
                }
                else {
                    System.out.println("Error!\nWithdrawal amount must less than current account balance :"+ acc_balance);
                }
            }
            else {
                System.out.println("Error!\nWithdrawal amount must be a multiple of 100");
                System.out.println("Current Balance is : "+acc_balance);
            }
        }
        else {
            System.out.println("Invalid withdrawal amount");
            System.out.println("Current Balance is : "+acc_balance);
        }
    }
}
 */
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        double bal = 10000;
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid Amount");
        } else if (amount % 100 != 0) {
            System.out.println("Amount must be multiple of 100");
        } else if (amount > bal) {
            System.out.println("Insufficient Bal");
        } else {
            bal -= amount;
            System.out.println("Withdraw successful!! Remaining Bal " +bal);
        }
    }
}
 */

/*
static void main(String[] args) {

        int balance = 10000;

        Scanner sc = new Scanner(System.in);
        System.out.println("---- ATM Withdrawal Simulation----");
        System.out.println("Current balance is: $"+balance);
        System.out.print("Enter the amount to be withdrawal: $");
        int withdraw_amt = sc.nextInt();

        if(withdraw_amt<=0)
        {
            System.out.println("Invalid amount...The amount should be greater than zero.");
        }
        else if(withdraw_amt%100!=0)
        {
            System.out.println("Invalid amount...withdrawal amount should be a multiple of 100");
        }
        else if(withdraw_amt>balance)
        {
            System.out.println("Invalid... withdrawal amount should not exceed the account balance.");
        }
        else
        {
            balance-=withdraw_amt;
            System.out.println("----Withdrawal successful----");
            System.out.println("Amount withdraw: $"+withdraw_amt);
            System.out.println("updated balance: $"+balance);
        }
    }
}
 */
/*
public static void main(String[] args) {
        int account_balance=10000;

        try{
            Scanner scn=new Scanner(System.in);
            System.out.println("enter amount");
            int amount=scn.nextInt();
        if(amount>0 && amount<account_balance && amount%100==0)
        {
            account_balance=account_balance-amount;
            System.out.println("Updated balnce is "+ account_balance);
        }
        }
        catch (Exception e) {
            System.out.println("withdrawal limit is wrong");
            throw new RuntimeException(e);

        }

    }
 */
/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw");
        int n = scanner.nextInt();

        int balance = 10000;

        if (n<=0){
            System.out.println("Invalid amount Entered");
        }
        else if (n<=balance) {
            System.out.println("Withdraw Successful");
            balance -= n;
            System.out.println("Ubdate balenace Rs." + balance);
        }
        else {
            System.out.println("Unable to withdraw insufficient balance");
        }
    }
 */
/*
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Step 1: Initialize balance
    double balance = 10000.00;

    System.out.println("🏧 Welcome to the ATM!");
    System.out.println("Your current balance: ₹" + balance);

    // Step 2: Take user input
    System.out.print("Enter amount to withdraw: ₹");
    double withdrawAmount = sc.nextDouble();

    // Step 3: Check conditions
    if (withdrawAmount <= 0) {
        System.out.println("❌ Invalid amount! Please enter an amount greater than ₹0.");
    }
    else if (withdrawAmount % 100 != 0) {
        System.out.println("⚠️ Amount should be a multiple of ₹100.");
    }
    else if (withdrawAmount > balance) {
        System.out.println("❌ Insufficient balance!");
    }
    else {
        // Step 4: Deduct amount
        balance -= withdrawAmount;
        System.out.println("✅ Withdrawal successful!");
        System.out.println("💵 You withdrew: ₹" + withdrawAmount);
        System.out.println("🏦 Remaining balance: ₹" + balance);
    }

    sc.close();
}

 */
/*
  public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bal = 10000;

        System.out.print("Enter amount: ");
        int amt = s.nextInt();

        if(amt <= 0) {
            System.out.println("Enter Valid Amount");
        }
        else if(amt % 100 != 0) {
            System.out.println("Amount must be multiple of 100");
        }
        else if(amt > bal) {
            System.out.println("Not Enough Balance");
        }
        else {
            bal = bal - amt;
            System.out.println("Withdraw Successful");
            System.out.println("Remaining Balance: " + bal);
        }
    }
 */
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        double bal = 10000;
        double amount = scanner.nextDouble();
        if (amount <= 0){
            System.out.println("Invalid amount");
        } else if (amount % 100 != 0) {
            System.out.println("Amount must be multiple of 100");

        } else if (amount > bal) {
            System.out.println("insufficient balance");
        }
        else {
            bal = bal - amount;
            System.out.println("Withdrawal Succefull ! Remaining balance is Rs " +bal);
        }
    }
}
 */