import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MaxAscendingString {
    public static void main(String[] args) {
        System.out.println("Insert a String: ");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        List<Character> maxList = new LinkedList<>();
        for (int i = 0; i < inputString.length(); i++) {
            List<Character> tempList = new LinkedList<>();
            tempList.add(inputString.charAt(i));

            for (int j = i + 1; j < inputString.length(); j++) {
                if (inputString.charAt(j) > ((LinkedList<Character>) tempList).getLast()) {
                    tempList.add(inputString.charAt(j));
                }
            }
            if (tempList.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(tempList);
            }
            tempList.clear();
        }

        for (Character ch : maxList) {
            System.out.print(ch);
        }
        System.out.println();
    }
}

