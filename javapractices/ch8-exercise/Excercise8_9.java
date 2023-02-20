public class Excercise8_9 {
    public static void main(String args[]) throws Exception {
        throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
    }
}


class UnsupportedFunctionException extends RuntimeException {
    final private int ERR_CODE;

    UnsupportedFunctionException(String msg, int error) {
        super(msg);
        this.ERR_CODE = error;
    }

    UnsupportedFunctionException(String msg) {
        super(msg);
        this.ERR_CODE = 100;
    }
    

    public int getErrorCode() {
        return ERR_CODE;
    }

    public String getMessage() {
        return "[" + ERR_CODE + "]" + super.getMessage();
    }
}