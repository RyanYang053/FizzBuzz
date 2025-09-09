package lab1;

public class Multiples {
    public static <or> void main(String[] args) {
        
        int count = multiples();
        System.out.println(count);
        }

    private static int multiples() {
        int i = 0;
        int count = 0;
        while(i < 1000){
            if (i % 3 == 0){
                count++;
                i++;
            }
            else if (i%5==0){
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

