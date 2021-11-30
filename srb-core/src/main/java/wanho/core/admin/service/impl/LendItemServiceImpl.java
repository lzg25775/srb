package wanho.core.admin.service.impl;

import wanho.core.admin.entity.LendItem;
import wanho.core.admin.mapper.LendItemMapper;
import wanho.core.admin.service.ILendItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标的出借记录表 服务实现类
 * </p>
 *
 * @author mamp
 * @since 2021-11-30
 */
@Service
public class LendItemServiceImpl extends ServiceImpl<LendItemMapper, LendItem> implements ILendItemService {

}
