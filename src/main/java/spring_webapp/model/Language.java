package spring_webapp.model;

public class Language extends BaseModel {

	
	public Language(String description) {
		this.setDescription(description);
	}
	
	public Language(long id, String description) {
		this.setId(id);
		this.setDescription(description);
	}
	
}
