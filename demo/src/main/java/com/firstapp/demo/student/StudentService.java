package com.firstapp.demo.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudentList(){
        return studentRepository.findAll();
    };

    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElseThrow();
    }

    public Student getStudentByName(String name){
        Student std=new Student();
        return studentRepository.findStudentByName(name).orElse(std);
    }
    public Student createStudent(Student student){
        Student currStudent=new Student();
        currStudent.setName(student.getName());
        currStudent.setNumber(student.getNumber());
        currStudent.setAge(student.getAge());
        currStudent.setLocaldate(LocalDate.now());
        studentRepository.save(currStudent);
        return currStudent;
    }

    public void deleteStudent(Long id){
        boolean exist=studentRepository.existsById(id);
        if(!exist)
            throw new IllegalArgumentException("Student with id "+id + " does not exist!");
        studentRepository.deleteById(id);
    }

    @Transactional
    public void updateStudent(
        Long studentId,
        String name,
        int age
    ){
        Student student=studentRepository
        .findById(studentId).
        orElseThrow(()->new IllegalArgumentException("Student with id:"+studentId+" does not exist"));

        if(name!=null&&name.length()>0&&!Objects.equals(student.getName(),name)) {
            Optional<Student> studentOptional = studentRepository.findStudentByName(name);
            if(studentOptional.isPresent())
                throw new IllegalArgumentException("Bu isimle Öğrencimiz bulunmaktadır, fakrlı bir isim seçiniz");

            student.setName(name);
        }
        if(age!=0) {
            student.setAge(age);
        }
    }



}
