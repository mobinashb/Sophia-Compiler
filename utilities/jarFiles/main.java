import java.io.IOException;

public class main {
    public int foo(int a) {
        if(a == 1) {
            return 2;
        }
        else {
            return 5;
        }
    }

    public static void main(String[] args) throws IOException {
        main m = new main();
        System.out.println(m.foo(1));
    }
}
