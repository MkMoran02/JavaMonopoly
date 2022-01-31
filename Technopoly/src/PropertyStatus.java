
public enum PropertyStatus { AVAILABLE(0), OWNED(1), UPGRADED(2);
	
	private String status[] = {"Available", "Owned", "Upgraded"};
	
	private int index;
	
	private PropertyStatus(int num) {
		index = num;
	}
	
	/**
	 * A method that changes the enums to a string format
	 */
	public String toString() {
		return status[index];
	}

}
