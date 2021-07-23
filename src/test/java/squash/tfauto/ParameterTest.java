package squash.tfauto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.opentestfactory.exception.ParameterException;
import org.opentestfactory.util.ParameterService;

public class ParameterTest {

    @Test
    public void testScopePrem() throws ParameterException {
        int integer = ParameterService.INSTANCE.getTestInt("TC_CUF_testcase");
        Assertions.assertTrue(integer == 50, "The integer value is incorrect, current is" + integer);
        String chars = ParameterService.INSTANCE.getTestString("IT_CUF_iteration");
        Assertions.assertTrue(chars.equals("iterationValue"), "The String value is incorrect, current is" + chars);
        float floatNumber = ParameterService.INSTANCE.getTestFloat("TS_CUF_testsuite");
        Assertions.assertTrue(floatNumber == 62.35f, "The float value is incorrect, current is" + floatNumber);
        double doubleNumber = ParameterService.INSTANCE.getTestDouble("CPG_CUF_campaign");
        Assertions.assertTrue(doubleNumber == 1.25, "The double value is incorrect, current is" + doubleNumber);
        boolean dataset = ParameterService.INSTANCE.getTestBoolean("DSNAME");
        Assertions.assertTrue(dataset, "The DSNAME is false");
        boolean datasetParam = ParameterService.INSTANCE.getTestBoolean("DS_param");
        Assertions.assertTrue(datasetParam, "The dataset param is false");
    }

    @Test
    public void testScopeCom() throws ParameterException {
        int integer = ParameterService.INSTANCE.getTestInt("TC_CUF_testcase");
        Assertions.assertTrue(integer == 50, "The integer value is incorrect, current is" + integer);
        boolean dataset = ParameterService.INSTANCE.getTestBoolean("DSNAME");
        Assertions.assertTrue(dataset, "The DSNAME is false");
        boolean datasetParam = ParameterService.INSTANCE.getTestBoolean("DS_param");
        Assertions.assertTrue(datasetParam, "The dataset param is false");
    }

    @Test
    public void allScope() throws ParameterException {
        int integer = ParameterService.INSTANCE.getInt("TC_CUF_testcase");
        Assertions.assertTrue(integer == 50, "The integer value is incorrect, current is" + integer);
        boolean dataset = ParameterService.INSTANCE.getBoolean("DSNAME");
        Assertions.assertTrue(dataset, "The DSNAME is false");
        boolean datasetParam = ParameterService.INSTANCE.getBoolean("DS_param");
        Assertions.assertTrue(datasetParam, "The dataset param is false");
    }

    @Test
    public void globalScope() throws ParameterException {
        int integer = ParameterService.INSTANCE.getGlobalInt("TC_CUF_testcase");
        Assertions.assertTrue(integer == 50, "The integer value is incorrect, current is" + integer);
        boolean dataset = ParameterService.INSTANCE.getGlobalBoolean("DSNAME");
        Assertions.assertTrue(dataset, "The DSNAME is false");
        boolean datasetParam = ParameterService.INSTANCE.getGlobalBoolean("DS_param");
        Assertions.assertTrue(datasetParam, "The dataset param is false");
    }
}