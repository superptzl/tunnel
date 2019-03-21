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
public class PU_UPGRADE_ITGT_FILE_INFO extends Structure {
	/**
	 * \u667a\u80fd\u7b97\u6cd5\u5347\u7ea7\u5305\u6a21\u578b\u4fe1\u606f<br>
	 * C type : PU_UPGRADE_ITGT_MODEL_PARA_S[16]
	 */
	public PU_UPGRADE_ITGT_MODEL_PARA[] astItgtModelPara = new PU_UPGRADE_ITGT_MODEL_PARA[16];
	/** C type : CHAR[32] */
	public byte[] szReserve = new byte[32];
	public PU_UPGRADE_ITGT_FILE_INFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("astItgtModelPara", "szReserve");
	}
	/**
	 * @param astItgtModelPara \u667a\u80fd\u7b97\u6cd5\u5347\u7ea7\u5305\u6a21\u578b\u4fe1\u606f<br>
	 * C type : PU_UPGRADE_ITGT_MODEL_PARA_S[16]<br>
	 * @param szReserve C type : CHAR[32]
	 */
	public PU_UPGRADE_ITGT_FILE_INFO(PU_UPGRADE_ITGT_MODEL_PARA astItgtModelPara[], byte szReserve[]) {
		super();
		if ((astItgtModelPara.length != this.astItgtModelPara.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.astItgtModelPara = astItgtModelPara;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public PU_UPGRADE_ITGT_FILE_INFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_UPGRADE_ITGT_FILE_INFO implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_UPGRADE_ITGT_FILE_INFO implements Structure.ByValue {
		
	};
}