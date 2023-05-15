package com.ssafy.trip.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.trip.model.dto.ReviewDto;
import com.ssafy.trip.service.AttractionReviewService;

@RestController
@RequestMapping("/attrReview")
public class AttractionReviewController {
	private final Logger logger = LoggerFactory.getLogger(BoardController.class);
	AttractionReviewService attractionReviewService;
	public AttractionReviewController(AttractionReviewService attractionReviewService) {
		super();
		this.attractionReviewService = attractionReviewService;
	}
	
	@GetMapping
	public List<ReviewDto> list() throws Exception {
		return null;
		
	}
}
