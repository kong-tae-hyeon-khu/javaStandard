package ch5;

public class ArrayEx10 {
    public static void main(String args[]) {
        
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int)(Math.random() * 10));
        }
        System.out.println();
        // 버블 정렬 알고리즘
        for (int i = 0; i < numArr.length - 1; i++) {
            boolean changed = false;
            for (int j = 0; j < numArr.length - 1 - i; j++) {
                if (numArr[j] > numArr[j+1]) { // 옆의 값이 작으면 서로 바꾼다.
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                    changed = true;
                }
            }
            if (!changed) break; // 값이 안바뀌었으면 출력 X

            for (int k = 0; k < numArr.length; k++) {
                System.out.print(numArr[k]);
            }
            System.out.println();
        }
    
    
    }
}

