package package1;

class Faculty extends Employee {
	private boolean status;
	
	public void setStatus(String t) {
		if(t.equals("Y")) {
			this.status = true;
		}
		else {
			this.status = false;
		}
		
	}
	public boolean isRegular() {
		return status;
	}
}
