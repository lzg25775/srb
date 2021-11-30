package wanho.core.admin.service.impl;

import wanho.core.admin.entity.UserLoginRecord;
import wanho.core.admin.mapper.UserLoginRecordMapper;
import wanho.core.admin.service.IUserLoginRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录记录表 服务实现类
 * </p>
 *
 * @author mamp
 * @since 2021-11-30
 */
@Service
public class UserLoginRecordServiceImpl extends ServiceImpl<UserLoginRecordMapper, UserLoginRecord> implements IUserLoginRecordService {

}
