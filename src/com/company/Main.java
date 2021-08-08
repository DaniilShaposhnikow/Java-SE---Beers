package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int beerNum = 99;
        String word = "бутылок (бутылки)";

        while (beerNum > 0)
        {
            if (beerNum <= 1 )
            {
                System.out.println(" ");
                word = "бутылка";
                System.out.println(beerNum + " " + word + " пива на стене");
                System.out.println(beerNum + " " + word + " пива на стене");
                System.out.println("Возьму одну. ");
                System.out.println("Пусти по кругу. ");
                beerNum = beerNum - 1;
            }
            else if (beerNum >= 2 && beerNum <= 4)
            {
                System.out.println(" ");
                word = "бутылки";
                System.out.println(beerNum + " " + word + " пива на стене");
                System.out.println(beerNum + " " + word + " пива на стене");
                System.out.println("Возьму одну. ");
                System.out.println("Пусти по кругу. ");
                beerNum = beerNum - 1;
            }
            else if (beerNum >= 5 & beerNum <= 99)
            {
                System.out.println(" ");
                word = "бутылок";
                System.out.println(beerNum + " " + word + " пива на стене");
                System.out.println(beerNum + " " + word + " пива на стене");
                System.out.println("Возьму одну. ");
                System.out.println("Пусти по кругу. ");
                beerNum = beerNum - 1;
            }
        }
    }
}
