import com.jnuuni.senior.usertrack.spark.session.UserVisitActionAnalyzerSpark;

public class UserVisitActionAnalyzerSparkTest {
    public static void main(String[] args) throws InterruptedException {
        String[] params = new String []{"1"};
        UserVisitActionAnalyzerSpark.main(params);
        Thread.sleep(100000000);
    }
}
