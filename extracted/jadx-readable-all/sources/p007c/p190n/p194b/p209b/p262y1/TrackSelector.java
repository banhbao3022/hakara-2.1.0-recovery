package p007c.p190n.p194b.p209b.p262y1;

import p007c.p190n.p194b.p209b.ExoPlaybackException;
import p007c.p190n.p194b.p209b.RendererCapabilities;
import p007c.p190n.p194b.p209b.Timeline;
import p007c.p190n.p194b.p209b.p210a2.BandwidthMeter;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;

/* JADX INFO: renamed from: c.n.b.b.y1.n, reason: use source file name */
/* JADX INFO: compiled from: TrackSelector.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class TrackSelector {

    /* JADX INFO: renamed from: a */
    public a f10363a;

    /* JADX INFO: renamed from: b */
    public BandwidthMeter f10364b;

    /* JADX INFO: renamed from: c.n.b.b.y1.n$a */
    /* JADX INFO: compiled from: TrackSelector.java */
    public interface a {
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo4543a(Object obj);

    /* JADX INFO: renamed from: b */
    public abstract TrackSelectorResult mo4544b(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray, MediaSource2.a aVar, Timeline timeline) throws ExoPlaybackException;
}
