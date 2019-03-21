package tunnel.sdk.struct.hw;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : D:\HWPuSDK.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class PU_ALARM_REC_INFO extends Structure {
	/**
	 * \u5f55\u50cf\u5bf9\u5e94\u544a\u8b66\u4fe1\u606f<br>
	 * C type : PU_ALARM_REPORT_S
	 */
	public PU_ALARM_REPORT stAlarmReport;
	/**
	 * \u5f55\u50cf\u8d77\u59cb\u65f6\u95f4(UTC\u65f6\u95f4)<br>
	 * C type : PU_TIME_S
	 */
	public PU_TIME stBeginTime;
	/**
	 * \u5f55\u50cf\u7ed3\u675f\u65f6\u95f4(UTC\u65f6\u95f4)<br>
	 * C type : PU_TIME_S
	 */
	public PU_TIME stEndTime;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_ALARM_REC_INFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("stAlarmReport", "stBeginTime", "stEndTime", "szReserved");
	}
	/**
	 * @param stAlarmReport \u5f55\u50cf\u5bf9\u5e94\u544a\u8b66\u4fe1\u606f<br>
	 * C type : PU_ALARM_REPORT_S<br>
	 * @param stBeginTime \u5f55\u50cf\u8d77\u59cb\u65f6\u95f4(UTC\u65f6\u95f4)<br>
	 * C type : PU_TIME_S<br>
	 * @param stEndTime \u5f55\u50cf\u7ed3\u675f\u65f6\u95f4(UTC\u65f6\u95f4)<br>
	 * C type : PU_TIME_S<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_ALARM_REC_INFO(PU_ALARM_REPORT stAlarmReport, PU_TIME stBeginTime, PU_TIME stEndTime, byte szReserved[]) {
		super();
		this.stAlarmReport = stAlarmReport;
		this.stBeginTime = stBeginTime;
		this.stEndTime = stEndTime;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_ALARM_REC_INFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_ALARM_REC_INFO implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_ALARM_REC_INFO implements Structure.ByValue {
		
	};
}