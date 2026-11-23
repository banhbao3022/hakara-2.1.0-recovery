package p007c.p008a.p009a.p029b.p040e;

import android.app.Application;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import p007c.p008a.p009a.p029b.p030a.MediaPlayerApi;
import p007c.p008a.p009a.p029b.p030a.PlaylistItem;
import p007c.p008a.p009a.p029b.p031b.p037f.PlaylistHandler;
import p007c.p008a.p009a.p029b.p038c.MediaProgress;
import p007c.p008a.p009a.p029b.p038c.PlaybackState;
import p007c.p008a.p009a.p029b.p038c.RemoteActions;
import p007c.p008a.p009a.p029b.p039d.PlaylistListener;
import p007c.p008a.p009a.p029b.p039d.ProgressListener;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.b.e.a, reason: use source file name */
/* JADX INFO: compiled from: BasePlaylistManager.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class BasePlaylistManager<I extends PlaylistItem> implements PlaylistListener<I>, ProgressListener {

    /* JADX INFO: renamed from: f */
    public static final String f1770f;

    /* JADX INFO: renamed from: g */
    public int f1771g;

    /* JADX INFO: renamed from: h */
    public PlaylistHandler<I> f1772h;

    /* JADX INFO: renamed from: i */
    public final List<MediaPlayerApi<I>> f1773i;

    /* JADX INFO: renamed from: j */
    public List<WeakReference<PlaylistListener<I>>> f1774j;

    /* JADX INFO: renamed from: k */
    public List<WeakReference<ProgressListener>> f1775k;

    /* JADX INFO: renamed from: l */
    public ReentrantLock f1776l;

    /* JADX INFO: renamed from: m */
    public ReentrantLock f1777m;

    /* JADX INFO: renamed from: n */
    public Intent f1778n;

    /* JADX INFO: renamed from: o */
    public PendingIntent f1779o;

    /* JADX INFO: renamed from: p */
    public PendingIntent f1780p;

    /* JADX INFO: renamed from: q */
    public PendingIntent f1781q;

    /* JADX INFO: renamed from: r */
    public PendingIntent f1782r;

    /* JADX INFO: renamed from: s */
    public PendingIntent f1783s;

    /* JADX INFO: renamed from: t */
    public final Application f1784t;

    /* JADX INFO: renamed from: u */
    public final Class<? extends Service> f1785u;

    /* JADX INFO: renamed from: c.a.a.b.e.a$a */
    /* JADX INFO: compiled from: BasePlaylistManager.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        f1770f = "PlaylistManager";
    }

    public BasePlaylistManager(Application application, Class<? extends Service> cls) {
        Intrinsics2.m13090f(application, "application");
        Intrinsics2.m13090f(cls, "mediaServiceClass");
        this.f1784t = application;
        this.f1785u = cls;
        this.f1771g = -1;
        this.f1773i = new ArrayList();
        this.f1774j = new LinkedList();
        this.f1775k = new LinkedList();
        this.f1776l = new ReentrantLock(true);
        this.f1777m = new ReentrantLock(true);
        Intrinsics2.m13090f(cls, "mediaServiceClass");
        Intrinsics2.m13090f(application, "application");
        RemoteActions remoteActions = RemoteActions.f1769j;
        this.f1781q = m1272a(application, cls, RemoteActions.f1762c);
        this.f1780p = m1272a(application, cls, RemoteActions.f1763d);
        this.f1779o = m1272a(application, cls, RemoteActions.f1761b);
        this.f1782r = m1272a(application, cls, RemoteActions.f1764e);
        this.f1783s = m1272a(application, cls, RemoteActions.f1765f);
        Intent intent = new Intent(application, cls);
        intent.setAction(RemoteActions.f1766g);
        this.f1778n = intent;
    }

    /* JADX INFO: renamed from: a */
    public PendingIntent m1272a(Application application, Class<? extends Service> cls, String str) {
        Intrinsics2.m13090f(application, "application");
        Intrinsics2.m13090f(cls, "serviceClass");
        Intrinsics2.m13090f(str, "action");
        Intent intent = new Intent(application, cls);
        intent.setAction(str);
        PendingIntent service = PendingIntent.getService(application, 0, intent, 134217728);
        Intrinsics2.m13086b(service, "PendingIntent.getService…tent.FLAG_UPDATE_CURRENT)");
        return service;
    }

    /* JADX INFO: renamed from: b */
    public I m1273b() {
        int i = this.f1771g;
        if (i == -1 || i >= mo1276e()) {
            return null;
        }
        return (I) mo1275d(this.f1771g);
    }

    /* JADX INFO: renamed from: c */
    public PlaybackState m1274c() {
        PlaybackState playbackState;
        PlaylistHandler<I> playlistHandler = this.f1772h;
        return (playlistHandler == null || (playbackState = playlistHandler.f1732h) == null) ? PlaybackState.STOPPED : playbackState;
    }

    /* JADX INFO: renamed from: d */
    public abstract I mo1275d(int i);

    /* JADX INFO: renamed from: e */
    public abstract int mo1276e();

    /* JADX INFO: renamed from: f */
    public boolean m1277f() {
        int i = this.f1771g;
        return i != -1 && i + 1 < mo1276e();
    }

    /* JADX INFO: renamed from: g */
    public I m1278g() {
        int i = this.f1771g;
        if (i != -1) {
            m1282l(Math.min(i + 1, mo1276e()));
        }
        return (I) m1273b();
    }

    /* JADX INFO: renamed from: h */
    public void m1279h(long j2, boolean z) {
        if (m1273b() != null) {
            Intent intent = new Intent(this.f1784t, this.f1785u);
            RemoteActions remoteActions = RemoteActions.f1769j;
            intent.setAction(RemoteActions.f1760a);
            intent.putExtra(RemoteActions.f1767h, j2);
            intent.putExtra(RemoteActions.f1768i, z);
            this.f1784t.startService(intent);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m1280i(PlaylistListener<? super I> playlistListener) {
        Intrinsics2.m13090f(playlistListener, "listener");
        this.f1776l.lock();
        this.f1774j.add(new WeakReference<>(playlistListener));
        this.f1776l.unlock();
    }

    /* JADX INFO: renamed from: j */
    public void m1281j(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (Exception e) {
                String str = f1770f;
                StringBuilder sbM1556G = outline.m1556G("Error sending pending intent ");
                sbM1556G.append(String.valueOf(pendingIntent));
                Log.d(str, sbM1556G.toString(), e);
            }
        }
    }

    @Override // p007c.p008a.p009a.p029b.p039d.ProgressListener
    /* JADX INFO: renamed from: k */
    public boolean mo1250k(MediaProgress mediaProgress) {
        Intrinsics2.m13090f(mediaProgress, "mediaProgress");
        ReentrantLock reentrantLock = this.f1777m;
        List<WeakReference<ProgressListener>> list = this.f1775k;
        reentrantLock.lock();
        Iterator<WeakReference<ProgressListener>> it = list.iterator();
        while (it.hasNext()) {
            ProgressListener progressListener = it.next().get();
            if (progressListener == null) {
                it.remove();
            } else if (progressListener.mo1250k(mediaProgress)) {
                reentrantLock.unlock();
                return true;
            }
        }
        reentrantLock.unlock();
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final void m1282l(int i) {
        if (i < 0 || i >= mo1276e()) {
            i = -1;
        }
        this.f1771g = i;
    }

    /* JADX INFO: renamed from: m */
    public void m1283m(PlaylistListener<?> playlistListener) {
        Intrinsics2.m13090f(playlistListener, "listener");
        this.f1776l.lock();
        Iterator<WeakReference<PlaylistListener<I>>> it = this.f1774j.iterator();
        while (it.hasNext()) {
            PlaylistListener<I> playlistListener2 = it.next().get();
            if (playlistListener2 == null || Intrinsics2.m13085a(playlistListener2, playlistListener)) {
                it.remove();
            }
        }
        this.f1776l.unlock();
    }

    @Override // p007c.p008a.p009a.p029b.p039d.PlaylistListener
    /* JADX INFO: renamed from: n */
    public boolean mo1268n(PlaybackState playbackState) {
        Intrinsics2.m13090f(playbackState, "playbackState");
        ReentrantLock reentrantLock = this.f1776l;
        List<WeakReference<PlaylistListener<I>>> list = this.f1774j;
        reentrantLock.lock();
        Iterator<WeakReference<PlaylistListener<I>>> it = list.iterator();
        while (it.hasNext()) {
            PlaylistListener<I> playlistListener = it.next().get();
            if (playlistListener == null) {
                it.remove();
            } else if (playlistListener.mo1268n(playbackState)) {
                reentrantLock.unlock();
                return true;
            }
        }
        reentrantLock.unlock();
        return false;
    }

    @Override // p007c.p008a.p009a.p029b.p039d.PlaylistListener
    /* JADX INFO: renamed from: y */
    public boolean mo1269y(I i, boolean z, boolean z2) {
        ReentrantLock reentrantLock = this.f1776l;
        List<WeakReference<PlaylistListener<I>>> list = this.f1774j;
        reentrantLock.lock();
        Iterator<WeakReference<PlaylistListener<I>>> it = list.iterator();
        while (it.hasNext()) {
            PlaylistListener<I> playlistListener = it.next().get();
            if (playlistListener == null) {
                it.remove();
            } else if (playlistListener.mo1269y(i, z, z2)) {
                reentrantLock.unlock();
                return true;
            }
        }
        reentrantLock.unlock();
        return false;
    }
}
