package p007c.p190n.p194b.p266d.p314j.p315a;

import com.facebook.stetho.common.Utf8Charset;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wf2 {

    /* JADX INFO: renamed from: a */
    public final pe2 f21071a;

    /* JADX INFO: renamed from: b */
    public final String f21072b;

    /* JADX INFO: renamed from: c */
    public final String f21073c;

    /* JADX INFO: renamed from: e */
    public final Class<?>[] f21075e;

    /* JADX INFO: renamed from: d */
    public volatile Method f21074d = null;

    /* JADX INFO: renamed from: f */
    public final CountDownLatch f21076f = new CountDownLatch(1);

    public wf2(pe2 pe2Var, String str, String str2, Class<?>... clsArr) {
        this.f21071a = pe2Var;
        this.f21072b = str;
        this.f21073c = str2;
        this.f21075e = clsArr;
        pe2Var.f17948c.submit(new vf2(this));
    }

    /* JADX INFO: renamed from: a */
    public final String m8640a(byte[] bArr, String str) throws UnsupportedEncodingException, td2 {
        return new String(this.f21071a.f17950e.m8487b(bArr, str), Utf8Charset.NAME);
    }
}
