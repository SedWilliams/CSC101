public class Main {
    public static void main(String[] args) {
        int sum1 = 2 + 3;
        System.out.println(sum1); // 5

        double sum3 = 2 + 3;
        System.out.println(sum3); // 5.0

        double sum4 = 2.0 + 3;
        System.out.println(sum4); // 5.0

        int diff1 = 2 - 3;
        System.out.println(diff1); // -1

        double diff3 = 2 - 3; // Type error

        double diff4 = 2.0 - 3;
        System.out.println(diff4); // -1.0

        int prod1 = 2 * 3;
        System.out.println(prod1); // 6

        double prod3 = 2 * 3; // Type error

        double prod4 = 2.0 * 3.0;
        System.out.println(prod4); // 6.0

        int div2 = 13 / 4;
        System.out.println(div2); // 3

        double div4 = 13 / 4;
        System.out.println(div4); // 3.0

        double div5 = 13.0 / 4.0;
        System.out.println(div5); // 3.25

        double div6 = 13 / 4;
        System.out.println(div6); // 3.0

        double div7 = 13. / 4;
        System.out.println(div7); // 3.25

        int mod2 = 12 % 4;
        System.out.println(mod2); // 0

        int mod3 = 14 % 4;
        System.out.println(mod3); // 2

        int mod4 = 4 % 14;
        System.out.println(mod4); // 4

        double mod5 = 13 % 4;
        System.out.println(mod5); // 1.0

        double mod6 = 13.0 % 4.0;
        System.out.println(mod6); // 1.0


        int prec1 = 2 + 3 * 5;
        System.out.println(prec1); // 17

        int prec2 = (2 + 3) * 5;
        System.out.println(prec2); // 25

        double prec3 = (2 + 3) - 6 / 2;
        System.out.println(prec3); // 2.0

        double prec4 = ((2 + 3) - 6) / 2;
        System.out.println(prec4); // -0.5

        double prec5 = (2 + 3) * 5 - 6.0 / 2;
        System.out.println(prec5); // 22.0

        double prec6 = 2 + 3 * 5 - 6.0 / 2;
        System.out.println(prec6); // 22.0


        int count1 = 3;
        count1++;
        System.out.println(count1); // 4

        int count2 = 3;
        count2 += 2;
        System.out.println(count2); // 5

        double count3 = 2.3;
        count3--;
        System.out.println(count3); // 1.3

        double count4 = 2.3;
        count4 -= 1;
        System.out.println(count4); // 1.3

        int num1 = 5, num2 = 10;
        int res1 = num1++ * num2--;
        System.out.println(res1); // 50

        int num3 = 5, num4 = 10;
        int res2 = ++num3 * num4--;
        System.out.println(res2); // 60

        int smallNum = 3;
        double bigNum1 = smallNum;
        System.out.println(bigNum1); // 3.0

        int smallNum2 = 3;
        double bigNum2 = (double) smallNum2;
        System.out.println(bigNum2); // 3.0

        double floatNum2 = 3.0;
        int intNum2 = (int) floatNum2;
        System.out.println(intNum2); // 3

        double adjustNum = 2.3;
        adjustNum -= 1;
        adjustNum = (int) adjustNum;
        System.out.println(adjustNum); // 1

    }
}