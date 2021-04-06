import org.apache.commons.lang3.*;
import static org.apache.commons.lang3.StringUtils.*;
import static org.apache.commons.lang3.Validate.*;

class Section {
	private final String sectionId;
	private final Schedule schedule;
	
	Section(String sectionId, Schedule schedule) {
		notBlank(sectionId);
		notNull(schedule);
		isTrue(isAlphanumeric(sectionId), "sectionId must be alphanumericc, was:" + sectionId);		
		this.sectionId = sectionId;
		this.schedule = schedule;
	} 
	
	Schedule getSchedule(){
		return schedule;
	}
	
	boolean hasConflict(Section other) {
		return this.schedule.equals(other.schedule);
	}
		
	@Override
	public String toString() { 
		return sectionId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sectionId == null) ? 0 : sectionId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Section other = (Section) obj;
		if (sectionId == null) {
			if (other.sectionId != null)
				return false;
		} else if (!sectionId.equals(other.sectionId))
			return false;
		return true;
	}


	
	
	
}
