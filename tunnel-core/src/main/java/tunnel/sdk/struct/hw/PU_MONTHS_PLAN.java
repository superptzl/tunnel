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
public class PU_MONTHS_PLAN extends Structure {
	/** \u5bf9\u5e94\u6708\u4efd\uff0c\u5982\u679c\u4e3a0\u8868\u793a12\u4e2a\u6708\u4efd\u5168\u9700\u8981\u8bbe\u7f6e\uff0c1~12\u8868\u5bf9\u5e94\u7684\u6708\u4efd\u9700\u8981\u4fdd\u5b58 */
	public NativeLong ulMonth;
	/** \u4f7f\u80fd\u4e0e\u5426 */
	public boolean bEnable;
	/** C type : PU_TIME_QUANTUM_LIST_S[12] */
	public PU_TIME_QUANTUM_LIST[] stTimeQaumtumMonths = new PU_TIME_QUANTUM_LIST[12];
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_MONTHS_PLAN() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulMonth", "bEnable", "stTimeQaumtumMonths", "szReserved");
	}
	/**
	 * @param ulMonth \u5bf9\u5e94\u6708\u4efd\uff0c\u5982\u679c\u4e3a0\u8868\u793a12\u4e2a\u6708\u4efd\u5168\u9700\u8981\u8bbe\u7f6e\uff0c1~12\u8868\u5bf9\u5e94\u7684\u6708\u4efd\u9700\u8981\u4fdd\u5b58<br>
	 * @param bEnable \u4f7f\u80fd\u4e0e\u5426<br>
	 * @param stTimeQaumtumMonths C type : PU_TIME_QUANTUM_LIST_S[12]<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_MONTHS_PLAN(NativeLong ulMonth, boolean bEnable, PU_TIME_QUANTUM_LIST stTimeQaumtumMonths[], byte szReserved[]) {
		super();
		this.ulMonth = ulMonth;
		this.bEnable = bEnable;
		if ((stTimeQaumtumMonths.length != this.stTimeQaumtumMonths.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.stTimeQaumtumMonths = stTimeQaumtumMonths;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_MONTHS_PLAN(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_MONTHS_PLAN implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_MONTHS_PLAN implements Structure.ByValue {
		
	};
}
