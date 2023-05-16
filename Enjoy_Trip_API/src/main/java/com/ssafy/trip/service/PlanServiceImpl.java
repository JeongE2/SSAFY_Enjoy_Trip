package com.ssafy.trip.service;

import org.springframework.stereotype.Service;

import com.ssafy.trip.model.dto.PlanDto;
import com.ssafy.trip.model.mapper.PlanMapper;

@Service
public class PlanServiceImpl implements PlanService {
	PlanMapper planMapper;
	public PlanServiceImpl(PlanMapper planMapper) {
		super();
		this.planMapper = planMapper;
	}

	@Override
	public PlanDto get(int planNo) {
		return planMapper.get(planNo);
	}

	@Override
	public void write(PlanDto planDto) {
		planMapper.write(planDto);
	}

	@Override
	public void modify(PlanDto planDto) {
		planMapper.modify(planDto);
	}

	@Override
	public void delete(int planNo) {
		planMapper.delete(planNo);
	}

}
