package tunnel.sdk.struct.imos;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;
import static tunnel.sdk.constanst.IMOSDefLibrary.*;
/**
 * <i>native declaration : sdk_struct.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class tagPlanWeekTimeForResV2 extends Structure {
	/** C type : int */
	public int ulWeekDay;
	/** C type : int */
	public int ulTimeSliceNum;
	/** C type : TIME_SLICE_FOR_RES_S[IMOS_MAX_TIME_SLICE_NUM_V2] */
	public tagTimeSliceForRes[] astTimeInfo = new tagTimeSliceForRes[IMOS_MAX_TIME_SLICE_NUM_V2];
	public tagPlanWeekTimeForResV2() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulWeekDay", "ulTimeSliceNum", "astTimeInfo");
	}
	/**
	 * @param ulWeekDay C type : int<br>
	 * @param ulTimeSliceNum C type : int<br>
	 * @param astTimeInfo C type : TIME_SLICE_FOR_RES_S[IMOS_MAX_TIME_SLICE_NUM_V2]
	 */
	public tagPlanWeekTimeForResV2(int ulWeekDay, int ulTimeSliceNum, tagTimeSliceForRes astTimeInfo[]) {
		super();
		this.ulWeekDay = ulWeekDay;
		this.ulTimeSliceNum = ulTimeSliceNum;
		if ((astTimeInfo.length != this.astTimeInfo.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.astTimeInfo = astTimeInfo;
	}
	public tagPlanWeekTimeForResV2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagPlanWeekTimeForResV2 implements Structure.ByReference {
		
	};
	public static class ByValue extends tagPlanWeekTimeForResV2 implements Structure.ByValue {
		
	};
}
