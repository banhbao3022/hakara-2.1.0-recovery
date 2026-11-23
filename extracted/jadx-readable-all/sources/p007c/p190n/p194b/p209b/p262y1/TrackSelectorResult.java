package p007c.p190n.p194b.p209b.p262y1;

import p007c.p190n.p194b.p209b.RendererConfiguration;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.y1.o, reason: use source file name */
/* JADX INFO: compiled from: TrackSelectorResult.java */
/* JADX INFO: loaded from: classes.dex */
public final class TrackSelectorResult {

    /* JADX INFO: renamed from: a */
    public final int f10365a;

    /* JADX INFO: renamed from: b */
    public final RendererConfiguration[] f10366b;

    /* JADX INFO: renamed from: c */
    public final ExoTrackSelection2[] f10367c;

    /* JADX INFO: renamed from: d */
    public final Object f10368d;

    public TrackSelectorResult(RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection2[] exoTrackSelection2Arr, Object obj) {
        this.f10366b = rendererConfigurationArr;
        this.f10367c = (ExoTrackSelection2[]) exoTrackSelection2Arr.clone();
        this.f10368d = obj;
        this.f10365a = rendererConfigurationArr.length;
    }

    /* JADX INFO: renamed from: a */
    public boolean m4547a(TrackSelectorResult trackSelectorResult, int i) {
        return trackSelectorResult != null && Util6.m3113a(this.f10366b[i], trackSelectorResult.f10366b[i]) && Util6.m3113a(this.f10367c[i], trackSelectorResult.f10367c[i]);
    }

    /* JADX INFO: renamed from: b */
    public boolean m4548b(int i) {
        return this.f10366b[i] != null;
    }
}
