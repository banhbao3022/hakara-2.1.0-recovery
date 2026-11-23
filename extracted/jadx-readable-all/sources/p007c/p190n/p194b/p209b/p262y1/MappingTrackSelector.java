package p007c.p190n.p194b.p209b.p262y1;

import android.util.Pair;
import java.util.Arrays;
import p007c.p190n.p194b.p209b.BaseRenderer;
import p007c.p190n.p194b.p209b.ExoPlaybackException;
import p007c.p190n.p194b.p209b.RendererCapabilities;
import p007c.p190n.p194b.p209b.RendererConfiguration;
import p007c.p190n.p194b.p209b.Timeline;
import p007c.p190n.p194b.p209b.p212b2.MimeTypes;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.TrackGroup;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;

/* JADX INFO: renamed from: c.n.b.b.y1.j, reason: use source file name */
/* JADX INFO: compiled from: MappingTrackSelector.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class MappingTrackSelector extends TrackSelector {

    /* JADX INFO: renamed from: c */
    public a f10339c;

    /* JADX INFO: renamed from: c.n.b.b.y1.j$a */
    /* JADX INFO: compiled from: MappingTrackSelector.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f10340a;

        /* JADX INFO: renamed from: b */
        public final String[] f10341b;

        /* JADX INFO: renamed from: c */
        public final int[] f10342c;

        /* JADX INFO: renamed from: d */
        public final TrackGroupArray[] f10343d;

        /* JADX INFO: renamed from: e */
        public final int[] f10344e;

        /* JADX INFO: renamed from: f */
        public final int[][][] f10345f;

        /* JADX INFO: renamed from: g */
        public final TrackGroupArray f10346g;

        public a(String[] strArr, int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.f10341b = strArr;
            this.f10342c = iArr;
            this.f10343d = trackGroupArrayArr;
            this.f10345f = iArr3;
            this.f10344e = iArr2;
            this.f10346g = trackGroupArray;
            this.f10340a = iArr.length;
        }

        /* JADX INFO: renamed from: a */
        public int m4545a(int i, int i2, boolean z) {
            int i3 = this.f10343d[i].f9069h[i2].f9064f;
            int[] iArr = new int[i3];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = this.f10345f[i][i2][i6] & 7;
                if (i7 == 4 || (z && i7 == 3)) {
                    iArr[i5] = i6;
                    i5++;
                }
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
            String str = null;
            int iMin = 16;
            boolean z2 = false;
            int i8 = 0;
            while (i4 < iArrCopyOf.length) {
                String str2 = this.f10343d[i].f9069h[i2].f9065g[iArrCopyOf[i4]].f6934q;
                int i9 = i8 + 1;
                if (i8 == 0) {
                    str = str2;
                } else {
                    z2 |= !Util6.m3113a(str, str2);
                }
                iMin = Math.min(iMin, this.f10345f[i][i2][i4] & 24);
                i4++;
                i8 = i9;
            }
            return z2 ? Math.min(iMin, this.f10344e[i]) : iMin;
        }

        /* JADX INFO: renamed from: b */
        public int m4546b(int i, int i2, int i3) {
            return this.f10345f[i][i2][i3] & 7;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.TrackSelector
    /* JADX INFO: renamed from: a */
    public final void mo4543a(Object obj) {
        this.f10339c = (a) obj;
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.TrackSelector
    /* JADX INFO: renamed from: b */
    public final TrackSelectorResult mo4544b(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray, MediaSource2.a aVar, Timeline timeline) throws ExoPlaybackException {
        int[] iArr;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        int[] iArr2 = new int[rendererCapabilitiesArr.length + 1];
        int length = rendererCapabilitiesArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr3 = new int[rendererCapabilitiesArr.length + 1][][];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = trackGroupArray2.f9068g;
            trackGroupArr[i2] = new TrackGroup[i3];
            iArr3[i2] = new int[i3][];
        }
        int length2 = rendererCapabilitiesArr.length;
        int[] iArr4 = new int[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            iArr4[i4] = rendererCapabilitiesArr[i4].mo3038e();
        }
        int i5 = 0;
        while (i5 < trackGroupArray2.f9068g) {
            TrackGroup trackGroup = trackGroupArray2.f9069h[i5];
            boolean z = MimeTypes.m3167i(trackGroup.f9065g[i].f6934q) == 5;
            int length3 = rendererCapabilitiesArr.length;
            int i6 = 0;
            int i7 = 0;
            boolean z2 = true;
            while (i6 < rendererCapabilitiesArr.length) {
                RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i6];
                int iMax = 0;
                while (i < trackGroup.f9064f) {
                    iMax = Math.max(iMax, rendererCapabilities.mo3383a(trackGroup.f9065g[i]) & 7);
                    i++;
                }
                boolean z3 = iArr2[i6] == 0;
                if (iMax > i7 || (iMax == i7 && z && !z2 && z3)) {
                    z2 = z3;
                    i7 = iMax;
                    length3 = i6;
                }
                i6++;
                i = 0;
            }
            if (length3 == rendererCapabilitiesArr.length) {
                iArr = new int[trackGroup.f9064f];
            } else {
                RendererCapabilities rendererCapabilities2 = rendererCapabilitiesArr[length3];
                int[] iArr5 = new int[trackGroup.f9064f];
                for (int i8 = 0; i8 < trackGroup.f9064f; i8++) {
                    iArr5[i8] = rendererCapabilities2.mo3383a(trackGroup.f9065g[i8]);
                }
                iArr = iArr5;
            }
            int i9 = iArr2[length3];
            trackGroupArr[length3][i9] = trackGroup;
            iArr3[length3][i9] = iArr;
            iArr2[length3] = iArr2[length3] + 1;
            i5++;
            trackGroupArray2 = trackGroupArray;
            i = 0;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[rendererCapabilitiesArr.length];
        String[] strArr = new String[rendererCapabilitiesArr.length];
        int[] iArr6 = new int[rendererCapabilitiesArr.length];
        for (int i10 = 0; i10 < rendererCapabilitiesArr.length; i10++) {
            int i11 = iArr2[i10];
            trackGroupArrayArr[i10] = new TrackGroupArray((TrackGroup[]) Util6.m3100I(trackGroupArr[i10], i11));
            iArr3[i10] = (int[][]) Util6.m3100I(iArr3[i10], i11);
            strArr[i10] = rendererCapabilitiesArr[i10].getName();
            iArr6[i10] = ((BaseRenderer) rendererCapabilitiesArr[i10]).f6248f;
        }
        a aVar2 = new a(strArr, iArr6, trackGroupArrayArr, iArr4, iArr3, new TrackGroupArray((TrackGroup[]) Util6.m3100I(trackGroupArr[rendererCapabilitiesArr.length], iArr2[rendererCapabilitiesArr.length])));
        Pair<RendererConfiguration[], ExoTrackSelection2[]> pairMo4530c = mo4530c(aVar2, iArr3, iArr4, aVar, timeline);
        return new TrackSelectorResult((RendererConfiguration[]) pairMo4530c.first, (ExoTrackSelection2[]) pairMo4530c.second, aVar2);
    }

    /* JADX INFO: renamed from: c */
    public abstract Pair<RendererConfiguration[], ExoTrackSelection2[]> mo4530c(a aVar, int[][][] iArr, int[] iArr2, MediaSource2.a aVar2, Timeline timeline) throws ExoPlaybackException;
}
