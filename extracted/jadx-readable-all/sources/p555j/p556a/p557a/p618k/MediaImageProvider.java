package p555j.p556a.p557a.p618k;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import mtp.media.karaoke.R;
import p007c.p008a.p009a.p029b.p030a.PlaylistItem;
import p007c.p008a.p009a.p029b.p031b.p033b.ImageProvider;
import p007c.p085g.p086a.Glide;
import p007c.p085g.p086a.RequestManager;
import p007c.p085g.p086a.p108q.p109h.SimpleTarget;
import p007c.p085g.p086a.p108q.p110i.Transition;
import p477d1.Lazy3;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p606h.p607a.MediaItem4;

/* JADX INFO: renamed from: j.a.a.k.a, reason: use source file name */
/* JADX INFO: compiled from: MediaImageProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MediaImageProvider implements ImageProvider<MediaItem4> {

    /* JADX INFO: renamed from: a */
    public final Lazy3 f33069a;

    /* JADX INFO: renamed from: b */
    public final a f33070b;

    /* JADX INFO: renamed from: c */
    public final b f33071c;

    /* JADX INFO: renamed from: d */
    public final Lazy3 f33072d;

    /* JADX INFO: renamed from: e */
    public Bitmap f33073e;

    /* JADX INFO: renamed from: f */
    public Bitmap f33074f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6153a<Unit> f33075g;

    /* JADX INFO: renamed from: j.a.a.k.a$a */
    /* JADX INFO: compiled from: MediaImageProvider.kt */
    public final class a extends SimpleTarget<Bitmap> {
        public a() {
        }

        @Override // p007c.p085g.p086a.p108q.p109h.Target
        /* JADX INFO: renamed from: b */
        public void mo1932b(Object obj, Transition transition) {
            Bitmap bitmap = (Bitmap) obj;
            Intrinsics2.m13089e(bitmap, "resource");
            MediaImageProvider mediaImageProvider = MediaImageProvider.this;
            mediaImageProvider.f33073e = bitmap;
            mediaImageProvider.f33075g.mo2c();
        }
    }

    /* JADX INFO: renamed from: j.a.a.k.a$b */
    /* JADX INFO: compiled from: MediaImageProvider.kt */
    public final class b extends SimpleTarget<Bitmap> {
        public b() {
        }

        @Override // p007c.p085g.p086a.p108q.p109h.Target
        /* JADX INFO: renamed from: b */
        public void mo1932b(Object obj, Transition transition) {
            Bitmap bitmap = (Bitmap) obj;
            Intrinsics2.m13089e(bitmap, "resource");
            MediaImageProvider mediaImageProvider = MediaImageProvider.this;
            mediaImageProvider.f33074f = bitmap;
            mediaImageProvider.f33075g.mo2c();
        }
    }

    /* JADX INFO: renamed from: j.a.a.k.a$c */
    /* JADX INFO: compiled from: MediaImageProvider.kt */
    public static final class c extends Lambda implements InterfaceC6153a<Bitmap> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Context f33078g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.f33078g = context;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Bitmap mo2c() {
            return BitmapFactory.decodeResource(this.f33078g.getResources(), R.mipmap.ic_launcher);
        }
    }

    /* JADX INFO: renamed from: j.a.a.k.a$d */
    /* JADX INFO: compiled from: MediaImageProvider.kt */
    public static final class d extends Lambda implements InterfaceC6153a<RequestManager> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Context f33079g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(0);
            this.f33079g = context;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public RequestManager mo2c() {
            RequestManager requestManagerM1627e = Glide.m1627e(this.f33079g.getApplicationContext());
            Intrinsics2.m13088d(requestManagerM1627e, "Glide.with(context.applicationContext)");
            return requestManagerM1627e;
        }
    }

    public MediaImageProvider(Context context, InterfaceC6153a<Unit> interfaceC6153a) {
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(interfaceC6153a, "onImageUpdated");
        this.f33075g = interfaceC6153a;
        this.f33069a = LazyJVM.m13021b(new d(context));
        this.f33070b = new a();
        this.f33071c = new b();
        this.f33072d = LazyJVM.m13021b(new c(context));
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p033b.ImageProvider
    /* JADX INFO: renamed from: a */
    public void mo1229a(PlaylistItem playlistItem) {
        MediaItem4 mediaItem4 = (MediaItem4) playlistItem;
        Intrinsics2.m13089e(mediaItem4, "playlistItem");
        ((RequestManager) this.f33069a.getValue()).mo1652l().mo1645Q(mediaItem4.f32262a.f32260e).m1640L(this.f33070b);
        ((RequestManager) this.f33069a.getValue()).mo1652l().mo1645Q(mediaItem4.f32262a.f32260e).m1640L(this.f33071c);
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p033b.ImageProvider
    /* JADX INFO: renamed from: b */
    public Bitmap mo1230b() {
        Bitmap bitmap = this.f33073e;
        return bitmap != null ? bitmap : (Bitmap) this.f33072d.getValue();
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p033b.ImageProvider
    /* JADX INFO: renamed from: c */
    public int mo1231c() {
        return R.mipmap.ic_launcher;
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p033b.ImageProvider
    /* JADX INFO: renamed from: d */
    public Bitmap mo1232d() {
        return this.f33074f;
    }
}
