package squash.tfauto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentestfactory.exception.ParameterException;
import org.opentestfactory.util.ParameterService;

public class DefaultParameterTest {

    @Test
    public void defaultTestScopePrem() throws ParameterException {
        int integer = ParameterService.INSTANCE.getTestInt("TC_CUF_testcase", 50);
        Assertions.assertTrue(integer == 50, "The integer value is incorrect, current is" + integer);
        String chars = ParameterService.INSTANCE.getTestString("IT_CUF_iteration", "iterationValue");
        Assertions.assertTrue(chars.equals("iterationValue"), "The String value is incorrect, current is" + chars);
        float floatNumber = ParameterService.INSTANCE.getTestFloat("TS_CUF_testsuite", 62.35f);
        Assertions.assertTrue(floatNumber == 62.35f, "The float value is incorrect, current is" + floatNumber);
        double doubleNumber = ParameterService.INSTANCE.getTestDouble("CPG_CUF_campaign", 1.25);
        Assertions.assertTrue(doubleNumber == 1.25, "The double value is incorrect, current is" + doubleNumber);
        boolean dataset = ParameterService.INSTANCE.getTestBoolean("DSNAME", true);
        Assertions.assertTrue(dataset, "The DSNAME is false");
        boolean datasetParam = ParameterService.INSTANCE.getTestBoolean("DS_param", true);
        Assertions.assertTrue(datasetParam, "The dataset param is false");
    }

    @Test
    public void defaultTestScopeCom() throws ParameterException {
        int integer = ParameterService.INSTANCE.getTestInt("TC_CUF_testcase", 50);
        Assertions.assertTrue(integer == 50, "The integer value is incorrect, current is" + integer);
        boolean dataset = ParameterService.INSTANCE.getTestBoolean("DSNAME", true);
        Assertions.assertTrue(dataset, "The DSNAME is false");
        boolean datasetParam = ParameterService.INSTANCE.getTestBoolean("DS_param", true);
        Assertions.assertTrue(datasetParam, "The dataset param is false");
    }

    @Test
    public void defaultAllScope() throws ParameterException {
        int integer = ParameterService.INSTANCE.getInt("TC_CUF_testcase", 50);
        Assertions.assertTrue(integer == 50, "The integer value is incorrect, current is" + integer);
        boolean dataset = ParameterService.INSTANCE.getBoolean("DSNAME", true);
        Assertions.assertTrue(dataset, "The DSNAME is false");
        boolean datasetParam = ParameterService.INSTANCE.getBoolean("DS_param", true);
        Assertions.assertTrue(datasetParam, "The dataset param is false");
    }

    @Test
    public void defaultGlobalScope() throws ParameterException {
        int integer = ParameterService.INSTANCE.getGlobalInt("TC_CUF_testcase", 50);
        Assertions.assertTrue(integer == 50, "The integer value is incorrect, current is" + integer);
        boolean dataset = ParameterService.INSTANCE.getGlobalBoolean("DSNAME", true);
        Assertions.assertTrue(dataset, "The DSNAME is false");
        boolean datasetParam = ParameterService.INSTANCE.getGlobalBoolean("DS_param", true);
        Assertions.assertTrue(datasetParam, "The dataset param is false");
    }
}
