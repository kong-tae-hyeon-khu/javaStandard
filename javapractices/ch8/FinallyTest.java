class FinallyTest {
    public static void main(String args[]) {
        try {
            startInstall(); // 프로그램 설치에 필요한 준비를 한다.
            copyFile(); // 파일들을 복사한다.
            deleteTempFiles(); // 프로그램 설치에 사용된 임시파일들을 삭제한다.
        } catch (Exception e) {
            e.printStackTrace();
            deleteTempFiles();
        }
    }

    static void startInstall() {}
    static void copyFile() {}
    static deleteTempFiles() {}
}