package wanho.core.admin.service.impl;

import wanho.core.admin.entity.UserAccount;
import wanho.core.admin.mapper.UserAccountMapper;
import wanho.core.admin.service.IUserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author mamp
 * @since 2021-11-30
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements IUserAccountService {

}
