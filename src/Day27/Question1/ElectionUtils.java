package Day27.Question1;

public class ElectionUtils {


    public static void vote(String name, Integer age) throws Exception {
        if (name == null || age == null) {
            throw new NullPointerException();
        }
        if (age < 18) {
            throw new Exception();
        }

    }

    public static void checkTotalVotes(int total) throws Exception {
        if (total < 0 || total > 20000) {
            throw new Exception();

        }


    }
}
