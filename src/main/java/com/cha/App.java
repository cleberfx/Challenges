package com.cha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */

    public static void main(final String[] args) throws IOException {

        int N = 0;
        String yearString;
        int century;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);

        while (br.readLine() != null) {
            try {
                System.out.print("Type the year: ");
                N = scan.nextInt();
                if (N >= 1) {
                    yearString = Integer.toString(N);
                    if (yearString.endsWith("00")) {
                        century = N / 100;
                    } else {
                        century = (N / 100) + 1;
                    }
                    System.out.println(century);
                } else {
                    System.out.println("Type a number equal to or greater than 1");
                }
            } catch (Exception e) {
                System.out.println("Type a number equal to or less than 1000000000 " + e);
            }
        }
    }
}
