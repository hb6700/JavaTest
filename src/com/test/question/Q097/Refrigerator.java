package com.test.question.Q097;

public class Refrigerator {

	private Item[] items = new Item[100];

	public void add(Item item) {
		for(int i=0 ; i<this.items.length ; i++) {
			if(this.items[i] == null) {
				this.items[i] = item;
				System.out.printf("'%s'를 냉장고에 넣었습니다.\n", this.items[i].getName());
				break;
			}
		}
	}

	public Item get(String name) {
		for(int i=0;i<this.items.length;i++) {
			if(this.items[i].getName() == name) {
				Item tmp = this.items[i];
				//땡기기구현하기
				int c = this.count();
				int j=i;
				for(j=i;j<c;j++) {
					this.items[j]=this.items[j+1];
				}
				this.items[j] = null;
				
				return tmp;
			}
		}
		return null;
	}

	public int count() {
		int cnt = 0;
		for(int i=0;i<this.items.length;i++) {
			if(this.items[i] != null) {
				cnt++;
			}
		}
		return cnt;
	}

	public void listItem() {
		System.out.println("[냉장고 아이템 목록]");
		for(int i=0;i<this.items.length;i++) {
			if(this.items[i] != null) {
				System.out.printf("%s(%s)\n", this.items[i].getName(), this.items[i].getExpiration());
			}
		}
	}

}
