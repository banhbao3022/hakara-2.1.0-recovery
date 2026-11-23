package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class aw0 {

    /* JADX INFO: renamed from: a */
    public static final SparseArray<iu2> f12466a;

    /* JADX INFO: renamed from: b */
    public final Context f12467b;

    /* JADX INFO: renamed from: c */
    public final o50 f12468c;

    /* JADX INFO: renamed from: d */
    public final TelephonyManager f12469d;

    /* JADX INFO: renamed from: e */
    public final tv0 f12470e;

    /* JADX INFO: renamed from: f */
    public final pv0 f12471f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2305w0 f12472g;

    /* JADX INFO: renamed from: h */
    public lt2 f12473h;

    static {
        SparseArray<iu2> sparseArray = new SparseArray<>();
        f12466a = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), iu2.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        iu2 iu2Var = iu2.CONNECTING;
        sparseArray.put(iOrdinal, iu2Var);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), iu2Var);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), iu2Var);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), iu2.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        iu2 iu2Var2 = iu2.DISCONNECTED;
        sparseArray.put(iOrdinal2, iu2Var2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), iu2Var2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), iu2Var2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), iu2Var2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), iu2Var2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), iu2.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), iu2Var);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), iu2Var);
    }

    public aw0(Context context, o50 o50Var, tv0 tv0Var, pv0 pv0Var, InterfaceC2305w0 interfaceC2305w0) {
        this.f12467b = context;
        this.f12468c = o50Var;
        this.f12470e = tv0Var;
        this.f12471f = pv0Var;
        this.f12469d = (TelephonyManager) context.getSystemService("phone");
        this.f12472g = interfaceC2305w0;
    }

    /* JADX INFO: renamed from: a */
    public static final lt2 m5868a(boolean z) {
        return z ? lt2.ENUM_TRUE : lt2.ENUM_FALSE;
    }
}
