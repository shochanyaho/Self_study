package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    /**
     * 商品情報リストを取得
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Goods[] getGoodsList() {
    	
    	Goods[] goodsList = new Goods[5];
    	goodsList[0] = new Goods("GB0001", "JavaScript入門", "本");
    	goodsList[1] = new Goods("GB0002", "Java SE Silver問題集", "本");
    	goodsList[2] = new Goods("GB0002", "AWSコンテナ設計", "本");
    	goodsList[3] = new Goods("GG0002", "エルデンリング", "ゲーム");
    	goodsList[4] = new Goods("GG0002", "スプラトゥーン２", "ゲーム");
    	
        return goodsList;
    }
    /**
     * 商品情報クラス
     */
	private class Goods{
        private String code;
        private String name;
    	  private String category;
    	
    	public Goods( String code, String name, String category){
    		this.code = code;
    		this.name = name;
    		this.category = category;
    	}

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    	
    	public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }
    }
}