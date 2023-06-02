package sdv.mq.manager.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import sdv.mq.manager.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}