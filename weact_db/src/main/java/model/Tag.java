package model;

public class Tag {
	
	private int tagID;
	private String description;
	private TagCategory category;
	
	/**
	 * Alle mogelijke categorieen voor een tag, te weten:
	 * <ul><li>KNOWS: heeft kennis van</li>
	 * <li>WANTS_TO_LEARN: wil leren</li>
	 * <li>GROUP: groep</li>
	 * <li>OTHER: overig</li></ul>
	 * @author roysten
	 *
	 */
	public enum TagCategory{
		KNOWS, WANTS_TO_LEARN, GROUP, OTHER; 
	}
	
	/**
	 * Constructor voor een tag.
	 * @param tagID
	 * @param description de beschrijving van de tag
	 */
	public Tag(int tagID, String beschrijving, TagCategory category){
		this.tagID = tagID;
		this.description = beschrijving;
		this.category = category;
	}

	public int getTagID() {
		return tagID;
	}

	public void setTagID(int tagID) {
		this.tagID = tagID;
	}

	public String getBeschrijving() {
		return description;
	}

	public void setBeschrijving(String beschrijving) {
		this.description = beschrijving;
	}
	
	public TagCategory getCategory(){
		return category;
	}
}
