package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: c.n.b.d.j.a.ju */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3190ju implements InterfaceC3290mj {

    /* JADX INFO: renamed from: a */
    public File f15723a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f15724b;

    public C3190ju(Context context) {
        this.f15724b = context;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3290mj
    public final File zza() {
        if (this.f15723a == null) {
            this.f15723a = new File(this.f15724b.getCacheDir(), "volley");
        }
        return this.f15723a;
    }
}
