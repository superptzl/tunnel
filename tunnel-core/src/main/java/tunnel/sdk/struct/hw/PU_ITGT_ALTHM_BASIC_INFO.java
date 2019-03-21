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
public class PU_ITGT_ALTHM_BASIC_INFO extends Structure {
	/**
	 * \u7b97\u6cd5\u7c7b\u578b<br>
	 * C type : PU_ITGT_TYPE_E
	 */
	public int enAlthmType;
	/**
	 * \u7b97\u6cd5\u63a7\u5236\u72b6\u6001<br>
	 * C type : PU_ITGT_LIC_STATUS_E
	 */
	public int enAlthmStatus;
	/** \u7b97\u6cd5\u662f\u5426\u542f\u7528 0\uff1a\u5173\u95ed 1:\u542f\u7528 */
	public boolean bEnableAlthm;
	/**
	 * \u7b97\u6cd5\u7248\u672c<br>
	 * C type : CHAR[48]
	 */
	public byte[] szAlthmVer = new byte[48];
	/**
	 * \u7b97\u6cd5\u5382\u5bb6<br>
	 * C type : CHAR[48]
	 */
	public byte[] szAlthmOwner = new byte[48];
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_ITGT_ALTHM_BASIC_INFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("enAlthmType", "enAlthmStatus", "bEnableAlthm", "szAlthmVer", "szAlthmOwner", "szReserved");
	}
	/**
	 * @param enAlthmType \u7b97\u6cd5\u7c7b\u578b<br>
	 * C type : PU_ITGT_TYPE_E<br>
	 * @param enAlthmStatus \u7b97\u6cd5\u63a7\u5236\u72b6\u6001<br>
	 * C type : PU_ITGT_LIC_STATUS_E<br>
	 * @param bEnableAlthm \u7b97\u6cd5\u662f\u5426\u542f\u7528 0\uff1a\u5173\u95ed 1:\u542f\u7528<br>
	 * @param szAlthmVer \u7b97\u6cd5\u7248\u672c<br>
	 * C type : CHAR[48]<br>
	 * @param szAlthmOwner \u7b97\u6cd5\u5382\u5bb6<br>
	 * C type : CHAR[48]<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_ITGT_ALTHM_BASIC_INFO(int enAlthmType, int enAlthmStatus, boolean bEnableAlthm, byte szAlthmVer[], byte szAlthmOwner[], byte szReserved[]) {
		super();
		this.enAlthmType = enAlthmType;
		this.enAlthmStatus = enAlthmStatus;
		this.bEnableAlthm = bEnableAlthm;
		if ((szAlthmVer.length != this.szAlthmVer.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szAlthmVer = szAlthmVer;
		if ((szAlthmOwner.length != this.szAlthmOwner.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szAlthmOwner = szAlthmOwner;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_ITGT_ALTHM_BASIC_INFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_ITGT_ALTHM_BASIC_INFO implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_ITGT_ALTHM_BASIC_INFO implements Structure.ByValue {
		
	};
}