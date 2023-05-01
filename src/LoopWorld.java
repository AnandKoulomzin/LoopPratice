public class LoopWorld {

    public static void main(String[] args) {
        LoopWorld loops = new LoopWorld();
    }

    public LoopWorld() {
        pattern1();
        pattern2();
        pattern3();
        pattern5();
        pattern6();
        pattern7();
        pattern8();
    }

    public void pattern1() {
        System.out.println("****** Pattern 1:");
        for (int i = 0; i<26; i=i+5) {
            System.out.println(i);
        }
        System.out.println();

    }

    public void pattern2() {
        System.out.println("****** Pattern 2:");

        for (int x = 2; x<28; x=x+5){
            System.out.println(x);
        }
        System.out.println();

    }

    public void pattern3(){
        System.out.println("****** Pattern 3:");

        for (int x = 21; x>0; x=x-4){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println();

    }

    public void pattern5() {
        System.out.println("****** Pattern 5:");

        for (int i=1; i<5; i++) {
            for (int x = 1; x < 5; x++) {
                System.out.print(x+ " ");
            }
            System.out.println();
        }
    }

    public void pattern6() {
        System.out.println("****** Pattern 6:");
        for (int i = 1; i < 6; i++) {
            for (int x = 0; x<i-1; x++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }

    public void pattern7() {
        System.out.println("****** Pattern 7:");
        for (int i=6; i>1; i=i-1) {
            for (int x = 1; x < i; x++) {
                System.out.print(x+ " ");
            }
            System.out.println();
        }

    }

  public void pattern8(){
                System.out.println("****** Pattern 8: ");
                for (int i = 1; i < 6; i++) {
                    for (int x = 0; x < i - 1; x++) {
                        System.out.print(" ");
                    }
//            for (int p = 5; p > 1; p--) {
                    System.out.println("*");
//            }
        }
    }
}
