package com.JavaFundamentals.basics;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;


public class Lab01 {

        public  String pluralize(String s, int num) {
            if (num == 0 || num > 1) {
                return s += "s";

            } else {
                return s;
            }


        }


        /*************************************************************************************************/
        public  void flipNHeads(int n) {
            /*
            "flipNHeads(n)" , here n represent
            how many heads I wanna this
             function to flip in a row, and it
             does not matter how many times it will
              flip until we get it to show n heads in a row.
             */

            Random random = new Random();

            int headCounter = 0;
            int i;
            for ( i= 0; headCounter < n; i++) {
                float ran = random.nextFloat();
                if (ran < 0.5) {
                    headCounter=0;
                    System.out.println("tails");
                } else {
                    headCounter++;
                    System.out.println("heads");

                }



            }
            System.out.println("It took " + i + " flips to flip " + n + " head in a row.");
        }

        /**************************************************************************************************/
        public  void clock ()   {
        try {

            while (true) {

                while (true) {

                    LocalDateTime time = LocalDateTime.now();
                    String now = time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                    System.out.println(now);
                    break;
                }
                Thread.sleep(1000);

            }
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        }

    }


    /* paste in main method to test
    Lab01 test = new Lab01();
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + test.pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + test.pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + test.pluralize("turtle", turtleCount) + ".");

        test.flipNHeads(1);
        test.clock();
     */