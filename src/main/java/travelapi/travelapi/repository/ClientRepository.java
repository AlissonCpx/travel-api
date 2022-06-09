package travelapi.travelapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import travelapi.travelapi.model.ClientModel;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Long> {


}
