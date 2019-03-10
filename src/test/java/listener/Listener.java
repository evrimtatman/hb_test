package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.BaseTest;

public class Listener extends BaseTest implements ITestListener{


    @Override
    public void onTestStart(ITestResult Result) {
       System.out.println("HepsiBurada ana sayfa acılıyor");
       System.out.println(Result.getName()+" test case started");

    }

    @Override
    public void onTestSuccess(ITestResult Result) {
        System.out.println("Test Basarılı");

    }

    @Override
    public void onTestFailure(ITestResult Result) {
        System.out.println("The name of the testcase failed is :"+ Result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult Result) {
        System.out.println("The name of the testcase Skipped is :"+Result.getName());

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
        System.out.println("The name of the testcase passed is :"+Result.getName());

    }

    @Override
    public void onStart(ITestContext ıTestContext) {

    }

    @Override
    public void onFinish(ITestContext ıTestContext) {

    }
}
