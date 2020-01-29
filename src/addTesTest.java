import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addTesTest {

	@Test
	void test() {
		addTes tt=new addTes();
		int result=tt.adds(4, 6);
		assertEquals(10,result);
	}

}
