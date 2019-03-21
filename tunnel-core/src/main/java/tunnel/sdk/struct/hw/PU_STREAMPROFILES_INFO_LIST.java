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
public class PU_STREAMPROFILES_INFO_LIST extends Structure {
	/** \u6d41\u5957\u9910\u4e2a\u6570 */
	public NativeLong ulStreamProfilesNum;
	/** \u5f53\u524d\u6fc0\u6d3b\u7684\u7801\u6d41\u5957\u9910 */
	public NativeLong ulStreamId;
	/**
	 * \u4fe1\u606f\u5217\u8868<br>
	 * C type : PU_STREAMPROFILES_INFO_S[8]
	 */
	public PU_STREAMPROFILES_INFO[] szStreamProfile = new PU_STREAMPROFILES_INFO[8];
	/**
	 * \u9884\u7559\u5b57\u6bb5<br>
	 * C type : CHAR[32]
	 */
	public byte[] szReserved = new byte[32];
	public PU_STREAMPROFILES_INFO_LIST() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulStreamProfilesNum", "ulStreamId", "szStreamProfile", "szReserved");
	}
	/**
	 * @param ulStreamProfilesNum \u6d41\u5957\u9910\u4e2a\u6570<br>
	 * @param ulStreamId \u5f53\u524d\u6fc0\u6d3b\u7684\u7801\u6d41\u5957\u9910<br>
	 * @param szStreamProfile \u4fe1\u606f\u5217\u8868<br>
	 * C type : PU_STREAMPROFILES_INFO_S[8]<br>
	 * @param szReserved \u9884\u7559\u5b57\u6bb5<br>
	 * C type : CHAR[32]
	 */
	public PU_STREAMPROFILES_INFO_LIST(NativeLong ulStreamProfilesNum, NativeLong ulStreamId, PU_STREAMPROFILES_INFO szStreamProfile[], byte szReserved[]) {
		super();
		this.ulStreamProfilesNum = ulStreamProfilesNum;
		this.ulStreamId = ulStreamId;
		if ((szStreamProfile.length != this.szStreamProfile.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szStreamProfile = szStreamProfile;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_STREAMPROFILES_INFO_LIST(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_STREAMPROFILES_INFO_LIST implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_STREAMPROFILES_INFO_LIST implements Structure.ByValue {
		
	};
}
