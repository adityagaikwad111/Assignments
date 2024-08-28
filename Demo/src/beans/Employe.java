package beans;

public abstract class Employe extends Person {
 private String dept;
 private String desg;
public Employe(int id, String name,String dept,String desg) {
	super(id, name);
	this.dept=dept;
	this.desg=desg;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}
@Override
public String toString() {
	return super.toString()+" [dept=" + dept + ", desg=" + desg + "]";
}

}
