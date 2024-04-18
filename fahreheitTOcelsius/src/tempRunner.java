public class tempRunner {
    public static void main(String[] args) throws Exception {
        temp run = new temp();

        run.setTemp();
        int tempPicked = run.tempType();

        if (tempPicked == 1){
            run.fahrenheitConvert();
        }
        else if (tempPicked == 2){
            run.celsiusConvert();
        }

    }
}
