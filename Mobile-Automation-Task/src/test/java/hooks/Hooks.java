package hooks;

import initialization.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	DriverManager driverMangerObj = new DriverManager();

    @Before
    public  void initializeDriver() throws Exception {
        driverMangerObj.startDriver();
    }

    @After
    public void tearDown() {
        driverMangerObj.tearDown();
    }

}
