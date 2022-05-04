import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dateOne = sc.nextLine().split(" ");
        String[] dateTwo = sc.nextLine().split(" ");
        SwiftDate date1 = new SwiftDate(Integer.parseInt(dateOne[0]),Integer.parseInt(dateOne[1]),Integer.parseInt(dateOne[2]));
        SwiftDate date2 = new SwiftDate(Integer.parseInt(dateTwo[0]),Integer.parseInt(dateTwo[1]),Integer.parseInt(dateTwo[2]));
        int difference = date1.getDaysDifference(date2);
        System.out.println(difference);
        date1.printInfo();
        date2.printInfo();
    }
}