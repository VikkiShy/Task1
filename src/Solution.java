public class Solution {
            public static void main(String[] args) {
                int size = 5;
                for (int i = size; i >= 1; i--) {
                    for (int j = size - i; j > 0; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = 2; i <= size; i++) {
                    for (int j = size - i; j > 0; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }


