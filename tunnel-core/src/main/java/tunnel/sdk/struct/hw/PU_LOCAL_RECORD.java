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
public class PU_LOCAL_RECORD extends Structure {
	/** \u5f55\u50cf\u901a\u9053 */
	public NativeLong ulChannelId;
	/** \u52a8\u4f5c\u6807\u5fd7 0 \u505c\u6b62 \u975e0 \u5f00\u59cb */
	public NativeLong ulAction;
	/**
	 * \u5f55\u50cf\u65b9\u5f0f<br>
	 * C type : PU_RECORD_TYPE_E
	 */
	public int enRecordType;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_LOCAL_RECORD() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelId", "ulAction", "enRecordType", "szReserved");
	}
	/**
	 * @param ulChannelId \u5f55\u50cf\u901a\u9053<br>
	 * @param ulAction \u52a8\u4f5c\u6807\u5fd7 0 \u505c\u6b62 \u975e0 \u5f00\u59cb<br>
	 * @param enRecordType \u5f55\u50cf\u65b9\u5f0f<br>
	 * C type : PU_RECORD_TYPE_E<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_LOCAL_RECORD(NativeLong ulChannelId, NativeLong ulAction, int enRecordType, byte szReserved[]) {
		super();
		this.ulChannelId = ulChannelId;
		this.ulAction = ulAction;
		this.enRecordType = enRecordType;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_LOCAL_RECORD(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_LOCAL_RECORD implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_LOCAL_RECORD implements Structure.ByValue {
		
	};
}
