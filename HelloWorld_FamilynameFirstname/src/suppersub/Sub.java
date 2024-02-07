package suppersub;

import java.util.Random;

public class Sub extends Super {

	public Sub() {
		Random rnd = new Random();

		setHp(rnd.nextInt(1000));
		setMp(rnd.nextInt(1000));
		setPower(rnd.nextInt(1000));
		setSpeed(rnd.nextInt(1000));
		setDefense(rnd.nextInt(1000));
	}
}


