package com.cognizant.locationcrud.repos;

import com.cognizant.locationcrud.models.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepo extends JpaRepository<InventoryEntity, Long> {
}
