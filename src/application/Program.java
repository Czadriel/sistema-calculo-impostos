package application;

import entitiens.User;
import entitiens.UserCompany;
import entitiens.UserIndividual;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c): ");
            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double anualicome = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthexpenditures = sc.nextDouble();
                users.add(new UserIndividual(name, anualicome, healthexpenditures));
            }
            else {
                System.out.print("Numberofemployees: ");
                double numberofemployees = sc.nextDouble();
                users.add(new UserCompany(name, anualicome, numberofemployees));
            }

            /// vai guardar a soma total dos impostos ///
            double sum = 0.0;

            System.out.println("TAXES PAID:");

            for( User u : users){
                double tax = u.tax();
                /// u.getName é um objeto da lista users ///
                System.out.println("Name: " + u.getName() + '\'' +
                        ", : $ " + String.format("%2.f", tax) );
                /// somando todos os impostos ///
                sum += tax;
            }

            System.out.println(" TOTAL TAXES: $ " + String.format("%2.f", sum));

            sc.close();
        }
    }
}