package raisetech.student.management.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Student {
 //private String name;
 //private int age;

  //public String getName() {return name;}

 // public void setName(String name) {this.name = name;}

 // public int getAge() {return age;}

  //public void setAge(int age) {this.age = age;}

  private String id;
  private String name;
  private String furigana;
  private String nickname;
  private String address;
  private String mailaddress;
  private int age;
  private String sex;
  private String remark;
  private boolean isDeleted;
}