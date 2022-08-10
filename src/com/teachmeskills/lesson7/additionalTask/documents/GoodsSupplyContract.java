package com.teachmeskills.lesson7.additionalTask.documents;

import java.util.Date;

public class GoodsSupplyContract extends Document {
    private String goodsType;
    private int goodsQuantity;

    public GoodsSupplyContract(int documentNumber, Date documentDate, String goodsType, int goodsQuantity) {
        super(documentNumber, documentDate);
        this.goodsType = goodsType;
        this.goodsQuantity = goodsQuantity;
    }

    public GoodsSupplyContract() {
        super();
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public int getGoodsQuantity() {
        return goodsQuantity;
    }

    public void setGoodsQuantity(int goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    @Override
    public String toString() {
        return "GoodsSupplyContract{" +
                "documentNumber=" + this.getDocumentNumber() +
                " documentDate=" + this.getDocumentDate() +
                " goodsType='" + goodsType + '\'' +
                ", goodsQuantity=" + goodsQuantity +
                '}';
    }
}
