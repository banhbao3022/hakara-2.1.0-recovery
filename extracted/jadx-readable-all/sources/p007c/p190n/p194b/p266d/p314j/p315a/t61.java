package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class t61 implements ha1<Bundle> {

    /* JADX INFO: renamed from: a */
    public final int f19780a;

    /* JADX INFO: renamed from: b */
    public final boolean f19781b;

    /* JADX INFO: renamed from: c */
    public final boolean f19782c;

    /* JADX INFO: renamed from: d */
    public final int f19783d;

    /* JADX INFO: renamed from: e */
    public final int f19784e;

    /* JADX INFO: renamed from: f */
    public final int f19785f;

    /* JADX INFO: renamed from: g */
    public final float f19786g;

    /* JADX INFO: renamed from: h */
    public final boolean f19787h;

    public t61(int i, boolean z, boolean z2, int i2, int i3, int i4, float f, boolean z3) {
        this.f19780a = i;
        this.f19781b = z;
        this.f19782c = z2;
        this.f19783d = i2;
        this.f19784e = i3;
        this.f19785f = i4;
        this.f19786g = f;
        this.f19787h = z3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5696d(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putInt("am", this.f19780a);
        bundle2.putBoolean("ma", this.f19781b);
        bundle2.putBoolean("sp", this.f19782c);
        bundle2.putInt("muv", this.f19783d);
        bundle2.putInt("rm", this.f19784e);
        bundle2.putInt("riv", this.f19785f);
        bundle2.putFloat("android_app_volume", this.f19786g);
        bundle2.putBoolean("android_app_muted", this.f19787h);
    }
}
