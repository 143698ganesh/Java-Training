package pancard;

public class PanModel {
//	public String name;
	public String panNo;
//	@Override
//	public String toString() {
//		return "PanModel [name=" + name + ", panNo=" + panNo + "]";
//	}
	public PanModel(String name, String panNo) {
		super();
//		this.name = name;
		this.panNo = panNo;
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
}
