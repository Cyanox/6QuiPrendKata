

public class SixQuiPrend {

    private static final int NB_CARD_MAX = 104;

    public static int findNumberOfBullHeads(int value) {

        if(value == 55 ) {
            return 7;
        }
        else if (value%10 == 0 ){
            return 3;
        }
        else if( (value%5 == 0 )&&( value%10 !=0 )) {
            return 2;
        }
        else if( (value%11 == 0 )&&( value !=100 )) {
            return 5;
        } else
            return 1;
    }

    public static void gameLoop() {
        for (int cardValue = 1 ; cardValue <= NB_CARD_MAX ; cardValue++) {
            System.out.println(cardValue + " -> " + findNumberOfBullHeads(cardValue));
        }
    }
}
