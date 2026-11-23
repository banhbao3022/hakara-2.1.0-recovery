package p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.d.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2338b {

    /* JADX INFO: renamed from: a */
    public int f10935a = 1;

    /* JADX INFO: renamed from: a */
    public C2338b m4910a(Object obj) {
        this.f10935a = (31 * this.f10935a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C2338b m4911b(boolean z) {
        this.f10935a = (31 * this.f10935a) + (z ? 1 : 0);
        return this;
    }
}
