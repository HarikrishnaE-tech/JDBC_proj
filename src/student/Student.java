package student;

public class Student {
private int stdid;
private String stdname;
private int stdage;

public Student(int stdid,String stdname,int stdage) {
	this.stdid=stdid;
	this.stdname=stdname;
	this.stdage=stdage;
	
}

public int getStdid() {
	return stdid;
}

public void setStdid(int stdid) {
	this.stdid = stdid;
}

public String getStdname() {
	return stdname;
}

public void setStdname(String stdname) {
	this.stdname = stdname;
}

public int getStdage() {
	return stdage;
}

public void setStdage(int stdage) {
	this.stdage = stdage;
}

@Override
public String toString() {
	return "Student [stdid=" + stdid + ", stdname=" + stdname + ", stdage=" + stdage + "]";
}











}
