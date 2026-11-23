package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ea2 extends la2 {
    public ea2(int i) {
        super(i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.la2
    /* JADX INFO: renamed from: a */
    public final void mo6616a() {
        if (!this.f16306j) {
            for (int i = 0; i < m7575b(); i++) {
                Map.Entry entryM7576c = m7576c(i);
                if (((w72) entryM7576c.getKey()).m8614b()) {
                    entryM7576c.setValue(Collections.unmodifiableList((List) entryM7576c.getValue()));
                }
            }
            for (Map.Entry entry : this.f16305i.isEmpty() ? ha2.f14798b : this.f16305i.entrySet()) {
                if (((w72) entry.getKey()).m8614b()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo6616a();
    }
}
