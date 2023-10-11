package com.capstone.snowe.serviceImpl;

import com.capstone.snowe.dto.BoardFileDTO;
import com.capstone.snowe.mapper.BoardFileMapper;
import com.capstone.snowe.service.BoardFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardFileServiceImpl implements BoardFileService {

    @Autowired
    private BoardFileMapper boardFileMapper;


    @Override
    public void insertBoardFile(BoardFileDTO boardFileDTO) {
        boardFileMapper.insertBoardFile(boardFileDTO);
    }
}
