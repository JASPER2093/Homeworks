package pro0328homework;
// java homework No.07 20191458 정민혁

public class No07 {

    public static void main(String[] args) {

        for (int num = 1; num < 100; num++) {
            int a = num / 10; 
            int b = num % 10;

            if (b == 3 || b == 6 || b == 9) {
                if (a == 3 || a == 6 || a == 9) {
                    System.out.println(num + "박수두번");
                    continue;
                }else {System.out.println(num + "박수한번");}
            }
            
            if (a == 3 || a == 6 || a == 9) {
                System.out.println(num + "박수한번");
            }            
        }
    }
}


