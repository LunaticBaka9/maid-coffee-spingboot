package com.maid_coffee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.maid_coffee.entity.Shop;
import com.maid_coffee.exception.CustomerException;
import com.maid_coffee.mapper.ShopMapper;

import jakarta.annotation.Resource;

@Service
public class ShopService {

    @Resource
    ShopMapper shopMapper;

     public List<Shop> selectAllShops(){
        return shopMapper.selectAllShops(null);
    }

    public PageInfo<Shop> selectPage(Integer pageNum, Integer pageSize, Shop shop){
        //开启分页查询
        PageHelper.startPage(pageNum,pageSize);
        List<Shop> list = shopMapper.selectAllShops(shop);
        return PageInfo.of(list);
    }

    public void add(Shop shop){
        Shop dbShop = shopMapper.selectByShopName(shop.getShopName());
        if(dbShop != null){
            System.out.println("Duplicate shop name: " + dbShop.getShopName());
            throw new CustomerException("商店名称重复");
        }
        shopMapper.insert(shop);
    }

    public void update(Shop shop){
        shopMapper.updateByShopId(shop);
    }

    public void deleteByShopId(Shop shop){
        shopMapper.deleteByShopId(shop);
    }
}
