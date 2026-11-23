package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import android.graphics.Bitmap;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.p293i.InterfaceC2462c;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.e0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2453e0 implements InterfaceC2462c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MediaNotificationService.C5893b f11231a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MediaNotificationService f11232b;

    public C2453e0(MediaNotificationService mediaNotificationService, MediaNotificationService.C5893b c5893b) {
        this.f11232b = mediaNotificationService;
        this.f11231a = c5893b;
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.p293i.InterfaceC2462c
    /* JADX INFO: renamed from: a */
    public final void mo5055a(Bitmap bitmap) {
        MediaNotificationService.C5893b c5893b = this.f11231a;
        c5893b.f28626b = bitmap;
        MediaNotificationService mediaNotificationService = this.f11232b;
        mediaNotificationService.f28613r = c5893b;
        mediaNotificationService.m12651c();
    }
}
