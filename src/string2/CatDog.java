package string2;

public class CatDog {

    public static boolean catDog(String str) {
        int countDog = 0;
        int countCat = 0;
        if(str.length() < 3) {
            System.out.println(true);
            return true;
        }
        for(int i = 0; i < str.length()-2; i++) {
            if(str.substring(i, i + 3).equals("dog")) {
                countDog++;

            }
            if(str.substring(i, i + 3).equals("cat")) {
                countCat++;

            }

        }
        if(countDog == countCat) {
            System.out.println(true);
            return true;

        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        catDog("catdog");// → true	true	OK
        catDog("catcat");// → false	false	OK
        catDog("1cat1cadodog");// → true	true	OK
        catDog("catxxdogxxxdog");// → false	true	X
        catDog("catxdogxdogxcat");// → true	true	OK
        catDog("catxdogxdogxca");// → false	true	X
        catDog("dogdogcat");// → false	false	OK
        catDog("dogogcat");// → true	true	OK
        catDog("dog");// → false	false	OK
        catDog("cat");// → false	false	OK
        catDog("ca");// → true	true	OK
        catDog("c");// → true	true	OK
        catDog("");// → true	true	OK
    }

}
