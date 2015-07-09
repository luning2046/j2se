package cys.gh.strategy2;

/**
 * 
 * »·¾³½ÇÉ«
 */
public class Environment {

	private Strategy mStrategy;
	
	public Environment(Strategy mStrategy){
		this.mStrategy = mStrategy;
	}

	public Strategy getmStrategy() {
		return mStrategy;
	}

	public void setmStrategy(Strategy mStrategy) {
		this.mStrategy = mStrategy;
	}
	
	public float calculate(float a, float b){
		return mStrategy.calculate(a, b);
	}
	
}
