package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
		for (Item item : items) {
			if (item.getName().equals("+5 Dexterity Vest")) {
				item.decreaseQuality();
				
				item.setSellIn(item.getSellIn() - 1);

				if (item.getSellIn() < 0) {
					item.decreaseQuality();
				}
			} else if (item.getName().equals("Elixir of the Mongoose")) {
				item.decreaseQuality();
				
				item.setSellIn(item.getSellIn() - 1);
				if (item.getSellIn() < 0) {
					item.decreaseQuality();
				}
			} else if (item.getName().equals("Sulfuras, Hand of Ragnaros")) {
				if (item.getQuality() > 0) {
					// do nothing...
				}
				if (item.getSellIn() < 0) {
					if (item.getQuality() > 0) {
						// do nothing...
					}
				}
			} else if (item.getName().equals("Aged Brie")) {
				item.increaseQuality();
				
				item.setSellIn(item.getSellIn() - 1);

				if (item.getSellIn() < 0) {
					item.increaseQuality();
				}
			} else if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
				item.increaseQuality();
				
				if (item.getQuality() < 50) {
					if (item.getSellIn() < 11) {
						item.increaseQuality();
					}

					if (item.getSellIn() < 6) {
						item.increaseQuality();
					}
				}
				
				item.setSellIn(item.getSellIn() - 1);
				if (item.getSellIn() < 0) {
					item.zeroQuality();
				}

			} else {
				item.increaseQuality();
				
				item.setSellIn(item.getSellIn() - 1);
				if (item.getSellIn() < 0) {
					item.decreaseQuality();
				}
			}
		}
    }
}