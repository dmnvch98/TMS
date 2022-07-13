package teachmeskills.lesson3;

public class Executor {
    public static void main(String[] args) {
        Loop loop = new Loop();
        loop.printOddNums();
        loop.countDown();
        loop.sumEnteredNums();
        loop.printSequenceSeven();
        loop.printSequenceMinusFive();
        loop.squareFromTenToTwenty();

        ConditionalStatement cs = new ConditionalStatement();
        cs.findSeasonByMonthNumberSwitch(5);
        cs.findSeasonByMonthNumberIf(12);
        cs.oddOrEvenNumber(12);
        cs.warmOrCold(-10);
        cs.findRainbowColor(4);

        AdditionalTask additionalTask = new AdditionalTask();
        additionalTask.getFirstElevenFibonacciNumbers();
        additionalTask.calculateDepositIncomeEveryMonth();
        additionalTask.printMultiplicationTable();
    }
}
