import org.apache.commons.lang3.Validate;

class Schedule {
	private final Days days;
	private final Period period;
	private final Room room;
	
	Schedule(Days days, Period period, Room room) {
		Validate.notNull(days);
		Validate.notNull(period);
		Validate.notNull(room);
		this.days = days;
		this.period = period;
		this.room = room;
	}
	
	@Override
	public String toString() {
		return days + " " + period + " " + room;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((days == null) ? 0 : days.hashCode());
		result = prime * result + ((period == null) ? 0 : period.hashCode());
		result = prime * result + ((room == null) ? 0 : room.hashCode());
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
		Schedule other = (Schedule) obj;
		if (days != other.days)
			return false;
		if (period != other.period)
			return false;
		if (room != other.room)
			return false;
		return true;
	}
}


enum Days {
	MTH, TF, WS
}

enum Period {
	H0830, H1000, H1130, H1300, H1430, H1600
}
enum Room {
	A1, A2, B1, B2, C1, C2
}