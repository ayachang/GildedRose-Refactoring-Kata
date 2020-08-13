package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
		for (Item item : items) {
			if (item.getName().equals("+5 Dexterity Vest")) {
				if (item.getQuality() > 0) {
					item.setQuality(item.getQuality() - 1);
				}
				item.setSellIn(item.getSellIn() - 1);

				if (item.getSellIn() < 0) {
					if (item.getQuality() > 0) {
						item.setQuality(item.getQuality() - 1);
					}
				}
			} else if (item.getName().equals("Elixir of the Mongoose")) {
				if (item.getQuality() > 0) {
					item.setQuality(item.getQuality() - 1);
				}
				item.setSellIn(item.getSellIn() - 1);
				if (item.getSellIn() < 0) {
					if (item.getQuality() > 0) {
						item.setQuality(item.getQuality() - 1);
					}
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
				if (item.getQuality() < 50) {
					item.setQuality(item.getQuality() + 1);
				}
				item.setSellIn(item.getSellIn() - 1);

				if (item.getSellIn() < 0) {
					if (item.getQuality() < 50) {
						item.setQuality(item.getQuality() + 1);
					}
				}
			} else if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
				if (item.getQuality() < 50) {
					item.setQuality(item.getQuality() + 1);

					if (item.getSellIn() < 11) {
						if (item.getQuality() < 50) {
							item.setQuality(item.getQuality() + 1);
						}
					}

					if (item.getSellIn() < 6) {
						if (item.getQuality() < 50) {
							item.setQuality(item.getQuality() + 1);
						}
					}
				}
				item.setSellIn(item.getSellIn() - 1);
				if (item.getSellIn() < 0) {
					item.setQuality(item.getQuality() - item.getQuality());
				}

			} else {
				if (item.getQuality() < 50) {
					item.setQuality(item.getQuality() + 1);
				}
				item.setSellIn(item.getSellIn() - 1);
				if (item.getSellIn() < 0) {
					if (item.getQuality() > 0) {
						item.setQuality(item.getQuality() - 1);
					}
				}
			}
		}
    }
}