package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class sq2 implements Comparator<jq2> {
    public sq2(tq2 tq2Var) {
    }

    @Override // java.util.Comparator
    public final int compare(jq2 jq2Var, jq2 jq2Var2) {
        jq2 jq2Var3 = jq2Var;
        jq2 jq2Var4 = jq2Var2;
        float f = jq2Var3.f15707b;
        float f2 = jq2Var4.f15707b;
        if (f >= f2) {
            if (f <= f2) {
                float f3 = jq2Var3.f15706a;
                float f4 = jq2Var4.f15706a;
                if (f3 >= f4) {
                    if (f3 <= f4) {
                        float f5 = (jq2Var3.f15708c - f3) * (jq2Var3.f15709d - f);
                        float f6 = (jq2Var4.f15708c - f4) * (jq2Var4.f15709d - f2);
                        if (f5 <= f6) {
                            if (f5 >= f6) {
                                return 0;
                            }
                        }
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
