package shm.myleet.string;

import lombok.extern.slf4j.Slf4j;

/**
 * 151. 翻转字符串里的单词
 *
 * @see https://leetcode-cn.com/problems/reverse-words-in-a-string/
 */
@Slf4j
public class Q151ReverseWords {

  /**
   * 给定一个字符串，逐个翻转字符串中的每个单词。 说明： 无空格字符构成一个 单词 。 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
   * 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
   *
   * @param s
   * @return
   */
  public String reverseWords(String s) {
    byte[] bytes = s.getBytes();

    int len = this.removeBlank(bytes, bytes.length);
    // log.debug("after removeBlank str = '{}'", new String(bytes, 0, len));

    reverse(bytes, 0, len - 1);
    // log.debug("after reverse str = '{}'", new String(bytes, 0, len));

    reverseWords(bytes, len);
    // log.debug("after reverseWords str = '{}'", new String(bytes, 0, len));

    return new String(bytes, 0, len);
  }

  /**
   * 去除首位，中间重复空格
   *
   * @param s
   * @param len
   * @return
   */
  private int removeBlank(byte[] s, int len) {
    int fast = 0, slow = 0;
    // 去除开头空格
    while (s[fast] == ' ') {
      fast++;
    }

    while (fast < len) {
      if (s[fast] == ' ') {
        // 去除中间重复空格
        if (fast > 0 && s[fast - 1] == ' ') {
          // pass
        } else {
          s[slow++] = s[fast];
        }
      } else {
        s[slow++] = s[fast];
      }

      fast++;
    }

    // 末尾可能还有个空格
    if (s[slow - 1] == ' ') {
      slow--;
    }

    // for (int i = slow + 1; i < len; i++) {
    // s[i] = 0;
    // }

    // 清除空格后长度为 slow 位置
    return slow;
  }

  /**
   * 反转字符串
   *
   * @param s
   * @param left
   * @param right
   */
  private void reverse(byte[] s, int left, int right) {
    while (left < right) {
      byte swap = s[left];
      s[left] = s[right];
      s[right] = swap;
      left++;
      right--;
    }
  }

  /**
   * 反转 words
   *
   * @param s
   * @param len
   */
  private void reverseWords(byte[] s, int len) {
    int left = 0, right = 0;
    for (right = 0; right < len; right++) {
      // 遇到空格，反转 (left, right-1) 的单词
      if (s[right] == ' ') {
        reverse(s, left, right - 1);
        left = right + 1;
      }
    }

    reverse(s, left, right - 1);
  }

}
