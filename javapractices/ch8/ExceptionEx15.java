import java.io.*;

class ExceptionEx15 {
    public static void main(String args[]) {
        // Command Line 에서 입력받은 값을 이름으로 갖는 파일을 생성한다.
        File f = createFile(args[0]);
        System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
    }

    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals(""))
                throw new Exception("파일 이름이 유효하지 않습니다.");
        } catch (Exception e) {
            // fileName 이 부적절한 경우.
            fileName = "제목없음.txt";
        } finally {
            File f = new File(fileName); // File 클래스의 객체를 만든다.
            createNewFile(f);
            return f;
        }
    }

    static void createNewFile(File f) {
        try {
            f.createNewFile();
        } catch (Exception e) { }
    }
}