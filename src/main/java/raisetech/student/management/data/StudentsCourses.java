package raisetech.student.management.data;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentsCourses {

  private String id;
  private String students_ID;
  private String courses_name;
  private LocalDateTime start;
  private LocalDateTime scheduled_to_end;

}
