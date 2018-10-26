import java.util.ArrayList;

public class DisplayAvg implements Observerint, Display {
	private ArrayList<Float> avgtemp = new ArrayList<>();
	private String name;
	private static long cnt;
	private Observableint obs;
	private long id;

	public DisplayAvg(WeatherStationObservable wso, String name) {
		this.name = name;
		this.obs = wso;
		this.id = ++cnt;

		obs.add(this);
		System.out.println("New Observer created! --> Name " + name + " Id: " + id);

	}

	@Override
	public void display() {
		System.out.println();
		System.out.println("Name: " + name + " Id: " + id);
		System.out.println("AVG temp is: " + calcAVG());
	
	}

	@Override
	public void update() {
		avgtemp.add(((WeatherStationObservable) obs).getTemp());
		display();
	}

	private float calcAVG() {
		float total = 0;
		float avg;
		for (int i = 0; i < avgtemp.size(); i++)
			total = total + avgtemp.get(i);
		avg = total / avgtemp.size();

		return avg;
	}

}
