package deployment.devopstwo.service;

import deployment.devopstwo.dto.StudentDTO;
import deployment.devopstwo.entity.StudentEntity;
import deployment.devopstwo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public  StudentEntity StudentDetails(StudentDTO studentDTO) {
        StudentEntity student = new StudentEntity();
        student.setName(studentDTO.getName());
        student.setStandard(studentDTO.getStandard());

        return studentRepository.save(student);
    }
}