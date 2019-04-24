package parking_garage;

public class Garage {

	private double inTime;
	private double outTime;
	private boolean isMonthly;
	private double totalTime;
	private final static int rate = 5;
	private double charge;

	public Garage(double inTime, double outTime, boolean isMonthly, double totalTime) {
		super();
		this.inTime = inTime;
		this.outTime = outTime;
		this.isMonthly = isMonthly;
		this.totalTime = totalTime;
	}

	public Garage() {
	}

	public double CalTime(double inTime, double outTime) {
		if (inTime <= outTime) {
			totalTime = Math.ceil(outTime - inTime);
		} else {
			System.out.println("OutTime should be greater than InTime");
			totalTime = -1;
		}

		return totalTime;
	}

	public double getInTime() {
		return inTime;
	}

	public void setInTime(double inTime) {
		this.inTime = inTime;
	}

	public double getOutTime() {
		return outTime;
	}

	public void setOutTime(double outTime) {
		this.outTime = outTime;
	}

	public boolean isMonthly() {
		return isMonthly;
	}

	public void setMonthly(boolean isMonthly) {
		this.isMonthly = isMonthly;
	}

	public double getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(double totalTime) {
		this.totalTime = totalTime;
	}

	@Override
	public String toString() {
		return "Garage [inTime=" + inTime + ", outTime=" + outTime + ", isMonthly=" + isMonthly + ", totalTime="
				+ totalTime + "]";
	}

	public double CalCharge(double totalTime2,boolean isMonthly) {
		if (!isMonthly)
		{
		charge = totalTime2 * rate;
		charge= Math.min(30,charge);
		}
		else
		{
			charge = 0;
		}
		return charge;
	}

}
