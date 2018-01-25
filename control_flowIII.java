package com.company;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//        while(count != 5) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        while(true){
//            if (count == 5) {
//                break;
//            }
//         System.out.println("Count value is " + count);
//         count++;
//        }
//
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//        } while(count != 6);

//        int number = 5;
//        int finishNumber = 20;
//        while (number <= finishNumber) {
//            if (!isEvenNumber(number)) {
//                number++;
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//            number ++;
//        }


        int number = 5;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            evenNumbersFound++;
            if(evenNumbersFound >= 5) {
                break;
            }
            System.out.println("Even number " + number);
            number ++;
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {
        if((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
