public class SwapExercise {
    private int a;
    private int b;
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;

        //main 연습
        System.out.printf("a: %d b: %d", a, b);
    }
}
