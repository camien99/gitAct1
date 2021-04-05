import java.util.*;

class Student {
	
	private final int studentNumber;
	private final Collection<Section> sections = new HashSet<>();
	
	Student(int studentNumber, Collection<Section> sections){
		if (studentNumber <0) {
			throw new IllegalArgumentException("studentNumber should be non-negative, was:" + studentNumber);
		}
		if (sections == null) {
			throw new NullPointerException("sections was null");
		}
		this.studentNumber = studentNumber;
		this.sections.addAll(sections);
	}
	
	void enlist(Section section) {
		if (section == null) {
			throw new NullPointerException("section was null");
		}
		
		sections.add(section);
	}
	
	@Override
	public String toString() {
		return "Student #" + studentNumber;
	}
	
	@Override
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentNumber;
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
		Student other = (Student) obj;
		if (studentNumber !=other.studentNumber)
			return false;
		return true;
	}
}
