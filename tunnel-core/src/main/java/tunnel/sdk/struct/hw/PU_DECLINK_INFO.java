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
public class PU_DECLINK_INFO extends Structure {
	/**
	 * \u89c6\u9891IP\u5730\u5740<br>
	 * C type : CHAR[40]
	 */
	public byte[] szDecVIP = new byte[40];
	/** \u89c6\u9891\u7aef\u53e3 */
	public NativeLong ulDecVPort;
	/**
	 * \u97f3\u9891IP\u5730\u5740<br>
	 * C type : CHAR[40]
	 */
	public byte[] szDecAIP = new byte[40];
	/** \u97f3\u9891\u7aef\u53e3 */
	public NativeLong ulDecAPort;
	/** \u4f20\u8f93\u534f\u8bae: 1:RTP(TCP Client) 2:RTP(UDP) ...  \u97f3\u9891\u89c6\u9891\u89e3\u7801\u9700\u76f8\u540c,\u5f53TCP\u65f6\uff0c\u4ee5\u4e0aIP\u3001PORT\u4e3a\u5165\u53c2\uff0c\u5f53UDP\u65f6\uff0cIP\u3001PORT\u4e3a\u51fa\u53c2 */
	public byte chTransProtocol;
	/** \u89e3\u7801\u6807\u5fd7\uff1a0 \u4ec5\u89e3\u89c6\u9891; 1 \u4ec5\u89e3\u97f3\u9891; 2 \u540c\u65f6\u89e3,\u540c\u65f6\u89e3\u65f6\u4f7f\u7528VIP\u53caVPORT\u5373\u53ef */
	public byte chDecFlags;
	/** \u4fdd\u6d3b\u6807\u5fd7,\u5728VIP/VPort \u53d1\u9001RTSP\u4fdd\u6d3b\u4fe1\u4ee4: 0 \u4e0d\u4fdd\u6d3b,1 \u4fdd\u6d3b */
	public byte chKeepaliveFlags;
	/**
	 * \u9884\u7559,\u901a\u8fc7sdk\u53d1\u6d41:szRes[0]= 0;sdk\u5efa\u7acb\u4fe1\u4ee4\uff0c\u8c03\u7528\u8005\u76f4\u63a5\u53d1\u6d41:szRes[0]=1<br>
	 * C type : CHAR[32]
	 */
	public byte[] szRes = new byte[32];
	public PU_DECLINK_INFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szDecVIP", "ulDecVPort", "szDecAIP", "ulDecAPort", "chTransProtocol", "chDecFlags", "chKeepaliveFlags", "szRes");
	}
	/**
	 * @param szDecVIP \u89c6\u9891IP\u5730\u5740<br>
	 * C type : CHAR[40]<br>
	 * @param ulDecVPort \u89c6\u9891\u7aef\u53e3<br>
	 * @param szDecAIP \u97f3\u9891IP\u5730\u5740<br>
	 * C type : CHAR[40]<br>
	 * @param ulDecAPort \u97f3\u9891\u7aef\u53e3<br>
	 * @param chTransProtocol \u4f20\u8f93\u534f\u8bae: 1:RTP(TCP Client) 2:RTP(UDP) ...  \u97f3\u9891\u89c6\u9891\u89e3\u7801\u9700\u76f8\u540c,\u5f53TCP\u65f6\uff0c\u4ee5\u4e0aIP\u3001PORT\u4e3a\u5165\u53c2\uff0c\u5f53UDP\u65f6\uff0cIP\u3001PORT\u4e3a\u51fa\u53c2<br>
	 * @param chDecFlags \u89e3\u7801\u6807\u5fd7\uff1a0 \u4ec5\u89e3\u89c6\u9891; 1 \u4ec5\u89e3\u97f3\u9891; 2 \u540c\u65f6\u89e3,\u540c\u65f6\u89e3\u65f6\u4f7f\u7528VIP\u53caVPORT\u5373\u53ef<br>
	 * @param chKeepaliveFlags \u4fdd\u6d3b\u6807\u5fd7,\u5728VIP/VPort \u53d1\u9001RTSP\u4fdd\u6d3b\u4fe1\u4ee4: 0 \u4e0d\u4fdd\u6d3b,1 \u4fdd\u6d3b<br>
	 * @param szRes \u9884\u7559,\u901a\u8fc7sdk\u53d1\u6d41:szRes[0]= 0;sdk\u5efa\u7acb\u4fe1\u4ee4\uff0c\u8c03\u7528\u8005\u76f4\u63a5\u53d1\u6d41:szRes[0]=1<br>
	 * C type : CHAR[32]
	 */
	public PU_DECLINK_INFO(byte szDecVIP[], NativeLong ulDecVPort, byte szDecAIP[], NativeLong ulDecAPort, byte chTransProtocol, byte chDecFlags, byte chKeepaliveFlags, byte szRes[]) {
		super();
		if ((szDecVIP.length != this.szDecVIP.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szDecVIP = szDecVIP;
		this.ulDecVPort = ulDecVPort;
		if ((szDecAIP.length != this.szDecAIP.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szDecAIP = szDecAIP;
		this.ulDecAPort = ulDecAPort;
		this.chTransProtocol = chTransProtocol;
		this.chDecFlags = chDecFlags;
		this.chKeepaliveFlags = chKeepaliveFlags;
		if ((szRes.length != this.szRes.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szRes = szRes;
	}
	public PU_DECLINK_INFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_DECLINK_INFO implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_DECLINK_INFO implements Structure.ByValue {
		
	};
}
