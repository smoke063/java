public class Sum {
    public Integer sum(Integer[] arr) {
        Integer res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                res += arr[i - 1];
            }
        }
        return res;
    }
}
