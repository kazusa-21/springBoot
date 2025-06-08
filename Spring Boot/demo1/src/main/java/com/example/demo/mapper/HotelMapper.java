
package com.example.demo.mapper;

import com.example.demo.model.Hotel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface HotelMapper {
    List<Hotel> findByKeyword(@Param("keyword") String keyword);
}

// package com.example.demo.mapper;

// import com.example.demo.model.Hotel;
// import org.apache.ibatis.annotations.Mapper;
// import org.apache.ibatis.annotations.Param;
// import org.apache.ibatis.annotations.Select;
// import java.util.List;

// @Mapper
// public interface HotelMapper {

//     @Select("SELECT * FROM hotel WHERE prefecture LIKE CONCAT('%', #{keyword}, '%')")
//     List<Hotel> findByKeyword(@Param("keyword") String keyword);
// }

