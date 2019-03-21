package tunnel.sdk.struct.hw;
import com.sun.jna.NativeLong;
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
public class PU_GAIN_CONTROL extends Structure {
	/**
	 * \u673a\u82af\u589e\u76ca\u63a7\u5236\u5f00\u5173(\u5173\u95ed\u3001\u6253\u5f00)<br>
	 * C type : PU_COMMONMODE_SWITCH_E
	 */
	public int enGainSwitch;
	/**
	 * \u673a\u82af\u589e\u76ca\u7c7b\u578b<br>
	 * C type : PU_GAIN_TYPE_E
	 */
	public int enGainType;
	/** \u589e\u76ca\u503c */
	public NativeLong ulGainValue;
	/** C type : CHAR[32] */
	public byte[] szReserve = new byte[32];
	public PU_GAIN_CONTROL() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("enGainSwitch", "enGainType", "ulGainValue", "szReserve");
	}
	/**
	 * @param enGainSwitch \u673a\u82af\u589e\u76ca\u63a7\u5236\u5f00\u5173(\u5173\u95ed\u3001\u6253\u5f00)<br>
	 * C type : PU_COMMONMODE_SWITCH_E<br>
	 * @param enGainType \u673a\u82af\u589e\u76ca\u7c7b\u578b<br>
	 * C type : PU_GAIN_TYPE_E<br>
	 * @param ulGainValue \u589e\u76ca\u503c<br>
	 * @param szReserve C type : CHAR[32]
	 */
	public PU_GAIN_CONTROL(int enGainSwitch, int enGainType, NativeLong ulGainValue, byte szReserve[]) {
		super();
		this.enGainSwitch = enGainSwitch;
		this.enGainType = enGainType;
		this.ulGainValue = ulGainValue;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public PU_GAIN_CONTROL(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_GAIN_CONTROL implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_GAIN_CONTROL implements Structure.ByValue {
		
	};
}
