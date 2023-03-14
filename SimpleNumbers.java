public class SimpleNumbers {

    public int sumSimpleNumbers(int [] arr) {
        int sum = 0;
        for (int i: arr) {
            if(this.checkSimpleNumber(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private boolean checkSimpleNumber(int number) {
        boolean check = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}
