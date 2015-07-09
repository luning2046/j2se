package cys.gh.strategy2;

/**
 * 
 * 具体的策略类
 */
public class Multiply implements Strategy {

	public float calculate(float a, float b) {
		return a*b;
	}

}
