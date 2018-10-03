/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u1_a3_incometax;
import java.util.Scanner;
import java.text.*;
/**
 *Jacob
 *Oct 3 2018
 *To calculate the total income tax based on total income (using Fed level)
 */
public class U1_A3_IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare Scanner
        Scanner keyedInput = new Scanner(System.in);
        
        //declare Money CAN format
        DecimalFormat moneyCanadian = new DecimalFormat ("$##########.##CAN");
        
        //state variables
        //CONSTANTS
        final double LEVEL_ONE_INCOME_TAX_PERCENT = 0.15;//15%
        final double LEVEL_TWO_INCOME_TAX_PERCENT = 0.205;//20.5%
        final double LEVEL_THREE_INCOME_TAX_PERCENT = 0.26;//26%
        final double LEVEL_FOUR_INCOME_TAX_PERCENT = 0.29;//29%
        final double LEVEL_FIVE_INCOME_TAX_PERCENT = 0.33;//33%
        
        final double LEVEL_ONE_INCOME_TAX_THRESHOLD = 46605;//$
        final double LEVEL_TWO_INCOME_TAX_THRESHOLD = 46603;//$
        final double LEVEL_THREE_INCOME_TAX_THRESHOLD = 51281;//$
        final double LEVEL_FOUR_INCOME_TAX_THRESHOLD = 61353;//$
        final double LEVEL_FIVE_INCOME_TAX_THRESHOLD = 205842;//$
        //CHANGING
        double userTotalIncome = 0;
        double userTotalTaxCost = 0;
        
        //Instructions
        System.out.println("Please input your yearly income.");
        
        //Input
        userTotalIncome = keyedInput.nextDouble();
        
        //Calculations
        //lvl 1
        if (userTotalIncome>LEVEL_ONE_INCOME_TAX_THRESHOLD) {
            System.out.println("lvl 1");
            userTotalIncome = userTotalIncome - LEVEL_ONE_INCOME_TAX_THRESHOLD;
            userTotalTaxCost = LEVEL_ONE_INCOME_TAX_THRESHOLD*LEVEL_ONE_INCOME_TAX_PERCENT;
        }
        else {
            System.out.println("Lucky, you don't have to pay anything!");
        }
        //lvl 2
        if (userTotalIncome>LEVEL_TWO_INCOME_TAX_THRESHOLD) {
            System.out.println("lvl 2");
            userTotalIncome = userTotalIncome - LEVEL_TWO_INCOME_TAX_THRESHOLD;
            userTotalTaxCost = userTotalTaxCost + LEVEL_TWO_INCOME_TAX_THRESHOLD*LEVEL_TWO_INCOME_TAX_PERCENT;
        }
        else {
            userTotalIncome = userTotalIncome + userTotalIncome*LEVEL_TWO_INCOME_TAX_PERCENT;
        }
        //lvl 3
        if (userTotalIncome>LEVEL_THREE_INCOME_TAX_THRESHOLD) {
            System.out.println("lvl 3");
            userTotalIncome = userTotalIncome - LEVEL_THREE_INCOME_TAX_THRESHOLD;
            userTotalTaxCost = userTotalTaxCost + LEVEL_THREE_INCOME_TAX_THRESHOLD*LEVEL_THREE_INCOME_TAX_PERCENT;
        }
        else {
            userTotalIncome = userTotalIncome + userTotalIncome*LEVEL_THREE_INCOME_TAX_PERCENT;
        }
        //lvl 4
        if (userTotalIncome>LEVEL_FOUR_INCOME_TAX_THRESHOLD) {
            System.out.println("lvl 4");
            userTotalIncome = userTotalIncome - LEVEL_FOUR_INCOME_TAX_THRESHOLD;
            userTotalTaxCost = userTotalTaxCost + LEVEL_FOUR_INCOME_TAX_THRESHOLD*LEVEL_FOUR_INCOME_TAX_PERCENT;
        }
        else {
            userTotalIncome = userTotalIncome + userTotalIncome*LEVEL_FOUR_INCOME_TAX_PERCENT;
        }
        //lvl 5
        if (userTotalIncome>LEVEL_FIVE_INCOME_TAX_THRESHOLD) {
            System.out.println("lvl 5");
            userTotalTaxCost = userTotalTaxCost + userTotalTaxCost*LEVEL_FIVE_INCOME_TAX_PERCENT;
            System.out.println("You owe the government:"+moneyCanadian.format(userTotalTaxCost));
        }
        else {
            System.out.println("You owe the government:"+moneyCanadian.format(userTotalTaxCost));
        }
    }
    
}
