package p555j.p556a.p557a.p558a.p596f;

import android.app.Application;
import mtp.media.karaoke.service.MediaService;
import p007c.p008a.p009a.p010a.p027i.VideoControlsButtonListener;
import p007c.p008a.p009a.p029b.p040e.ListPlaylistManager;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p607a.MediaItem4;

/* JADX INFO: renamed from: j.a.a.a.f.f, reason: use source file name */
/* JADX INFO: compiled from: PlaylistManager.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistManager extends ListPlaylistManager<MediaItem4> {

    /* JADX INFO: renamed from: j.a.a.a.f.f$a */
    /* JADX INFO: compiled from: PlaylistManager.kt */
    public final class a implements VideoControlsButtonListener {
        public a() {
        }

        @Override // p007c.p008a.p009a.p010a.p027i.VideoControlsButtonListener
        /* JADX INFO: renamed from: a */
        public boolean mo987a() {
            PlaylistManager playlistManager = PlaylistManager.this;
            playlistManager.m1281j(playlistManager.f1781q);
            return false;
        }

        @Override // p007c.p008a.p009a.p010a.p027i.VideoControlsButtonListener
        /* JADX INFO: renamed from: b */
        public boolean mo988b() {
            return false;
        }

        @Override // p007c.p008a.p009a.p010a.p027i.VideoControlsButtonListener
        /* JADX INFO: renamed from: c */
        public boolean mo989c() {
            return false;
        }

        @Override // p007c.p008a.p009a.p010a.p027i.VideoControlsButtonListener
        /* JADX INFO: renamed from: d */
        public boolean mo990d() {
            PlaylistManager playlistManager = PlaylistManager.this;
            playlistManager.m1281j(playlistManager.f1779o);
            return true;
        }

        @Override // p007c.p008a.p009a.p010a.p027i.VideoControlsButtonListener
        /* JADX INFO: renamed from: e */
        public boolean mo991e() {
            PlaylistManager playlistManager = PlaylistManager.this;
            playlistManager.m1281j(playlistManager.f1780p);
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistManager(Application application) {
        super(application, MediaService.class);
        Intrinsics2.m13089e(application, "application");
    }
}
