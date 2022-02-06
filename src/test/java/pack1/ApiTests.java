package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ApiTests {
    @Test(groups = {"t1"})
    void passedTest() {
        System.out.println("IT'S T1 TEST");
        Assert.assertTrue(true);
    }

    @Test(groups = {"t1", "t2"})
    void passedTest2() {
        System.out.println("IT'S T1 and T2 TEST");
        Assert.assertTrue(true);
    }

    @Test(groups = {"t2"})
    void failedTest3() {
        System.out.println("IT'S T2 TEST");
        Assert.assertTrue(true);
    }
}
