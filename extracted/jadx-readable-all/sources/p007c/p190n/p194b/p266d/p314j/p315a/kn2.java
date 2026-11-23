package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Arrays;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class kn2 {

    /* JADX INFO: renamed from: b */
    public int f16000b;

    /* JADX INFO: renamed from: c */
    public int f16001c;

    /* JADX INFO: renamed from: d */
    public int f16002d = 0;

    /* JADX INFO: renamed from: e */
    public en2[] f16003e = new en2[100];

    /* JADX INFO: renamed from: a */
    public final en2[] f15999a = new en2[1];

    public kn2(boolean z, int i) {
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m7530a(int i) {
        int i2 = this.f16000b;
        this.f16000b = i;
        if (i < i2) {
            m7533d();
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7531b(en2 en2Var) {
        en2[] en2VarArr = this.f15999a;
        en2VarArr[0] = en2Var;
        m7532c(en2VarArr);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m7532c(en2[] en2VarArr) {
        int length = this.f16002d + en2VarArr.length;
        en2[] en2VarArr2 = this.f16003e;
        int length2 = en2VarArr2.length;
        if (length >= length2) {
            this.f16003e = (en2[]) Arrays.copyOf(en2VarArr2, Math.max(length2 + length2, length));
        }
        for (en2 en2Var : en2VarArr) {
            C2622l.m5366f1(en2Var.f13625a.length == 65536);
            en2[] en2VarArr3 = this.f16003e;
            int i = this.f16002d;
            this.f16002d = i + 1;
            en2VarArr3[i] = en2Var;
        }
        this.f16001c -= en2VarArr.length;
        notifyAll();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m7533d() {
        int iMax = Math.max(0, jo2.m7370b(this.f16000b, 65536) - this.f16001c);
        int i = this.f16002d;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.f16003e, iMax, i, (Object) null);
        this.f16002d = iMax;
    }
}
