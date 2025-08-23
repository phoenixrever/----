package com.atguigu.mapper;

import com.atguigu.pojo.Schedule;

import java.util.List;

/**
 * projectName: com.atguigu.mapper
 *
 * 
 * description:
 */
public interface ScheduleMapper {

    List<Schedule> queryList();

    int deleteById(Integer id);

    int insert(Schedule schedule);

    int update(Schedule schedule);
}
