package z.etc;

/**
 * 3�Ŋ���؂��ꍇ�́uFizz�v
 * 5�Ŋ���؂��ꍇ�́uBuzz�v
 * �����Ŋ���؂��ꍇ�́uFizzBuzz�v
 */
public class FizzBuzz {

	private static final String FIZZ_STR = "FIZZ";
	private static final String BUZZ_STR = "BUZZ";

	public static final int FIZZ_NUM = 3;
	public static final int BUZZ_NUM = 5;

	public static void main(String[] args) {
		doFizzBuzz(FIZZ_NUM, BUZZ_NUM, 100);

	}

	public static void doFizzBuzz(int fizzNum, int buzzNum, int maxCount) {

		for (int i = 1; i <= maxCount; i++) {
			if (i % (fizzNum * buzzNum) == 0) {
				System.out.println(FIZZ_STR + BUZZ_STR);
			} else if (i % fizzNum == 0) {
				System.out.println(FIZZ_STR);
			} else if (i % buzzNum == 0) {
				System.out.println(BUZZ_STR);
			} else {
				System.out.println(i);
			}
		}
	}

}
