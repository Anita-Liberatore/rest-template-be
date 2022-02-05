package response;

import java.util.List;

import model.Category;

public class CategoriesResponse {
	
	private List<Category> categories;

	/**
	 * @return the categories
	 */
	public List<Category> getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "CategoriesResponse [categories=" + categories + "]";
	}
	
	
}
