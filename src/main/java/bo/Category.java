package bo;

public class Category {
    private int categoryId;
    private String label;

    public Category(int categoryId, String label) {
        this.categoryId = categoryId;
        this.label = label;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", label=" + label + "]";
	}
}
