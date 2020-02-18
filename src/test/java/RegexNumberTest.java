import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class RegexNumberTest {
    public Object[] regexNumbers() {
        return new Object[] {
            new Object[] {"cdefg 345 12bb23", "345"},
            new Object[] {"cdefg 345 12bbb33 678tt", "345, 678"},
            new Object[] {"abc12", ""},
            new Object[] {"cdefg 345 12bbb33 678tt123456", "345, 678, 123456"},
        };
    }

    @Test
    @Parameters(method = "regexNumbers")
    public void shouldReturnThreeOrMoreDigitsNums(String args, String result) {
        RegexNumber regex = new RegexNumber();
        ArrayList<Integer> list = regex.numsCheck(args);
        String resultCheck = "";
        Iterator it = list.iterator();
        while(it.hasNext()) {
            resultCheck += it.next();
            if(it.hasNext()) resultCheck += ", ";
        }
        assertEquals(result, resultCheck);
    }
}
