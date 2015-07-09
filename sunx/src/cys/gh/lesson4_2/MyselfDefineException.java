package cys.gh.lesson4_2;


class PasswordErrorException extends RuntimeException {

	public PasswordErrorException(String message){
		super(message);
	}
}

public class MyselfDefineException {

	public static void main(String[] args) {
		int a = 2;
		try{
			aa(a);
		}catch(PasswordErrorException e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void aa(int a){
		if(a==2){
			throw new PasswordErrorException("adf");
		}
	}

}
