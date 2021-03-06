import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class studentTest {

	@Test
	void enlist_2_sections_no_sched_overlap() {
		//1 student 2 sections no overlap sched
		Student student = new Student(1, Collections.emptyList());
		Section sec1 = new Section("A", new Schedule(Days.MTH, Period.H0830, Room.A1));
		Section sec2 = new Section("B", new Schedule(Days.TF, Period.H1000, Room.A2));
		
		//enlistment in both sections
		student.enlist(sec1);
		student.enlist(sec2);
		
		//Both sections in student but no other
		Collection<Section> sections = student.getSections();
		assertAll(
				() -> assertTrue(sections.containsAll(List.of(sec1 , sec2))),
				() -> assertEquals(2, sections.size())
				);	
	
	}
	
	@Test
	void enlist_2_sections_same_schedule() {
		// 1 student 2 sections same sched
		Student student = new Student(1);
		Section sec1 = new Section("A", new Schedule(Days.MTH, Period.H0830, Room.A1));
		Section sec2 = new Section("B", new Schedule(Days.MTH, Period.H0830, Room.A1));
		
		// enlist in both sections
		student.enlist(sec1);
		//exception in second enlistment
		assertThrows(ScheduleConflictException.class,() -> student.enlist(sec2));
	}
}
