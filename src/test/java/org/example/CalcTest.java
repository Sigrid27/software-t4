package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }

    @Test  // 必须添加@Test注解，否则Maven无法识别为测试方法
    public void testSubtraction() {
        // 故意写错误断言：预期结果是2，实际结果是c.subtract(4,2)=2（若Calc类的subtract方法正确），但此处改为预期10，制造失败
        assertEquals(2, c.subtract(4, 2));
    }
}
