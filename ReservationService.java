package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Reservation;
import Entity.Room;
import Repository.ReservationRepository;

@Service
public class ReservationService {

	   @Autowired
	    private ReservationRepository reservationRepository;

	    public List<Reservation> getAllReservations() {
	        return reservationRepository.findAll();
	    }

	    public List<Reservation> getReservationsByRoom(Room room) {
	        return reservationRepository.findReservationsByRoom(room);
	    }

	    public Reservation saveReservation(Reservation reservation) {
	        return reservationRepository.save(reservation);
	    }

	    public void deleteReservation(Long id) {
	        reservationRepository.deleteById(id);
	    }
}
