package zrp.pub;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import zrp.pub.dao.IArticleDao;
import zrp.pub.po.Article;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring.xml")
public class MongoTest {
	@Resource
	private IArticleDao articleDao;

	@Test
	public void testInsert() {
		try {
			Article article = new Article();
			article.setTitle("ндуб");
			article.setLink("http://javake.me");
			article.setState(1);
			article.setCreateTime(new Timestamp(new Date().getTime()));
			articleDao.insert(article);
			List<Article> all = articleDao.findList(0, 10);
			System.out.println(all);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
