import java.util.ArrayList;

public class WeatherStationObservable implements Observableint {
	private  float temp;
	private  float press;
	private  float humid;
	private ArrayList<Observerint> observers = new ArrayList<>();

	public WeatherStationObservable() {

	}

	public void setStateData(float temp, float press, float humid) {
		this.temp = temp;
		this.press = press;
		this.humid = humid;

		stateChanged();
	}

	@Override
	public void add(Observerint o) {
		observers.add(o);

	}

	@Override
	public void remove(Observerint o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(o);
			System.out.println();
			System.out.println("Obsever "+(i+1)+ " removed!");
		}
		

	}

	@Override
	public void notifyOb() {

		for (Observerint o : observers) {
			o.update();

		}

	}

	public void stateChanged() {

		notifyOb();
	}

	public float getTemp() {
		return temp;
	}

	public float getPress() {
		return press;
	}

	public float getHumid() {
		return humid;
	}

}
