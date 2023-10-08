package JavaProblems;

public class ReverseInteger {
    public static void main(String[] args) {
        int num=12345;
        //solve using algorithm
        int rev=0;
        while(num!=0){
            rev=rev*10 + num % 10;
            num=num/10;
        }
        System.out.println("Reversed Integer is :"+rev);

        //solve using StringBuffer
        int num1=12345;
        StringBuffer sb=new StringBuffer(String.valueOf(num1)).reverse();
        System.out.println("Reversed Integer is :"+num1);
    }
}
