public class Task1 {

    public static void main(String[] args) {
        int count = 99;
        while (count > 0) {
            System.out.println(new StringBuilder()
                    .append(count)
                    .append(" ")
                    .append(getNameFromNumber(count))
                    .append(" of beer on the wall,\n")
                    .append(count)
                    .append(" ")
                    .append(getNameFromNumber(count))
                    .append(" of beer!\n")
                    .append("Take one down, pass it around,\n")
                    .append(--count)
                    .append(" ")
                    .append(getNameFromNumber(count))
                    .append(" of beer on the wall!\n"));
        }
        System.out.println("No more bottles of beer on the wall,\nNo more bottles of beer!\nGo to the store and buy some more,\n99 bottles of beer on the wall.");
    }

    private static String getNameFromNumber(int count) {
        if (count == 1) {
            return "bottle";
        }
        return "bottles";
    }
}
