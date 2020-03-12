package Qatar2022.tn.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Qatar2022.tn.entities.equipes;


@Repository
public interface equiperepository extends JpaRepository<equipes,Long> {


}




