package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.RemoteException;
import org.json.JSONException;

/* JADX INFO: renamed from: c.n.b.d.j.a.nf */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3323nf extends hg2 implements InterfaceC3360of {
    public AbstractBinderC3323nf() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            i31 i31Var = (i31) this;
            synchronized (i31Var) {
                if (!i31Var.f15086j) {
                    if (string == null) {
                        i31Var.m7193S("Adapter returned null signals");
                    } else {
                        try {
                            i31Var.f15085i.put("signals", string);
                        } catch (JSONException unused) {
                        }
                        i31Var.f15084h.m7286a(i31Var.f15085i);
                        i31Var.f15086j = true;
                    }
                }
            }
        } else if (i == 2) {
            ((i31) this).m7193S(parcel.readString());
        } else {
            if (i != 3) {
                return false;
            }
            yv2 yv2Var = (yv2) ig2.m7250a(parcel, yv2.CREATOR);
            i31 i31Var2 = (i31) this;
            synchronized (i31Var2) {
                if (!i31Var2.f15086j) {
                    try {
                        i31Var2.f15085i.put("signal_error", yv2Var.f22117g);
                    } catch (JSONException unused2) {
                    }
                    i31Var2.f15084h.m7286a(i31Var2.f15085i);
                    i31Var2.f15086j = true;
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
