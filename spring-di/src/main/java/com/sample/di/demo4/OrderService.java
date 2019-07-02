package com.sample.di.demo4;

public class OrderService {
	
	private Messenger messenger;		// 어떤 타입이 올지 모르기 때문에 인터페이스인 Messenger를 적는다
	public void setMessenger(Messenger messenger) {
		this.messenger = messenger;
	}

	public void sendOrderStatus() {
		messenger.sendMessage("010-1111-1111", "발송준비중...");
	}
}
