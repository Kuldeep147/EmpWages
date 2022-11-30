import com.bzl.empSample;

public class EmpWageUC7 {
    public static void main(String[] args) {
        empSample wage = new empSample();
        int k = wage.monthlyWages();
        System.out.println(k);
    }
}