package com.capstone.snowe.controller;

import com.capstone.snowe.dto.TeacherDTO;
import com.capstone.snowe.service.MemberService;
import com.capstone.snowe.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherService teacherService;


    /*
    * 강사 정보 수정하기(스키장 정보)
    * */
    @PutMapping("/teachers/{id}")
    public ResponseEntity<String> updateTeacherStat(@PathVariable String id, @RequestBody TeacherDTO teacherDTO) throws Exception {

        teacherDTO.setLoginId(id);
        this.teacherService.updateTeacherStat(teacherDTO);

        return ResponseEntity.ok("정보가 수정되었습니다.");
    }
}
