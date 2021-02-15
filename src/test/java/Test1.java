import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1  {

    @Test
    @Step("Najważnieszy pierwszy krok")
    void test1(){
        Assert.assertEquals(2,1,"oczekiwałem tego");
    }
}
