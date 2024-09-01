import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestService {


    void main() {
        List<String> testValues = Arrays.asList("sds", "sdcsd", "sdcsd", "sam");
        List<String> findings = testValues.stream().filter(value -> value.length() == 3).toList();//.collect(Collectors.toList());
        System.out.println(findings);
        List<String> updatedList = testValues.stream().map(value -> value + "testing").toList();
        System.out.println(updatedList);
        testValues.forEach(System.out::println);
    }
}
//javac --source 22 --enable-preview TestService.java
//java --enable-preview TestService