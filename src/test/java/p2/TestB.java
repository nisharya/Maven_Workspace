package p2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestB {
  @Test
  public void f() {
	  Reporter.log("f executed", true);
  }
  @Test
  public void g() {
	  Reporter.log("g executed", true);
  }
  @Test
  public void h() {
	  Reporter.log("h executed", true);
  }

}
