package com.fengdu.service;

import com.fengdu.entity.WxReplyNewsEntity;

import java.util.List;
import java.util.Map;

/**
 * Service接口
 *
 * @author william_w
 * @email 939961241@qq.com
 * @date 2018-05-24 15:56:38
 */
public interface WxReplyNewsService {

    /**
     * 根据主键查询实体
     *
     * @param id 主键
     * @return 实体
     */
    WxReplyNewsEntity queryObject(String id);

    /**
     * 分页查询
     *
     * @param map 参数
     * @return list
     */
    List<WxReplyNewsEntity> queryList(Map<String, Object> map);

    /**
     * 分页统计总数
     *
     * @param map 参数
     * @return 总数
     */
    int queryTotal(Map<String, Object> map);

    /**
     * 保存实体
     *
     * @param wxReplyNews 实体
     * @return 保存条数
     */
    int save(WxReplyNewsEntity wxReplyNews);

    /**
     * 根据主键更新实体
     *
     * @param wxReplyNews 实体
     * @return 更新条数
     */
    int update(WxReplyNewsEntity wxReplyNews);

    /**
     * 根据主键删除
     *
     * @param id
     * @return 删除条数
     */
    int delete(String id);

    /**
     * 根据主键批量删除
     *
     * @param ids
     * @return 删除条数
     */
    int deleteBatch(String[]ids);
}
