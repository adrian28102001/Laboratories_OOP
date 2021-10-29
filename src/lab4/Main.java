package lab4;

import java.io.*;

import static lab4.CheckExpression.BalancedBrackets;

public class Main {
    public static void main(String[] args) throws Exception {
        File firstFile = new File("C:\\Users\\gherm\\IdeaProjects\\Laboratories_OOP\\src\\lab4\\one_expression.txt");
        File secondFile = new File("C:\\Users\\gherm\\IdeaProjects\\Laboratories_OOP\\src\\lab4\\three_expressions.txt");

        BufferedReader brOne = new BufferedReader(new FileReader(firstFile));
        BufferedReader brTwo = new BufferedReader(new FileReader(secondFile));

        String stringOne;
        while ((stringOne = brOne.readLine()) != null) {
            System.out.println("Expression: " + stringOne + "is: " + BalancedBrackets(stringOne));
        }
        String stringTwo;
        while ((stringTwo = brTwo.readLine()) != null) {
            System.out.println("Expression: " + stringTwo + "is: " + BalancedBrackets(stringTwo));
        }
    }
}
