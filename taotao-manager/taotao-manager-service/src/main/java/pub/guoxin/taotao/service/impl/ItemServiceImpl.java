package pub.guoxin.taotao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pub.guoxin.taotao.mapper.TbItemMapper;
import pub.guoxin.taotao.model.TbItem;
import pub.guoxin.taotao.service.ItemService;

/**
 * 商品管理
 * <p>
 * Created by guoxin on 17-10-2.
 */
@Service("itemService")
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(long id) {
        TbItem tbItem = itemMapper.selectByPrimaryKey(id);
        return tbItem;
    }
}
