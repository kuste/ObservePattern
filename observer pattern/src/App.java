
public class App {

	public static void main(String[] args) {
		WeatherStationObservable wso = new WeatherStationObservable();

		MoblieObserver mob1 = new MoblieObserver(wso, "Nokia");
		MoblieObserver mob2 = new MoblieObserver(wso, "Motorola");
		DisplayAvg mob3 = new DisplayAvg(wso, "Samsung");

		wso.setStateData(12, 1020, 80);
		wso.setStateData(18, 1050, 60);
		wso.setStateData((float) 20.25, 1010, 50);

		wso.remove(mob1);
		
		wso.setStateData(12, 1020, 80);
		wso.setStateData(24, 1050, 65);
		wso.setStateData((float) 22.25, 1010, 50);
		
		
		
	}

}
