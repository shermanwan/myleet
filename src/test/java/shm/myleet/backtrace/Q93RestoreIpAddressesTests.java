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

}
