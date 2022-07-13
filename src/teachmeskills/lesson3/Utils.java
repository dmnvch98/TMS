package teachmeskills.lesson3;
import java.util.Scanner;

public final class Utils {
    public static int askUserToEnterData(String messageToPrint){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print(messageToPrint);
            String enteredValue = scanner.next();
            try {
                int enteredNum = Integer.parseInt(enteredValue);
                if (enteredNum > 0){
                    return enteredNum;
                }
            } catch (NumberFormatException ignored){}
        }
    }
}
