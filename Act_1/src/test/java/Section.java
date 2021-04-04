

class Section {
	private final String sectionId;
	
	Section(String sectionId) {
		if (!sectionId.matches("some regex for checking alphanum")) {
			throw new IllegalArgumentException("sectionId must be alphanumericc, was:" + sectionId);
		}
		this.sectionId = sectionId;
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