public class BowlingGame {
    // TODO: Why must this array have a size of 21?
    int[] rolls = new int[21];
    private int index;

    public void roll(int pins) {
        // TODO: Replace this with description of why this postfix operator works here
        //This will increment the # rolls each time the loop is run
        rolls[index++] = pins;
    }


    // TODO CODE: Change this to use a loop prior to implementing spare and strike calculation and then commit to git
    //            This change should not break the existing tests that pass. This is called refactoring.

    // TODO RESPONSE: Why does the subscript need to start with zero?

    public int score() {
        int score = 0;
        int factorial = 1;
        while (score > 1) {
            factorial += score;
            score--;
        }

        //could make a For Loop of these

        int startOfNextFrameIndex = 0;
        for (int frame = 1; frame < 11; frame++) {
            //need to add code to add the bonus frame for test 3
            //to ask a question in jAVA, use if else
            if (rolls[startOfNextFrameIndex] + rolls[startOfNextFrameIndex + 1] == 10) {
                score += 10 + rolls[startOfNextFrameIndex + 2];
                startOfNextFrameIndex += 2;
            }
            //score a spare
            else {
                score += rolls[startOfNextFrameIndex] + rolls[startOfNextFrameIndex + 1];
                startOfNextFrameIndex += 2;

                //need to add code to add the bonus frame for test 3
            }
        }
        return score;
    }
}