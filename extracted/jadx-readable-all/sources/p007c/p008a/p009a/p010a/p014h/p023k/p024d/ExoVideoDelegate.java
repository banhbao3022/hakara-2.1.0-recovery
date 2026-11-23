package p007c.p008a.p009a.p010a.p014h.p023k.p024d;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p007c.p008a.p009a.p010a.ExoMedia3;
import p007c.p008a.p009a.p010a.p014h.ListenerMux;
import p007c.p008a.p009a.p010a.p014h.p018g.ExoMediaPlayer;
import p007c.p008a.p009a.p010a.p014h.p018g.WindowInfo;
import p007c.p008a.p009a.p010a.p014h.p019h.MetadataListener;
import p007c.p008a.p009a.p010a.p014h.p023k.ClearableSurface;
import p007c.p008a.p009a.p010a.p027i.OnBufferUpdateListener;
import p007c.p190n.p194b.p209b.Timeline;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.TrackGroup;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p007c.p190n.p194b.p209b.p262y1.MappingTrackSelector;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: c.a.a.a.h.k.d.a, reason: use source file name */
/* JADX INFO: compiled from: ExoVideoDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ExoVideoDelegate {

    /* JADX INFO: renamed from: a */
    public ExoMediaPlayer f1614a;

    /* JADX INFO: renamed from: b */
    public ListenerMux f1615b;

    /* JADX INFO: renamed from: c */
    public boolean f1616c;

    /* JADX INFO: renamed from: d */
    public a f1617d;

    /* JADX INFO: renamed from: e */
    public ClearableSurface f1618e;

    /* JADX INFO: renamed from: c.a.a.a.h.k.d.a$a */
    /* JADX INFO: compiled from: ExoVideoDelegate.kt */
    public final class a implements MetadataListener, OnBufferUpdateListener {
        public a() {
        }

        @Override // p007c.p008a.p009a.p010a.p014h.p019h.MetadataListener
        /* JADX INFO: renamed from: a */
        public void mo1054a(Metadata metadata) {
            Intrinsics2.m13089e(metadata, "metadata");
            ListenerMux listenerMux = ExoVideoDelegate.this.f1615b;
            if (listenerMux != null) {
                listenerMux.mo1054a(metadata);
            }
        }

        @Override // p007c.p008a.p009a.p010a.p027i.OnBufferUpdateListener
        /* JADX INFO: renamed from: e */
        public void mo1062e(int i) {
            ListenerMux listenerMux = ExoVideoDelegate.this.f1615b;
            if (listenerMux != null) {
                Objects.requireNonNull(listenerMux.f1516r);
                OnBufferUpdateListener onBufferUpdateListener = listenerMux.f1507i;
                if (onBufferUpdateListener != null) {
                    onBufferUpdateListener.mo1062e(i);
                }
            }
        }
    }

    public ExoVideoDelegate(Context context, ClearableSurface clearableSurface) {
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(clearableSurface, "clearableSurface");
        this.f1618e = clearableSurface;
        this.f1617d = new a();
        Context applicationContext = context.getApplicationContext();
        Intrinsics2.m13088d(applicationContext, "context.applicationContext");
        ExoMediaPlayer exoMediaPlayer = new ExoMediaPlayer(applicationContext);
        a aVar = this.f1617d;
        exoMediaPlayer.f1546u = aVar;
        exoMediaPlayer.f1547v = aVar;
        exoMediaPlayer.m1116l(aVar != null);
        this.f1614a = exoMediaPlayer;
    }

    /* JADX INFO: renamed from: g */
    public static void m1174g(ExoVideoDelegate exoVideoDelegate, Uri uri, MediaSource2 mediaSource2, int i) {
        int i2 = i & 2;
        ListenerMux listenerMux = exoVideoDelegate.f1615b;
        if (listenerMux != null) {
            listenerMux.f1513o = false;
            listenerMux.f1516r.mo1089d(true);
        }
        ExoMediaPlayer.m1097i(exoVideoDelegate.f1614a, 0L, false, 2);
        if (uri == null) {
            exoVideoDelegate.f1614a.m1118n(null);
            return;
        }
        exoVideoDelegate.f1614a.m1122r(uri);
        ListenerMux listenerMux2 = exoVideoDelegate.f1615b;
        if (listenerMux2 != null) {
            listenerMux2.f1514p = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Map<ExoMedia3, TrackGroupArray> m1175a() {
        ExoMedia3 exoMedia3;
        int i;
        ExoMediaPlayer exoMediaPlayer = this.f1614a;
        ExoMedia3 exoMedia4 = ExoMedia3.METADATA;
        ExoMedia3 exoMedia5 = ExoMedia3.CLOSED_CAPTION;
        ExoMedia3 exoMedia6 = ExoMedia3.VIDEO;
        ExoMedia3 exoMedia7 = ExoMedia3.AUDIO;
        int i2 = 1;
        if (exoMediaPlayer.f1532g.mo3329P() == 1) {
            return null;
        }
        ArrayMap arrayMap = new ArrayMap();
        MappingTrackSelector.a aVar = exoMediaPlayer.f1533h.f10339c;
        if (aVar != null) {
            Intrinsics2.m13088d(aVar, "trackSelector.currentMap…ckInfo ?: return trackMap");
            ExoMedia3[] exoMedia3Arr = {exoMedia7, exoMedia6, exoMedia5, exoMedia4};
            int i3 = 0;
            for (int i4 = 4; i3 < i4; i4 = 4) {
                ExoMedia3 exoMedia8 = exoMedia3Arr[i3];
                ArrayList arrayList = new ArrayList();
                Intrinsics2.m13089e(exoMedia8, "type");
                ArrayList arrayList2 = new ArrayList();
                int i5 = aVar.f10340a;
                int i6 = 0;
                int i7 = -1;
                int i8 = -1;
                int i9 = 0;
                while (i6 < i5) {
                    int i10 = aVar.f10342c[i6];
                    if (i10 == i2) {
                        exoMedia3 = exoMedia7;
                    } else if (i10 == 2) {
                        exoMedia3 = exoMedia6;
                    } else if (i10 != 3) {
                        exoMedia3 = i10 != 5 ? null : exoMedia4;
                    } else {
                        exoMedia3 = exoMedia5;
                    }
                    if (exoMedia8 != exoMedia3) {
                        i = i7;
                    } else {
                        arrayList2.add(Integer.valueOf(i6));
                        TrackGroupArray trackGroupArray = aVar.f10343d[i6];
                        Intrinsics2.m13088d(trackGroupArray, "mappedTrackInfo.getTrackGroups(rendererIndex)");
                        int i11 = i9 + trackGroupArray.f9068g;
                        if (i11 <= 0) {
                            i9 = i11;
                        } else {
                            i = i7;
                            if (i == -1) {
                                i8 = 0 - i9;
                                i7 = i6;
                            }
                        }
                        i6++;
                        i2 = 1;
                    }
                    i7 = i;
                    i6++;
                    i2 = 1;
                }
                Iterator<Integer> it = new ExoMediaPlayer.d(exoMediaPlayer, arrayList2, i7, i8).f1554a.iterator();
                while (it.hasNext()) {
                    TrackGroupArray trackGroupArray2 = aVar.f10343d[it.next().intValue()];
                    Intrinsics2.m13088d(trackGroupArray2, "mappedTrackInfo.getTrack…oups(exoPlayerTrackIndex)");
                    int i12 = trackGroupArray2.f9068g;
                    for (int i13 = 0; i13 < i12; i13++) {
                        arrayList.add(trackGroupArray2.f9069h[i13]);
                    }
                }
                i2 = 1;
                if (!arrayList.isEmpty()) {
                    Object[] array = arrayList.toArray(new TrackGroup[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    TrackGroup[] trackGroupArr = (TrackGroup[]) array;
                    arrayMap.put(exoMedia8, new TrackGroupArray((TrackGroup[]) Arrays.copyOf(trackGroupArr, trackGroupArr.length)));
                }
                i3++;
            }
        }
        return arrayMap;
    }

    /* JADX INFO: renamed from: b */
    public final long m1176b() {
        ListenerMux listenerMux = this.f1615b;
        Intrinsics2.m13087c(listenerMux);
        if (listenerMux.f1513o) {
            return this.f1614a.f1532g.getDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: c */
    public final WindowInfo m1177c() {
        ExoMediaPlayer exoMediaPlayer = this.f1614a;
        Timeline timelineMo3341p = exoMediaPlayer.f1532g.mo3341p();
        Intrinsics2.m13088d(timelineMo3341p, "exoPlayer.currentTimeline");
        if (timelineMo3341p.m3470q()) {
            return null;
        }
        int iMo3337j = exoMediaPlayer.f1532g.mo3337j();
        Timeline.c cVarM3468n = timelineMo3341p.m3468n(iMo3337j, new Timeline.c());
        Intrinsics2.m13088d(cVarM3468n, "timeline.getWindow(curre…Index, Timeline.Window())");
        return new WindowInfo(exoMediaPlayer.f1532g.mo2883m(), iMo3337j, exoMediaPlayer.f1532g.mo2884o(), cVarM3468n);
    }

    /* JADX INFO: renamed from: d */
    public final void m1178d() {
        ExoMediaPlayer exoMediaPlayer = this.f1614a;
        Surface surface = exoMediaPlayer.f1541p;
        if (surface != null) {
            surface.release();
        }
        exoMediaPlayer.f1541p = null;
        exoMediaPlayer.m1115k(2, 1, null, false);
    }

    /* JADX INFO: renamed from: e */
    public final void m1179e(Surface surface) {
        Intrinsics2.m13089e(surface, "surface");
        ExoMediaPlayer exoMediaPlayer = this.f1614a;
        exoMediaPlayer.f1541p = surface;
        exoMediaPlayer.m1115k(2, 1, surface, false);
        if (this.f1616c) {
            this.f1614a.m1120p(true);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1180f(ListenerMux listenerMux) {
        ListenerMux listenerMux2 = this.f1615b;
        if (listenerMux2 != null) {
            ExoMediaPlayer exoMediaPlayer = this.f1614a;
            Objects.requireNonNull(exoMediaPlayer);
            Intrinsics2.m13089e(listenerMux2, "listener");
            exoMediaPlayer.f1536k.remove(listenerMux2);
            ExoMediaPlayer exoMediaPlayer2 = this.f1614a;
            Objects.requireNonNull(exoMediaPlayer2);
            Intrinsics2.m13089e(listenerMux2, "listener");
            exoMediaPlayer2.f1550y.f6902k.m3151d(listenerMux2);
        }
        this.f1615b = listenerMux;
        ExoMediaPlayer exoMediaPlayer3 = this.f1614a;
        Objects.requireNonNull(exoMediaPlayer3);
        Intrinsics2.m13089e(listenerMux, "listener");
        exoMediaPlayer3.f1536k.add(listenerMux);
        this.f1614a.m1107b(listenerMux);
    }

    /* JADX INFO: renamed from: h */
    public final void m1181h(boolean z) {
        ListenerMux listenerMux;
        this.f1614a.m1125u();
        this.f1616c = false;
        if (!z || (listenerMux = this.f1615b) == null) {
            return;
        }
        ClearableSurface clearableSurface = this.f1618e;
        listenerMux.f1515q = true;
        listenerMux.f1512n = new WeakReference<>(clearableSurface);
    }
}
