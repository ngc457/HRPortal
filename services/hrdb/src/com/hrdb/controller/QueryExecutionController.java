/*Copyright (c) 2017-2018 us.ibm.com All Rights Reserved.
 This software is the confidential and proprietary information of us.ibm.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with us.ibm.com*/

package com.hrdb.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;
import com.wordnik.swagger.annotations.Api;

import com.hrdb.service.HrdbQueryExecutorService;

@RestController(value = "Hrdb.QueryExecutionController")
@RequestMapping("/hrdb/queryExecutor")
@Api(value = "QueryExecutionController", description = "controller class for query execution")
public class QueryExecutionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(QueryExecutionController.class);

    @Autowired
    private HrdbQueryExecutorService queryService;


}


