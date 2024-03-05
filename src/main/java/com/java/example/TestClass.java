package com.java.example;

import java.math.BigDecimal;

public class TestClass {

        public void doTestClass() {

                // BigDecimal object to store the result
                BigDecimal res;

                // For user input
                // Use Scanner or BufferedReader

                // Object of String created
                // Holds the value
                String input1
                        = "31452678569.25";

                // Convert the string input to BigDecimal
                BigDecimal a
                        = new BigDecimal(input1);

                // Scale for BigDecimal
                int newScale = 4;

                // Using setScale() method
                res = a.setScale(newScale,BigDecimal.ROUND_FLOOR);

                // Display the result in BigDecimal
                System.out.println(res);
        }
}