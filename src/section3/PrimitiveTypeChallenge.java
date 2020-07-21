package section3;

public class PrimitiveTypeChallenge {
    public static void main(StringTesting[] args) {

        byte myByteNumber = 10;
        short myShortNumber = 20;
        int myIntNumber = 50;
        long myLongNumber = 50000 + 10 * (myByteNumber + myIntNumber + myShortNumber);
        System.out.println(myLongNumber);

        short myNewShortNumber = (short) (1000 + 10 *
                (myByteNumber + myIntNumber + myShortNumber));
        System.out.println(myNewShortNumber);

        float myFloat = (float) 5.25;
        float myFloatValue = 5.25f;
        double myDouble = 5.25;
        System.out.println("My Float Value: " + Float.SIZE / 8);
        System.out.println("My Double Value: " + Double.SIZE /  8);

    }

}
