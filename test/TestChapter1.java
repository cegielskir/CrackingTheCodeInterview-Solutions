import com.cegielskir.Chapter1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestChapter1 {

    Chapter1 chapter1;

    @Before
    public void setUp(){
        this.chapter1 = new Chapter1();
    }

    @Test
    public void test1AreOnlyUniqueChars1(){
        boolean result = chapter1.areOnlyUniqueChars1("abcdefgh");
        assertTrue(result);
    }

    @Test
    public void test2AreOnlyUniqueChars1(){
        boolean result = chapter1.areOnlyUniqueChars1("");
        assertTrue(result);
    }

    @Test
    public void test3AreOnlyUniqueChars1(){
        boolean result = chapter1.areOnlyUniqueChars1("aaaaaaaaaa");
        assertFalse(result);
    }


    @Test
    public void test4AreOnlyUniqueChars1(){
        boolean result = chapter1.areOnlyUniqueChars1("abcdefgha");
        assertFalse(result);
    }


    @Test
    public void test1AreOnlyUniqueChars2(){
        boolean result = chapter1.areOnlyUniqueChars2("abcdefgh");
        assertTrue(result);
    }

    @Test
    public void test2AreOnlyUniqueChars2(){
        boolean result = chapter1.areOnlyUniqueChars2("");
        assertTrue(result);
    }

    @Test
    public void test3AreOnlyUniqueChars2(){
        boolean result = chapter1.areOnlyUniqueChars2("aaaaaaaaaa");
        assertFalse(result);
    }


    @Test
    public void test4AreOnlyUniqueChars2(){
        boolean result = chapter1.areOnlyUniqueChars2("abcdefgha");
        assertFalse(result);
    }

}
