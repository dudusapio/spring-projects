package model.exceptions;

public class AmountExceedWithdrawLimit extends Exception{

	private static final long serialVersionUID = 1L;
	
	public AmountExceedWithdrawLimit(String msg) {
		super(msg);
	}
}
