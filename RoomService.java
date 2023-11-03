package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Room;
import Repository.RoomRepository;

@Service
public class RoomService {
	
	  @Autowired
	    private RoomRepository roomRepository;

	    public List<Room> getAllRooms() {
	        return roomRepository.findAll();
	    }

	    public Room getRoomByRoomNumber(String roomNumber) {
	        return roomRepository.findByRoomNumber(roomNumber);
	    }

	    public Room saveRoom(Room room) {
	        return roomRepository.save(room);
	    }

	    public void deleteRoom(Long id) {
	        roomRepository.deleteById(id);
	    }
}
