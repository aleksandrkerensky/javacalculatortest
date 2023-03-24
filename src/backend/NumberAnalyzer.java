/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.text.DecimalFormat;

/**
 * Backend class for a calculator
 *
 * To be used with GitHub, includes essential operations
 *
 * @author paulz
 */
public class NumberAnalyzer {

    public NumberAnalyzer() {
    }

    /**
     * Casts and adds two numbers fetched from a JTextField, outputs a double
     *
     * Receives two numbers from a JTextField, casts them to doubles and
     * performs an addition, the resulting number is another double
     *
     * @param firstNumber first number to add
     * @param secondNumber second number to add
     * @return the result, as a double
     */
    public double add(String firstNumber, String secondNumber) {
        return Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
    }

    /**
     * Casts and subtracts two numbers fetched from a JTextField, outputs a
     * double
     *
     * Receives two Strings, casts them to doubles and performs a subtraction
     *
     * @param firstNumber minuend
     * @param secondNumber subtrahend
     * @return the result, as a double
     */
    public double subtract(String firstNumber, String secondNumber) {
        return Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber);
    }

    /**
     * Casts and multiplies two numbers fetched from a JTextField, outputs a
     * double
     *
     * Receives two Strings, casts them to doubles and performs a multiplication
     *
     * @param firstNumber multiplicand
     * @param secondNumber markiplier
     * @return the result, as a double
     */
    public double multiply(String firstNumber, String secondNumber) {
        return Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber);
    }

    /**
     * Casts and divides two numbers fetched from a JTextField, outputs a double
     *
     * Receives two Strings, casts them to doubles and performs a division
     *
     * @param firstNumber dividend
     * @param secondNumber divisor
     * @return the result, as a double
     */
    public double divide(String firstNumber, String secondNumber) {
        return Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
    }

    /**
     * Two decimals format
     *
     * Receives a double and outputs a String with the decimal format "0.00"
     *
     * @param number number to be formatted
     *
     * @return the resulting formatted number, as a String
     */
    public String printToTwoDecimals(Double number) {
        DecimalFormat df = new DecimalFormat("0.00");

        return df.format(number);
    }
}
