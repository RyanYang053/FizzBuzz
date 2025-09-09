package lab1;

public class Multiples {
    public static <or> void main(String[] args) {

        System.out.println(multiples(99,3,4));
        }

     public static int multiples(int n, int a, int b) {
        int i = 1;
        int count = 0;
        while(i < n){
            if (i % a == 0){
                count++;
                i++;
            }
            else if (i % b ==0){
                count++;
                i++;
            }
            else {
                i++;
            }
        }
        return count;
    }
}

