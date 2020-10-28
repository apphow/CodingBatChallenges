package warmup2;

// Given a string, return a string made of
// the chars at indexes 0,1, 4,5, 8,9 ...
// so "kittens" yields "kien".
//
//
// altPairs("kitten") → "kien"
// altPairs("Chocolate") → "Chole"
// altPairs("CodingHorror") → "Congrr"
public class AltParis {

    public static String altPairs(String str) {
        String temp = "";
        for(int i = 0; i < str.length(); i += 4) {
            temp += str.charAt(i);
            if(i + 1 < str.length()){
                temp += str.charAt(i + 1);
            }
        }
        System.out.println(temp);
        return temp;
    }

    public static void main(String[] args) {
        altPairs("kitten");
        altPairs("Chocolate");
        altPairs("CodingHorror");
        altPairs("yak");
        altPairs("ya");
        altPairs("y");
        altPairs("");
        altPairs("ThisThatTheOther");

    }
}
