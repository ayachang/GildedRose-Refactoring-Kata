package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
       //改成另一種for each 迴圈方式較好閱讀, 而不是使用index loop
    	for (Item item : items) {
    		 if (!item.name.equals("Aged Brie")
                     && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                 if (item.quality > 0) {
                     if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                         item.quality = item.quality - 1;
                     }
                 }
             } else {
                 if (item.quality < 50) {
                     item.quality = item.quality + 1;

                     if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                         if (item.sellIn < 11) {
                             if (item.quality < 50) {
                                 item.quality = item.quality + 1;
                             }
                         }

                         if (item.sellIn < 6) {
                             if (item.quality < 50) {
                                 item.quality = item.quality + 1;
                             }
                         }
                     }
                 }
             }

             if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                 item.sellIn = item.sellIn - 1;
             }

             if (item.sellIn < 0) {
                 if (!item.name.equals("Aged Brie")) {
                     if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                         if (item.quality > 0) {
                             if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                                 item.quality = item.quality - 1;
                             }
                         }
                     } else {
                         item.quality = item.quality - item.quality;
                     }
                 } else {
                     if (item.quality < 50) {
                         item.quality = item.quality + 1;
                     }
                 }
             }
    	}
    }
}