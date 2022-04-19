package com.firstapp.demo.student;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path="/student")
@RequiredArgsConstructor
public class StudentController {

    @Autowired
    private final StudentService studentService;

    @GetMapping
    public List<Student> getStudentList(){
        return studentService.getStudentList();
    };

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        Student st=new Student();
        try{
            return studentService.getStudentById(id);
        }catch(Exception e){
            System.out.println(e);
            st.setName("Veri Yok");
            st.setAge(-1);
            st.setNumber("Bulunamadı");
            return st;
        }
    }

    @GetMapping("/name")
    public Student getStudentByName(@RequestBody String name){
            return studentService.getStudentByName(name);
    }


    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @DeleteMapping(path={"delete/{studentId}"})
    public void deleteStudent(@PathVariable("studentId") Long id){
         studentService.deleteStudent(id);
    }

    @PutMapping(path="{studentId}")
    public void updateStudent(
        @PathVariable("studentId") Long studentId,
        @RequestParam(required = false) String name,
        @RequestParam(required=false)int age){
            studentService.updateStudent(studentId,name,age);
        }

}
