package p007c.p190n.p385d.p391l.p392e.p401p;

import com.facebook.stetho.common.Utf8Charset;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: c.n.d.l.e.p.a, reason: use source file name */
/* JADX INFO: compiled from: ByteString.java */
/* JADX INFO: loaded from: classes.dex */
public final class ByteString {

    /* JADX INFO: renamed from: a */
    public final byte[] f26910a;

    /* JADX INFO: renamed from: b */
    public volatile int f26911b = 0;

    public ByteString(byte[] bArr) {
        this.f26910a = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static ByteString m11984a(String str) {
        try {
            return new ByteString(str.getBytes(Utf8Charset.NAME));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        byte[] bArr = this.f26910a;
        int length = bArr.length;
        byte[] bArr2 = ((ByteString) obj).f26910a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.f26911b;
        if (i == 0) {
            byte[] bArr = this.f26910a;
            int length = bArr.length;
            for (byte b : bArr) {
                length = (length * 31) + b;
            }
            i = length == 0 ? 1 : length;
            this.f26911b = i;
        }
        return i;
    }
}
