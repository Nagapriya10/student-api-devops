
package deployment.devopstwo.controller;

import deployment.devopstwo.dto.StudentDTO;
import deployment.devopstwo.entity.StudentEntity;
import deployment.devopstwo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
@CrossOrigin("*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public StudentEntity createStudent(@RequestBody StudentDTO studentDTO) {
        return studentService.StudentDetails(studentDTO);
    }
}




