package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k61 implements cs1 {

    /* JADX INFO: renamed from: a */
    public static final cs1 f15892a = new k61();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
    public final Object apply(Object obj) {
        final ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ha1(arrayList) { // from class: c.n.b.d.j.a.l61

            /* JADX INFO: renamed from: a */
            public final ArrayList f16291a;

            {
                this.f16291a = arrayList;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
            /* JADX INFO: renamed from: d */
            public final void mo5696d(Object obj2) {
                ((Bundle) obj2).putStringArrayList("android_permissions", this.f16291a);
            }
        };
    }
}
