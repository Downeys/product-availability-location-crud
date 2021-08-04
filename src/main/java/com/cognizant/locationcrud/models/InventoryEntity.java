package com.cognizant.locationcrud.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "inventory")
public class InventoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inventoryId;
    private String departmentName;
    private Long productId;
    private String productName;
    private Long localQuantity;

    public Long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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

    public Long getLocalQuantity() {
        return localQuantity;
    }

    public void setLocalQuantity(Long localQuantity) {
        this.localQuantity = localQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InventoryEntity that = (InventoryEntity) o;
        return Objects.equals(inventoryId, that.inventoryId) && Objects.equals(departmentName, that.departmentName) && Objects.equals(productId, that.productId) && Objects.equals(productName, that.productName) && Objects.equals(localQuantity, that.localQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inventoryId, departmentName, productId, productName, localQuantity);
    }

    @Override
    public String toString() {
        return "InventoryEntity{" +
                "inventoryId=" + inventoryId +
                ", departmentName='" + departmentName + '\'' +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                ", localQuantity=" + localQuantity +
                '}';
    }
}
