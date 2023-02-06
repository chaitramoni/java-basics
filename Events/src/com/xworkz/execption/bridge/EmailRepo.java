package com.xworkz.execption.bridge;

public interface EmailRepo {
	boolean create(String email);

	default int totalEmails() {
		return 10;
	}
}
