
public class MoblieObserver implements Observerint, Display {
	private String name;
	private float temp;
	private float hmd;
	private float prs;
	private static long cnt;
	private Observableint obs;
	private long id;

	public MoblieObserver(Observableint wso, String name) {
		this.obs = wso;
		this.id = ++cnt;

		obs.add(this);
		System.out.println("New Observer created! --> Name " + name + " Id: " + id);
		this.name = name;

	}

	@Override
	public void update() {

		temp = ((WeatherStationObservable) obs).getTemp();
		hmd = ((WeatherStationObservable) obs).getTemp();
		prs = ((WeatherStationObservable) obs).getTemp();

		display();

	}

	@Override
	public void display() {
		System.out.println();
		System.out.println("Name: " + name + " Id: " + id);
		System.out.println("Temp: " + temp + "C");
		System.out.println("Tlak: " + prs + "hPa");
		System.out.println("Vlaznost: " + hmd + "%");
		
	}

}
