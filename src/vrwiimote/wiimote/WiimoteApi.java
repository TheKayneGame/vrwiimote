package vrwiimote.wiimote;

import wiiusej.WiiUseApiManager;
import wiiusej.Wiimote;

public class WiimoteApi {
	
	public WiimoteApi() {
		super();
	}
	
	public void connect() {
		Wiimote[] wiimotes = WiiUseApiManager.getWiimotes(1, true);
        Wiimote wiimote = wiimotes[0];
        wiimote.activateMotionSensing();
        wiimote.addWiiMoteEventListeners(new WiimoteEventListener());
	}

}
