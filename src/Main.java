import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat) {
            System.out.println("The current song is playing. Do you want to go on to the next song?");
            String WhatDoYouWant = input.next();
            String lc = WhatDoYouWant.toLowerCase();
            if (lc.equals("yes")) {
                isOnRepeat = false;
            }
        }
    }
}
