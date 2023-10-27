package com.capstone.snowe.serviceImpl;

import com.capstone.snowe.domain.MemberResponse;
import com.capstone.snowe.dto.TeacherDTO;
import com.capstone.snowe.mapper.TeacherMapper;
import com.capstone.snowe.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public void addTeacher(TeacherDTO teacherDTO) {
        this.teacherMapper.addTeacher(teacherDTO);
    }

    @Override
    public void perCodeUpdate(MemberResponse memberResponse) {
        this.teacherMapper.perCodeUpdate(memberResponse);
    }

    @Override
    public void updateTeacherStat(TeacherDTO teacherDTO) {
        this.teacherMapper.updateTeacherStat(teacherDTO);
    }
}