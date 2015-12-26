package eu.tavsanli.remoteejbimpl;

import eu.tavsanli.remoteejpapi.WeatherStation;

import javax.ejb.Stateless;

@Stateless
public class WeatherStationBean implements WeatherStation {
    @Override
    public Double getTemperature() {
        return 95.0;
    }
}
