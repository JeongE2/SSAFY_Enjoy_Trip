package com.ssafy.trip.controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.trip.service.BoardLikeService;

@RestController
@RequestMapping("/boardlike")
public class BoardLikeController {
	private final Logger logger = LoggerFactory.getLogger(BoardController.class);
	BoardLikeService boardLikeService;
	public BoardLikeController(BoardLikeService boardLikeService) {
		super();
		this.boardLikeService = boardLikeService;
	}
	
	@GetMapping("")
	public int get(int boardNo) throws Exception {
		/**
		 * 세션??에서 사용자 번호를 가져와서 사용자가 boardNo에 해당하는 게시글에 좋아요를 눌렀다면 1 아니면 0 반환
		 */
		int userNo = 7;//test
		logger.debug("like board {} user {}", boardNo,userNo);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("boardNo", boardNo);
		map.put("userNo", userNo);

		int result = boardLikeService.get(map);
		return result;
	}
	
	@PostMapping("")
	public String create(int boardNo) throws Exception {
		logger.debug("like board number of : {}", boardNo);
		int userNo = 5;//test
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("boardNo", boardNo);
		map.put("userNo", userNo);
		boardLikeService.create(map);
		return "success";
	}
	
	@DeleteMapping("")
	public String delete(int boardNo) throws Exception {
		logger.debug("unlike board number of : {}", boardNo);
		int userNo = 7;//test
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("boardNo", boardNo);
		map.put("userNo", userNo);
		boardLikeService.delete(map);
		return "success";
	}
}
