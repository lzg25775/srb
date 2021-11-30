package wanho.core.admin.service.impl;

import wanho.core.admin.entity.UserBind;
import wanho.core.admin.mapper.UserBindMapper;
import wanho.core.admin.service.IUserBindService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户绑定表 服务实现类
 * </p>
 *
 * @author mamp
 * @since 2021-11-30
 */
@Service
public class UserBindServiceImpl extends ServiceImpl<UserBindMapper, UserBind> implements IUserBindService {

}
