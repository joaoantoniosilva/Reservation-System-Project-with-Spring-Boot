package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.Room;
import Service.RoomService;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {
	 
	@Autowired
	    private RoomService roomService;

	    @GetMapping
	    public List<Room> getAllRooms() {
	        return roomService.getAllRooms();
	    }

	    @GetMapping("/{roomNumber}")
	    public Room getRoomByRoomNumber(@PathVariable String roomNumber) {
	        return roomService.getRoomByRoomNumber(roomNumber);
	    }

	    @PostMapping
	    public Room createRoom(@RequestBody Room room) {
	        return roomService.saveRoom(room);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteRoom(@PathVariable Long id) {
	        roomService.deleteRoom(id);
	    }

}
