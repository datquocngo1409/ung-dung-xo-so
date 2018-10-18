package xoso;

import java.util.Scanner;

public class XoSo {

    public static void main(String[] args) {
        int num1 = ((int)(Math.random()*100))%10;
        int num2 = ((int)(Math.random()*100))%10;
        System.out.println(num1+""+num2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int guessDegit = sc.nextInt();
        int guessDegit1 = (int)guessDegit/10, guessDegit2 = guessDegit%10;
        if(guessDegit1==num1 && guessDegit2==num2){
            System.out.println("$10.000");
        }
        else if(guessDegit1==num2 && guessDegit2==num1){
            System.out.println("$3.000");
        }
        else if(guessDegit1==num1 || guessDegit1==num2 || guessDegit2==num1 || guessDegit2==num2){
            System.out.println("$1.000");
        }
        else System.out.println("$0");
    }
    
}
