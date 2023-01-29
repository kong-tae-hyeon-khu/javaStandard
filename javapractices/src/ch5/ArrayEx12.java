package ch5;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"kong", "tae", "hyeon"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "] :" + names[i]);
        }
        String temp = names[2];
        System.out.println("tmep : " + temp);
        names[0] = "kim";

        for (String str : names)
            System.out.println(str);
    }
}
