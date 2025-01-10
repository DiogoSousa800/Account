import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Account account1 = new Account("Diogo", 50.00);
        Account account2 = new Account("Gabriel", -7.53);

        // exibe o saldo inicial
        System.out.printf("%s balace: $%.2f %n",
                account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n",
                account2.getName(),account2.getBalance());

        // Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);


        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n",
                depositAmount);
        account1.deposit(depositAmount); //adiciona o saldo de account1

        //exibe os saldos
        System.out.printf("%s balance: $%.2f %n",
                account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f %n",
                account2.getName(),account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%%nadding %.2f to account balance%n%n",
                depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f %n",
                account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f %n",
                account2.getName(),account2.getBalance());



    }
}
