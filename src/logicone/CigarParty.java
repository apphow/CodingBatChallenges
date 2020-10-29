package logicone;
// When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.
//
// cigarParty(30, false) → false
// cigarParty(50, false) → true
// cigarParty(70, true) → true
public class CigarParty {

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if((isWeekend && cigars >= 40) || (!isWeekend && (cigars >= 40 && cigars <= 60))) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        cigarParty(30, false);
        cigarParty(50, false);
        cigarParty(70, true);
        cigarParty(30, true);
        cigarParty(50, true);
        cigarParty(60, false);
        cigarParty(61, false);
        cigarParty(40, false);
        cigarParty(39, false);
        cigarParty(40, true);
        cigarParty(39, true);

    }
}
