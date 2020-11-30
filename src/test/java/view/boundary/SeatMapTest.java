package view.boundary;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeatMapTest {

	@Test
	public void testSeatMap() {
		SeatMap map= new SeatMap();
		for (int i=0;i<map.seats.size();i++) {
			System.err.println(map.seats.get(i).getText());
		}
		fail("Not yet implemented");
	}

}
