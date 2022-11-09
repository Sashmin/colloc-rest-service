package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConcatController {

	@GetMapping("/concat_two")
	public Concatenation concatTwoStrings(@RequestParam(value = "string1", defaultValue = "") String string1,
										  @RequestParam(value = "string2", defaultValue = "") String string2) {
		return new Concatenation(string1 + string2);
	}

	@GetMapping("/concat_num_of_str")
	public Concatenation concatANumberOfString(@RequestParam(value = "string", defaultValue = "") String string,
											   @RequestParam(value = "num", defaultValue = "0") int num)
	{
		String result = "";
		for (int i = 0; i < num; i++){
			result += string;
		}
		return new Concatenation(result);
	}
}
