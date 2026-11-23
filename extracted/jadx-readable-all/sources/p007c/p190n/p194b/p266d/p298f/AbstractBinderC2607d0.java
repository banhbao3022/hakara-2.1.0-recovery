package p007c.p190n.p194b.p266d.p298f;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractBinderC2737i1;
import p007c.p190n.p194b.p266d.p298f.p302q.InterfaceC2740j1;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.f.d0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2607d0 extends AbstractBinderC2737i1 {

    /* JADX INFO: renamed from: g */
    public final int f11561g;

    public AbstractBinderC2607d0(byte[] bArr) {
        C2622l.m5339a(bArr.length == 25);
        this.f11561g = Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: T1 */
    public static byte[] m5199T1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.InterfaceC2740j1
    /* JADX INFO: renamed from: c */
    public final int mo5200c() {
        return this.f11561g;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.InterfaceC2740j1
    /* JADX INFO: renamed from: e */
    public final InterfaceC2799a mo5201e() {
        return new BinderC2800b(mo5202i1());
    }

    public final boolean equals(Object obj) {
        InterfaceC2799a interfaceC2799aMo5201e;
        if (obj != null && (obj instanceof InterfaceC2740j1)) {
            try {
                InterfaceC2740j1 interfaceC2740j1 = (InterfaceC2740j1) obj;
                if (interfaceC2740j1.mo5200c() == this.f11561g && (interfaceC2799aMo5201e = interfaceC2740j1.mo5201e()) != null) {
                    return Arrays.equals(mo5202i1(), (byte[]) BinderC2800b.m5639T1(interfaceC2799aMo5201e));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11561g;
    }

    /* JADX INFO: renamed from: i1 */
    public abstract byte[] mo5202i1();
}
