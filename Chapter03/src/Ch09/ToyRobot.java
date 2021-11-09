package Ch09;

// ¥Ÿ¡ﬂ¿Œ≈Õ∆‰¿ÃΩ∫
public class ToyRobot implements RemoteController, SoundEffect{

	String name;
	
	public ToyRobot() {
		this.name = "∞«¥„∑Œ∫ø";
	}
	
	@Override
	public void turnOn() {
		System.out.println("¿Â≥≠∞® ∑Œ∫ø¿ª ƒ’¥œ¥Ÿ");
	}

	@Override
	public void turnOff() {
		System.out.println("¿Â≥≠∞® ∑Œ∫ø¿ª ≤¸¥œ¥Ÿ");
		
	}

	@Override
	public void notification() {
		System.out.println("ªﬂ∫Úªﬂ∫Ú....");
	}
	
}
