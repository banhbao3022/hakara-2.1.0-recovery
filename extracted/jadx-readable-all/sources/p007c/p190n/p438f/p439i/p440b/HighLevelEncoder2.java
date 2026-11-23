package p007c.p190n.p438f.p439i.p440b;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: c.n.f.i.b.e, reason: use source file name */
/* JADX INFO: compiled from: HighLevelEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class HighLevelEncoder2 {

    /* JADX INFO: renamed from: a */
    public static final String[] f27627a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* JADX INFO: renamed from: b */
    public static final int[][] f27628b = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX INFO: renamed from: c */
    public static final int[][] f27629c;

    /* JADX INFO: renamed from: d */
    public static final int[][] f27630d;

    /* JADX INFO: renamed from: e */
    public final byte[] f27631e;

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) int.class, 5, 256);
        f27629c = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f27629c[0][i] = (i - 65) + 2;
        }
        f27629c[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f27629c[1][i2] = (i2 - 97) + 2;
        }
        f27629c[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f27629c[2][i3] = (i3 - 48) + 2;
        }
        int[][] iArr2 = f27629c;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            f27629c[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr4[i5] > 0) {
                f27629c[4][iArr4[i5]] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) int.class, 6, 6);
        f27630d = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f27630d;
        iArr7[0][4] = 0;
        iArr7[1][4] = 0;
        iArr7[1][0] = 28;
        iArr7[3][4] = 0;
        iArr7[2][4] = 0;
        iArr7[2][0] = 15;
    }

    public HighLevelEncoder2(byte[] bArr) {
        this.f27631e = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static Collection<State> m12336a(Iterable<State> iterable) {
        LinkedList linkedList = new LinkedList();
        for (State state : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                State state2 = (State) it.next();
                if (state2.m12339c(state)) {
                    z = false;
                    break;
                }
                if (state.m12339c(state2)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(state);
            }
        }
        return linkedList;
    }
}
