package p007c.p190n.p385d.p421t;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: renamed from: c.n.d.t.m, reason: use source file name */
/* JADX INFO: compiled from: RandomFidGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public class RandomFidGenerator {

    /* JADX INFO: renamed from: a */
    public static final byte f27154a = Byte.parseByte("01110000", 2);

    /* JADX INFO: renamed from: b */
    public static final byte f27155b = Byte.parseByte("00001111", 2);

    /* JADX INFO: renamed from: a */
    public String m12113a() {
        UUID uuidRandomUUID = UUID.randomUUID();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[17]);
        byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
        byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        bArrArray[16] = bArrArray[0];
        bArrArray[0] = (byte) ((f27155b & bArrArray[0]) | f27154a);
        return new String(Base64.encode(bArrArray, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
