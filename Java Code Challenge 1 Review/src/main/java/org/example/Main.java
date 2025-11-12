package org.example;
/*
The challenge question:
1. count how many words start with a vowel (a, e, i, o, u)
2. ISBNs number retrieve
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// need Main class
public class Main {

    // main method
    public static void main(String[] args) {


        // VOWEL WORD COUNT
//        Scanner scan = new Scanner(System.in);
//
//        Set<Character> vowels = new HashSet<>();
//        vowels.add('a');
//        vowels.add('e');
//        vowels.add('i');
//        vowels.add('o');
//        vowels.add('u');
//
//        int vowelCount = 0;
//        while(scan.hasNext()) {
//            String word = scan.next().toLowerCase();
//            if(vowels.contains(word.charAt(0))){
//                vowelCount++;
//            }
//        }
//        scan.close();
//        System.out.println(vowelCount);

        // ISBNs NUMBERS
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] isbns = new int[N];

        for ( int i = 0; i < N; i++) {
            isbns[i] = scanner.nextInt();
        }

        int target_ISBN = scanner.nextInt();

        if ( target_ISBN > isbns[N-1] ) {
            System.out.println(N);
            return;
        }

        for ( int i = 0; i < N; i++ ) {
            if (target_ISBN <= isbns[i]) {
                System.out.println(i);
                return;
            }
        }
    }
}

