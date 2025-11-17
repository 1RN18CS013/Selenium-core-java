package Seleniumpackcorejava;

public class Ananday5 {
    public static void main(String[] args){
     /*example1   int i=1;
        while(i<=10){
            System.out.println(i);//without increment/decrement or any stopper it becomes an infinite loop
           // i++;
        }*/
        /*example 2
        int i=1;
        while(i<=10) {
            System.out.println("Hello");
            i++;
        }*/
        //example 3-even nos between 1-10
       /*approach 1 int i=2;
        while(i<=10){
            System.out.println(i);
            i+=2;
        }*/
       /*approach 2 int i=1;
        while(i<=10){
            if(i%2==0)
            {
                System.out.println(i);
            }
            i++;
        }*/
        //example 3-print each number even or odd
       /* int i=1;
        while(i<=10){
            if(i%2==0)
                System.out.println(i+"even");
            else
                System.out.println(i+"odd");
            i++;
        }*/
        //example 4- print the values in descending order from 10-1
        int i=10;
        while(i>=1)
        {
            System.out.println(i);
            i--;
        }
    }
}
