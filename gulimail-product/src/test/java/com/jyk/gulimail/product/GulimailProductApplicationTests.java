package com.jyk.gulimail.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jyk.gulimail.product.entity.BrandEntity;
import com.jyk.gulimail.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimailProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    public void contextLoads(){
        // BrandEntity brandEntity = new BrandEntity();
        // // brandEntity.setName("小米");
        // // brandService.save(brandEntity);
        //
        // brandEntity.setBrandId(2L);
        // brandEntity.setName("Apple");
        // brandEntity.setDescript("Xiaomi 13 Pro");
        //
        // brandService.updateById(brandEntity);
        //
        // System.out.println("修改成功。。。");

        List<BrandEntity> brandEntities = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brandEntities.forEach((item)->{
            System.out.println(item);
        });
    }
}
