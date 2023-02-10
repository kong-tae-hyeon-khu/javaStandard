final class Singleton {
    private static Singleton s = new Singleton(); // 미리 인스턴스가 만들어져 있어야 메서드를 통해 반환할 수 있으므로 . .

    private Singleton() {
        // ...
    }

    public static Singleton getInstance() {
        if (s == null )
            s = new Singleton();
        return s;
    }
}

class SingletonTest {
    public static void main(String args[]) {
        // Singleton s = new Singleton(); Error
        Singleton s = Singleton.getInstance();
    }
}
