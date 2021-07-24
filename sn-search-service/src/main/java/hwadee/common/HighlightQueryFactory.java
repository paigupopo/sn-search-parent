package hwadee.common;

import org.springframework.data.domain.Sort;
import org.springframework.data.solr.core.query.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public class HighlightQueryFactory {

    private HighlightQuery query;

    public HighlightQueryFactory() {
        HighlightQuery query = new SimpleHighlightQuery();
        HighlightOptions options = new HighlightOptions();
        options.addField("jo_title");
        options.addField("jo_content");
//        //设置高亮前后缀
        options.setSimplePrefix("<em style='color:red'>");
        options.setSimplePostfix("</em>");
        //设置高亮选项
        query.setHighlightOptions(options);
        this.query = query;
    }

    public HighlightQuery getQuery() {
        return query;
    }

    public void addCriteria(Criteria criteria) {
        this.query.addCriteria(criteria);
    }

    public void addCriteria(Map searchMap) {
        String o1 = (String) searchMap.get("title");
        //是否点击标题查询
        if (o1 != null && o1 != "" && o1.equals("2")) {
            //点击标题后 站点是否存在
            if (searchMap.get("groupId") == null || searchMap.get("groupId").equals("")) {
                Criteria criteria = new Criteria("jo_title").is(searchMap.get("keywords"));
                this.query.addCriteria(criteria);
            } else {
                Criteria criteria1 = new Criteria("jo_title").is(searchMap.get("keywords"));
                Crotch crotch1 = criteria1.and("jo_groupId").is(searchMap.get("groupId"));
                this.query.addCriteria(crotch1);
            }

        } else if (searchMap.get("groupId") != null && !searchMap.get("groupId").equals("")) {
            Criteria criteria = new Criteria("jo_keywords").is(searchMap.get("keywords"));
            Crotch crotch = criteria.and("jo_groupId").is(searchMap.get("groupId"));
            this.query.addCriteria(crotch);
        } else {
            Criteria criteria = new Criteria("jo_keywords").is(searchMap.get("keywords"));
            this.query.addCriteria(criteria);
        }
    }

    public void addCriteria(String filedname, String value) {
        Criteria criteria = new Criteria(filedname).is(value);
        this.query.addCriteria(criteria);
    }

    public void addExclude(String filedname, String value) {
        Criteria criteria = new Criteria(filedname).not().is(value);
        this.query.addCriteria(criteria);
    }

    public void setPage(Map searchMap) {
        Integer pageNo = (Integer) searchMap.get("pageNo");//获取页码
        if (pageNo == null) {
            pageNo = 1;
        }
        Integer pageSize = (Integer) searchMap.get("pageSize");//获取页大小
        if (pageSize == null) {
            pageSize = 10;
        }
        this.query.setOffset((pageNo - 1) * pageSize);//起始索引
        this.query.setRows(pageSize);//每页记录数
    }

    public void setSort(Map searchMap) {
        String sortValue = (String) searchMap.get("sort");//ASC DESC
        String sortField = (String) searchMap.get("sortField");//排序字段
        if (sortValue != null && !sortValue.equals("")) {
            if (sortValue.equals("ASC")) {
                Sort sort = new Sort(Sort.Direction.ASC, "jo_" + sortField);
                this.query.addSort(sort);
            }
            if (sortValue.equals("DESC")) {
                Sort sort = new Sort(Sort.Direction.DESC, "jo_" + sortField);
                this.query.addSort(sort);
            }
        }
        String time = (String) searchMap.get("time");
        if(time !=null&& time!=""&&time.equals("一周内")){
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.WEEK_OF_MONTH,-1);//一周内
            Date pastDate = calendar.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
            StringBuilder builder=new StringBuilder("");
            builder.append("["+sdf.format(pastDate)+" TO "+ sdf.format(new Date())+"]");
            Criteria criteria = new Criteria("jo_createdate").is(builder);

            this.query.addCriteria(criteria);
        } if(time !=null&& time!=""&&time.equals("一月内")){
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.MONTH, -1);//一月内
            Date pastDate = calendar.getTime();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");
            StringBuilder builder=new StringBuilder("");
            builder.append("["+sdf.format(pastDate)+" TO "+ sdf.format(new Date())+"]");
            Criteria criteria = new Criteria("jo_createdate").is(builder);
            this.query.addCriteria(criteria);
        }
        if(time !=null&& time!=""&&time.equals("一年内")){
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.YEAR, -1);//一年
            Date pastDate = calendar.getTime();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'16:00:00'Z'");


            StringBuilder builder=new StringBuilder("");
            builder.append("["+sdf.format(pastDate)+" TO "+ sdf.format(new Date())+"]");
            Criteria criteria = new Criteria("jo_createdate").is(builder);
            this.query.addCriteria(criteria);
        }
    }

    public void setSpecialSearch(Map searchMap){
        if(searchMap.get("group1")!=null&&searchMap.get("group1").equals("高级搜索")){
            StringBuilder builder=new StringBuilder("");

            StringBuilder gao1 = builder.append("\"").append(searchMap.get("gao1")).append("\"");


            Criteria criteria=new Criteria("jo_keywords").is(searchMap.get("gao"));
            Crotch jo_keywords = criteria.and("jo_keywords").is(gao1);
            Crotch crotch = jo_keywords.and("jo_keywords").is(searchMap.get("gao2"));
            if(searchMap.get("gao3")!=null&&!searchMap.get("gao3").equals("")){
                Crotch crotch2 = crotch.not().is(searchMap.get("gao3"));
                Crotch crotch1 = crotch2.and("jo_groupId").is(searchMap.get("groupId"));

                this.query.addCriteria(crotch1);
            }

        }
    }

}
