package raisetech.student.management;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetech.student.management.data.Student;
import raisetech.student.management.data.StudentsCourses;
import raisetech.student.management.repository.StudentRepository;

@SpringBootApplication
@RestController
public class Application {

	//@Autowired//自動的に紐づける
	//private StudentRepository repository;

	//private String name="Yamasaki Ayari";
	//private String age ="37";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
//@GetMapping("/studentList") //←URL
	//public List<Student> getStudentList ()//@RequestParam String name){

	//String getStudentList(@RequestParam("name")String name){//この文字”Hello World”を返せという指示

			//student

			//return repository.search();}
		//Student student = new Student();
		//student.setName("YamasakiAyayri");//名前にスペース入れると後の追加などが面倒
		//String name = student.getName();

		//return student.getName() + " " +student.getAge() + "old";
//}

//@PostMapping("/student")
	//public  void registerStudent(String name,int age) {
	//repository.registerStudent(name,age);
//}
	//@PatchMapping("/student")
			//public void updateStudentName(String name,int age ){
		//repository.updateStudent(name,age);
		//this.name = name;//引数name13行目に対して指定をする。このとき値がないことになっている
		//下のGitbashでポストをして自分の名前を入力→名前の値を渡している
	//}
	//@DeleteMapping("/student")
	//public void deleteStudent(String name){
		//repository.deleteStudent(name);
	//}

//@GetMapping("/studentsCourseList") public List<StudentsCourses> getStudentsCourseList(){return repository.searchStudentsCourses();}

}
