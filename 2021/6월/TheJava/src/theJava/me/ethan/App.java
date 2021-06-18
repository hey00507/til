package theJava.me.ethan;

import javax.crypto.Cipher;
import java.util.List;

public class App {

    static  String myName;

    static {
        myName = "jonggu";
    }

    public static void main(String[] args) {
        System.out.println(App.class.getClassLoader());
        System.out.println(List.class.getClassLoader());
        System.out.println(Cipher.class.getClassLoader());
        System.out.println(App.class.getSuperclass());


        Thread.currentThread();
        // Java Native Method - C 또는 C++ 어셈블리 언어로 만들어진 메서드들
    }
}
