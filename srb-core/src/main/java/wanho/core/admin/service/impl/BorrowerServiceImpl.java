package wanho.core.admin.service.impl;

import wanho.core.admin.entity.Borrower;
import wanho.core.admin.mapper.BorrowerMapper;
import wanho.core.admin.service.IBorrowerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 借款人 服务实现类
 * </p>
 *
 * @author mamp
 * @since 2021-11-30
 */
@Service
public class BorrowerServiceImpl extends ServiceImpl<BorrowerMapper, Borrower> implements IBorrowerService {

}
