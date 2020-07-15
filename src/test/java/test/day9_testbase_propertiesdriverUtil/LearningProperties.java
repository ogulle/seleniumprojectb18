package test.day9_testbase_propertiesdriverUtil;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_properties_test(){

        //String osName = System.getProperty("os.name");
        //System.out.println("osName = " + osName);

        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));

    }

}
