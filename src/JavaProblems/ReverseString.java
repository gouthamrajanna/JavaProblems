package JavaProblems;

public class ReverseString {
    public static void main(String[] args) {
        String str="Selenium";
        //1.solved using for loop and charAt() method
        int len=str.length();//will give the length of the string
        String rev="";//used to store the reversed string so intially it will be empty string
        for (int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);

        //2.solve using StringBuffer class

        StringBuffer sf=new StringBuffer(str);
        System.out.println(sf.reverse());

    }
}
