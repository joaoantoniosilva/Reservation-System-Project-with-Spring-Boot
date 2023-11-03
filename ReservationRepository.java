package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Entity.Reservation;
import Entity.Room;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

	// Custom search method to find reservations for a specific room
    @Query("SELECT r FROM Reservation r WHERE r.room = ?1")
    List<Reservation> findReservationsByRoom(Room room);
}