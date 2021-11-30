package wanho.core.admin.service.impl;

import wanho.core.admin.entity.UserInfo;
import wanho.core.admin.mapper.UserInfoMapper;
import wanho.core.admin.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author mamp
 * @since 2021-11-30
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
