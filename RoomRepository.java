package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

    // Custom search method to find a room by room number
    Room findByRoomNumber(String roomNumber);
}
