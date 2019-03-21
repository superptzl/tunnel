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
public class PU_ITS_BUSINESS_TYPE_PARA extends Structure {
	/** \u901a\u9053ID */
	public NativeLong ulChannelID;
	/**
	 * ITS\u4e1a\u52a1\u7c7b\u578b<br>
	 * C type : EN_ITS_TYPE
	 */
	public int enITSBusinessType;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_ITS_BUSINESS_TYPE_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelID", "enITSBusinessType", "szReserved");
	}
	/**
	 * @param ulChannelID \u901a\u9053ID<br>
	 * @param enITSBusinessType ITS\u4e1a\u52a1\u7c7b\u578b<br>
	 * C type : EN_ITS_TYPE<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_ITS_BUSINESS_TYPE_PARA(NativeLong ulChannelID, int enITSBusinessType, byte szReserved[]) {
		super();
		this.ulChannelID = ulChannelID;
		this.enITSBusinessType = enITSBusinessType;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_ITS_BUSINESS_TYPE_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_ITS_BUSINESS_TYPE_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_ITS_BUSINESS_TYPE_PARA implements Structure.ByValue {
		
	};
}
