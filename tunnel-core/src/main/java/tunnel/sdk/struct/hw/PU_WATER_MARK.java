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
public class PU_WATER_MARK extends Structure {
	/**
	 * \u901a\u7528\u4e8b\u4ef6<br>
	 * C type : PU_EVENT_COMMON_S
	 */
	public PU_EVENT_COMMON stPuEventCommon;
	/**
	 * \u544a\u8b66\u53d1\u751f/\u6d88\u9664<br>
	 * C type : PU_ALARM_ACTION_E
	 */
	public int enAction;
	public PU_WATER_MARK() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("stPuEventCommon", "enAction");
	}
	/**
	 * @param stPuEventCommon \u901a\u7528\u4e8b\u4ef6<br>
	 * C type : PU_EVENT_COMMON_S<br>
	 * @param enAction \u544a\u8b66\u53d1\u751f/\u6d88\u9664<br>
	 * C type : PU_ALARM_ACTION_E
	 */
	public PU_WATER_MARK(PU_EVENT_COMMON stPuEventCommon, int enAction) {
		super();
		this.stPuEventCommon = stPuEventCommon;
		this.enAction = enAction;
	}
	public PU_WATER_MARK(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_WATER_MARK implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_WATER_MARK implements Structure.ByValue {
		
	};
}
