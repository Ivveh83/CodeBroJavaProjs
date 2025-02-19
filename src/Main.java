import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte NO_MONTHS_PER_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Principal ($1K - $1M): ");
        int principalLoan = scanner.nextInt();

        boolean isOn = true;
        if (principalLoan < 1000 || principalLoan > 1_000_000)
            while (isOn) {
                System.out.println("Enter a number between 1,000 and 1,000,000.");
                System.out.print("Principal ($1K - $1M): ");
                principalLoan = scanner.nextInt();
                if (principalLoan > 1000 && principalLoan < 1_000_000)
                    isOn = false;
            }

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();

        isOn = true;
        if (annualInterestRate <= 0 || annualInterestRate >= 30)
            while (isOn) {
                System.out.println("Enter a value greater than 0 and equal to or lesser than 30.");
                System.out.print("Annual Interest Rate: ");
                annualInterestRate = scanner.nextInt();
                if (annualInterestRate > 0 && annualInterestRate <= 30)
                    isOn = false;
            }

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();

        isOn = true;
        if (years < 1 || years > 30)
            while (isOn) {
                System.out.println("Enter a value between 1 and 30.");
                System.out.print("Period (Years): ");
                years = scanner.nextByte();
                if (years >= 1 && years <= 30)
                    isOn = false;
            }

        float monthlyInterestRate = annualInterestRate / PERCENT / NO_MONTHS_PER_YEAR;
        int noOfPayments = years * NO_MONTHS_PER_YEAR;
        float numerator = (float) (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, noOfPayments)); //täljaren
        float denominator = (float) Math.pow(1 + monthlyInterestRate, noOfPayments) - 1; // nämnaren
        float monthlyMortgagePayment = (numerator / denominator) * principalLoan;
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
        String monthlyMortagePaymentString = currencyInstance.format(monthlyMortgagePayment);

        System.out.println("Mortgage: " + monthlyMortagePaymentString);

        }

    }