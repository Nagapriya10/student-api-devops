//package deployment.devopstwo.controller;
//import deployment.devopstwo.service.StudentService;
//import deployment.devopstwo.dto.StudentDTO;
//import deployment.devopstwo.entity.StudentEntity;
//import deployment.devopstwo.repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.*;
//@RestController
//@RequestMapping("/api/students")
//public class StudentController {
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @PostMapping
//    public StudentEntity createStudent(@RequestBody StudentDTO studentDTO) {
//        return StudentService.StudentDetails(studentDTO);
//    }
////
//}

package deployment.devopstwo.controller;

import deployment.devopstwo.dto.StudentDTO;
import deployment.devopstwo.entity.StudentEntity;
import deployment.devopstwo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public StudentEntity createStudent(@RequestBody StudentDTO studentDTO) {
        return studentService.StudentDetails(studentDTO);
    }
}




