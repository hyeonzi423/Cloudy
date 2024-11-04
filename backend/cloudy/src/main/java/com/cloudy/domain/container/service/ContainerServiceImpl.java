package com.cloudy.domain.container.service;

import com.cloudy.domain.container.model.dto.request.ContainerGetUsagesRequest;
import com.cloudy.domain.container.model.dto.response.ContainerGetUsagesResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class ContainerServiceImpl implements ContainerService {
    @Override
    public ContainerGetUsagesResponses getContainerUsages(ContainerGetUsagesRequest request) {
        return null;
    }
}