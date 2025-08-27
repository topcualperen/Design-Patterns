

class LightSystem {
	public void turnOnLight() {
		System.out.println("Işıklar açılıyor.");
	}
	public void turnOffLight() {
		System.out.println("Işıklar kapatılıyor.");
	}
}

class AirConditionSystem {
	public void turnOnAC() {
		System.out.println("Klima açılıyor.");
	}
	public void turnOffAC() {
		System.out.println("Klima kapatılıyor.");
	}
}

class SmartHomeSystem {
	private LightSystem lightSystem;
	private AirConditionSystem airConditionSystem;

	public SmartHomeSystem() {
		lightSystem = new LightSystem();
		airConditionSystem = new AirConditionSystem();
	}

	public void leaveHome() {
		lightSystem.turnOffLight();
		airConditionSystem.turnOffAC();
	}

	public void arriveHome() {
		lightSystem.turnOnLight();
		airConditionSystem.turnOnAC();
	}
}

public class Main {
	public static void main(String[] args){
		SmartHomeSystem smart = new SmartHomeSystem();
		smart.leaveHome();
		smart.arriveHome();
	}
}
