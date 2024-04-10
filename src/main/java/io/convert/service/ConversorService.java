package io.convert.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ConversorService {

	public String converter(@PathVariable String numSerie) {
		StringBuilder pattern = new StringBuilder();

		String numeroSerie = numSerie.replaceAll("\\s", "");

		for (int x = 0; x < numeroSerie.length(); x++) {
			char caractereAtualNumSerie = numeroSerie.charAt(x);
			// System.out.print(caractereAtualNumSerie);
			if (Character.isDigit(caractereAtualNumSerie)) {
				pattern.append("[0-9]");
				// System.out.println(" digit");
			} else if (Character.isLetter(caractereAtualNumSerie)) {
				pattern.append("[A-Z]");
				// System.out.println(" letter");
			} else {
				pattern.append("?");
			}
		}

		return pattern.toString();
	}

}
