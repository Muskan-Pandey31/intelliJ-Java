import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a + "is greater than" + b);
        } else if (a < b) {
            System.out.println(b + "is greater than"+ a);

        }else{
            System.out.println(a + "and"+ b +"is equal");
        }
    }
}
