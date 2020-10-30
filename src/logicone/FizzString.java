package logicone;

public class FizzString {
    public static String fizzString(String str) {
        if (str.substring(0, 1).equals("f") && str.substring(str.length() - 1).equals("b")) {
            System.out.println("FizzBuzz");
            return "FizzBuzz";
        }
        if (str.substring(0, 1).equals("f")) {
            System.out.println("Fizz");
            return "Fizz";
        }
        if (str.substring(str.length() - 1).equals("b")) {
            System.out.println("Buzz");
            return "Buzz";
        }
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        fizzString("fig");
        fizzString("dib");
        fizzString("fib");
        fizzString("abc");
        fizzString("fooo");
        fizzString("booo");
        fizzString("ooob");
        fizzString("fooob");
        fizzString("f");
        fizzString("b");
        fizzString("abcb");
        fizzString("Hello");
        fizzString("Hellob");
        fizzString("af");
        fizzString("bf");
        fizzString("fb");
    }
    }

