package PRACTICAL_EXAM;



public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank(400,10);
        double interest = bank.calculateInterest();
        System.out.println("Lãi được tính: " + interest + "$");
    }
}
