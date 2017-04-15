package com.spring.visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Created by dhavalpatel on 15/04/17.
 */
@Repository
public class VisitorRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly=true)
    public List<Visitor> findAll(){
        List<Visitor> list = jdbcTemplate.query(
                "select id, name, email, city, gender, dob, created_date from visitor",
                (rs, rowNum) -> new Visitor(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("city"),
                        rs.getString("gender"),
                        rs.getDate("dob"),
                        rs.getDate("created_date")
                )
        );
        return list;
    }
}
