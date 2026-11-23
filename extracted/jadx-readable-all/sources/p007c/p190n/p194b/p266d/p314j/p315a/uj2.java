package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class uj2 extends wj2 {

    /* JADX INFO: renamed from: P0 */
    public final long f20361P0;

    /* JADX INFO: renamed from: Q0 */
    public final List<vj2> f20362Q0;

    /* JADX INFO: renamed from: R0 */
    public final List<uj2> f20363R0;

    public uj2(int i, long j2) {
        super(i);
        this.f20361P0 = j2;
        this.f20362Q0 = new ArrayList();
        this.f20363R0 = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public final vj2 m8509b(int i) {
        int size = this.f20362Q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            vj2 vj2Var = this.f20362Q0.get(i2);
            if (vj2Var.f21233O0 == i) {
                return vj2Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final uj2 m8510c(int i) {
        int size = this.f20363R0.size();
        for (int i2 = 0; i2 < size; i2++) {
            uj2 uj2Var = this.f20363R0.get(i2);
            if (uj2Var.f21233O0 == i) {
                return uj2Var;
            }
        }
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wj2
    public final String toString() {
        String strM8658a = wj2.m8658a(this.f21233O0);
        String string = Arrays.toString(this.f20362Q0.toArray());
        String string2 = Arrays.toString(this.f20363R0.toArray());
        StringBuilder sb = new StringBuilder(outline.m1578b(String.valueOf(strM8658a).length(), 22, String.valueOf(string).length(), String.valueOf(string2).length()));
        outline.m1572W(sb, strM8658a, " leaves: ", string, " containers: ");
        sb.append(string2);
        return sb.toString();
    }
}
