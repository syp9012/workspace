package remote;

public class Remote {
	
	int channel;
	int volume;
	int volume2;
	boolean mute;
	
//	int chChange(int channel) {
//		this.channel = channel;
//		return channel;
//	}
//	
//	void chUp() {
//		++channel;
//	}
//	
//	void chDw() {
//		if(--channel <= 0) {
//			channel = 999;
//		} else {
//			--channel;
//		};
//	}
	
	void volumeUp() {
		if(mute) {
			volume = ++volume2;
			mute = false;
		}else {
			++volume;
		}
		System.out.println("volume은 " + volume);
	}
	
	void volumeDown() {
		if(mute) {
			volume = --volume2;
			mute = false;
		}else {
			--volume;
		}
		System.out.println("volume은 " + volume);
	}
	
	void mute() {
		if(mute) {
			volume = volume2;
			System.out.println("음소거를 해제합니다. volume은 " + volume );
			mute = false; 
		} else {
			volume2 = volume;
			volume = 0;
			System.out.println("음소거 입니다. " + "volume은 " + volume );
			mute = true;
		}
	}	
		
	
}
