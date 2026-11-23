package p007c.p190n.p194b.p266d.p298f.p302q;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Scope;
import p007c.p190n.p194b.p266d.p298f.C2606d;
import p007c.p190n.p194b.p266d.p298f.C2610f;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.f.q.h */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2732h extends AbstractC2767a {

    @RecentlyNonNull
    public static final Parcelable.Creator<C2732h> CREATOR = new C2774z0();

    /* JADX INFO: renamed from: f */
    public final int f11860f;

    /* JADX INFO: renamed from: g */
    public final int f11861g;

    /* JADX INFO: renamed from: h */
    public int f11862h;

    /* JADX INFO: renamed from: i */
    public String f11863i;

    /* JADX INFO: renamed from: j */
    public IBinder f11864j;

    /* JADX INFO: renamed from: k */
    public Scope[] f11865k;

    /* JADX INFO: renamed from: l */
    public Bundle f11866l;

    /* JADX INFO: renamed from: m */
    public Account f11867m;

    /* JADX INFO: renamed from: n */
    public C2606d[] f11868n;

    /* JADX INFO: renamed from: o */
    public C2606d[] f11869o;

    /* JADX INFO: renamed from: p */
    public boolean f11870p;

    /* JADX INFO: renamed from: q */
    public int f11871q;

    /* JADX INFO: renamed from: r */
    public boolean f11872r;

    /* JADX INFO: renamed from: s */
    public final String f11873s;

    public C2732h(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C2606d[] c2606dArr, C2606d[] c2606dArr2, boolean z, int i4, boolean z2, String str2) {
        this.f11860f = i;
        this.f11861g = i2;
        this.f11862h = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f11863i = "com.google.android.gms";
        } else {
            this.f11863i = str;
        }
        if (i < 2) {
            Account accountMo5561a = null;
            if (iBinder != null) {
                InterfaceC2745m interfaceC2745mM5605i1 = InterfaceC2745m.a.m5605i1(iBinder);
                int i5 = BinderC2711a.f11783f;
                if (interfaceC2745mM5605i1 != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            accountMo5561a = interfaceC2745mM5605i1.mo5561a();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.f11867m = accountMo5561a;
        } else {
            this.f11864j = iBinder;
            this.f11867m = account;
        }
        this.f11865k = scopeArr;
        this.f11866l = bundle;
        this.f11868n = c2606dArr;
        this.f11869o = c2606dArr2;
        this.f11870p = z;
        this.f11871q = i4;
        this.f11872r = z2;
        this.f11873s = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        C2774z0.m5612a(this, parcel, i);
    }

    public C2732h(int i, String str) {
        this.f11860f = 6;
        this.f11862h = C2610f.f11567a;
        this.f11861g = i;
        this.f11870p = true;
        this.f11873s = str;
    }
}
