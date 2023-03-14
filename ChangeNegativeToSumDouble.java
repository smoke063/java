public class ChangeNegativeToSumDouble {

    public int [] changeToSumIndexes(int [] arr) {
        int sumIndexes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (this.isDoubleDigist(arr[i])) {
                sumIndexes += i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = sumIndexes;
            }
        }
        return arr;
    }
    private boolean isDoubleDigist(int i) {
        return i > 9 && i < 100;
    }
}
