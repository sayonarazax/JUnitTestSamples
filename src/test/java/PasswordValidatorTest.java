import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class PasswordValidatorTest {
    public Object[] passwords() {
        return new Object[] {
                new Object[] {"qwerty" , false},
                new Object[] {"12asOP", false},
                new Object[] {"123sdfds_OP", true}
        };
    }

    @Test
    @Parameters(method = "passwords")
    public void passwordShouldBeHard(String password, boolean validation) {
        PasswordValidator validator = new PasswordValidator();
        boolean passCheck = validator.passwordValidate(password);
        assertEquals(validation, passCheck);
    }
}
