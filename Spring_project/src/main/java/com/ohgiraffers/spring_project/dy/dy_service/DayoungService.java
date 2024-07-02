package com.ohgiraffers.spring_project.dy.dy_service;

import com.ohgiraffers.spring_project.dy.dy_model.dy_entity.DayoungEntity;
import com.ohgiraffers.spring_project.dy.dy_repository.DayoungRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DayoungService {
    private DayoungRepository dayoungRepository;

    @Autowired
    public DayoungService(DayoungRepository dayoungRepository) {
        this.dayoungRepository = dayoungRepository;
    }

    @Transactional
    public List<DayoungEntity> findEntitiesByPageNumber(int pageNumber) {
        List<DayoungEntity> allEntities = dayoungRepository.findAll();

        // 페이지 번호와 일치하는 엔티티만 필터링
        List<DayoungEntity> entitiesOnPage = allEntities.stream()
                .filter(entity -> entity.getId() == pageNumber)
                .collect(Collectors.toList());

        return entitiesOnPage;
    }

}
