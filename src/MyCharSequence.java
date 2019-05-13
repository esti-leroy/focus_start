import java.util.Arrays;

public class MyCharSequence implements CharSequence {

    private char chars[];

    public MyCharSequence(String charSequence) {
        this.chars = charSequence.toCharArray();
    }

    private MyCharSequence(char[] chars) {
        this.chars = chars;
    }

    @Override
    public int length() {
        return chars.length;
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || index >= length()) {
            throw new IndexOutOfBoundsException();
        }
        return chars[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end < 0 || end > length() || start > end) {
            throw new IndexOutOfBoundsException();
        }
        if (start == end) {
            return new MyCharSequence(new char[0]);
        }
        int diff = end - start;
        return new MyCharSequence(Arrays.copyOfRange(chars, start, start + diff));
    }

    @Override
    public String toString() {
        return Arrays.toString(chars);
    }

    public static void main(String[] args) {
        CharSequence chars = new MyCharSequence("YesYesYes");
        System.out.println("chars = " + chars);
        System.out.println("chars.charAt(7) = " + chars.charAt(7));
        System.out.println("chars.length() = " + chars.length());
        System.out.println("chars.subSequence(0,5) = " + chars.subSequence(0,5));
    }
}
