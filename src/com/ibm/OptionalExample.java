package com.ibm;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		Optional<String> opt = Optional.ofNullable("Hello");

		// Check if value is present
		if (opt.isPresent()) {
			System.out.println(opt.get()); // Output: Hello
		}

		// Use orElse
		System.out.println(opt.orElse("Default")); // Output: Hello

		// Use ifPresent
		opt.ifPresent(System.out::println); // Output: Hello
	}
}
