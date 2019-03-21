package tunnel.sdk.struct.hw;
import com.sun.jna.Pointer;
import com.sun.jna.Union;
/**
 * <i>native declaration : D:\HWPuSDK.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class tagITSRegulationCfgAttch extends Union {
	/**
	 * \u9884\u7559\uff0c\u5f53\u524d\u4e0d\u4f7f\u7528, \u95ef\u7ea2\u706f\u6293\u62cd\u53c2\u6570,\u5bf9\u5e94\u8fdd\u7ae0\u7c7b\u578bITS_REGULA_RUNNINGRED<br>
	 * C type : PU_ITS_RUNLIGHT_PARA_S
	 */
	public tagITSRunLightPara stRunningRed;
	/**
	 * \u538b\u7ebf,\u5bf9\u5e94\u8fdd\u7ae0\u7c7b\u578bITS_REGULA_OVER_LANE_LINE<br>
	 * C type : PU_ITS_REGULATION_CFG_ATTCH_PRESS_LINE_UNIT_S
	 */
	public tagITSRegulationCfgAttchPressLine stPressLine;
	/**
	 * \u673a\u5360\u975e,\u5bf9\u5e94\u8fdd\u7ae0\u7c7b\u578bITS_REGULA_MOTOR_IN_BICYCLE_LANE<br>
	 * C type : PU_ITS_REGULATION_CFG_ATTCH_INVADE_DRIVERWAY_UNIT_S
	 */
	public tagITSRegulationCfgAttchInvadeDriverWay stInvadeDriverWay;
	/**
	 * \u975e\u6cd5\u5360\u7528\u516c\u4ea4\u8f66\u9053,\u5bf9\u5e94\u8fdd\u7ae0\u7c7b\u578bITS_REGULA_OCCUPANCY_BUSLANE<br>
	 * C type : PU_ITS_REGULATION_CFG_ATTCH_INVADE_DRIVERWAY_UNIT_S
	 */
	public tagITSRegulationCfgAttchInvadeDriverWay stInvadeBusLane;
	/**
	 * \u9ec4\u7f51\u683c\u8fdd\u505c\u65f6\u95f4,\u5bf9\u5e94\u8fdd\u7ae0\u7c7b\u578bITS_REGULA_ILLEGAL_PARKING<br>
	 * C type : PU_ITS_REGULATION_CFG_ATTCH_INVADE_DRIVERWAY_UNIT_S
	 */
	public tagITSRegulationCfgAttchInvadeDriverWay stIllegalParkTime;
	public tagITSRegulationCfgAttch() {
		super();
	}
	/**
	 * @param stRunningRed \u9884\u7559\uff0c\u5f53\u524d\u4e0d\u4f7f\u7528, \u95ef\u7ea2\u706f\u6293\u62cd\u53c2\u6570,\u5bf9\u5e94\u8fdd\u7ae0\u7c7b\u578bITS_REGULA_RUNNINGRED<br>
	 * C type : PU_ITS_RUNLIGHT_PARA_S
	 */
	public tagITSRegulationCfgAttch(tagITSRunLightPara stRunningRed) {
		super();
		this.stRunningRed = stRunningRed;
		setType(tagITSRunLightPara.class);
	}
	/**
	 * @param stPressLine \u538b\u7ebf,\u5bf9\u5e94\u8fdd\u7ae0\u7c7b\u578bITS_REGULA_OVER_LANE_LINE<br>
	 * C type : PU_ITS_REGULATION_CFG_ATTCH_PRESS_LINE_UNIT_S
	 */
	public tagITSRegulationCfgAttch(tagITSRegulationCfgAttchPressLine stPressLine) {
		super();
		this.stPressLine = stPressLine;
		setType(tagITSRegulationCfgAttchPressLine.class);
	}
	/**
	 * @param stInvadeDriverWay_or_stInvadeBusLane_or_stIllegalParkTime \u673a\u5360\u975e,\u5bf9\u5e94\u8fdd\u7ae0\u7c7b\u578bITS_REGULA_MOTOR_IN_BICYCLE_LANE<br>
	 * C type : PU_ITS_REGULATION_CFG_ATTCH_INVADE_DRIVERWAY_UNIT_S, or \u975e\u6cd5\u5360\u7528\u516c\u4ea4\u8f66\u9053,\u5bf9\u5e94\u8fdd\u7ae0\u7c7b\u578bITS_REGULA_OCCUPANCY_BUSLANE<br>
	 * C type : PU_ITS_REGULATION_CFG_ATTCH_INVADE_DRIVERWAY_UNIT_S, or \u9ec4\u7f51\u683c\u8fdd\u505c\u65f6\u95f4,\u5bf9\u5e94\u8fdd\u7ae0\u7c7b\u578bITS_REGULA_ILLEGAL_PARKING<br>
	 * C type : PU_ITS_REGULATION_CFG_ATTCH_INVADE_DRIVERWAY_UNIT_S
	 */
	public tagITSRegulationCfgAttch(tagITSRegulationCfgAttchInvadeDriverWay stInvadeDriverWay_or_stInvadeBusLane_or_stIllegalParkTime) {
		super();
		this.stIllegalParkTime = this.stInvadeBusLane = this.stInvadeDriverWay = stInvadeDriverWay_or_stInvadeBusLane_or_stIllegalParkTime;
		setType(tagITSRegulationCfgAttchInvadeDriverWay.class);
	}
	public tagITSRegulationCfgAttch(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagITSRegulationCfgAttch implements com.sun.jna.Structure.ByReference {
		
	};
	public static class ByValue extends tagITSRegulationCfgAttch implements com.sun.jna.Structure.ByValue {
		
	};
}
