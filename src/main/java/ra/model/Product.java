package ra.model;

public class Product {
    private Long productId;
    private String productName;
    private String catalogName;
    private String description;
    private double price;
    private boolean status;

    public Product() {
    }

    public Product(Long productId, String productName, String catalogName, String description, double price, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.catalogName = catalogName;
        this.description = description;
        this.price = price;
        this.status = status;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
