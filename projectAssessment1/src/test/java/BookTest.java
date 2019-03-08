
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookTest {

    private Book bk;

    @Before
    public void setUp() throws Exception{
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        bk = (Book)ctx.getBean("change");
    }
    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void Books() throws Exception {

        String output = bk.output();
        Assert.assertEquals("Magazine ",output,"Magazine few pages");
    }


}
