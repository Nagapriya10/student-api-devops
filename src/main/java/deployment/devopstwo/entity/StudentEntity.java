package deployment.devopstwo.entity;

import deployment.devopstwo.dto.StudentDTO;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Students")
@Data

public class StudentEntity {
    @Id
    private String id;
    private String name;
    private String standard;

}
