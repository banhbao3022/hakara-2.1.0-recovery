package p007c.p190n.p194b.p209b.p252x1.p261v;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p252x1.Cue;
import p007c.p190n.p194b.p209b.p252x1.Subtitle;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.x1.v.k, reason: use source file name */
/* JADX INFO: compiled from: WebvttSubtitle.java */
/* JADX INFO: loaded from: classes.dex */
public final class WebvttSubtitle implements Subtitle {

    /* JADX INFO: renamed from: f */
    public final List<WebvttCueInfo> f10175f;

    /* JADX INFO: renamed from: g */
    public final long[] f10176g;

    /* JADX INFO: renamed from: h */
    public final long[] f10177h;

    public WebvttSubtitle(List<WebvttCueInfo> list) {
        this.f10175f = Collections.unmodifiableList(new ArrayList(list));
        this.f10176g = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            WebvttCueInfo webvttCueInfo = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f10176g;
            jArr[i2] = webvttCueInfo.f10146b;
            jArr[i2 + 1] = webvttCueInfo.f10147c;
        }
        long[] jArr2 = this.f10176g;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f10177h = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: f */
    public int mo4395f(long j2) {
        int iM3114b = Util6.m3114b(this.f10177h, j2, false, false);
        if (iM3114b < this.f10177h.length) {
            return iM3114b;
        }
        return -1;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: h */
    public long mo4396h(int i) {
        C2096e.m4566b(i >= 0);
        C2096e.m4566b(i < this.f10177h.length);
        return this.f10177h[i];
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: j */
    public List<Cue> mo4397j(long j2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f10175f.size(); i++) {
            long[] jArr = this.f10176g;
            int i2 = i * 2;
            if (jArr[i2] <= j2 && j2 < jArr[i2 + 1]) {
                WebvttCueInfo webvttCueInfo = this.f10175f.get(i);
                Cue cue = webvttCueInfo.f10145a;
                if (cue.f9790e == -3.4028235E38f) {
                    arrayList2.add(webvttCueInfo);
                } else {
                    arrayList.add(cue);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: c.n.b.b.x1.v.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((WebvttCueInfo) obj).f10146b, ((WebvttCueInfo) obj2).f10146b);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            Cue.b bVarM4391a = ((WebvttCueInfo) arrayList2.get(i3)).f10145a.m4391a();
            bVarM4391a.f9806d = (-1) - i3;
            bVarM4391a.f9807e = 1;
            arrayList.add(bVarM4391a.m4392a());
        }
        return arrayList;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: l */
    public int mo4398l() {
        return this.f10177h.length;
    }
}
