package tunnel.sdk.struct.imos;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

/**
 * <i>native declaration : sdk_struct.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class TagCruisePlanInfoV2 extends Structure {
	/** C type : CRUISE_PLAN_BASE_S */
	public TagCruisePlanBase stCruiseBaseInfo;
	/** C type : PLAN_CRUISE_TIME_FOR_RES_S */
	public TagCruisePlanTimeForRes stCruiseTimeInfo;
	public TagCruisePlanInfoV2() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("stCruiseBaseInfo", "stCruiseTimeInfo");
	}
	/**
	 * @param stCruiseBaseInfo C type : CRUISE_PLAN_BASE_S<br>
	 * @param stCruiseTimeInfo C type : PLAN_CRUISE_TIME_FOR_RES_S
	 */
	public TagCruisePlanInfoV2(TagCruisePlanBase stCruiseBaseInfo, TagCruisePlanTimeForRes stCruiseTimeInfo) {
		super();
		this.stCruiseBaseInfo = stCruiseBaseInfo;
		this.stCruiseTimeInfo = stCruiseTimeInfo;
	}
	public TagCruisePlanInfoV2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TagCruisePlanInfoV2 implements Structure.ByReference {
		
	};
	public static class ByValue extends TagCruisePlanInfoV2 implements Structure.ByValue {
		
	};
}
