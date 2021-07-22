package squash.tfauto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.opentestfactory.exception.ParameterException;
import org.opentestfactory.util.ParameterService;

public class ParameterTest {

    @Test
    public void testscopePrem() throws ParameterException {
        int integer = ParameterService.INSTANCE.getTestInt("TC_CUF_testcase");
        Assertions.assertTrue(integer == 50, "The integer value is incorrect");
        String chars = ParameterService.INSTANCE.getTestString("IT_CUF_iteration");
        Assertions.assertTrue(chars.equals("iterationValue"), "The String value is incorrect");
        float floatNumber = ParameterService.INSTANCE.getTestFloat("TS_CUF_testsuite");
        Assertions.assertTrue(floatNumber == 62.35, "The float value is incorrect");
        double doubleNumber = ParameterService.INSTANCE.getTestDouble("CPG_CUF_campaign");
        Assertions.assertTrue(doubleNumber == 1.25, "The double value is incorrect");
        boolean dataset = ParameterService.INSTANCE.getTestBoolean("DSNAME");
        Assertions.assertTrue(dataset, "The DSNAME is false");
        boolean datasetParam = ParameterService.INSTANCE.getTestBoolean("DS_param");
        Assertions.assertTrue(datasetParam, "The dataset param is false");
    }

    @Test
    public void testscopeCommu() throws ParameterException {
        int integer = ParameterService.INSTANCE.getTestInt("TC_CUF_testcase");
        Assertions.assertTrue(integer == 50, "The integer value is incorrect");
        boolean dataset = ParameterService.INSTANCE.getTestBoolean("DSNAME");
        Assertions.assertTrue(dataset, "The DSNAME is false");
        boolean datasetParam = ParameterService.INSTANCE.getTestBoolean("DS_param");
        Assertions.assertTrue(datasetParam, "The dataset param is false");
    }

    @Test
    public void defaultScope() throws ParameterException {
        int integer = ParameterService.INSTANCE.getInt("TC_CUF_testcase");
        Assertions.assertTrue(integer == 50, "The integer value is incorrect");
        boolean dataset = ParameterService.INSTANCE.getBoolean("DSNAME");
        Assertions.assertTrue(dataset, "The DSNAME is false");
        boolean datasetParam = ParameterService.INSTANCE.getBoolean("DS_param");
        Assertions.assertTrue(datasetParam, "The dataset param is false");
    }

    @Test
    public void globalscope() throws ParameterException {
        int integer = ParameterService.INSTANCE.getGlobalInt("TC_CUF_testcase");
        Assertions.assertTrue(integer == 50, "The integer value is incorrect");
        boolean dataset = ParameterService.INSTANCE.getGlobalBoolean("DSNAME");
        Assertions.assertTrue(dataset, "The DSNAME is false");
        boolean datasetParam = ParameterService.INSTANCE.getGlobalBoolean("DS_param");
        Assertions.assertTrue(datasetParam, "The dataset param is false");
    }
}