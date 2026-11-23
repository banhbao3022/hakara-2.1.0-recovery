package p007c.p190n.p194b.p209b.p243w1;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import p007c.p190n.p194b.p209b.Timeline;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.w1.l, reason: use source file name */
/* JADX INFO: compiled from: BaseMediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMediaSource implements MediaSource2 {

    /* JADX INFO: renamed from: f */
    public final ArrayList<MediaSource2.b> f8980f = new ArrayList<>(1);

    /* JADX INFO: renamed from: g */
    public final HashSet<MediaSource2.b> f8981g = new HashSet<>(1);

    /* JADX INFO: renamed from: h */
    public final MediaSourceEventListener.a f8982h = new MediaSourceEventListener.a();

    /* JADX INFO: renamed from: i */
    public final DrmSessionEventListener2.a f8983i = new DrmSessionEventListener2.a();

    /* JADX INFO: renamed from: j */
    public Looper f8984j;

    /* JADX INFO: renamed from: k */
    public Timeline f8985k;

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: b */
    public final void mo4085b(MediaSource2.b bVar) {
        this.f8980f.remove(bVar);
        if (!this.f8980f.isEmpty()) {
            mo4088e(bVar);
            return;
        }
        this.f8984j = null;
        this.f8985k = null;
        this.f8981g.clear();
        mo4133w();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: c */
    public final void mo4086c(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
        Objects.requireNonNull(handler);
        Objects.requireNonNull(mediaSourceEventListener);
        MediaSourceEventListener.a aVar = this.f8982h;
        Objects.requireNonNull(aVar);
        aVar.f8875c.add(new MediaSourceEventListener.a.C8511a(handler, mediaSourceEventListener));
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: d */
    public final void mo4087d(MediaSourceEventListener mediaSourceEventListener) {
        MediaSourceEventListener.a aVar = this.f8982h;
        for (MediaSourceEventListener.a.C8511a c8511a : aVar.f8875c) {
            if (c8511a.f8878b == mediaSourceEventListener) {
                aVar.f8875c.remove(c8511a);
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: e */
    public final void mo4088e(MediaSource2.b bVar) {
        boolean z = !this.f8981g.isEmpty();
        this.f8981g.remove(bVar);
        if (z && this.f8981g.isEmpty()) {
            mo4145r();
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: g */
    public final void mo4090g(Handler handler, DrmSessionEventListener2 drmSessionEventListener2) {
        DrmSessionEventListener2.a aVar = this.f8983i;
        Objects.requireNonNull(aVar);
        aVar.f7439c.add(new DrmSessionEventListener2.a.C8510a(handler, drmSessionEventListener2));
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: i */
    public /* synthetic */ boolean mo4092i() {
        return MediaSource.m4083b(this);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: m */
    public /* synthetic */ Timeline mo4094m() {
        return MediaSource.m4082a(this);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: n */
    public final void mo4095n(MediaSource2.b bVar, TransferListener transferListener) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f8984j;
        C2096e.m4566b(looper == null || looper == looperMyLooper);
        Timeline timeline = this.f8985k;
        this.f8980f.add(bVar);
        if (this.f8984j == null) {
            this.f8984j = looperMyLooper;
            this.f8981g.add(bVar);
            mo4132u(transferListener);
        } else if (timeline != null) {
            mo4096o(bVar);
            bVar.mo4067a(this, timeline);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: o */
    public final void mo4096o(MediaSource2.b bVar) {
        Objects.requireNonNull(this.f8984j);
        boolean zIsEmpty = this.f8981g.isEmpty();
        this.f8981g.add(bVar);
        if (zIsEmpty) {
            mo4146s();
        }
    }

    /* JADX INFO: renamed from: p */
    public final DrmSessionEventListener2.a m4143p(MediaSource2.a aVar) {
        return this.f8983i.m3701g(0, null);
    }

    /* JADX INFO: renamed from: q */
    public final MediaSourceEventListener.a m4144q(MediaSource2.a aVar) {
        return this.f8982h.m4115r(0, null, 0L);
    }

    /* JADX INFO: renamed from: r */
    public void mo4145r() {
    }

    /* JADX INFO: renamed from: s */
    public void mo4146s() {
    }

    /* JADX INFO: renamed from: u */
    public abstract void mo4132u(TransferListener transferListener);

    /* JADX INFO: renamed from: v */
    public final void m4147v(Timeline timeline) {
        this.f8985k = timeline;
        Iterator<MediaSource2.b> it = this.f8980f.iterator();
        while (it.hasNext()) {
            it.next().mo4067a(this, timeline);
        }
    }

    /* JADX INFO: renamed from: w */
    public abstract void mo4133w();
}
