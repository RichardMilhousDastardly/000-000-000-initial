package com.crucifix.software.generate;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;

public class GenerateManager {

	private static final String[] files = new String[] { "click_on.json", "sayPlay.json", "audio_permission.json", "storage_permission.json" };

	public static void main(final String[] args) throws JsonProcessingException, IOException {

		final Generator generator = new Generator();
		generator.init(files);
		generator.build();
		
		

	}

}
