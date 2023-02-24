public class StringEx7 {
    public static void main(String args[]) {
        String fullName = "Hello.java";

        // fullName 에서 . 의 위치를 찾는다.
        int index = fullName.indexOf(".");

        // fullName 에서 첫번째 글자부터 '.' 이 있는 곳 까지 문자열을 추출한다.
        String fileName = fullName.substring(0, index);
        // . 의 다음 문자부터 시작해서 문자열의 끝까지 추출한다.
        String ext = fullName.substring(index + 1);   // String ext = fullName.substring(index + 1, fullName.length());

        System.out.println(fullName);
        System.out.println(fileName);
        System.out.println(ext);
    }
}
