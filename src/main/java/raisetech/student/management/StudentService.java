package raisetech.student.management;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raisetech.student.management.data.Student;
import raisetech.student.management.data.StudentsCourses;
import raisetech.student.management.repository.StudentRepository;

@Service
public class StudentService {

  private StudentRepository repository;

  @Autowired
  public StudentService(StudentRepository repository) {
    this.repository = repository;
  }

  /**
   *
   * @return 検索するサービス
   */
  public List<Student> searchStudentList(){
    //ここで何かしらの処理を行う。検索処理を行う
    return repository.search();//絞り込みを行う。年齢が30代のみ抽出
  }

  public List<StudentsCourses> searchStudentsCourseList(){
    return repository.searchStudentsCourses();
  }
}
