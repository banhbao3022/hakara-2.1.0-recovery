package mtp.media.karaoke.service;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import mtp.media.karaoke.MainApplication;
import p007c.p008a.p009a.p029b.p030a.MediaPlayerApi;
import p007c.p008a.p009a.p029b.p031b.p032a.DefaultAudioFocusProvider;
import p007c.p008a.p009a.p029b.p031b.p034c.DefaultMediaControlsProvider;
import p007c.p008a.p009a.p029b.p031b.p035d.DefaultMediaSessionProvider;
import p007c.p008a.p009a.p029b.p031b.p036e.DefaultPlaylistNotificationProvider;
import p007c.p008a.p009a.p029b.p031b.p037f.DefaultPlaylistHandler;
import p007c.p008a.p009a.p029b.p031b.p037f.PlaylistHandler;
import p007c.p008a.p009a.p029b.p041f.BasePlaylistService;
import p477d1.Lazy3;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p596f.PlaylistManager;
import p555j.p556a.p557a.p606h.p607a.AudioApi;
import p555j.p556a.p557a.p606h.p607a.MediaItem4;
import p555j.p556a.p557a.p618k.MediaImageProvider;

/* JADX INFO: compiled from: MediaService.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MediaService extends BasePlaylistService<MediaItem4, PlaylistManager> {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f33505j = 0;

    /* JADX INFO: renamed from: k */
    public final Lazy3 f33506k = LazyJVM.m13021b(new C7247b());

    /* JADX INFO: renamed from: mtp.media.karaoke.service.MediaService$a */
    /* JADX INFO: compiled from: MediaService.kt */
    public static final class C7246a extends Lambda implements InterfaceC6153a<Unit> {
        public C7246a() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            MediaService mediaService = MediaService.this;
            int i = MediaService.f33505j;
            mediaService.m1284c().mo1257r();
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.service.MediaService$b */
    /* JADX INFO: compiled from: MediaService.kt */
    public static final class C7247b extends Lambda implements InterfaceC6153a<PlaylistManager> {
        public C7247b() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public PlaylistManager mo2c() {
            Context applicationContext = MediaService.this.getApplicationContext();
            Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type mtp.media.karaoke.MainApplication");
            return ((MainApplication) applicationContext).m14331a();
        }
    }

    @Override // p007c.p008a.p009a.p029b.p041f.BasePlaylistService
    /* JADX INFO: renamed from: d */
    public PlaylistHandler<MediaItem4> mo1285d() {
        Context applicationContext = getApplicationContext();
        Intrinsics2.m13088d(applicationContext, "applicationContext");
        MediaImageProvider mediaImageProvider = new MediaImageProvider(applicationContext, new C7246a());
        Context applicationContext2 = getApplicationContext();
        Intrinsics2.m13088d(applicationContext2, "applicationContext");
        DefaultPlaylistHandler.a aVar = new DefaultPlaylistHandler.a(applicationContext2, MediaService.class, m14351e(), mediaImageProvider);
        return new DefaultPlaylistHandler(aVar.f1725a, aVar.f1726b, aVar.f1727c, aVar.f1728d, new DefaultPlaylistNotificationProvider(aVar.f1725a), new DefaultMediaSessionProvider(aVar.f1725a, aVar.f1726b), new DefaultMediaControlsProvider(aVar.f1725a), new DefaultAudioFocusProvider(aVar.f1725a), null);
    }

    /* JADX INFO: renamed from: e */
    public PlaylistManager m14351e() {
        return (PlaylistManager) this.f33506k.getValue();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p007c.p008a.p009a.p029b.p041f.BasePlaylistService, android.app.Service
    public void onCreate() {
        super.onCreate();
        List<MediaPlayerApi<I>> list = m14351e().f1773i;
        Context applicationContext = getApplicationContext();
        Intrinsics2.m13088d(applicationContext, "applicationContext");
        list.add(new AudioApi(applicationContext));
    }

    @Override // p007c.p008a.p009a.p029b.p041f.BasePlaylistService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Iterator it = m14351e().f1773i.iterator();
        while (it.hasNext()) {
            ((MediaPlayerApi) it.next()).release();
        }
        m14351e().f1773i.clear();
    }
}
