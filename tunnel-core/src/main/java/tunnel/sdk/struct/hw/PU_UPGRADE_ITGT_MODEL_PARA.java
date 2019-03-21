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
public class PU_UPGRADE_ITGT_MODEL_PARA extends Structure {
	/**
	 * \u667a\u80fd\u5347\u7ea7\u5305\u7c7b\u578b<br>
	 * C type : PU_UPGRADE_ITGT_TYPE_E
	 */
	public int enUpgradeItgtType;
	/**
	 * \u667a\u80fd\u5347\u7ea7\u5305\u8def\u5f84<br>
	 * C type : CHAR[300]
	 */
	public byte[] szModelPath = new byte[300];
	/** C type : CHAR[32] */
	public byte[] szReserve = new byte[32];
	public PU_UPGRADE_ITGT_MODEL_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("enUpgradeItgtType", "szModelPath", "szReserve");
	}
	/**
	 * @param enUpgradeItgtType \u667a\u80fd\u5347\u7ea7\u5305\u7c7b\u578b<br>
	 * C type : PU_UPGRADE_ITGT_TYPE_E<br>
	 * @param szModelPath \u667a\u80fd\u5347\u7ea7\u5305\u8def\u5f84<br>
	 * C type : CHAR[300]<br>
	 * @param szReserve C type : CHAR[32]
	 */
	public PU_UPGRADE_ITGT_MODEL_PARA(int enUpgradeItgtType, byte szModelPath[], byte szReserve[]) {
		super();
		this.enUpgradeItgtType = enUpgradeItgtType;
		if ((szModelPath.length != this.szModelPath.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szModelPath = szModelPath;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public PU_UPGRADE_ITGT_MODEL_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_UPGRADE_ITGT_MODEL_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_UPGRADE_ITGT_MODEL_PARA implements Structure.ByValue {
		
	};
}
