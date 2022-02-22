package com.company;


public record promotionalProduct (String productName, double discountPercentage,
                                  double initialPrice, double promotionalPrice, String productType,
                                  double endDateofDiscount
){


    private static int totalCount;
    public promotionalProduct() {
        this("name", 2, 10, 8, " type ", 23);
    }
    public promotionalProduct(String productName, double discountPercentage,
                              double initialPrice) {
        this(productName, discountPercentage, initialPrice, 9, "clothes", 99);
    }


    @Override
    public String toString() {
        return "promotionalProduct:\n- productName: " + this.productName +
                "\n- discountPercentage: " + this.discountPercentage + "\n-  initialPrice: " + this.initialPrice +
                "\n- promotionalPrice: " + this.promotionalPrice+ "\n- productType: " + this.productType +
                "\n- endDateofDiscount: " + this.endDateofDiscount;
    }

    public static int getTotalCount() {
        return totalCount;
    }
}