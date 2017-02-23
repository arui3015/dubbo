package zrp.pub.dao;

import java.util.List;

import zrp.pub.po.Article;
import zrp.pub.support.dao.IBaseDao;
import zrp.pub.support.dao.Pagination;

/**
 * 
 * @author ZRP
 *
 */
public interface IArticleDao extends IBaseDao<Article> {
	/**
	 * 根据link属性获取一条数据 @Title: findOneByLink @Description: TODO @param @param
	 * link @param @return @return Article @throws
	 */
	public Article findOneByLink(String link);

	/**
	 * 根据link属性与title属性进行或运算获取一条数据 @Title: findOneByLinkOrTitle @Description:
	 * TODO @param @param link @param @param title @param @return @return
	 * Article @throws
	 */
	public Article findOneByLinkOrTitle(String link, String title);

	/**
	 * 根据state属性获取createTime为最新的数据 @Title: findNewestByState @Description:
	 * TODO @param @param state @param @return @return Article @throws
	 */
	public Article findNewestByState(Integer state);

	/**
	 * 根据state属性获取数据的数量 @Title: findNewestByState @Description:
	 * TODO @param @param state @param @return @return Article @throws
	 */
	public Long findCount(Integer state);

	/**
	 * 分页获取数据 @Title: findListByPage @Description: TODO @param @param
	 * page @param @param state @param @return @return List<Article> @throws
	 */
	public List<Article> findListByPage(Pagination page, Integer state);
}
