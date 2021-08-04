package com.cognizant.locationcrud.repos;

import com.cognizant.locationcrud.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepo extends JpaRepository<Location, Integer>{

}
