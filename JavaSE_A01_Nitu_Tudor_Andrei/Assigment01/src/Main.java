import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> statusList = new ArrayList<>();
        int statusNo;
        statusList.add("Single");
        statusList.add("Married Filing Jointly or Qualified Widow(er)");
        statusList.add("Married Filing Separately");
        statusList.add("Head of Household");
        while(true){
        System.out.println("Select your status by typing the respective number:");
        for (int i = 0; i < statusList.size(); i++) {
            System.out.println(i + 1 + ". " + statusList.get(i));
        }   
        statusNo = Integer.valueOf(scanner.nextLine());
        if(statusNo >= 1 && statusNo <= 4){
            break;
        }
        else{
            System.out.println("Invalid input. Please try again.");
        }
    }
        System.out.println("What is your income?");
        Integer income = Integer.valueOf(scanner.nextLine());
        String status = statusList.get(statusNo - 1);

        System.out.println("Your tax is: " + taxCalculator(status, income));

    }

    public static int taxCalculator(String status, int income) {
        int tax = 0;
        switch (status) {
            case "Single":
                if (income <= 8350) {
                    tax = (int) (0.10 * income);
                } else if (income <= 33950) {
                    tax = (int) (0.15 * income);
                } else if (income <= 82250) {
                    tax = (int) (0.25 * income);
                } else if (income <= 171550) {
                    tax = (int) (0.28 * income);
                } else if (income <= 372950) {
                    tax = (int) (0.33 * income);
                } else {
                    tax = (int) (0.35 * income);
                }
                break;
            case "Married Filing Jointly or Qualified Widow(er)":
                if (income <= 16700) {
                    tax = (int) (0.10 * income);
                } else if (income <= 67900) {
                    tax = (int) (0.15 * income);
                } else if (income <= 137050) {
                    tax = (int) (0.25 * income);
                } else if (income <= 208850) {
                    tax = (int) (0.28 * income);
                } else if (income <= 372950) {
                    tax = (int) (0.33 * income);
                } else {
                    tax = (int) (0.35 * income);
                }
                break;
            case "Married Filing Separately":
                if (income <= 8350) {
                    tax = (int) (0.10 * income);
                } else if (income <= 33950) {
                    tax = (int) (0.15 * income);
                } else if (income <= 68525) {
                    tax = (int) (0.25 * income);
                } else if (income <= 104425) {
                    tax = (int) (0.28 * income);
                } else if (income <= 186475) {
                    tax = (int) (0.33 * income);
                } else {
                    tax = (int) (0.35 * income);
                }
                break;
            case "Head of Household":
                if (income <= 11950) {
                    tax = (int) (0.10 * income);
                } else if (income <= 45500) {
                    tax = (int) (0.15 * income);
                } else if (income <= 117450) {
                    tax = (int) (0.25 * income);
                } else if (income <= 190200) {
                    tax = (int) (0.28 * income);
                } else if (income <= 372950) {
                    tax = (int) (0.33 * income);
                } else {
                    tax = (int) (0.35 * income);
                }
                break;

        }
        return tax;
    }

}