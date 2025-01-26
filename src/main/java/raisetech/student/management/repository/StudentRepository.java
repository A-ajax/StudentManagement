package raisetech.student.management.repository;//データベースを使うためのもの。Javaから？

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import raisetech.student.management.data.Student;
import raisetech.student.management.data.StudentsCourses;

/**
 * 受講生情報を扱うリポジトリ
 *
 * 全権検索や単一情報の検索やコース情報の検索が行えるクラスです。
 */


@Mapper//Mybatisが管理するものと認識してくれる
public interface StudentRepository {

  /**
   * 全件検索します。
   *
   * @return 全件検索した受講生情報の一覧
   */

  @Select("SELECT * FROM students")
      //中身はsql文
  List <Student> search();//上の＃で設定したものの引数を設定してくれる。

  //@Insert("INSERT student values(#{name},#{age})")
  //void registerStudent(String name,int age);

  //@Update("UPDATE student SET age = #{age} WHERE name = #{name}")//SET＝変更を加える
  //void updateStudent(String name,int age);

 // @Delete("DELETE FROM student WHERE name = #{name}")
 // void deleteStudent(String name);

  @Select("SELECT*FROM students_courses")
  List<StudentsCourses> searchStudentsCourses();
}
