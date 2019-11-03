package spring_webapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import spring_webapp.model.Language;

public class LanguageService {

	private static Language[] dados = {new Language(1,"PHP"), new Language(2,"JAVA"), new Language(3,"C#"), new Language(4,"PHYTON")};
	private static LanguageService instance;
	
	public static LanguageService getInstance() {
		if(instance==null) {
			instance = new LanguageService();
		}
		return instance;
	}
	
	public List<Language> getAll() {
		return Arrays.asList(dados); 
	}
	
	public Language getByID(long id) {
		return getAll().stream()
				.filter(language -> id==language.getId())
				.findFirst()
				.orElse(null);
	}
			
}
