package ch09;

public class Chatting {
	void startChar(String chatId) {
		String nickName = chatId;
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "æ»≥Á«œººø‰";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
}
