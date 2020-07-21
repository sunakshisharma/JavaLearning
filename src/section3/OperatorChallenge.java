package section3;

public class OperatorChallenge {
    public static void main(StringTesting[] args){
        double myDouble = 20d;
        double mySecondDouble = 80d;
        double myTotalDouble = (myDouble + mySecondDouble) * 100;
        System.out.println("My value total is " + myTotalDouble);
        double myRemainder = myTotalDouble % 40d;
        System.out.println("The remainder is " + myRemainder);

        boolean isNoRemainder = (myRemainder == 0) ? true : false;
        System.out.println("isNoRemainder " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
