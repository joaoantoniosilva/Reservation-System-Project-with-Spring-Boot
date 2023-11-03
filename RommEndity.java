package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Room {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String roomNumber;
	    private String TypeOfRoom;
	    private String price;
	    
	    //Getters and setters methods
	    
		public String getRoomNumber() {
			return roomNumber;
		}
		public void setRoomNumber(String roomNumber) {
			this.roomNumber = roomNumber;
		}
		public String getTypeOfRoom() {
			return TypeOfRoom;
		}
		public void setTypeOfRoom(String typeOfRoom) {
			TypeOfRoom = typeOfRoom;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public void setId(Long roomId) {
			
			
		}
}
