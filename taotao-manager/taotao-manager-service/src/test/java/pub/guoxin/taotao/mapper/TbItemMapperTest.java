package pub.guoxin.taotao.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pub.guoxin.taotao.model.TbItem;

/**
 * Created by guoxin on 17-10-2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext-dao.xml"})
public class TbItemMapperTest {

    @Autowired
    private TbItemMapper itemMapper;

    @Test
    public void findById() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application*.xml");
//        TbItemMapper bean = applicationContext.getBean(TbItemMapper.class);
        TbItem tbItem = itemMapper.selectByPrimaryKey(536563L);
        System.out.println(tbItem.toString());

    }
}
