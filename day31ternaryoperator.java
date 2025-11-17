package Seleniumpackcorejava;

public class day31ternaryoperator {
    public static void main(String[] args){
        int a=20,b=30;
        int res= a<b?a:b;
        System.out.println(res);
        int u= a>b?a:b;
        System.out.println(u);
        int age=15;
        String result=(age>=18)?"eligible":"not eligible";
        System.out.println(result);


    }
}
