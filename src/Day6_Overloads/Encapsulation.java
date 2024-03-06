package Day6_Overloads;

public class Encapsulation
{
  private int id;
  private String name;
  private String role;
 
 void setData(int id)
 {
	 this.id=id;
 }
 int getData()
 {
	 return id;
 }
 
 void setname(String name)
 {
	 this.name=name;
 }
 String getname()
 {
	 return name;
 }
 
 
 void setRole(String role)
 {
	 this.role=role;
 }
 String getRole()
 {
	 return role;
 }

}
