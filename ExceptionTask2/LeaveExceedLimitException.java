package com.yash.ExceptionTask2;

public class LeaveExceedLimitException extends Exception {

	public LeaveExceedLimitException(String msg)
	{
		super(msg);
	}
}
