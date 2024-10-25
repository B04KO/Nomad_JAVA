public class practic4 {
    public static int countVowels(String input) {
        int count = 0;
        String vowels = "аеёиоуыэюя";

        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String testString = "генагенагенагенрпршроары";
        System.out.println(countVowels(testString));
    }

}