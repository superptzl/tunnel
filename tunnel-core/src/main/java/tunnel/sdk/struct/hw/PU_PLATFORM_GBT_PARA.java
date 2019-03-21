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
public class PU_PLATFORM_GBT_PARA extends Structure {
	public boolean bEnable;
	/** C type : CHAR[32] */
	public byte[] szLoginDomain = new byte[32];
	/**
	 * \u8bbe\u5907ID\u4e0e\u767b\u5f55\u540d\u76f8\u540c<br>
	 * C type : CHAR[32]
	 */
	public byte[] szLoginName = new byte[32];
	/**
	 * \u670d\u52a1\u5668\u7f16\u7801<br>
	 * C type : CHAR[32]
	 */
	public byte[] szPlatformId = new byte[32];
	/** C type : CHAR[32] */
	public byte[] szPassword = new byte[32];
	/** C type : CHAR[16] */
	public byte[] szServerIp = new byte[16];
	public NativeLong ulServerPort;
	/** C type : CHAR[32] */
	public byte[] szReserve = new byte[32];
	public PU_PLATFORM_GBT_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("bEnable", "szLoginDomain", "szLoginName", "szPlatformId", "szPassword", "szServerIp", "ulServerPort", "szReserve");
	}
	/**
	 * @param szLoginDomain C type : CHAR[32]<br>
	 * @param szLoginName \u8bbe\u5907ID\u4e0e\u767b\u5f55\u540d\u76f8\u540c<br>
	 * C type : CHAR[32]<br>
	 * @param szPlatformId \u670d\u52a1\u5668\u7f16\u7801<br>
	 * C type : CHAR[32]<br>
	 * @param szPassword C type : CHAR[32]<br>
	 * @param szServerIp C type : CHAR[16]<br>
	 * @param szReserve C type : CHAR[32]
	 */
	public PU_PLATFORM_GBT_PARA(boolean bEnable, byte szLoginDomain[], byte szLoginName[], byte szPlatformId[], byte szPassword[], byte szServerIp[], NativeLong ulServerPort, byte szReserve[]) {
		super();
		this.bEnable = bEnable;
		if ((szLoginDomain.length != this.szLoginDomain.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szLoginDomain = szLoginDomain;
		if ((szLoginName.length != this.szLoginName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szLoginName = szLoginName;
		if ((szPlatformId.length != this.szPlatformId.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szPlatformId = szPlatformId;
		if ((szPassword.length != this.szPassword.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szPassword = szPassword;
		if ((szServerIp.length != this.szServerIp.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szServerIp = szServerIp;
		this.ulServerPort = ulServerPort;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public PU_PLATFORM_GBT_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_PLATFORM_GBT_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_PLATFORM_GBT_PARA implements Structure.ByValue {
		
	};
}
