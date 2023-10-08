package JavaProblems;

public class FindMissingNumbersInArray {
    public static void main(String[] args) {
        int a[]={1,2,4,5};

        //logic is add all the numbers in the array and store it in sum varaible
        //add all the array elements along with the missing number and store it in a variable sum1
        //at the end do sum1-sum to get the missing number

        //step1: logic is add all the numbers in the array and store it in sum varaible
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
    //step2:  add all the array elements along with the missing number and store it in a variable sum1
        int sum1=0;
        for(int j=1;j<=5;j++)
        {
           sum1=sum1+j;
        }
        System.out.println(sum1);

        //step3: at the end do sum1-sum to get the missing number
        System.out.println(sum1-sum);
    }
}
