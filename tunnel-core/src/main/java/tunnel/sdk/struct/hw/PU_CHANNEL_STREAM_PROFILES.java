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
public class PU_CHANNEL_STREAM_PROFILES extends Structure {
	/** \u901a\u9053ID */
	public NativeLong ulChannelID;
	/**
	 * \u64cd\u4f5c\u7c7b\u578b<br>
	 * C type : PU_STREAM_MANIPULATE_TYPE_E
	 */
	public int enStreamOptionType;
	/**
	 * \u7801\u6d41\u5957\u9910\u53c2\u6570<br>
	 * C type : PU_STREAM_PROFILES_PARA_S
	 */
	public PU_STREAM_PROFILES_PARA stStreamProfilesPara;
	/**
	 * \u9884\u7559<br>
	 * C type : CHAR[32]
	 */
	public byte[] szReserve = new byte[32];
	public PU_CHANNEL_STREAM_PROFILES() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelID", "enStreamOptionType", "stStreamProfilesPara", "szReserve");
	}
	/**
	 * @param ulChannelID \u901a\u9053ID<br>
	 * @param enStreamOptionType \u64cd\u4f5c\u7c7b\u578b<br>
	 * C type : PU_STREAM_MANIPULATE_TYPE_E<br>
	 * @param stStreamProfilesPara \u7801\u6d41\u5957\u9910\u53c2\u6570<br>
	 * C type : PU_STREAM_PROFILES_PARA_S<br>
	 * @param szReserve \u9884\u7559<br>
	 * C type : CHAR[32]
	 */
	public PU_CHANNEL_STREAM_PROFILES(NativeLong ulChannelID, int enStreamOptionType, PU_STREAM_PROFILES_PARA stStreamProfilesPara, byte szReserve[]) {
		super();
		this.ulChannelID = ulChannelID;
		this.enStreamOptionType = enStreamOptionType;
		this.stStreamProfilesPara = stStreamProfilesPara;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public PU_CHANNEL_STREAM_PROFILES(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_CHANNEL_STREAM_PROFILES implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_CHANNEL_STREAM_PROFILES implements Structure.ByValue {
		
	};
}
