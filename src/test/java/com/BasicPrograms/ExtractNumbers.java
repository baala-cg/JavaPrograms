package com.BasicPrograms;

public class ExtractNumbers {

        public static void main(String[] args) {

            String text = "In 2025, our company completed 12 major projects, served 350 " +
                    "clients across 8 countries, generated revenue of 4.7 million dollars, " +
                    "and hired 25 new employees while maintaining a customer satisfaction rate of 98%.";

            String[] words = text.split(" ");

            double sum = 0;

            for (String word : words) {
                word = word.replaceAll("[^0-9.]", "");

                if (!word.isEmpty()) {
                    sum += Double.parseDouble(word);
                }
            }

            System.out.println(sum);
        }
    }

