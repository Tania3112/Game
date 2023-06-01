import java.util.Random;
import java.util.Scanner;

public class Enemy extends People {
   public Enemy (String name, int life) {
       super(name,life);

   }

   @Override
       public void attack() {

           System.out.println("Введите число от 1 до 20:");
           Scanner object = new Scanner(System.in);
            number = object.nextInt();

            if (rand_num != number) {
                if (rand_num > number) {
                    System.out.println("Вы не угадали! Число что вы пытаетесь угадать больше  ");

                } else {
                    System.out.println("Вы не угадали! Число что вы пытаетесь угадать меньше  ");
                }
            }}}
