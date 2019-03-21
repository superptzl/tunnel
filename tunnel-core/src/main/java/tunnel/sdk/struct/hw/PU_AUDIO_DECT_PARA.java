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
public class PU_AUDIO_DECT_PARA extends Structure {
	/** \u4f7f\u80fd */
	public boolean bEnable;
	/** \u7075\u654f\u5ea6 */
	public NativeLong ulSensitivity;
	/**
	 * \u9884\u7559\u5b57\u6bb5<br>
	 * C type : CHAR[32]
	 */
	public byte[] szReserve = new byte[32];
	public PU_AUDIO_DECT_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("bEnable", "ulSensitivity", "szReserve");
	}
	/**
	 * @param bEnable \u4f7f\u80fd<br>
	 * @param ulSensitivity \u7075\u654f\u5ea6<br>
	 * @param szReserve \u9884\u7559\u5b57\u6bb5<br>
	 * C type : CHAR[32]
	 */
	public PU_AUDIO_DECT_PARA(boolean bEnable, NativeLong ulSensitivity, byte szReserve[]) {
		super();
		this.bEnable = bEnable;
		this.ulSensitivity = ulSensitivity;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public PU_AUDIO_DECT_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_AUDIO_DECT_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_AUDIO_DECT_PARA implements Structure.ByValue {
		
	};
}
