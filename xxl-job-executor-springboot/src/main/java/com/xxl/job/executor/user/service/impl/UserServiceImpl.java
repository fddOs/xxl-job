package com.xxl.job.executor.user.service.impl;

import com.xxl.job.executor.dao.UserMapper;
import com.xxl.job.executor.entity.User;
import com.xxl.job.executor.user.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:用户业务实现类
 * @author:方典典
 * @time:2017年12月26日 下午10:35:50
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    
    /**
     *	持久化
     */
     @Override
    public void save(User model){
    	userMapper.insert(model);
    }
    
    //批量持久化
    /**
     * @Description:保存用户信息
     * @param models 用户model
     * @exception:
     * @author: 方典典
     * @time:2017年12月26日 下午10:36:10
     * @see com.xxl.job.executor.core.Service#save(java.util.List)
     */
    @Override
    public void save(List<User> models){
    }
    
    //通过主鍵刪除
    @Override
    public void deleteById(Integer id){
    }
    
    //批量刪除 eg：ids -> “1,2,3,4”
    @Override
    public void deleteByIds(String ids){
    }
    
    //更新
    /*@Override
    public void update(User model){
    	userMapper.updateByPrimaryKey(model);
    }
    
    //通过ID查找
    @Override
    public User findById(Integer id){
    	return userMapper.selectByPrimaryKey(id);
    }*/
    
    //通过多个ID查找//eg：ids -> “1,2,3,4”
    /**
     * @Description:TODO
     * @param ids
     * @return List<User>
     * @exception:
     * @author: 方典典
     * @time:2017年12月26日 下午10:36:45
     * @see com.xxl.job.executor.core.Service#findByIds(java.lang.String)
     */
    @Override
    public List<User> findByIds(String ids){
    	return null;
    }
    
    //获取所有
    @Override
    public List<User> findAll(){
    	return userMapper.selectAll();
    }

}
