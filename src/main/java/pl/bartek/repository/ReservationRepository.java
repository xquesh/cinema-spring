package pl.bartek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.bartek.model.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}