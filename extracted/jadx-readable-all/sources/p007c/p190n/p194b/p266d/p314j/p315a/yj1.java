package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yj1 implements wj1 {

    /* JADX INFO: renamed from: a */
    public final String f21905a;

    public yj1(String str) {
        this.f21905a = str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wj1
    public final boolean equals(Object obj) {
        if (obj instanceof yj1) {
            return this.f21905a.equals(((yj1) obj).f21905a);
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wj1
    public final int hashCode() {
        return this.f21905a.hashCode();
    }

    public final String toString() {
        return this.f21905a;
    }
}
