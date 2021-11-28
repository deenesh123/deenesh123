import java.util.*;
public class Account{
  int accno;
  int balance=0;

 void create(){
  accno=1;
  System.out.println("Your account is created. ");
 }
 void deposit(int balance){
  this.balance=this.balance + balance;
  if(this.balance<500){
    balance=balance-100;
    System.out.println("Rs 100 deducted as balance is less than 500.");
  }
 }
 void withdraw(int wbalance){
  if(wbalance<=balance){balance=balance - wbalance;}
  else{System.out.println("Insufficient balance !!!");}
  if(balance<500){
    balance=balance-100;
    System.out.println("Rs 100 deducted as balance is less than 500.");
  }
 }
 void balanceCheck(){
  System.out.println("Account Balance : "+balance);
 }
 void transfer(){
  System.out.println("Your balance is transfered. ");
 }

public static void main(String []args){

  Account customer = new Account();
  customer.create();
  System.out.println("Enter balance to deposit: ");
  Scanner sc =new Scanner(System.in);
  int x=sc.nextInt();
  customer.deposit(x);
  System.out.println("Enter balance to withdraw: ");
  int y=sc.nextInt();
  customer.withdraw(y);
  customer.balanceCheck();
  customer.transfer();
 }
}
