package JavaProblems;

public class RemoveJunkCharacters {
    public static void main(String[] args) {
        String str="!@#$%^%$#@ Java $%^%$ Selenium )(*&^& APIs";
        String str1="!@#$%^%$#@ Java $%^%$ Selenium )(*&^& APIs";

        //using regular expression extractors using removeAll() method
        str=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str); // o/p JavaSeleniumAPIs

        //keep all the special characters and remove only text
        str1=str1.replaceAll("[a-zA-Z0-9]","");

        System.out.println(str1); //o/p : !@#$%^%$#@  $%^%$  )(*&^&

    }
}
