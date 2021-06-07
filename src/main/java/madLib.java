/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 jiahao zhu
 */
import java.util.Scanner;

public class madLib {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String noun,verb,adjective,adverb;

        System.out.println("Enter a noun:");
        noun = scan.nextLine();
        System.out.println("Enter a verb:");
        verb = scan.nextLine();
        System.out.println("Enter a adjective:");
        adjective = scan.nextLine();
        System.out.println("Enter a adverb:");
        adverb = scan.nextLine();

        System.out.println("Do you "+ verb + " your " + adjective +" "+ noun +" "+ adverb);
    }
}
