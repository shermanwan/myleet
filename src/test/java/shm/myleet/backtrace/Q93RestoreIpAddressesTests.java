package shm.myleet.backtrace;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Q93RestoreIpAddressesTests {

  Q93RestoreIpAddresses solution = new Q93RestoreIpAddresses();

  @Test
  public void demo1() {
    List<String> actual = solution.restoreIpAddresses("25525511135");
    String[] expect = { "255.255.11.135", "255.255.111.35" };
    Assertions.assertArrayEquals(expect, actual.toArray(new String[] {}));
  }

  @Test
  public void demo2() {
    List<String> actual = solution.restoreIpAddresses("0000");
    String[] expect = { "0.0.0.0" };
    Assertions.assertArrayEquals(expect, actual.toArray(new String[] {}));
  }

  @Test
  public void demo3() {
    List<String> actual = solution.restoreIpAddresses("1111");
    String[] expect = { "1.1.1.1" };
    Assertions.assertArrayEquals(expect, actual.toArray(new String[] {}));
  }

  @Test
  public void demo4() {
    List<String> actual = solution.restoreIpAddresses("010010");
    String[] expect = { "0.10.0.10", "0.100.1.0" };
    Assertions.assertArrayEquals(expect, actual.toArray(new String[] {}));
  }

  @Test
  public void demo5() {
    List<String> actual = solution.restoreIpAddresses("101023");
    String[] expect = { "1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3" };
    Assertions.assertArrayEquals(expect, actual.toArray(new String[] {}));
  }

  @Test
  public void adv1() {
    List<String> actual = solution.restoreIpAddresses("0279245587303");
    String[] expect = {};
    Assertions.assertArrayEquals(expect, actual.toArray(new String[] {}));
  }

}
