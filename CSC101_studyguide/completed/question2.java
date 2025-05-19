public class question2 {
    public static void main(String[] args) {

        for(int i = 0; i <= 5; i++) {
            for(int j = 0; j <= i; j++ ) {
                if(j == i) {
                    System.out.print("*\n");
                } else {
                    System.out.print("*");
                }
            }
        }

    }
}
