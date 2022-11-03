package LaberonLSDZ2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringList stringList = new StringListImpl();
        stringList.add("a");
        stringList.add("ab");
        stringList.add("abc");
        stringList.add("abcd");
        stringList.add("abcde");

        stringList.add(3, "abcdef");

        stringList.remove(1);
        System.out.println(Arrays.toString(stringList.toArray()));

        stringList.clear();
        System.out.println(stringList.size());
    }
}
