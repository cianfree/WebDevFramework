package cn.arvin.example.cache.query;

import java.io.Serializable;

/**
 * Created by Arvin on 2016/7/10.
 */
public class UserQuery implements Serializable {

    private Integer curPage;

    private Integer pageSize;

    private Integer id; // equals query

    private String name; // equals query

    private Integer age; // equals query

    public Integer getId() {
        return id;
    }

    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserQuery{" +
                "curPage=" + curPage +
                ", pageSize=" + pageSize +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
