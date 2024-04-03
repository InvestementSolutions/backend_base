package com.example.corebase.core.superAdmin.systemManagement.service.impl;

import com.example.corebase.core.base.model.PageableObject;
import com.example.corebase.core.superAdmin.systemManagement.model.request.SuObjectManagementFilterRequest;
import com.example.corebase.core.superAdmin.systemManagement.model.response.SuObjectsManagementResponse;
import com.example.corebase.core.superAdmin.systemManagement.repository.SuObjectManagementRepository;
import com.example.corebase.core.superAdmin.systemManagement.service.SuObjectManagementService;
import com.example.corebase.entity.ObjectsEntity;
import com.example.corebase.util.PageableCommon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service("objectManagementServiceImpl")
public class SuObjectManagementServiceImpl implements SuObjectManagementService {

    @Autowired
    @Qualifier("objectManagementRepository")
    private SuObjectManagementRepository repository;

    @Override
    public PageableObject<SuObjectsManagementResponse> getAllObjects(SuObjectManagementFilterRequest request) {
        return new PageableObject<>(repository.getAllObjectsManagement(request, PageableCommon.getPageable(request)));
    }

    @Override
    public ObjectsEntity createOrUpdateObjects(ObjectsEntity objectsEntity) {
        return repository.save(objectsEntity);
    }
}